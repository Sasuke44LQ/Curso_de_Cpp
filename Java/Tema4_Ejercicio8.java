/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 8
 * ===============================================
 * Escriba un programa que use break para terminar un bucle cuando el usuario 
 * ingrese un número específico.
 */

import java.util.Scanner;

public class Tema4_Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");
        System.out.println("Estoy pensando en un número entre 1 y 10.");
        System.out.println("Escribe 'salir' para abandonar.");
        
        int numeroSecreto = 7;
        boolean adivinado = false;
        int intentos = 0;
        
        while (true) {
            System.out.print("\nIntenta adivinar: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego! El número era: " + numeroSecreto);
                break;
            }
            
            try {
                int numero = Integer.parseInt(input);
                intentos++;
                
                if (numero == numeroSecreto) {
                    System.out.println("¡CORRECTO! Adivinaste en " + intentos + " intentos.");
                    adivinado = true;
                    break;
                } else if (numero < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido.");
            }
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA (ejemplo):
 * === JUEGO: ADIVINA EL NÚMERO ===
 * Estoy pensando en un número entre 1 y 10.
 * Escribe 'salir' para abandonar.
 * 
 * Intenta adivinar: 5
 * El número es mayor.
 * 
 * Intenta adivinar: 8
 * El número es menor.
 * 
 * Intenta adivinar: 7
 * ¡CORRECTOINT! Adivinaste en 3 intentos.
 */
