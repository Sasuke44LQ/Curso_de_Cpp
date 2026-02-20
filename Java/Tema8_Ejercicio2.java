/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 2
 * ======================================================
 * Escriba un programa que use HashSet para almacenar elementos únicos.
 */

import java.util.HashSet;
import java.util.ArrayList;

public class Tema8_Ejercicio2 {
    public static void main(String[] args) {
        // Crear HashSet
        HashSet<Integer> conjunto = new HashSet<>();
        
        // Agregar elementos (duplicados serán ignorados)
        int[] numeros = {10, 20, 15, 30, 20, 25, 10, 35, 15};
        
        System.out.println("=== HASHSET - ELEMENTOS ÚNICOS ===");
        System.out.println("Números originales: ");
        for (int num : numeros) {
            System.out.print(num + " ");
            conjunto.add(num);
        }
        
        System.out.println("\n\nElementos únicos en el conjunto: " + conjunto.size());
        System.out.println(conjunto);
        
        // Operaciones con conjuntos
        HashSet<String> colores1 = new HashSet<>();
        colores1.add("Rojo");
        colores1.add("Azul");
        colores1.add("Verde");
        
        HashSet<String> colores2 = new HashSet<>();
        colores2.add("Rojo");
        colores2.add("Amarillo");
        colores2.add("Verde");
        
        System.out.println("\n--- Operaciones con conjuntos ---");
        System.out.println("Colores1: " + colores1);
        System.out.println("Colores2: " + colores2);
        
        // Unión
        HashSet<String> union = new HashSet<>(colores1);
        union.addAll(colores2);
        System.out.println("Unión: " + union);
        
        // Intersección
        HashSet<String> interseccion = new HashSet<>(colores1);
        interseccion.retainAll(colores2);
        System.out.println("Intersección: " + interseccion);
        
        // Diferencia
        HashSet<String> diferencia = new HashSet<>(colores1);
        diferencia.removeAll(colores2);
        System.out.println("Diferencia (Col1 - Col2): " + diferencia);
    }
}

/*
 * SALIDA ESPERADA:
 * === HASHSET - ELEMENTOS ÚNICOS ===
 * Números originales: 
 * 10 20 15 30 20 25 10 35 15 
 * 
 * Elementos únicos en el conjunto: 6
 * [10, 15, 20, 25, 30, 35]
 * 
 * --- Operaciones con conjuntos ---
 * Colores1: [Rojo, Azul, Verde]
 * Colores2: [Rojo, Amarillo, Verde]
 * Unión: [Rojo, Azul, Verde, Amarillo]
 * Intersección: [Rojo, Verde]
 * Diferencia (Col1 - Col2): [Azul]
 */
