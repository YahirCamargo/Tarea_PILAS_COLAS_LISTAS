package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class controlListasEnlazadas {
    private int tope=-1;
    private int max=15;
    private List<Persona> lista;
    
    
    public controlListasEnlazadas(){
        lista=new ArrayList<>();
    }
    
    
    private boolean listaLlena(){
        return (tope==max-1);
    }
    
    private boolean listaVacia(){        
        return tope==-1;
    }
    
    
    
    public List<Persona> recorrerLista(){
        Collections.rotate(lista, 2);
        return lista;
    }
    
    public String agregarPrimero(Persona persona){
        if(!listaLlena()){
            List<Persona> nuevaLista = new ArrayList<>();
            for(Persona p : recorrerLista()){
                nuevaLista.add(p);
            }
            nuevaLista.add(0, persona);
            lista = nuevaLista;
            tope++;
            return "Persona agregada";
        }else
            return "No se pudo"; 
    }
    
    
    public String agregarFinal(Persona persona){
        if(!listaLlena()){
            lista.add(persona);
            tope++;
            return "Persona agregada";
        }else
            return "Lista llena, desbordamiento de lista";
    }
    
    public String agregarEnPosicion(Persona persona, int posicion){
        if (!listaLlena()) {
            if (posicion < 0 || posicion > tope) {
                return "Posición no válida";
            }
            lista.add(posicion, persona);
            tope++;
            return "Persona agregada";
        } else {
            return "Lista llena, no se puede añadir nada";
    }
    }
    
    
    public String eliminaPrimero(){
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            lista.remove(0);
            Collections.rotate(lista, 0);
            tope--;
            return "Elemento quitado";
        }
    }
    
    public String eliminaUltimo(){
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            lista.remove(tope);
            tope--;
            return "Elemento quitado";
        }
    }
    
    public String eliminaPosicion(int posicion){
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            lista.remove(posicion);
            for(int i=posicion; i<=tope;i++){
                lista.set(i-1, lista.get(i));
            }
            tope--;
            return "Elemento quitado";
        }
    }
    
    public String eliminarPorNombre(String nombre){
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            for(int i=0;i<=tope;i++){
                if(lista.get(i).getNombre().equals(nombre)){
                    lista.remove(i);
                    // el remove, remueve el elemento de la lista sin dejar a los demas vacios
                    tope--;
                    return "Persona eliminada";
                }
            }
            return "Persona no encontrada";
        }
    }
    
    
    public String buscar(String nomb, String apelli, String nace){
        String cadena="Persona no encontrada";
        if(listaVacia())
            cadena="La lista esta vacia";
        else{
            for(int i=0;i<=tope;i++){
                if(lista.get(i).getNombre().equals(nomb)&&lista.get(i).getApellido().equals(apelli)&&lista.get(i).getFechaNacimiento().equals(nace)){
                    cadena=lista.get(i).toString();
                }
            }
        }
        return cadena;
    }
    
    
    public String imprimir(){
         String salida = "";
        for(Persona persona : lista){
            salida+=persona.toString()+"\n";
        }
        return salida;
    }
    
    public String imprimirInversa(){
        String salida = "";
        for(int i=tope; i>=0; i--){
            salida+=lista.toString()+"\n";
        }
        return salida;
    }
    
}
