/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 10
 * ================================================
 * Escriba un programa que genere la serie de Fibonacci hasta el término N-ésimo.
 */

import java.util.Scanner;

public class Tema4_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos de la serie de Fibonacci deseas? ");
        int n = scanner.nextInt();
        
        System.out.println("\n=== SERIE DE FIBONACCI ===");
        
        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            long fib1 = 0, fib2 = 1;
            
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    System.out.print(fib1);
                } else if (i == 2) {
                    System.out.print(", " + fib2);
                } else {
                    long fib3 = fib1 + fib2;
                    System.out.print(", " + fib3);
                    fib1 = fib2;
                    fib2 = fib3;
                }
            }
            System.out.println();
            
            // Mostrar suma
            System.out.println("\nFibonacci(1) = 0");
            System.out.println("Fibonacci(2) = 1");
            System.out.println("Fibonacci(3) = 1");
            System.out.println("Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ¿Cuántos términos de la serie de Fibonacci deseas? 7
 * 
 * === SERIE DE FIBONACCI ===
 * 0, 1, 1, 2, 3, 5, 8
 * 
 * Fibonacci(1) = 0
 * Fibonacci(2) = 1
 * Fibonacci(3) = 1
 * Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
 */
