
package com.mycompany.unidad3.PILAS_COLAS_LISTAS;

public class Cliente {
    private int cuenta;
    private String nombre;
    private String apellidoPaterno;
    private double saldo;

    public Cliente(int cuenta, String nombre, String apellidoPaterno, double saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.saldo = saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "cuenta=" + cuenta + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", saldo=" + saldo + '}';
    }
    
    
}
