/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 3
 * =================================================
 * Escriba un programa que determine la mayor edad entre tres personas.
 */

import java.util.Scanner;

public class Tema3_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la edad de la persona 1: ");
        int edad1 = scanner.nextInt();
        
        System.out.print("Digite la edad de la persona 2: ");
        int edad2 = scanner.nextInt();
        
        System.out.print("Digite la edad de la persona 3: ");
        int edad3 = scanner.nextInt();
        
        System.out.println("\n=== MAYOR EDAD ===");
        
        int mayor = edad1;
        if (edad2 > mayor) mayor = edad2;
        if (edad3 > mayor) mayor = edad3;
        
        System.out.println("La mayor edad es: " + mayor + " años");
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite la edad de la persona 1: 25
 * Digite la edad de la persona 2: 30
 * Digite la edad de la persona 3: 28
 * 
 * === MAYOR EDAD ===
 * La mayor edad es: 30 años
 */
