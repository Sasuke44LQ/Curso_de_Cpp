/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 7
 * =================================================
 * Escriba un programa que determine si un carácter es una vocal o consonante.
 */

import java.util.Scanner;

public class Tema3_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un carácter: ");
        String input = scanner.nextLine().toLowerCase();
        
        System.out.println("\n=== CLASIFICACIÓN DE CARÁCTER ===");
        
        if (input.length() != 1) {
            System.out.println("Por favor ingrese solo un carácter.");
        } else {
            char c = input.charAt(0);
            
            if (!Character.isLetter(c)) {
                System.out.println("'" + c + "' NO es una letra.");
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("'" + c + "' es una VOCAL.");
            } else {
                System.out.println("'" + c + "' es una CONSONANTE.");
            }
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un carácter: a
 * 
 * === CLASIFICACIÓN DE CARÁCTER ===
 * 'a' es una VOCAL.
 */
