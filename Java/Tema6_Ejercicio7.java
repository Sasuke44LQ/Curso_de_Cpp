/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 7
 * ============================================
 * Escriba un programa que revise si una cadena es un palíndromo (ignorando espacios).
 */

import java.util.Scanner;

public class Tema6_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String original = scanner.nextLine();
        
        // Eliminar espacios y convertir a minúsculas
        String limpia = original.replaceAll("\\s+", "").toLowerCase();
        
        // Invertir la cadena
        String invertida = new StringBuilder(limpia).reverse().toString();
        
        System.out.println("\n=== VERIFICAR PALÍNDROMO ===");
        System.out.println("Cadena original: '" + original + "'");
        System.out.println("Cadena limpia: '" + limpia + "'");
        System.out.println("Cadena invertida: '" + invertida + "'");
        
        if (limpia.equals(invertida)) {
            System.out.println("✓ La cadena ES un palíndromo.");
        } else {
            System.out.println("✗ La cadena NO es un palíndromo.");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: Anita lava la tina
 * 
 * === VERIFICAR PALÍNDROMO ===
 * Cadena original: 'Anita lava la tina'
 * Cadena limpia: 'anitalavlatina'
 * Cadena invertida: 'anitalavlatina'
 * ✓ La cadena ES un palíndromo.
 */
