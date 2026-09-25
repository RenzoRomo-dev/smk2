package com.example;

import java.util.UUID;

public class ProductoHigiene extends Producto{

    public String tipoDeUso;

    public ProductoHigiene(String nombre, UUID codigo, Integer precio, String categoria, String tipoDeUso) {
        super(nombre, codigo, precio, categoria);
        this.tipoDeUso = tipoDeUso;
    }

    @Override //Completar Logica
    public double calcularPrecioFinal() {
        return 0;
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }
}
