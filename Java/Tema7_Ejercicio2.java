/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 2
 * ==========================================
 * Escriba un programa con funciones para operaciones matemáticas básicas.
 */

public class Tema7_Ejercicio2 {
    
    static double suma(double a, double b) {
        return a + b;
    }
    
    static double resta(double a, double b) {
        return a - b;
    }
    
    static double multiplicacion(double a, double b) {
        return a * b;
    }
    
    static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;
        
        System.out.println("=== OPERACIONES MATEMÁTICAS ===");
        System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
        System.out.println(num1 + " × " + num2 + " = " + multiplicacion(num1, num2));
        System.out.println(num1 + " ÷ " + num2 + " = " + division(num1, num2));
    }
}

/*
 * SALIDA ESPERADA:
 * === OPERACIONES MATEMÁTICAS ===
 * 20.0 + 5.0 = 25.0
 * 20.0 - 5.0 = 15.0
 * 20.0 × 5.0 = 100.0
 * 20.0 ÷ 5.0 = 4.0
 */
