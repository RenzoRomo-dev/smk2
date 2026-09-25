import java.time.LocalDate;

public class ProductoAlimenticio extends Producto{

    public LocalDate fechaCaducicad;
    public boolean esPerecedero;

    public ProductoAlimenticio(String nombre, Integer codigo, Integer precio, String categoria, LocalDate fechaCaducicad, boolean esPerecedero) {
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

    public ProductoAlimenticio(String nombre, Integer codigo, Integer precio, String categoria) {
        super(nombre, codigo, precio, categoria);
    }

    @Override //Completar logica
    public double calcularPrecioFinal() {
        return 0;
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }

}
