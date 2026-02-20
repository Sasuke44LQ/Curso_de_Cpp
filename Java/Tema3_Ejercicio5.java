/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 5
 * =================================================
 * Escriba un programa que simule un menú de opciones usando switch.
 */

import java.util.Scanner;

public class Tema3_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MENÚ DE OPERACIONES ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Digite su opción (1-4): ");
        
        int opcion = scanner.nextInt();
        
        System.out.print("Digite el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacionValida = true;
        
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === MENÚ DE OPERACIONES ===
 * 1. Suma
 * 2. Resta
 * 3. Multiplicación
 * 4. División
 * Digite su opción (1-4): 1
 * Digite el primer número: 10
 * Digite el segundo número: 5
 * Resultado: 10.0 + 5.0 = 15.0
 */
