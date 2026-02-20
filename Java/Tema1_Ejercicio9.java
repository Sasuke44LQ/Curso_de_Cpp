/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 9
 * ==========================================
 * Escriba un programa que lea un número entero y muestre su tabla 
 * de multiplicar del 1 al 10.
 * 
 * EXPLICACIÓN:
 * - Usamos un bucle for para iterar del 1 al 10
 * - Multiplicamos el número por cada valor del bucle
 */

import java.util.Scanner;

public class Tema1_Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n=== TABLA DE MULTIPLICAR DE " + numero + " ===");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite un número: 5
 * 
 * === TABLA DE MULTIPLICAR DE 5 ===
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */
