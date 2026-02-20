/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 6
 * ========================================
 * Escriba un programa que busque un elemento en un arreglo.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Tema5_Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {15, 32, 48, 21, 67, 89, 12, 45, 76, 34};
        
        System.out.println("=== BÚSQUEDA EN ARREGLO ===");
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        
        System.out.print("\nBusca un número: ");
        int numBuscado = scanner.nextInt();
        
        // Búsqueda lineal
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscado) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            System.out.println("Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("Número no encontrado.");
        }
        
        // Búsqueda con Arrays.binarySearch() (requiere arreglo ordenado)
        int[] numerosOrdenados = numeros.clone();
        Arrays.sort(numerosOrdenados);
        int posicion2 = Arrays.binarySearch(numerosOrdenados, numBuscado);
        
        if (posicion2 >= 0) {
            System.out.println("Usando búsqueda binaria: posición " + posicion2 + 
                             " en el arreglo ordenado");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === BÚSQUEDA EN ARREGLO ===
 * Arreglo: [15, 32, 48, 21, 67, 89, 12, 45, 76, 34]
 * 
 * Busca un número: 67
 * Número encontrado en la posición: 4
 * Usando búsqueda binaria: posición 7 en el arreglo ordenado
 */
