/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 1
 * ==========================================
 * Escriba un programa que lea dos números desde la entrada estándar 
 * y muestre en la salida la suma, resta, multiplicación y división.
 * 
 * EXPLICACIÓN:
 * - Usamos la clase Scanner para leer entrada del usuario
 * - Realizamos operaciones aritméticas básicas
 * - Mostramos los resultados con println()
 */

import java.util.Scanner;

public class Tema1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lectura de dos números
        System.out.print("Digite un número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite otro número: ");
        int numero2 = scanner.nextInt();
        
        // Operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA (Ejemplo con 10 y 3):
 * ====================================
 * Digite un número: 10
 * Digite otro número: 3
 * 
 * === RESULTADOS ===
 * Suma: 13
 * Resta: 7
 * Multiplicación: 30
 * División: 3.3333333333333335
 */
