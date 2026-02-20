/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 3
 * ================================================
 * Escriba un programa que demuestre los operadores de asignación 
 * compuesta (+=, -=, *=, /=, %=).
 * 
 * EXPLICACIÓN:
 * - a += 5 es equivalente a a = a + 5
 * - a -= 3 es equivalente a a = a - 3
 * - a *= 2 es equivalente a a = a * 2
 * - a /= 4 es equivalente a a = a / 4
 * - a %= 3 es equivalente a a = a % 3
 */

public class Tema2_Ejercicio3 {
    public static void main(String[] args) {
        int numero = 20;
        
        System.out.println("=== OPERADORES DE ASIGNACIÓN COMPUESTA ===");
        System.out.println("Valor inicial: " + numero);
        
        numero += 5;
        System.out.println("Después de += 5: " + numero);  // 25
        
        numero -= 3;
        System.out.println("Después de -= 3: " + numero);  // 22
        
        numero *= 2;
        System.out.println("Después de *= 2: " + numero);  // 44
        
        numero /= 4;
        System.out.println("Después de /= 4: " + numero);  // 11
        
        numero %= 5;
        System.out.println("Después de %= 5: " + numero);  // 1
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * === OPERADORES DE ASIGNACIÓN COMPUESTA ===
 * Valor inicial: 20
 * Después de += 5: 25
 * Después de -= 3: 22
 * Después de *= 2: 44
 * Después de /= 4: 11
 * Después de %= 5: 1
 */
