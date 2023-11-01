
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

import java.util.Comparator;
import java.util.PriorityQueue;


public class controlColas {
    PriorityQueue <Cliente> cola;
    
    
    public controlColas(){
        this.cola = new PriorityQueue<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getCuenta() - c2.getCuenta();
            }
        });
    }
    
    public boolean colaVacia(){
        if(cola.isEmpty()){
            return true;
        }else{
            return false;
        }
    
    }
    // quitar esta parte de cola llena, igual implementarla asi
    
    
    
    public String ponerEnCola(Cliente cliente){
            this.cola.add(cliente);
            return "Cliente agregado";
        
    }
    
    public String quitarDeCola(){
        String cadena;
        if(colaVacia())
            return "Cola vacia, no se puede quitar nada";
        else{
            cadena=cola.toString();
            cola.remove();
            //hay otro metodo
            return "Elemento quitado con exito: "+cadena;
        }
    }
    
    public String imprimir(){
        String cadena="";
        for(Cliente cliente: this.cola){
            cadena+=cliente.toString()+"\n";
        }
        return cadena;
    }
    
    
    public String imprimirInverso(){
        String cadena="";
        //revisar esto quitando el -1
        for(int i=this.cola.size()-1; i>=0;i--){
            cadena+=this.cola.poll()+"\n";
        }
        return cadena;
    }
    
    
}
