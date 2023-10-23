
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
        return cola.isEmpty();
    }
    
    public boolean colaLlena(){
            return (cola.size()>=20);
    }
    
    
    public String ponerEnCola(Cliente cliente){
        if(colaLlena())
            return "Desbordamiento";
        else{
            this.cola.add(cliente);
            return "Cliente agregado";
        }
    }
    
    public String quitarDeCola(){
        if(colaVacia())
            return "Cola vacia, no se puede quitar nada";
        else{
            cola.remove();
            return "Elemento quitado con exito";
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
        
        for(int i=this.cola.size()-1; i>=0;i--){
            cadena+=this.cola.poll()+"\n";
        }
        return cadena;
    }
    
    
}
