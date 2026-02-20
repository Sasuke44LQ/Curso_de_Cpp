/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 5
 * ================================================
 * Escriba un programa que demuestre el operador ternario (? :).
 * Este operador es una forma compacta de escribir un if-else.
 * 
 * EXPLICACIÓN:
 * - Sintaxis: condición ? valor_si_verdadero : valor_si_falso
 * - Si la condición es verdadera, retorna el primer valor
 * - Si la condición es falsa, retorna el segundo valor
 */

import java.util.Scanner;

public class Tema2_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        // Usar operador ternario
        String tipo = (numero % 2 == 0) ? "par" : "impar";
        String signo = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";
        String rango = (numero > 0 && numero < 10) ? "un dígito" : 
                       (numero >= 10 && numero < 100) ? "dos dígitos" : "otros";
        
        System.out.println("\n=== OPERADOR TERNARIO ===");
        System.out.println("Número: " + numero);
        System.out.println("Es: " + tipo);
        System.out.println("Signo: " + signo);
        System.out.println("Rango: " + rango);
        
        // Ejemplo de ternario anidado
        String clasificacion = (numero >= 90) ? "Excelente" :
                               (numero >= 80) ? "Muy bueno" :
                               (numero >= 70) ? "Bueno" :
                               (numero >= 60) ? "Aceptable" : "Insuficiente";
        System.out.println("Clasificación (asumiendo que es una nota): " + clasificacion);
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * Digite un número: 42
 * 
 * === OPERADOR TERNARIO ===
 * Número: 42
 * Es: par
 * Signo: positivo
 * Rango: dos dígitos
 * Clasificación (asumiendo que es una nota): Muy bueno
 */
