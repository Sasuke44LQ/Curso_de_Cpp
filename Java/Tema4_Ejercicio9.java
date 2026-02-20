/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 9
 * ===============================================
 * Escriba un programa que use continue para saltar números pares 
 * e imprimir solo los números impares del 1 al 20.
 */

public class Tema4_Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("=== NÚMEROS IMPARES DEL 1 AL 20 ===");
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;  // Salta los números pares
            }
            System.out.println("Número: " + i);
        }
        
        System.out.println("\n=== NÚMEROS PARES DEL 1 AL 20 ===");
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;  // Salta los números impares
            }
            System.out.println("Número: " + i);
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === NÚMEROS IMPARES DEL 1 AL 20 ===
 * Número: 1
 * Número: 3
 * Número: 5
 * ... (hasta 19)
 * 
 * === NÚMEROS PARES DEL 1 AL 20 ===
 * Número: 2
 * Número: 4
 * Número: 6
 * ... (hasta 20)
 */
