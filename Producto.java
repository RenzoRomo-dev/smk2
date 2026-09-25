public abstract class Producto {

    private static int totalProductos = 0;
    private String nombre;
    private int codigo;
    private int precio;
    private String categoria;

    // Constructores
    public Producto(String nombre, Integer codigo, Integer precio, String categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        totalProductos++;
    }

    public static int getTotalProductos() {
        return totalProductos;
    }

//    public static void setTotalProductos(int totalProductos) {
//        Producto.totalProductos = totalProductos;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract double calcularPrecioFinal();
    public abstract String mostrarInformacion();
}