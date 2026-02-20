/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 2
 * ============================================
 * Escriba un programa que convierta una cadena a mayúsculas y minúsculas.
 */

import java.util.Scanner;

public class Tema6_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.println("\n=== CONVERSIÓN DE CADENA ===");
        System.out.println("Original: " + cadena);
        System.out.println("Mayúsculas: " + cadena.toUpperCase());
        System.out.println("Minúsculas: " + cadena.toLowerCase());
        System.out.println("Primera letra mayúscula: " + cadena.substring(0, 1).toUpperCase() + 
                         cadena.substring(1).toLowerCase());
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: JaVa ProGraMinG
 * 
 * === CONVERSIÓN DE CADENA ===
 * Original: JaVa ProGraMinG
 * Mayúsculas: JAVA PROGRAMING
 * Minúsculas: java programing
 * Primera letra mayúscula: Java programing
 */
