/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 10
 * ==================================================
 * Escriba un programa que determine la calificación según la nota obtenida.
 */

import java.util.Scanner;

public class Tema3_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la nota (0-100): ");
        double nota = scanner.nextDouble();
        
        System.out.println("\n=== CALIFICACIÓN ===");
        System.out.println("Nota: " + nota);
        
        String calificacion;
        if (nota < 0 || nota > 100) {
            calificacion = "NOTA INVÁLIDA";
        } else if (nota >= 90) {
            calificacion = "A - Excelente";
        } else if (nota >= 80) {
            calificacion = "B - Muy Bueno";
        } else if (nota >= 70) {
            calificacion = "C - Bueno";
        } else if (nota >= 60) {
            calificacion = "D - Aceptable";
        } else {
            calificacion = "F - Insuficiente";
        }
        
        System.out.println("Calificación: " + calificacion);
        
        // Determinar si pasó
        if (nota >= 60 && nota <= 100) {
            System.out.println("Resultado: APROBADO");
        } else if (nota < 60) {
            System.out.println("Resultado: REPROBADO");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite la nota (0-100): 85
 * 
 * === CALIFICACIÓN ===
 * Nota: 85.0
 * Calificación: B - Muy Bueno
 * Resultado: APROBADO
 */
