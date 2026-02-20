/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 3
 * ==========================================
 * Escriba un programa con una función recursiva para calcular factorial.
 */

public class Tema7_Ejercicio3 {
    
    static long factorial(int n) {
        if (n < 0) {
            return -1;  // Error
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("=== FACTORIAL RECURSIVO ===");
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === FACTORIAL RECURSIVO ===
 * 0! = 1
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * 7! = 5040
 * 8! = 40320
 * 9! = 362880
 * 10! = 3628800
 */
