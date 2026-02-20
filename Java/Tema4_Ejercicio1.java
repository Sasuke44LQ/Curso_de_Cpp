/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 1
 * ===============================================
 * Escriba un programa que imprima los números del 1 al 10 usando while.
 */

public class Tema4_Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("=== NÚMEROS DEL 1 AL 10 (WHILE) ===");
        
        int i = 1;
        while (i <= 10) {
            System.out.println("Número: " + i);
            i++;
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === NÚMEROS DEL 1 AL 10 (WHILE) ===
 * Número: 1
 * Número: 2
 * ... (hasta el 10)
 */
