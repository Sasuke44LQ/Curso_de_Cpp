/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 10
 * ===========================================
 * Escriba un programa que lea un número y muestre la suma de sus dígitos.
 * Por ejemplo, si el número es 123, la suma es 1+2+3=6.
 * 
 * EXPLICACIÓN:
 * - Convertimos el número a String
 * - Iteramos sobre cada carácter usando charAt()
 * - Convertimos cada carácter de vuelta a int
 * - Sumamos todos los dígitos
 */

import java.util.Scanner;

public class Tema1_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        String numStr = scanner.nextLine();
        
        int suma = 0;
        
        // Iterar sobre cada dígito
        for (int i = 0; i < numStr.length(); i++) {
            char digito = numStr.charAt(i);
            
            // Verificar que sea un dígito válido
            if (Character.isDigit(digito)) {
                suma += Character.getNumericValue(digito);
            }
        }
        
        System.out.println("\n=== SUMA DE DÍGITOS ===");
        System.out.println("Número: " + numStr);
        System.out.println("Suma de dígitos: " + suma);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ===============
 * Digite un número: 12345
 * 
 * === SUMA DE DÍGITOS ===
 * Número: 12345
 * Suma de dígitos: 15
 * 
 * (1+2+3+4+5 = 15)
 */
