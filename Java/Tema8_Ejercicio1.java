/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 1
 * ======================================================
 * Escriba un programa que use HashMap para almacenar pares clave-valor.
 */

import java.util.HashMap;
import java.util.Map;

public class Tema8_Ejercicio1 {
    public static void main(String[] args) {
        // Crear HashMap
        HashMap<String, String> paises = new HashMap<>();
        
        // Agregar elementos
        paises.put("MX", "México");
        paises.put("ES", "España");
        paises.put("AR", "Argentina");
        paises.put("CO", "Colombia");
        paises.put("CL", "Chile");
        
        System.out.println("=== HASHMAP - PARES CLAVE-VALOR ===");
        System.out.println("Cantidad de elementos: " + paises.size());
        
        // Mostrar todos los elementos
        System.out.println("\nTodos los países:");
        for (Map.Entry<String, String> entrada : paises.entrySet()) {
            System.out.println("  " + entrada.getKey() + " -> " + entrada.getValue());
        }
        
        // Buscar por clave
        System.out.println("\nBúsqueda:");
        System.out.println("MX: " + paises.get("MX"));
        System.out.println("AR: " + paises.get("AR"));
        
        // Verificar si contiene una clave
        System.out.println("\n¿Contiene 'ES'? " + paises.containsKey("ES"));
        System.out.println("¿Contiene 'BR'? " + paises.containsKey("BR"));
        
        // Eliminar elemento
        paises.remove("CO");
        System.out.println("\nDespués de eliminar 'CO': " + paises.size() + " elementos");
    }
}

/*
 * SALIDA ESPERADA:
 * === HASHMAP - PARES CLAVE-VALOR ===
 * Cantidad de elementos: 5
 * 
 * Todos los países:
 *   MX -> México
 *   ES -> España
 *   AR -> Argentina
 *   CO -> Colombia
 *   CL -> Chile
 * 
 * Búsqueda:
 * MX: México
 * AR: Argentina
 * 
 * ¿Contiene 'ES'? true
 * ¿Contiene 'BR'? false
 * 
 * Después de eliminar 'CO': 4 elementos
 */
