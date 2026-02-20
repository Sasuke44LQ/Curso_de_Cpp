/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 3
 * ========================================
 * Escriba un programa que calcule la suma y promedio de un arreglo.
 */

import java.util.Arrays;

public class Tema5_Ejercicio3 {
    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 78, 92, 88, 95, 80, 87};
        
        System.out.println("=== CALIFICACIONES ===");
        System.out.println(Arrays.toString(calificaciones));
        
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        
        double promedio = (double) suma / calificaciones.length;
        
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Cantidad de calificaciones: " + calificaciones.length);
        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}

/*
 * SALIDA ESPERADA:
 * === CALIFICACIONES ===
 * [85, 90, 78, 92, 88, 95, 80, 87]
 * 
 * === ESTADÍSTICAS ===
 * Cantidad de calificaciones: 8
 * Suma: 695
 * Promedio: 86.88
 */
