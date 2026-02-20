/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 4
 * ============================================
 * Escriba un programa que extraiga una subcadena de una cadena.
 */

import java.util.Scanner;

public class Tema6_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Digite el índice inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite el índice final: ");
        int fin = scanner.nextInt();
        
        System.out.println("\n=== EXTRACCIÓN DE SUBCADENA ===");
        System.out.println("Cadena: '" + cadena + "'");
        System.out.println("Índice: [" + inicio + ", " + fin + "]");
        
        if (inicio >= 0 && fin <= cadena.length() && inicio <= fin) {
            String subcadena = cadena.substring(inicio, fin);
            System.out.println("Subcadena extraída: '" + subcadena + "'");
        } else {
            System.out.println("Índices inválidos.");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una cadena: Programación
 * Digite el índice inicial: 0
 * Digite el índice final: 7
 * 
 * === EXTRACCIÓN DE SUBCADENA ===
 * Cadena: 'Programación'
 * Índice: [0, 7]
 * Subcadena extraída: 'Program'
 */
