public class ClienteVIP extends Cliente {
    private final int descuentoVIP;

    // Constructor
    public ClienteVIP(String nombre, int dni, int totalclientes, int descuentoVIP) {
        super(nombre, dni, totalclientes);
        this.descuentoVIP = descuentoVIP;
    }

    // Metodos
    public void aplicarDescuentoVIP(Producto producto){
    }
}
