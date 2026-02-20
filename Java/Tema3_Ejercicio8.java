/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 8
 * =================================================
 * Escriba un programa que determine si un año es bisiesto.
 * Un año es bisiesto si: es divisible por 4 Y (no divisible por 100 OR divisible por 400)
 */

import java.util.Scanner;

public class Tema3_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un año: ");
        int año = scanner.nextInt();
        
        System.out.println("\n=== AÑO BISIESTO ===");
        
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        
        if (esBisiesto) {
            System.out.println("El año " + año + " ES BISIESTO.");
            System.out.println("Febrero tiene 29 días.");
        } else {
            System.out.println("El año " + año + " NO es bisiesto.");
            System.out.println("Febrero tiene 28 días.");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite un año: 2020
 * 
 * === AÑO BISIESTO ===
 * El año 2020 ES BISIESTO.
 * Febrero tiene 29 días.
 */
