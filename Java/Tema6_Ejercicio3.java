/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 3
 * ============================================
 * Escriba un programa que busque una subcadena dentro de una cadena.
 */

import java.util.Scanner;

public class Tema6_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la cadena principal: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Digite la subcadena a buscar: ");
        String subcadena = scanner.nextLine();
        
        System.out.println("\n=== BÚSQUEDA DE SUBCADENA ===");
        System.out.println("Cadena: '" + cadena + "'");
        System.out.println("Buscar: '" + subcadena + "'");
        
        if (cadena.contains(subcadena)) {
            int indice = cadena.indexOf(subcadena);
            System.out.println("Encontrado en la posición: " + indice);
            System.out.println("Conteo de ocurrencias: " + countOccurrences(cadena, subcadena));
        } else {
            System.out.println("No encontrado.");
        }
        
        scanner.close();
    }
    
    static int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }
}

/*
 * SALIDA ESPERADA:
 * Digite la cadena principal: banana
 * Digite la subcadena a buscar: ana
 * 
 * === BÚSQUEDA DE SUBCADENA ===
 * Cadena: 'banana'
 * Buscar: 'ana'
 * Encontrado en la posición: 1
 * Conteo de ocurrencias: 2
 */
