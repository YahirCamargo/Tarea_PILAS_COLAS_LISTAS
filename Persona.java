
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private short correo_e;
    private String fechaNacimiento;
    
    
    
    

    public Persona(String nombre, String apellido, int edad, String genero, String direccion, short correo_e, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero= genero;
        this.direccion = direccion;
        this.correo_e = correo_e;
        this.fechaNacimiento = fechaNacimiento;
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getCorreo_e() {
        return correo_e;
    }

    public void setCorreo_e(short correo_e) {
        this.correo_e = correo_e;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + ", Apellido: " + apellido 
                + ", Edad: " + edad
                + ", Genero: "+ genero
                + ", Direccion: " + direccion 
                + ", Correo_e: " + correo_e 
                + ", Fechade nacimiento: " + fechaNacimiento;
    }
    
    
    
}
