
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

public class Producto {
    private String nombre;
    private String fechaCaducidad;
    private int numLote;
    private double costeProduccion;

    public Producto(String nombre, String fechaCaducidad, int numLote, double costeProduccion) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
        this.costeProduccion = costeProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public double getCosteProduccion() {
        return costeProduccion;
    }

    public void setCosteProduccion(double costeProduccion) {
        this.costeProduccion = costeProduccion;
    }
    
    
    
    public double precioVenta(){
        double nose=0.0;
        
        return nose;
    }

    @Override
    public String toString() {
        return "Producto--" + "Nombre: " + nombre + ", Fecha de caducidad: " + fechaCaducidad + ", Numero de lote: " + numLote + ", Coste de produccion: " + costeProduccion;
    }
    
    
    
}
