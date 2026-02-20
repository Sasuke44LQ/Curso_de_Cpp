/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 4
 * =================================================
 * Escriba un programa que determine si un número es primo.
 */

import java.util.Scanner;

public class Tema3_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n=== NÚMERO PRIMO ===");
        
        if (numero < 2) {
            System.out.println("El número " + numero + " NO es primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println("El número " + numero + " es PRIMO.");
            } else {
                System.out.println("El número " + numero + " NO es primo.");
            }
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un número: 17
 * 
 * === NÚMERO PRIMO ===
 * El número 17 es PRIMO.
 */
