/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 9
 * ======================================================
 * Escriba un programa que implemente un carrito de compras con HashMap.
 */

import java.util.HashMap;
import java.util.Map;

public class Tema8_Ejercicio9 {
    
    public static void main(String[] args) {
        // HashMap para guardar productos y precios
        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Laptop", 999.99);
        precios.put("Mouse", 25.50);
        precios.put("Teclado", 75.00);
        precios.put("Monitor", 299.99);
        precios.put("Webcam", 80.00);
        
        // HashMap para cantidades en el carrito (producto -> cantidad)
        HashMap<String, Integer> carrito = new HashMap<>();
        
        System.out.println("=== CARRITO DE COMPRAS ===");
        
        // Agregar productos al carrito
        carrito.put("Laptop", 1);
        carrito.put("Mouse", 2);
        carrito.put("Teclado", 1);
        carrito.put("Monitor", 1);
        
        // Mostrar carrito
        System.out.println("\n--- Productos en carrito ---");
        double total = 0;
        for (Map.Entry<String, Integer> entrada : carrito.entrySet()) {
            String producto = entrada.getKey();
            int cantidad = entrada.getValue();
            double precio = precios.get(producto);
            double subtotal = precio * cantidad;
            total += subtotal;
            
            System.out.printf("%-15s | Cantidad: %d | Precio: $%.2f | Subtotal: $%.2f%n",
                            producto, cantidad, precio, subtotal);
        }
        
        // Calcular impuesto y total
        double impuesto = total * 0.16;  // 16% IVA
        double totalConImpuesto = total + impuesto;
        
        System.out.println("\n--- Resumen ---");
        System.out.printf("Subtotal:        $%.2f%n", total);
        System.out.printf("Impuesto (16%):  $%.2f%n", impuesto);
        System.out.printf("Total:           $%.2f%n", totalConImpuesto);
        
        // Aplicar descuento si total > 500
        if (total > 500) {
            double descuento = total * 0.10;
            System.out.printf("\n¡Descuento 10%!: -$%.2f%n", descuento);
            System.out.printf("Total final:     $%.2f%n", totalConImpuesto - descuento);
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === CARRITO DE COMPRAS ===
 * 
 * --- Productos en carrito ---
 * Laptop          | Cantidad: 1 | Precio: $999.99 | Subtotal: $999.99
 * Mouse           | Cantidad: 2 | Precio: $25.50 | Subtotal: $51.00
 * Teclado         | Cantidad: 1 | Precio: $75.00 | Subtotal: $75.00
 * Monitor         | Cantidad: 1 | Precio: $299.99 | Subtotal: $299.99
 * 
 * --- Resumen ---
 * Subtotal:        $1425.97
 * Impuesto (16%):  $228.16
 * Total:           $1654.13
 * 
 * ¡Descuento 10%!: -$142.60
 * Total final:     $1511.53
 */
