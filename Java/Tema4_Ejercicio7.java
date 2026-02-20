/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 7
 * ===============================================
 * Escriba un programa que verifique si un número es palíndromo.
 * Un palíndromo es un número que se lee igual de frente y de atrás.
 */

import java.util.Scanner;

public class Tema4_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        String numStr = scanner.nextLine();
        
        System.out.println("\n=== PALÍNDROMO ===");
        System.out.println("Número original: " + numStr);
        
        // Invertir el número
        String numInvertido = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            numInvertido += numStr.charAt(i);
        }
        
        System.out.println("Número invertido: " + numInvertido);
        
        if (numStr.equals(numInvertido)) {
            System.out.println("El número " + numStr + " ES PALÍNDROMO.");
        } else {
            System.out.println("El número " + numStr + " NO es palíndromo.");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un número: 12321
 * 
 * === PALÍNDROMO ===
 * Número original: 12321
 * Número invertido: 12321
 * El número 12321 ES PALÍNDROMO.
 */
