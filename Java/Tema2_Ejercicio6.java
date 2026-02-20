/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 6
 * ================================================
 * Escriba un programa que demuestre operadores bitwise (&, |, ^, ~, <<, >>).
 * 
 * EXPLICACIÓN:
 * - & (AND bitwise): retorna 1 si ambos bits son 1
 * - | (OR bitwise): retorna 1 si al menos un bit es 1
 * - ^ (XOR bitwise): retorna 1 si los bits son diferentes
 * - ~ (NOT bitwise): invierte todos los bits
 * - << (desplazamiento izquierdo): multiplica por potencias de 2
 * - >> (desplazamiento derecho): divide por potencias de 2
 */

public class Tema2_Ejercicio6 {
    public static void main(String[] args) {
        int a = 12;  // 1100 en binario
        int b = 10;  // 1010 en binario
        
        System.out.println("=== OPERADORES BITWISE ===");
        System.out.println("a = " + a + " (binario: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (binario: " + Integer.toBinaryString(b) + ")");
        
        System.out.println("\nOperaciones bitwise:");
        System.out.println("a & b = " + (a & b) + " (binario: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b = " + (a | b) + " (binario: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b = " + (a ^ b) + " (binario: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("~a = " + (~a) + " (bits invertidos)");
        
        System.out.println("\nDesplazamientos:");
        System.out.println("a << 1 = " + (a << 1) + " (equivalente a " + a + " * 2)");
        System.out.println("a << 2 = " + (a << 2) + " (equivalente a " + a + " * 4)");
        System.out.println("a >> 1 = " + (a >> 1) + " (equivalente a " + a + " / 2)");
        System.out.println("a >> 2 = " + (a >> 2) + " (equivalente a " + a + " / 4)");
    }
}

/*
 * SALIDA ESPERADA:
 * ================
 * === OPERADORES BITWISE ===
 * a = 12 (binario: 1100)
 * b = 10 (binario: 1010)
 * 
 * Operaciones bitwise:
 * a & b = 8 (binario: 1000)
 * a | b = 14 (binario: 1110)
 * a ^ b = 6 (binario: 110)
 * ~a = -13 (bits invertidos)
 * 
 * Desplazamientos:
 * a << 1 = 24 (equivalente a 12 * 2)
 * a << 2 = 48 (equivalente a 12 * 4)
 * a >> 1 = 6 (equivalente a 12 / 2)
 * a >> 2 = 3 (equivalente a 12 / 4)
 */
