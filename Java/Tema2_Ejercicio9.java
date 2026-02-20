/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 9
 * ================================================
 * Escriba un programa que calcule potencias usando operadores.
 * 
 * EXPLICACIÓN:
 * - Usamos Math.pow(base, exponente) para calcular potencias
 * - También podemos usar un bucle para multiplicar repetidamente
 * - Demostramos ambas formas
 */

import java.util.Scanner;

public class Tema2_Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la base: ");
        int base = scanner.nextInt();
        
        System.out.print("Digite el exponente: ");
        int exponente = scanner.nextInt();
        
        // Forma 1: Usando Math.pow()
        double resultadoMath = Math.pow(base, exponente);
        
        // Forma 2: Usando bucle
        long resultadoBucle = 1;
        for (int i = 0; i < exponente; i++) {
            resultadoBucle *= base;
        }
        
        System.out.println("\n=== CÁLCULO DE POTENCIA ===");
        System.out.println("Base: " + base);
        System.out.println("Exponente: " + exponente);
        System.out.println("Resultado (Math.pow()): " + (long)resultadoMath);
        System.out.println("Resultado (usando bucle): " + resultadoBucle);
        
        // Mostrar el cálculo paso a paso
        System.out.println("\nPasos:");
        long paso = 1;
        for (int i = 1; i <= exponente; i++) {
            paso *= base;
            System.out.println("  " + base + "^" + i + " = " + paso);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite la base: 2
 * Digite el exponente: 5
 * 
 * === CÁLCULO DE POTENCIA ===
 * Base: 2
 * Exponente: 5
 * Resultado (Math.pow()): 32
 * Resultado (usando bucle): 32
 * 
 * Pasos:
 *   2^1 = 2
 *   2^2 = 4
 *   2^3 = 8
 *   2^4 = 16
 *   2^5 = 32
 */
