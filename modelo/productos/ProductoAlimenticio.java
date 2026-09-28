package com.example.modelo.productos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class ProductoAlimenticio extends Producto{

    public LocalDate fechaCaducicad;
    public boolean esPerecedero;

    public ProductoAlimenticio(String nombre, UUID codigo, Integer precio, String categoria, LocalDate fechaCaducicad, boolean esPerecedero) {
        super(nombre, codigo, precio, categoria);
        this.fechaCaducicad = fechaCaducicad;
        this.esPerecedero = esPerecedero;
    }


    // Getter y setter por las dudas
    public LocalDate getFechaCaducicad() {
        return fechaCaducicad;
    }

    public void setFechaCaducicad(LocalDate fechaCaducicad) {
        this.fechaCaducicad = fechaCaducicad;
    }

    public boolean isEsPerecedero() {
        return esPerecedero;
    }

    public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }

    @Override //Completar logica
    public double calcularPrecioFinal() {
        double precioBase = this.getPrecio();

        // ChronoUnit.DAYS.between
        // funcion que calcula los días restantes entre hoy y la fecha de caducidad
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), this.fechaCaducicad);

        if (diasRestantes >= 0 && diasRestantes < 5){
            return precioBase * 0.70;
        }

        return precioBase;

    }

    @Override
    public String mostrarInformacion() {
        return String.format("[%s] %s | Código: %s | Base: $%.2f | Final: $%.2f | Vence: %s | Perecedero: %s",
                getCategoria(),
                getNombre(),
                getCodigo(),
                (double) getPrecio(),
                calcularPrecioFinal(),
                fechaCaducicad,
                esPerecedero ? "Sí" : "No"
        );
    }

}
