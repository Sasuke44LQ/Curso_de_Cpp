/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 4
 * ================================================
 * Escriba un programa que demuestre los operadores de incremento 
 * y decremento (++, --) en sus formas prefijo y postfijo.
 * 
 * EXPLICACIÓN:
 * - ++x (prefijo): incrementa primero, luego retorna el valor
 * - x++ (postfijo): retorna el valor, luego incrementa
 * - --x (prefijo): decrementa primero, luego retorna el valor
 * - x-- (postfijo): retorna el valor, luego decrementa
 */

public class Tema2_Ejercicio4 {
    public static void main(String[] args) {
        int x = 5;
        int y;
        
        System.out.println("=== OPERADORES DE INCREMENTO/DECREMENTO ===");
        System.out.println("Valor inicial de x: " + x);
        
        // Postfijo (x++)
        y = x++;
        System.out.println("\ny = x++");
        System.out.println("Valor asignado a y: " + y);  // 5 (se asigna antes de incrementar)
        System.out.println("Valor de x después: " + x);   // 6
        
        // Prefijo (++x)
        x = 5;  // Reiniciar
        y = ++x;
        System.out.println("\ny = ++x");
        System.out.println("Valor de x después de ++x: " + x);  // 6
        System.out.println("Valor asignado a y: " + y);         // 6 (se incrementa primero)
        
        // Postfijo (x--)
        x = 5;
        y = x--;
        System.out.println("\ny = x--");
        System.out.println("Valor asignado a y: " + y);  // 5
        System.out.println("Valor de x después: " + x);   // 4
        
        // Prefijo (--x)
        x = 5;
        y = --x;
        System.out.println("\ny = --x");
        System.out.println("Valor de x después de --x: " + x);  // 4
        System.out.println("Valor asignado a y: " + y);         // 4
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * === OPERADORES DE INCREMENTO/DECREMENTO ===
 * Valor inicial de x: 5
 * 
 * y = x++
 * Valor asignado a y: 5
 * Valor de x después: 6
 * 
 * y = ++x
 * Valor de x después de ++x: 6
 * Valor asignado a y: 6
 * 
 * y = x--
 * Valor asignado a y: 5
 * Valor de x después: 4
 * 
 * y = --x
 * Valor de x después de --x: 4
 * Valor asignado a y: 4
 */
