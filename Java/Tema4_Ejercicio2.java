/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 2
 * ===============================================
 * Escriba un programa que calcule la suma de números del 1 al 100.
 */

public class Tema4_Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("=== SUMA DE NÚMEROS DEL 1 AL 100 ===");
        
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        
        System.out.println("Suma: " + suma);
        
        // Fórmula alternativa: n(n+1)/2
        int sumaFormula = 100 * 101 / 2;
        System.out.println("Suma (fórmula): " + sumaFormula);
    }
}

/*
 * SALIDA ESPERADA:
 * === SUMA DE NÚMEROS DEL 1 AL 100 ===
 * Suma: 5050
 * Suma (fórmula): 5050
 */
