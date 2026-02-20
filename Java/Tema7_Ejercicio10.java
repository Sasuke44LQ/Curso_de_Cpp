/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 10
 * ===========================================
 * Escriba un programa que implemente la sucesión de Fibonacci usando recursión.
 */

public class Tema7_Ejercicio10 {
    
    // Fibonacci recursivo
    static long fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    
    // Fibonacci iterativo (más eficiente)
    static long fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        long fib1 = 0, fib2 = 1;
        for (int i = 2; i <= n; i++) {
            long fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib2;
    }
    
    // Fibonacci con memoización
    static long[] memo = new long[50];
    
    static long fibonacciMemo(int n) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        return memo[n];
    }
    
    public static void main(String[] args) {
        System.out.println("=== FIBONACCI ===");
        
        System.out.println("\n--- Primeros 15 términos ---");
        for (int i = 0; i < 15; i++) {
            System.out.print(fibonacciIterativo(i) + " ");
        }
        System.out.println();
        
        System.out.println("\n--- Comparación de métodos ---");
        for (int n = 10; n <= 20; n++) {
            long inicio = System.nanoTime();
            long resultado = fibonacciIterativo(n);
            long tiempo = System.nanoTime() - inicio;
            
            System.out.printf("Fibonacci(%2d) = %6d (tiempo: %,d ns)%n", 
                            n, resultado, tiempo);
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === FIBONACCI ===
 * 
 * --- Primeros 15 términos ---
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
 * 
 * --- Comparación de métodos ---
 * Fibonacci(10) =     55 (tiempo: 1,000 ns)
 * Fibonacci(11) =     89 (tiempo: 1,200 ns)
 * ... (hasta 20)
 */
