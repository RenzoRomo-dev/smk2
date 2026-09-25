package com.example;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String productosDisponible;
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Producto> listaPoductos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        if (producto != null){
            listaPoductos.add(producto);
            System.out.println("producto agregado con exito");
        } else {
            System.out.println("el producto no es valido");
        }
    };



}
