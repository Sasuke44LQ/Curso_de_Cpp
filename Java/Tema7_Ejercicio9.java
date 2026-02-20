/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 9
 * ==========================================
 * Escriba un programa que use sobrecarga de funciones (overloading).
 */

public class Tema7_Ejercicio9 {
    
    // Sumar dos enteros
    static int sumar(int a, int b) {
        return a + b;
    }
    
    // Sumar tres enteros
    static int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sumar dos doubles
    static double sumar(double a, double b) {
        return a + b;
    }
    
    // Sumar dos cadenas (concatenación)
    static String sumar(String a, String b) {
        return a + " " + b;
    }
    
    // Sumar arreglo
    static int sumar(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.println("=== SOBRECARGA DE FUNCIONES (OVERLOADING) ===");
        
        System.out.println("\n--- Sumar enteros ---");
        System.out.println("sumar(5, 10) = " + sumar(5, 10));
        System.out.println("sumar(5, 10, 15) = " + sumar(5, 10, 15));
        
        System.out.println("\n--- Sumar doubles ---");
        System.out.println("sumar(5.5, 10.5) = " + sumar(5.5, 10.5));
        
        System.out.println("\n--- Concatenar cadenas ---");
        System.out.println("sumar(\"Hola\", \"Mundo\") = " + sumar("Hola", "Mundo"));
        
        System.out.println("\n--- Sumar arreglo ---");
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("sumar({10, 20, 30, 40, 50}) = " + sumar(numeros));
    }
}

/*
 * SALIDA ESPERADA:
 * === SOBRECARGA DE FUNCIONES (OVERLOADING) ===
 * 
 * --- Sumar enteros ---
 * sumar(5, 10) = 15
 * sumar(5, 10, 15) = 30
 * 
 * --- Sumar doubles ---
 * sumar(5.5, 10.5) = 16.0
 * 
 * --- Concatenar cadenas ---
 * sumar("Hola", "Mundo") = Hola Mundo
 * 
 * --- Sumar arreglo ---
 * sumar({10, 20, 30, 40, 50}) = 150
 */
