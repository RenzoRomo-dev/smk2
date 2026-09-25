package com.example;

public class Cliente {
    private String nombre;
    private int dni;
    public static int totalclientes;

    // Constructor
    public Cliente(String nombre, int dni, int totalclientes) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Seters y Geters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public static int getTotalclientes() {
        return totalclientes;
    }

    public static void setTotalclientes(int totalclientes) {
        Cliente.totalclientes = totalclientes;
    }

    // Metodos
    public void comprar(Producto producto) {
    }

    public void mostrarCompras() {
    }
}
