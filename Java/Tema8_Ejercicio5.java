/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 5
 * ======================================================
 * Escriba un programa que use Stack (Pila) para gestionar elementos LIFO.
 */

import java.util.Stack;

public class Tema8_Ejercicio5 {
    public static void main(String[] args) {
        // Stack - Last In First Out (LIFO)
        Stack<String> pila = new Stack<>();
        
        System.out.println("=== STACK (PILA) - LIFO ===");
        
        // Apilar elementos
        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3");
        pila.push("Libro 4");
        pila.push("Libro 5");
        
        System.out.println("Libros en la pila:");
        System.out.println(pila);
        System.out.println("Tamaño: " + pila.size());
        
        // Ver el techo sin remover
        System.out.println("\nLibro en el techo: " + pila.peek());
        
        // Desapilar elementos
        System.out.println("\n--- Sacando libros de la pila ---");
        while (!pila.isEmpty()) {
            String libro = pila.pop();
            System.out.println("Sacado: " + libro);
        }
        
        System.out.println("Pila vacía: " + pila.isEmpty());
        
        // Verificar si una cadena tiene paréntesis balanceados
        System.out.println("\n--- Verificar paréntesis balanceados ---");
        verificarParentesis("(a + b) * (c - d)");
        verificarParentesis("(a + b * (c - d)");
        verificarParentesis("((a + b) * c)");
    }
    
    static void verificarParentesis(String expresion) {
        Stack<Character> pila = new Stack<>();
        boolean valida = true;
        
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    valida = false;
                    break;
                }
                pila.pop();
            }
        }
        
        if (!pila.isEmpty()) {
            valida = false;
        }
        
        System.out.println("Expresión: \"" + expresion + "\"");
        System.out.println("Paréntesis balanceados: " + valida);
    }
}

/*
 * SALIDA ESPERADA:
 * === STACK (PILA) - LIFO ===
 * Libros en la pila:
 * [Libro 1, Libro 2, Libro 3, Libro 4, Libro 5]
 * Tamaño: 5
 * 
 * Libro en el techo: Libro 5
 * 
 * --- Sacando libros de la pila ---
 * Sacado: Libro 5
 * Sacado: Libro 4
 * Sacado: Libro 3
 * Sacado: Libro 2
 * Sacado: Libro 1
 * Pila vacía: true
 * 
 * --- Verificar paréntesis balanceados ---
 * Expresión: "(a + b) * (c - d)"
 * Paréntesis balanceados: true
 * Expresión: "(a + b * (c - d)"
 * Paréntesis balanceados: false
 * Expresión: "((a + b) * c)"
 * Paréntesis balanceados: true
 */
