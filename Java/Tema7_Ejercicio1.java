/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 1
 * ==========================================
 * Escriba un programa con una función que calcule el cuadrado de un número.
 */

public class Tema7_Ejercicio1 {
    
    // Función para calcular el cuadrado
    static int cuadrado(int numero) {
        return numero * numero;
    }
    
    // Función sobrecargada para trabajar con doubles
    static double cuadrado(double numero) {
        return numero * numero;
    }
    
    public static void main(String[] args) {
        System.out.println("=== CÁLCULO DE CUADRADO ===");
        
        System.out.println("5² = " + cuadrado(5));
        System.out.println("10² = " + cuadrado(10));
        System.out.println("3.5² = " + cuadrado(3.5));
        System.out.println("-4² = " + cuadrado(-4));
    }
}

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE CUADRADO ===
 * 5² = 25
 * 10² = 100
 * 3.5² = 12.25
 * -4² = 16
 */
