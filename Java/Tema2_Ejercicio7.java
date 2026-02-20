/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 7
 * ================================================
 * Escriba un programa que calcule el máquina común divisor (MCD) 
 * usando expresiones y operadores.
 * 
 * EXPLICACIÓN:
 * - El MCD se puede calcular usando el algoritmo de Euclides
 * - MCD(a, b) = MCD(b, a % b) hasta que b = 0
 */

import java.util.Scanner;

public class Tema2_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite el segundo número: ");
        int b = scanner.nextInt();
        
        // Valores originales
        int numA = a;
        int numB = b;
        
        // Algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int mcd = a;
        
        System.out.println("\n=== MÁXIMO COMÚN DIVISOR ===");
        System.out.println("Números: " + numA + ", " + numB);
        System.out.println("MCD: " + mcd);
        
        // Mostrar divisores comunes
        System.out.println("\nDivisores comunes:");
        for (int i = 1; i <= mcd; i++) {
            if (numA % i == 0 && numB % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite el primer número: 48
 * Digite el segundo número: 18
 * 
 * === MÁXIMO COMÚN DIVISOR ===
 * Números: 48, 18
 * MCD: 6
 * 
 * Divisores comunes:
 * 1 2 3 6
 */
