/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 6
 * ===============================================
 * Escriba un programa que calcule el factorial de un número.
 */

import java.util.Scanner;

public class Tema4_Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n=== FACTORIAL ===");
        
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            
            System.out.println(numero + "! = " + factorial);
            
            // Mostrar el cálculo paso a paso
            System.out.println("\nPasos:");
            System.out.print(numero + "! = ");
            for (int i = numero; i >= 1; i--) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " × ");
                }
            }
            System.out.println(" = " + factorial);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un número: 5
 * 
 * === FACTORIAL ===
 * 5! = 120
 * 
 * Pasos:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
