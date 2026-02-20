/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 10
 * =========================================
 * Escriba un programa que combine dos arreglos en uno solo.
 */

import java.util.Arrays;

public class Tema5_Ejercicio10 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};
        
        System.out.println("=== COMBINACIÓN DE ARREGLOS ===");
        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
        
        // Método 1: Crear nuevo arreglo y copiar
        int[] arregloCombinado = new int[arreglo1.length + arreglo2.length];
        
        // Copiar arreglo1
        for (int i = 0; i < arreglo1.length; i++) {
            arregloCombinado[i] = arreglo1[i];
        }
        
        // Copiar arreglo2
        for (int i = 0; i < arreglo2.length; i++) {
            arregloCombinado[arreglo1.length + i] = arreglo2[i];
        }
        
        System.out.println("\n=== ARREGLO COMBINADO (bucles) ===");
        System.out.println(Arrays.toString(arregloCombinado));
        
        // Método 2: Usar Arrays.copyOf()
        int[] arregloCombinado2 = Arrays.copyOf(arreglo1, 
                                                 arreglo1.length + arreglo2.length);
        System.arraycopy(arreglo2, 0, arregloCombinado2, arreglo1.length, arreglo2.length);
        
        System.out.println("\n=== ARREGLO COMBINADO (Arrays.copyOf y arraycopy) ===");
        System.out.println(Arrays.toString(arregloCombinado2));
    }
}

/*
 * SALIDA ESPERADA:
 * === COMBINACIÓN DE ARREGLOS ===
 * Arreglo 1: [1, 2, 3, 4, 5]
 * Arreglo 2: [6, 7, 8, 9, 10]
 * 
 * === ARREGLO COMBINADO (bucles) ===
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * 
 * === ARREGLO COMBINADO (Arrays.copyOf y arraycopy) ===
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
