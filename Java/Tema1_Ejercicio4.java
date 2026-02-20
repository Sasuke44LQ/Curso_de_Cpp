/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 4
 * ==========================================
 * Escriba un programa que lea el lado de un cuadrado y calcule 
 * su área, perímetro y diagonal.
 * 
 * EXPLICACIÓN:
 * - Área: lado²
 * - Perímetro: lado * 4
 * - Diagonal: lado * √2 (usamos Math.sqrt())
 */

import java.util.Scanner;

public class Tema1_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        
        // Calcular área, perímetro y diagonal
        double area = lado * lado;
        double perimetro = lado * 4;
        double diagonal = lado * Math.sqrt(2);
        
        System.out.println("\n=== CUADRADO ===");
        System.out.println("Lado: " + lado);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite el lado del cuadrado: 4
 * 
 * === CUADRADO ===
 * Lado: 4.0
 * Área: 16.00
 * Perímetro: 16.00
 * Diagonal: 5.66
 */
