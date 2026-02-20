/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 7
 * ========================================
 * Escriba un programa que use ArrayList (lista dinámica).
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Tema5_Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("=== ARRAYLIST (LISTA DINÁMICA) ===");
        System.out.println("Ingresa números (0 para terminar):");
        
        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            numeros.add(numero);
        }
        
        System.out.println("\n=== LISTA INGRESADA ===");
        System.out.println(numeros);
        System.out.println("Tamaño: " + numeros.size());
        
        System.out.println("\n=== OPERACIONES ===");
        System.out.println("Primer elemento: " + numeros.get(0));
        System.out.println("Último elemento: " + numeros.get(numeros.size() - 1));
        
        // Eliminar elemento
        if (!numeros.isEmpty()) {
            numeros.remove(0);
            System.out.println("\nDespués de eliminar el primer elemento: " + numeros);
        }
        
        // Buscar elemento
        int buscado = 20;
        if (numeros.contains(buscado)) {
            System.out.println("El número " + buscado + " está en la lista.");
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === ARRAYLIST (LISTA DINÁMICA) ===
 * Ingresa números (0 para terminar):
 * Número: 10
 * Número: 20
 * Número: 30
 * Número: 0
 * 
 * === LISTA INGRESADA ===
 * [10, 20, 30]
 * Tamaño: 3
 * 
 * === OPERACIONES ===
 * Primer elemento: 10
 * Último elemento: 30
 * 
 * Después de eliminar el primer elemento: [20, 30]
 * El número 20 está en la lista.
 */
