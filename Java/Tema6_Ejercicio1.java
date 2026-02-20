/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 1
 * ============================================
 * Escriba un programa que lea una cadena y muestre su longitud.
 */

import java.util.Scanner;

public class Tema6_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.println("\n=== INFORMACIÓN DE LA CADENA ===");
        System.out.println("Cadena: '" + cadena + "'");
        System.out.println("Longitud: " + cadena.length() + " caracteres");
        System.out.println("Está vacía: " + cadena.isEmpty());
        System.out.println("Primera letra: " + cadena.charAt(0));
        System.out.println("Última letra: " + cadena.charAt(cadena.length() - 1));
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: Hola Mundo
 * 
 * === INFORMACIÓN DE LA CADENA ===
 * Cadena: 'Hola Mundo'
 * Longitud: 10 caracteres
 * Está vacía: false
 * Primera letra: H
 * Última letra: o
 */
