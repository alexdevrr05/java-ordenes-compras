public class EjemploOrdenes {
    public static void main(String[] args) throws Exception {

        OrdenCompra orden1 = new OrdenCompra();

        orden1.setCliente(new Cliente("Cristina", "Aguilera"));

        orden1.addProducto(new Producto("Apple", "Iphone", 2000));
        orden1.addProducto(new Producto("Dell", "Inspirion 99", 2500));
        orden1.addProducto(new Producto("Skypeak", "Mochila Antirrobo", 250));
        orden1.addProducto(new Producto("Logitech", "Master MX Master 3S", 95));

        System.out.println("============================================================================");
        System.out.println("Detalles de los productos de la orden 1, a nombre de : " + orden1.getCliente());
        for (Producto prod : orden1.getProductos()) {
            System.out.println("fabricante = " + prod.getFabricante() + ", nombre = " + prod.getNombre() + ", precio = "
                    + prod.getPrecio() + " dolares");
        }

        System.out.println("SUMA TOTAL = " + orden1.getSumaTotal() + " dólares");

        OrdenCompra orden2 = new OrdenCompra();
        orden2.setCliente(new Cliente("Juan", "Rulfo"));

        orden2.addProducto(new Producto("Samsung", "Galaxy S22 Ultra", 1800));
        orden2.addProducto(new Producto("HP", "Spectre x360", 2200));
        orden2.addProducto(new Producto("Sony", "WH-1000XM4", 350));
        orden2.addProducto(new Producto("Nike", "Air Zoom Pegasus 38", 120));
        // ignora esto debido a que sobreasa los 4 productos que declaramos
        // ESTO: this.productos = new Producto[4];
        // orden2.addProducto(new Producto("EXAMPLE", "EXAMPLE", 120));

        System.out.println("============================================================================");
        System.out.println("Detalles de los productos de la orden 2, a nombre de : " + orden2.getCliente());
        for (Producto prod : orden2.getProductos()) {
            System.out.println("fabricante = " + prod.getFabricante() + ", nombre = " + prod.getNombre() + ", precio = "
                    + prod.getPrecio() + " dolares ");
        }

        System.out.println("SUMA TOTAL = " + orden2.getSumaTotal() + " dólares");

        OrdenCompra orden3 = new OrdenCompra();
        orden3.setCliente(new Cliente("Julio", "Cortazar"));

        orden3.addProducto(new Producto("Microsoft", "Surface Laptop Studio", 2800));
        orden3.addProducto(new Producto("Canon", "EOS R5", 4000));
        orden3.addProducto(new Producto("Bose", "QuietComfort 45", 300));
        orden3.addProducto(new Producto("Adidas", "Ultraboost 22", 180));

        System.out.println("============================================================================");
        System.out.println("Detalles de los productos de la orden 3, a nombre de : " + orden3.getCliente());
        for (Producto prod : orden3.getProductos()) {
            System.out.println("fabricante = " + prod.getFabricante() + ", nombre = " + prod.getNombre() + ", precio = "
                    + prod.getPrecio() + " dolares");
        }
        System.out.println("SUMA TOTAL = " + orden3.getSumaTotal() + " dólares");

    }
}
