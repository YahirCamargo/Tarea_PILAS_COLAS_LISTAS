
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

public class testeo {
    public static void main(String []args){
        controlListasEnlazadas cle=new controlListasEnlazadas();
        controlPilas cp=new controlPilas();
        controlColas cc=new controlColas();
        
        //String nombre, String fechaCaducidad, int numLote, double costeProduccion
        /*
        
        cp.ponerEnPila(new Producto("Yahir", "Mayo", 993, 88.0));
        cp.ponerEnPila(new Producto("Nada", "mayin", 993, 88.0));
        System.out.println(cp.imprimir());
        System.out.println(cp.quitar());
        System.out.println(cp.imprimir());
        */
       /*
        cle.agregarFinal(new Persona("Penultimo", "Perez", 23,'B',123,"Never/12"));
        cle.agregarPrimero(new Persona("Primero", "Ramirez", 32,'G',123,"12/04/2020"));
        cle.agregarFinal(new Persona("Ultimo", "Perez", 23,'B',123,"Never/12"));
        cle.eliminarPorNombre("Primero");
        cle.agregarEnPosicion(new Persona("Primero", "Ramirez", 32,'G',123,"12/04/2020"), 0);
        System.out.println(cle.imprimir());
        */
       
       cc.ponerEnCola(new Cliente(123,"Yir","Camargo",123));
       cc.ponerEnCola(new Cliente(1232,"no","Camargo",123));
       
        System.out.println("Reporte\n"+cc.imprimir());
        System.out.println("\nInverso\n"+cc.imprimirInverso());
        cc.quitarDeCola();
        System.out.println(cc.imprimir());
        
    }
}
