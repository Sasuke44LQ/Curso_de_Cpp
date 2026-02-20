/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 4
 * ======================================================
 * Escriba un programa que use Queue (Cola) para gestionar elementos FIFO.
 */

import java.util.Queue;
import java.util.LinkedList;

public class Tema8_Ejercicio4 {
    public static void main(String[] args) {
        // Queue - First In First Out (FIFO)
        Queue<String> cola = new LinkedList<>();
        
        System.out.println("=== QUEUE (COLA) - FIFO ===");
        
        // Agregar elementos
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
        cola.add("Cliente 4");
        cola.add("Cliente 5");
        
        System.out.println("Clientes en la cola:");
        System.out.println(cola);
        System.out.println("Tamaño: " + cola.size());
        
        // Ver el primero sin remover
        System.out.println("\nPrimero en la cola: " + cola.peek());
        
        // Atender clientes
        System.out.println("\n--- Atendiendo clientes ---");
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendiendo: " + cliente);
        }
        
        System.out.println("Cola vacía: " + cola.isEmpty());
        
        // Ejemplo con números
        Queue<Integer> numeros = new LinkedList<>();
        int[] valores = {10, 20, 30, 40, 50};
        
        System.out.println("\n--- Cola de números ---");
        for (int val : valores) {
            numeros.offer(val);
        }
        
        System.out.println("Cola: " + numeros);
        
        while (!numeros.isEmpty()) {
            System.out.println("Procesando: " + numeros.poll());
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === QUEUE (COLA) - FIFO ===
 * Clientes en la cola:
 * [Cliente 1, Cliente 2, Cliente 3, Cliente 4, Cliente 5]
 * Tamaño: 5
 * 
 * Primero en la cola: Cliente 1
 * 
 * --- Atendiendo clientes ---
 * Atendiendo: Cliente 1
 * Atendiendo: Cliente 2
 * Atendiendo: Cliente 3
 * Atendiendo: Cliente 4
 * Atendiendo: Cliente 5
 * Cola vacía: true
 * 
 * --- Cola de números ---
 * Cola: [10, 20, 30, 40, 50]
 * Procesando: 10
 * Procesando: 20
 * Procesando: 30
 * Procesando: 40
 * Procesando: 50
 */
