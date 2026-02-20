/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 6
 * ==========================================
 * Escriba un programa que lea la base y altura de un triángulo 
 * y calcule su área.
 * 
 * EXPLICACIÓN:
 * - Área del triángulo: (base × altura) / 2
 */

import java.util.Scanner;

public class Tema1_Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la base del triángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite la altura del triángulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular área
        double area = (base * altura) / 2;
        
        System.out.println("\n=== TRIÁNGULO ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Área: %.2f%n", area);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite la base del triángulo: 10
 * Digite la altura del triángulo: 5
 * 
 * === TRIÁNGULO ===
 * Base: 10.0
 * Altura: 5.0
 * Área: 25.00
 */
