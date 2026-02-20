/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 2
 * =================================================
 * Escriba un programa que determine si un número es par o impar.
 */

import java.util.Scanner;

public class Tema3_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n=== NÚMERO PAR O IMPAR ===");
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un número: 7
 * 
 * === NÚMERO PAR O IMPAR ===
 * El número 7 es IMPAR
 */
