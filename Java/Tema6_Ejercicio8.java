/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 8
 * ============================================
 * Escriba un programa que cuente la frecuencia de caracteres en una cadena.
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Tema6_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        HashMap<Character, Integer> frecuencia = new HashMap<>();
        
        for (char c : cadena.toCharArray()) {
            if (c != ' ') {  // Ignorar espacios
                frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("\n=== FRECUENCIA DE CARACTERES ===");
        System.out.println("Cadena: '" + cadena + "'");
        System.out.println("\nFrecuencia:");
        
        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " veces");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: javascript
 * 
 * === FRECUENCIA DE CARACTERES ===
 * Cadena: 'javascript'
 * 
 * Frecuencia:
 * 'j': 1 veces
 * 'a': 2 veces
 * 'v': 1 veces
 * 's': 1 veces
 * 'c': 1 veces
 * 'r': 1 veces
 * 'i': 1 veces
 * 'p': 1 veces
 * 't': 1 veces
 */
