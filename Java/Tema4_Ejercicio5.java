/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 5
 * ===============================================
 * Escriba un programa que use do-while para pedir números hasta que el usuario 
 * ingrese un número negativo.
 */

import java.util.Scanner;

public class Tema4_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INGRESE NÚMEROS (negativo para terminar) ===");
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        do {
            System.out.print("Digite un número: ");
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);
        
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Cantidad de números: " + contador);
            System.out.println("Suma: " + suma);
            System.out.printf("Promedio: %.2f%n", promedio);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === INGRESE NÚMEROS (negativo para terminar) ===
 * Digite un número: 10
 * Digite un número: 20
 * Digite un número: 30
 * Digite un número: -1
 * 
 * === RESULTADOS ===
 * Cantidad de números: 3
 * Suma: 60
 * Promedio: 20.00
 */
