/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 6
 * ======================================================
 * Escriba un programa que use HashMap para guardar registros de estudiantes.
 */

import java.util.HashMap;
import java.util.Map;

public class Tema8_Ejercicio6 {
    public static void main(String[] args) {
        // HashMap con datos más complejos
        HashMap<Integer, String> estudiantes = new HashMap<>();
        
        // Agregar estudiantes (ID -> Nombre)
        estudiantes.put(1001, "Juan Pérez");
        estudiantes.put(1002, "María García");
        estudiantes.put(1003, "Carlos López");
        estudiantes.put(1004, "Ana Martínez");
        
        // HashMap para calificaciones (ID -> Promedio)
        HashMap<Integer, Double> calificaciones = new HashMap<>();
        calificaciones.put(1001, 85.5);
        calificaciones.put(1002, 92.0);
        calificaciones.put(1003, 88.5);
        calificaciones.put(1004, 95.0);
        
        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        
        // Mostrar todos los estudiantes
        System.out.println("\n--- Estudiantes ---");
        for (Map.Entry<Integer, String> entrada : estudiantes.entrySet()) {
            int id = entrada.getKey();
            String nombre = entrada.getValue();
            double promedio = calificaciones.get(id);
            
            System.out.printf("ID: %d | Nombre: %-15s | Promedio: %.1f%n",
                            id, nombre, promedio);
        }
        
        // Buscar estudiante
        System.out.println("\n--- Búsqueda ---");
        int idBuscado = 1002;
        if (estudiantes.containsKey(idBuscado)) {
            System.out.println("Estudiante " + idBuscado + ": " + 
                             estudiantes.get(idBuscado));
            System.out.println("Promedio: " + calificaciones.get(idBuscado));
        }
        
        // Calcular promedio general
        double sumaPromedio = 0;
        for (double promedio : calificaciones.values()) {
            sumaPromedio += promedio;
        }
        double promedioGeneral = sumaPromedio / calificaciones.size();
        
        System.out.println("\n--- Estadísticas ---");
        System.out.printf("Promedio general: %.1f%n", promedioGeneral);
    }
}

/*
 * SALIDA ESPERADA:
 * === REGISTRO DE ESTUDIANTES ===
 * 
 * --- Estudiantes ---
 * ID: 1001 | Nombre: Juan Pérez      | Promedio: 85.5
 * ID: 1002 | Nombre: María García    | Promedio: 92.0
 * ID: 1003 | Nombre: Carlos López    | Promedio: 88.5
 * ID: 1004 | Nombre: Ana Martínez    | Promedio: 95.0
 * 
 * --- Búsqueda ---
 * Estudiante 1002: María García
 * Promedio: 92.0
 * 
 * --- Estadísticas ---
 * Promedio general: 90.3
 */
