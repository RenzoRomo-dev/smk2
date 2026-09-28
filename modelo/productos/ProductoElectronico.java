package com.example.modelo.productos;

import java.util.UUID;

public class ProductoElectronico extends Producto{

    public int garantia;

//    public ProductoElectronico(String nombre, Integer codigo, Integer precio, String categoria) {
//        super(nombre, codigo, precio, categoria);
//    }

    public ProductoElectronico(String nombre, UUID codigo, Integer precio, String categoria, int garantia) {
        super(nombre, codigo, precio, categoria);
        this.garantia = garantia;
    }

    @Override// Completar logica
    public double calcularPrecioFinal() {
        double precioBase =  this.getPrecio();

        if (this.garantia > 2){
            return precioBase * 1.05;
        }

        return precioBase;
    }

    @Override
    public String mostrarInformacion() {
        return String.format("[%s] %s | Código: %s | Base: $%.2f | Final: $%.2f | Garantia: %s",
                getCategoria(),
                getNombre(),
                getCodigo(),
                (double) getPrecio(),
                calcularPrecioFinal(),
                garantia + (garantia == 1 ? " año" : " años")

        );
    }
}
