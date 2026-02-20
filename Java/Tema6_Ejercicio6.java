/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 6
 * ============================================
 * Escriba un programa que divida una cadena en partes usando un delimitador.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Tema6_Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Digite el delimitador: ");
        String delimitador = scanner.nextLine();
        
        String[] partes = cadena.split(delimitador);
        
        System.out.println("\n=== DIVISIÓN DE CADENA ===");
        System.out.println("Cadena original: '" + cadena + "'");
        System.out.println("Delimitador: '" + delimitador + "'");
        System.out.println("Número de partes: " + partes.length);
        System.out.println("\nPartes:");
        
        for (int i = 0; i < partes.length; i++) {
            System.out.println((i + 1) + ". '" + partes[i] + "'");
        }
        
        // Ejemplo con CSV
        String csv = "Juan,25,España,Ingeniería";
        String[] datos = csv.split(",");
        System.out.println("\n=== EJEMPLO CSV ===");
        System.out.println("Nombre: " + datos[0]);
        System.out.println("Edad: " + datos[1]);
        System.out.println("País: " + datos[2]);
        System.out.println("Profesión: " + datos[3]);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: java,python,javascript,c++
 * Digite el delimitador: ,
 * 
 * === DIVISIÓN DE CADENA ===
 * Cadena original: 'java,python,javascript,c++'
 * Delimitador: ','
 * Número de partes: 4
 * 
 * Partes:
 * 1. 'java'
 * 2. 'python'
 * 3. 'javascript'
 * 4. 'c++'
 * 
 * === EJEMPLO CSV ===
 * Nombre: Juan
 * Edad: 25
 * País: España
 * Profesión: Ingeniería
 */
