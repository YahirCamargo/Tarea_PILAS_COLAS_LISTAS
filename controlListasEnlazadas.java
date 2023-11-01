package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

import java.util.LinkedList;

public class controlListasEnlazadas {
    private LinkedList<Persona> lista;
    
    /*
    public controlListasEnlazadas(){
        lista=new ArrayList<>();
    }
    */
    
    
    //cada que agrege
    
    
    private boolean listaVacia(){        
        return lista.size()==-1;
    }
    /*
        public List<Persona> recorrerLista(){
        Collections.rotate(lista, 2);
        return lista;
    }
    */
    
    
    
    public String agregarPrimero(Persona persona){
            lista.addFirst(persona);
            return "Persona agregada";
         
    }
    
    
    public String agregarFinal(Persona persona){
            lista.addLast(persona);
            return "Persona agregada";
            }
    
    public String agregarEnPosicion(Persona persona, int posicion){
            if (posicion < 0 || posicion > lista.size()) {
                return "Posición no válida";
            }
            
            lista.add(posicion, persona);
            return "Persona agregada";
         
    }
    
    
    
    
    public String eliminaPrimero(){
        String cadena;
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            cadena=lista.get(0).toString();
            lista.removeFirst();
            return "Elemento quitado: "+cadena;
        }
    }
    
    public String eliminaUltimo(){
        String cadena;
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            cadena=lista.getLast().toString();
            lista.removeLast();
            return "Elemento quitado: "+cadena;
        }
    }
    
    public String eliminaPosicion(int posicion){
        String cadena;
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            cadena=lista.get(posicion).toString();
            lista.remove(posicion);
            return "Elemento quitado: "+cadena;
        }
    }
    
    public String eliminarPorNombre(String nombre){
        String cadena;
        if(listaVacia())
            return "Lista vacia, no se puede quitar nada";
        else{
            for(int i=0;i<=lista.size();i++){
                if(lista.get(i).getNombre().equals(nombre)){
                    cadena=lista.get(i).toString();
                    lista.remove(i);
                    // el remove, remueve el elemento de la lista sin dejar a los demas vacios
                    return "Persona eliminada: "+cadena;
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
            for(int i=0;i<=lista.size();i++){
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
        String salida="";
        for(int i=lista.size(); i>=0; i--){
            salida=lista.toString()+"\n";
        }
        return salida;
    }
    
    
    
}
