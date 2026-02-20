/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 10
 * =================================================
 * Escriba un programa que calcule la raíz cuadrada de un número 
 * usando expresiones y el método Math.sqrt().
 * 
 * EXPLICACIÓN:
 * - Math.sqrt(número) calcula la raíz cuadrada
 * - También podemos calcularla elevando a la potencia 0.5
 * - Mostramos ambos métodos
 */

import java.util.Scanner;

public class Tema2_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        double numero = scanner.nextDouble();
        
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de números negativos en reales.");
            scanner.close();
            return;
        }
        
        // Forma 1: Usando Math.sqrt()
        double raizSqrt = Math.sqrt(numero);
        
        // Forma 2: Usando Math.pow() con exponente 0.5
        double raizPow = Math.pow(numero, 0.5);
        
        System.out.println("\n=== RAÍZ CUADRADA ===");
        System.out.println("Número: " + numero);
        System.out.printf("Raíz cuadrada (Math.sqrt()): %.4f%n", raizSqrt);
        System.out.printf("Raíz cuadrada (Math.pow()): %.4f%n", raizPow);
        
        // Verificación
        System.out.printf("Verificación: %.4f² = %.2f%n", raizSqrt, raizSqrt * raizSqrt);
        
        // Tabla de raíces cuadradas
        System.out.println("\nTabla de raíces cuadradas del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("√%2d = %.4f%n", i, Math.sqrt(i));
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite un número: 16
 * 
 * === RAÍZ CUADRADA ===
 * Número: 16.0
 * Raíz cuadrada (Math.sqrt()): 4.0000
 * Raíz cuadrada (Math.pow()): 4.0000
 * Verificación: 4.0000² = 16.00
 * 
 * Tabla de raíces cuadradas del 1 al 10:
 * √ 1 = 1.0000
 * √ 2 = 1.4142
 * √ 3 = 1.7321
 * √ 4 = 2.0000
 * √ 5 = 2.2361
 * √ 6 = 2.4495
 * √ 7 = 2.6458
 * √ 8 = 2.8284
 * √ 9 = 3.0000
 * √10 = 3.1623
 */
