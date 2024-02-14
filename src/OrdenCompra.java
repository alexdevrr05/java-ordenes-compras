import java.time.LocalDate;

public class OrdenCompra {
    private int contador = 0;
    private int identificador;
    private String descripcion;
    private LocalDate fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int indiceProducto;

    // Constructor
    public OrdenCompra() {
        this.descripcion = "Esta es una descripcion de prueba";
        this.productos = new Producto[4];
    }

    public void addProducto(Producto producto) {
        if (indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }
    }

    // public static int getContador() {
    // return contador;
    // }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getSumaTotal() {
        for (Producto prod : this.productos) {
            this.contador += prod.getPrecio();
        }
        return this.contador;
    }

}