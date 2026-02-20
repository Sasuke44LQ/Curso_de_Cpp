/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 2
 * ==========================================
 * Escriba un programa que lea un número entero y muestre si es positivo, 
 * negativo o cero. Además, muestre el valor absoluto.
 * 
 * EXPLICACIÓN:
 * - Usamos condicionales para validar el número
 * - Math.abs() nos da el valor absoluto de un número
 */

import java.util.Scanner;

public class Tema1_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        // Determinar el tipo de número
        String tipo;
        if (numero > 0) {
            tipo = "positivo";
        } else if (numero < 0) {
            tipo = "negativo";
        } else {
            tipo = "cero";
        }
        
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El número es: " + tipo);
        System.out.println("Valor absoluto: " + valorAbsoluto);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite un número: -15
 * El número es: negativo
 * Valor absoluto: 15
 */
