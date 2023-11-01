
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

import java.util.Stack;


public class controlPilas {
    private Stack<Producto> pila;
    
    public controlPilas(){
        pila=new Stack<>();
    }
    
    
    public boolean pilaVacia(){
        return pila.isEmpty();
    }
    
    
    
    public String ponerEnPila(Producto producto){
            pila.push(producto);
            return "Agregado con exito";
        
         
    }
    
    public String quitar(){
        if (pilaVacia()) {
            return  "La pila esta vacia, no se puede eliminar nada";
        } else {
            Producto producto=pila.pop();
            
            return  "Elemento borrado exitosamente: "+producto.toString();
        }
    }
    
    public String imprimir(){
        String cadena="";
        for(Producto producto : pila){
            cadena+=producto.toString()+"\n";
        }
        return cadena;
    }
    
    public String imprimirInverso(){
        String cadena="";
        for(int i=pila.size()-1; i>=0; i--){
            cadena+=pila.get(i).toString()+"\n";
        }
        return cadena;
    }
}
