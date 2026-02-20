/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 5
 * ============================================
 * Escriba un programa que reemplace caracteres en una cadena.
 */

import java.util.Scanner;

public class Tema6_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Digite el carácter a reemplazar: ");
        String viejo = scanner.nextLine();
        
        System.out.print("Digite el carácter nuevo: ");
        String nuevo = scanner.nextLine();
        
        String cadenaModificada = cadena.replace(viejo, nuevo);
        
        System.out.println("\n=== REEMPLAZO DE CARACTERES ===");
        System.out.println("Original: '" + cadena + "'");
        System.out.println("Reemplazar: '" + viejo + "' por '" + nuevo + "'");
        System.out.println("Resultado: '" + cadenaModificada + "'");
        
        // Método replaceAll con expresiones regulares
        String conRegex = cadena.replaceAll("[aeiou]", "*");
        System.out.println("Reemplazar vocales: '" + conRegex + "'");
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: programacion
 * Digite el carácter a reemplazar: a
 * Digite el carácter nuevo: o
 * 
 * === REEMPLAZO DE CARACTERES ===
 * Original: 'programacion'
 * Reemplazar: 'a' por 'o'
 * Resultado: 'progromocoon'
 * Reemplazar vocales: 'pr*gr*m*c**n'
 */
