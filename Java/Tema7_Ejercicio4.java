/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 4
 * ==========================================
 * Escriba un programa con una función que verifique si un número es primo.
 */

public class Tema7_Ejercicio4 {
    
    static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("=== NÚMEROS PRIMOS HASTA 50 ===");
        
        System.out.print("Primos: ");
        for (int i = 2; i <= 50; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

/*
 * SALIDA ESPERADA:
 * === NÚMEROS PRIMOS HASTA 50 ===
 * Primos: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 */
