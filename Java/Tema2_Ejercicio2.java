/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 2
 * ================================================
 * Escriba un programa que demuestre los operadores relacionales 
 * y lógicos. Compara dos números y muestra el resultado de distintas 
 * operaciones lógicas.
 * 
 * EXPLICACIÓN:
 * - Operadores relacionales: ==, !=, <, >, <=, >=
 * - Operadores lógicos: && (AND), || (OR), ! (NOT)
 */

import java.util.Scanner;

public class Tema2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite el segundo número: ");
        int b = scanner.nextInt();
        
        System.out.println("\n=== OPERADORES RELACIONALES ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        
        System.out.println("\n=== OPERADORES LÓGICOS ===");
        System.out.println("(a > 0) && (b > 0): " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0): " + ((a > 0) || (b > 0)));
        System.out.println("!(a == b): " + !(a == b));
        System.out.println("(a > 5) && (b < 100): " + ((a > 5) && (b < 100)));
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite el primer número: 10
 * Digite el segundo número: 20
 * 
 * === OPERADORES RELACIONALES ===
 * a = 10, b = 20
 * a == b: false
 * a != b: true
 * a < b: true
 * a > b: false
 * a <= b: true
 * a >= b: false
 * 
 * === OPERADORES LÓGICOS ===
 * (a > 0) && (b > 0): true
 * (a > 0) || (b > 0): true
 * !(a == b): true
 * (a > 5) && (b < 100): true
 */
