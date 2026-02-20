/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 6
 * =================================================
 * Escriba un programa que determine la categoría de edad de una persona.
 */

import java.util.Scanner;

public class Tema3_Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite su edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("\n=== CATEGORÍA DE EDAD ===");
        
        String categoria;
        if (edad < 0) {
            categoria = "Edad inválida";
        } else if (edad < 5) {
            categoria = "Bebé";
        } else if (edad < 12) {
            categoria = "Niño";
        } else if (edad < 18) {
            categoria = "Adolescente";
        } else if (edad < 60) {
            categoria = "Adulto";
        } else {
            categoria = "Adulto Mayor";
        }
        
        System.out.println("Su edad es: " + edad + " años");
        System.out.println("Categoría: " + categoria);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite su edad: 35
 * 
 * === CATEGORÍA DE EDAD ===
 * Su edad es: 35 años
 * Categoría: Adulto
 */
