/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 7
 * ======================================================
 * Escriba un programa que implemente una agenda de contactos.
 */

import java.util.TreeMap;
import java.util.Map;

public class Tema8_Ejercicio7 {
    
    public static void main(String[] args) {
        // TreeMap mantiene las claves ordenadas
        TreeMap<String, String> agenda = new TreeMap<>();
        
        // Agregar contactos
        agenda.put("Ana García", "555-1234");
        agenda.put("Beatriz López", "555-5678");
        agenda.put("Carlos Martínez", "555-9012");
        agenda.put("Diana Rodríguez", "555-3456");
        agenda.put("Enrique Pérez", "555-7890");
        
        System.out.println("=== AGENDA DE CONTACTOS ===");
        
        // Mostrar todos los contactos (ordenados alfabéticamente)
        System.out.println("\n--- Todos los contactos ---");
        int contador = 1;
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.printf("%d. %-25s %s%n", contador++, 
                            entrada.getKey(), entrada.getValue());
        }
        
        // Buscar contacto
        System.out.println("\n--- Búsqueda ---");
        String nombreBuscado = "Carlos Martínez";
        if (agenda.containsKey(nombreBuscado)) {
            System.out.println(nombreBuscado + ": " + agenda.get(nombreBuscado));
        } else {
            System.out.println("Contacto no encontrado.");
        }
        
        // Contactos cuyo nombre empieza con 'D' o posterior
        System.out.println("\n--- Contactos desde 'D' en adelante ---");
        for (Map.Entry<String, String> entrada : agenda.tailMap("D").entrySet()) {
            System.out.println("  " + entrada.getKey() + ": " + entrada.getValue());
        }
        
        // Total de contactos
        System.out.println("\nTotal de contactos: " + agenda.size());
    }
}

/*
 * SALIDA ESPERADA:
 * === AGENDA DE CONTACTOS ===
 * 
 * --- Todos los contactos ---
 * 1. Ana García               555-1234
 * 2. Beatriz López            555-5678
 * 3. Carlos Martínez          555-9012
 * 4. Diana Rodríguez          555-3456
 * 5. Enrique Pérez            555-7890
 * 
 * --- Búsqueda ---
 * Carlos Martínez: 555-9012
 * 
 * --- Contactos desde 'D' en adelante ---
 *   Diana Rodríguez: 555-3456
 *   Enrique Pérez: 555-7890
 * 
 * Total de contactos: 5
 */
