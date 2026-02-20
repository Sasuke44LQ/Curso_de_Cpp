/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 3
 * ==========================================
 * Escriba un programa que calcule el área y perímetro de un círculo 
 * dado su radio.
 * 
 * EXPLICACIÓN:
 * - Área del círculo: π * r²
 * - Perímetro (circunferencia): 2 * π * r
 * - Usamos Math.PI para obtener el valor de pi
 */

import java.util.Scanner;

public class Tema1_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Calcular área y perímetro
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("\n=== CÍRCULO ===");
        System.out.println("Radio: " + radio);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite el radio del círculo: 5
 * 
 * === CÍRCULO ===
 * Radio: 5.0
 * Área: 78.54
 * Perímetro: 31.42
 */
