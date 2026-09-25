package com.example;

public class ProductoElectronico extends Producto{

    public int garantia;

//    public ProductoElectronico(String nombre, Integer codigo, Integer precio, String categoria) {
//        super(nombre, codigo, precio, categoria);
//    }

    public ProductoElectronico(String nombre, Integer codigo, Integer precio, String categoria, int garantia) {
        super(nombre, codigo, precio, categoria);
        this.garantia = garantia;
    }

    @Override// Completar logica
    public double calcularPrecioFinal() {
        return 0;
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }
}
