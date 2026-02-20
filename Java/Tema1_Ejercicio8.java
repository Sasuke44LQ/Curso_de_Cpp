/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 8
 * ==========================================
 * Escriba un programa que lea 3 calificaciones y calcule el promedio, 
 * mostrando si el estudiante pasó (promedio >= 60) o no.
 * 
 * EXPLICACIÓN:
 * - Promedio: suma de calificaciones / cantidad de calificaciones
 * - Validamos si pasó o no con una condición
 */

import java.util.Scanner;

public class Tema1_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer 3 calificaciones
        System.out.print("Digite la calificación 1: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Digite la calificación 2: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Digite la calificación 3: ");
        double calificacion3 = scanner.nextDouble();
        
        // Calcular promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        // Determinar si pasó
        String resultado = (promedio >= 60) ? "PASÓ" : "NO PASÓ";
        
        System.out.println("\n=== CALIFICACIONES ===");
        System.out.println("Calificación 1: " + calificacion1);
        System.out.println("Calificación 2: " + calificacion2);
        System.out.println("Calificación 3: " + calificacion3);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite la calificación 1: 75
 * Digite la calificación 2: 80
 * Digite la calificación 3: 85
 * 
 * === CALIFICACIONES ===
 * Calificación 1: 75.0
 * Calificación 2: 80.0
 * Calificación 3: 85.0
 * Promedio: 80.00
 * Resultado: PASÓ
 */
