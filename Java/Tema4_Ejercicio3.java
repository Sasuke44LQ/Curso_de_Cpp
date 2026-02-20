/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 3
 * ===============================================
 * Escriba un programa que imprima un rectángulo usando bucles anidados.
 */

import java.util.Scanner;

public class Tema4_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        
        System.out.print("Digite el alto del rectángulo: ");
        int alto = scanner.nextInt();
        
        System.out.println("\n=== RECTÁNGULO ===");
        
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite el ancho del rectángulo: 5
 * Digite el alto del rectángulo: 3
 * 
 * === RECTÁNGULO ===
 * *****
 * *****
 * *****
 */
