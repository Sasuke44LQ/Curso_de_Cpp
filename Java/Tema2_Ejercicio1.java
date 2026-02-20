/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 1
 * ================================================
 * Escriba un programa que evalúe expresiones matemáticas con operadores 
 * de precedencia. Calcule: (5 + 3) * 2 - 8 / 4 + 10 % 3
 * 
 * EXPLICACIÓN:
 * - Operadores: + (suma), - (resta), * (multiplicación), / (división), % (módulo)
 * - Precedencia: *, /, % se evalúan antes que +, -
 * - Paréntesis tienen la máxima precedencia
 */

public class Tema2_Ejercicio1 {
    public static void main(String[] args) {
        // Cálculo paso a paso
        int resultado1 = (5 + 3);              // = 8
        int resultado2 = resultado1 * 2;       // = 16
        int resultado3 = 8 / 4;                // = 2
        int resultado4 = resultado2 - resultado3;  // = 14
        int resultado5 = 10 % 3;               // = 1
        int resultadoFinal = resultado4 + resultado5;  // = 15
        
        // Forma directa
        int resultado = (5 + 3) * 2 - 8 / 4 + 10 % 3;
        
        System.out.println("=== EVALUACIÓN DE EXPRESIÓN ===");
        System.out.println("Expresión: (5 + 3) * 2 - 8 / 4 + 10 % 3");
        System.out.println("\nPasos:");
        System.out.println("  (5 + 3) = 8");
        System.out.println("  8 * 2 = 16");
        System.out.println("  8 / 4 = 2");
        System.out.println("  16 - 2 = 14");
        System.out.println("  10 % 3 = 1");
        System.out.println("  14 + 1 = 15");
        System.out.println("\nResultado final: " + resultado);
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * === EVALUACIÓN DE EXPRESIÓN ===
 * Expresión: (5 + 3) * 2 - 8 / 4 + 10 % 3
 * 
 * Pasos:
 *   (5 + 3) = 8
 *   8 * 2 = 16
 *   8 / 4 = 2
 *   16 - 2 = 14
 *   10 % 3 = 1
 *   14 + 1 = 15
 * 
 * Resultado final: 15
 */
