/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 8
 * ================================================
 * Escriba un programa que calcule el mínimo común múltiplo (MCM) 
 * de dos números.
 * 
 * EXPLICACIÓN:
 * - MCM(a, b) = (a * b) / MCD(a, b)
 * - Primero calculamos el MCD usando el algoritmo de Euclides
 * - Luego usamos la fórmula anterior
 */

import java.util.Scanner;

public class Tema2_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite el segundo número: ");
        int b = scanner.nextInt();
        
        // Guardar valores originales
        int numA = a;
        int numB = b;
        
        // Calcular MCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int mcd = a;
        
        // Calcular MCM
        int mcm = (numA * numB) / mcd;
        
        System.out.println("\n=== MÍNIMO COMÚN MÚLTIPLO ===");
        System.out.println("Números: " + numA + ", " + numB);
        System.out.println("MCD: " + mcd);
        System.out.println("MCM: " + mcm);
        
        // Mostrar los primeros múltiplos
        System.out.println("\nMúltiplos de " + numA + ": ");
        for (int i = 1; i <= 5; i++) {
            System.out.print((numA * i) + " ");
        }
        
        System.out.println("\nMúltiplos de " + numB + ": ");
        for (int i = 1; i <= 5; i++) {
            System.out.print((numB * i) + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite el primer número: 12
 * Digite el segundo número: 18
 * 
 * === MÍNIMO COMÚN MÚLTIPLO ===
 * Números: 12, 18
 * MCD: 6
 * MCM: 36
 * 
 * Múltiplos de 12: 
 * 12 24 36 48 60 
 * Múltiplos de 18: 
 * 18 36 54 72 90
 */
