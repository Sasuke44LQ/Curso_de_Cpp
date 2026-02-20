/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 7
 * ==========================================
 * Escriba un programa que calcule el índice de masa corporal (IMC) 
 * de una persona dado su peso en kg y altura en metros.
 * 
 * EXPLICACIÓN:
 * - IMC = peso / (altura²)
 */

import java.util.Scanner;

public class Tema1_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite su altura en metros: ");
        double altura = scanner.nextDouble();
        
        // Calcular IMC
        double imc = peso / (altura * altura);
        
        System.out.println("\n=== ÍNDICE DE MASA CORPORAL ===");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f%n", imc);
        
        // Clasificación
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc < 25) {
            clasificacion = "Peso normal";
        } else if (imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }
        
        System.out.println("Clasificación: " + clasificacion);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite su peso en kg: 70
 * Digite su altura en metros: 1.75
 * 
 * === ÍNDICE DE MASA CORPORAL ===
 * Peso: 70.0 kg
 * Altura: 1.75 m
 * IMC: 22.86
 * Clasificación: Peso normal
 */
