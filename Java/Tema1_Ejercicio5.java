/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 5
 * ==========================================
 * Escriba un programa que realice la conversión de temperatura 
 * de Celsius a Fahrenheit y Kelvin.
 * 
 * EXPLICACIÓN:
 * - Fahrenheit: (C × 9/5) + 32
 * - Kelvin: C + 273.15
 */

import java.util.Scanner;

public class Tema1_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Conversiones
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("\n=== CONVERSIÓN DE TEMPERATURAS ===");
        System.out.println("Celsius: " + celsius + "°C");
        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite la temperatura en Celsius: 0
 * 
 * === CONVERSIÓN DE TEMPERATURAS ===
 * Celsius: 0.0°C
 * Fahrenheit: 32.00°F
 * Kelvin: 273.15 K
 */
