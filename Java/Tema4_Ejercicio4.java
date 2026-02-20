/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 4
 * ===============================================
 * Escriba un programa que imprima un triángulo usando bucles.
 */

import java.util.Scanner;

public class Tema4_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la altura del triángulo: ");
        int altura = scanner.nextInt();
        
        System.out.println("\n=== TRIÁNGULO ASCENDENTE ===");
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== TRIÁNGULO DESCENDENTE ===");
        
        for (int i = altura; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite la altura del triángulo: 4
 * 
 * === TRIÁNGULO ASCENDENTE ===
 * *
 * **
 * ***
 * ****
 * 
 * === TRIÁNGULO DESCENDENTE ===
 * ****
 * ***
 * **
 * *
 */
