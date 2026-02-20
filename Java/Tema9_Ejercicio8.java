/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 8
 * ========================================================
 * Implemente una clase Producto y un carrito de compras con comportamiento.
 */

import java.util.ArrayList;

public class Tema9_Ejercicio8 {
    
    static class Producto {
        private int id;
        private String nombre;
        private double precio;
        private int stock;
        
        public Producto(int id, String nombre, double precio, int stock) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }
        
        // Getters
        public int getId() { return id; }
        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
        public int getStock() { return stock; }
        
        // Métodos
        public boolean disminuirStock(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
                return true;
            }
            return false;
        }
        
        public void mostrarInfo() {
            System.out.printf("ID: %d | %s | $%.2f (Stock: %d)%n", 
                            id, nombre, precio, stock);
        }
    }
    
    static class CarritoCompras {
        private ArrayList<Producto> productos = new ArrayList<>();
        private ArrayList<Integer> cantidades = new ArrayList<>();
        
        public void agregarProducto(Producto producto, int cantidad) {
            if (producto.disminuirStock(cantidad)) {
                productos.add(producto);
                cantidades.add(cantidad);
                System.out.println("✓ Agregado: " + cantidad + " unidad(es) de " + 
                                 producto.getNombre());
            } else {
                System.out.println("✗ Stock insuficiente de " + producto.getNombre());
            }
        }
        
        public double calcularTotal() {
            double total = 0;
            for (int i = 0; i < productos.size(); i++) {
                total += productos.get(i).getPrecio() * cantidades.get(i);
            }
            return total;
        }
        
        public void mostrarCarrito() {
            System.out.println("\n=== CARRITO DE COMPRAS ===");
            double total = 0;
            for (int i = 0; i < productos.size(); i++) {
                Producto p = productos.get(i);
                int cantidad = cantidades.get(i);
                double subtotal = p.getPrecio() * cantidad;
                total += subtotal;
                System.out.printf("%s x%d = $%.2f%n", 
                                p.getNombre(), cantidad, subtotal);
            }
            System.out.printf("Total: $%.2f%n", total);
        }
    }
    
    public static void main(String[] args) {
        // Crear productos
        Producto laptop = new Producto(1, "Laptop", 999.99, 5);
        Producto mouse = new Producto(2, "Mouse", 25.50, 20);
        Producto teclado = new Producto(3, "Teclado", 75.00, 10);
        
        System.out.println("=== PRODUCTOS DISPONIBLES ===");
        laptop.mostrarInfo();
        mouse.mostrarInfo();
        teclado.mostrarInfo();
        
        // Crear carrito y agregar productos
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(laptop,1);
        carrito.agregarProducto(mouse, 2);
        carrito.agregarProducto(teclado, 1);
        carrito.agregarProducto(new Producto(4, "Monitor", 300, 3), 3);
        
        carrito.mostrarCarrito();
    }
}

/*
 * SALIDA ESPERADA:
 * === PRODUCTOS DISPONIBLES ===
 * ID: 1 | Laptop | $999.99 (Stock: 5)
 * ID: 2 | Mouse | $25.50 (Stock: 20)
 * ID: 3 | Teclado | $75.00 (Stock: 10)
 * ✓ Agregado: 1 unidad(es) de Laptop
 * ✓ Agregado: 2 unidad(es) de Mouse
 * ✓ Agregado: 1 unidad(es) de Teklado
 * ✓ Agregado: 3 unidad(es) de Monitor
 * 
 * === CARRITO DE COMPRAS ===
 * Laptop x1 = $999.99
 * Mouse x2 = $51.00
 * Teclado x1 = $75.00
 * Monitor x3 = $900.00
 * Total: $2025.99
 */
