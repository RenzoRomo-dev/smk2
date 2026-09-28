package com.example.modelo.productos;

import java.util.UUID;


public class ProductoHigiene extends Producto{

    public TipoDeUso tipoDeUso;

    public ProductoHigiene(String nombre, UUID codigo, Integer precio, String categoria, TipoDeUso tipoDeUso) {
        super(nombre, codigo, precio, categoria);
        this.tipoDeUso = tipoDeUso;
    }

    @Override //Completar Logica
    public double calcularPrecioFinal() {

        double precioBase = this.getPrecio(); // O super.getPrecio() / this.precio
        return precioBase * 1.10; // Aplica el 10% de impuesto específico
    }

    @Override
    public String mostrarInformacion() {
        return String.format("[%s] %s | Código: %s | Base: $%.2f | Final: $%.2f | Tipo de uso: %s",
                getCategoria(),
                getNombre(),
                getCodigo(),
                (double) getPrecio(),
                calcularPrecioFinal(),
                tipoDeUso

        );
    }



}


