/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 8
 * ======================================================
 * Escriba un programa que implemente una lista de tareas con prioridades.
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Tema8_Ejercicio8 {
    
    public static void main(String[] args) {
        // HashMap para guardar tareas por prioridad
        HashMap<String, ArrayList<String>> tareas = new HashMap<>();
        
        // Crear listas para cada prioridad
        tareas.put("Alta", new ArrayList<>());
        tareas.put("Media", new ArrayList<>());
        tareas.put("Baja", new ArrayList<>());
        
        // Agregar tareas
        tareas.get("Alta").add("Finalizar proyecto");
        tareas.get("Alta").add("Entregar reportes");
        
        tareas.get("Media").add("Responder emails");
        tareas.get("Media").add("Actualizar documentación");
        tareas.get("Media").add("Revisar código");
        
        tareas.get("Baja").add("Organizar escritorio");
        tareas.get("Baja").add("Limpiar archivos");
        
        System.out.println("=== LISTA DE TAREAS POR PRIORIDAD ===");
        
        // Mostrar tareas
        String[] prioridades = {"Alta", "Media", "Baja"};
        for (String prioridad : prioridades) {
            ArrayList<String> listaTareas = tareas.get(prioridad);
            System.out.println("\n--- Prioridad " + prioridad + " (" + 
                             listaTareas.size() + " tareas) ---");
            
            for (int i = 0; i < listaTareas.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + listaTareas.get(i));
            }
        }
        
        // Contar total de tareas
        int totalTareas = 0;
        for (ArrayList<String> lista : tareas.values()) {
            totalTareas += lista.size();
        }
        System.out.println("\nTotal de tareas: " + totalTareas);
        
        // Marcar tarea como completada
        System.out.println("\n--- Marcando 'Finalizar proyecto' como completada ---");
        tareas.get("Alta").remove("Finalizar proyecto");
        System.out.println("Tareas Alta restantes: " + tareas.get("Alta"));
    }
}

/*
 * SALIDA ESPERADA:
 * === LISTA DE TAREAS POR PRIORIDAD ===
 * 
 * --- Prioridad Alta (2 tareas) ---
 *   1. Finalizar proyecto
 *   2. Entregar reportes
 * 
 * --- Prioridad Media (3 tareas) ---
 *   1. Responder emails
 *   2. Actualizar documentación
 *   3. Revisar código
 * 
 * --- Prioridad Baja (2 tareas) ---
 *   1. Organizar escritorio
 *   2. Limpiar archivos
 * 
 * Total de tareas: 7
 * 
 * --- Marcando 'Finalizar proyecto' como completada ---
 * Tareas Alta restantes: [Entregar reportes]
 */
