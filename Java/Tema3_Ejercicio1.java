/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 1
 * =================================================
 * Escriba un programa que lea dos números y determine cuál es el mayor.
 */

import java.util.Scanner;

public class Tema3_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("\n=== COMPARACIÓN DE NÚMEROS ===");
        
        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
        } else {
            System.out.println("El mayor es: " + numero2);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite el primer número: 10
 * Digite el segundo número: 20
 * 
 * === COMPARACIÓN DE NÚMEROS ===
 * El mayor es: 20
 */
