/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 3
 * ======================================================
 * Escriba un programa que use TreeSet para mantener elementos ordenados.
 */

import java.util.TreeSet;

public class Tema8_Ejercicio3 {
    public static void main(String[] args) {
        // TreeSet - elementos en orden automáticamente
        TreeSet<Integer> numeros = new TreeSet<>();
        
        int[] valores = {45, 23, 78, 12, 89, 56, 34};
        
        System.out.println("=== TREESET - ELEMENTOS ORDENADOS ===");
        System.out.println("Valores insertados: ");
        for (int val : valores) {
            System.out.print(val + " ");
            numeros.add(val);
        }
        
        System.out.println("\n\nElementos ordenados:");
        System.out.println(numeros);
        
        System.out.println("\nPrimer elemento: " + numeros.first());
        System.out.println("Último elemento: " + numeros.last());
        
        // TreeSet de cadenas
        TreeSet<String> palabras = new TreeSet<>();
        palabras.add("Zebra");
        palabras.add("Apple");
        palabras.add("Mango");
        palabras.add("Banana");
        palabras.add("Cherry");
        
        System.out.println("\n--- TreeSet de palabras ---");
        System.out.println("Insertadas: Zebra, Apple, Mango, Banana, Cherry");
        System.out.println("Ordenado: " + palabras);
        
        // Subconjuntos
        System.out.println("\nElementos desde 'B' hasta 'M' (sin incluir): " + 
                         numeros.subSet(23, 56));
        System.out.println("Elementos desde 'M' en adelante: " + 
                         numeros.tailSet(56));
        System.out.println("Elementos hasta 'M' (sin incluir): " + 
                         numeros.headSet(56));
    }
}

/*
 * SALIDA ESPERADA:
 * === TREESET - ELEMENTOS ORDENADOS ===
 * Valores insertados: 
 * 45 23 78 12 89 56 34 
 * 
 * Elementos ordenados:
 * [12, 23, 34, 45, 56, 78, 89]
 * 
 * Primer elemento: 12
 * Último elemento: 89
 * 
 * --- TreeSet de palabras ---
 * Insertadas: Zebra, Apple, Mango, Banana, Cherry
 * Ordenado: [Apple, Banana, Cherry, Mango, Zebra]
 * 
 * Elementos desde 'B' hasta 'M' (sin incluir): [23, 34, 45]
 * Elementos desde 'M' en adelante: [56, 78, 89]
 * Elementos hasta 'M' (sin incluir): [12, 23, 34, 45]
 */
