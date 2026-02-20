/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 9
 * =================================================
 * Escriba un programa que determine el descuento a aplicar según el monto.
 */

import java.util.Scanner;

public class Tema3_Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el monto de la compra: $");
        double monto = scanner.nextDouble();
        
        System.out.println("\n=== CÁLCULO DE DESCUENTO ===");
        System.out.println("Monto original: $" + String.format("%.2f", monto));
        
        double descuento;
        String porcentajeDesc;
        
        if (monto < 50) {
            descuento = 0;
            porcentajeDesc = "0%";
        } else if (monto < 100) {
            descuento = monto * 0.05;
            porcentajeDesc = "5%";
        } else if (monto < 500) {
            descuento = monto * 0.10;
            porcentajeDesc = "10%";
        } else {
            descuento = monto * 0.20;
            porcentajeDesc = "20%";
        }
        
        double montoFinal = monto - descuento;
        
        System.out.println("Descuento: " + porcentajeDesc + " (-$" + String.format("%.2f", descuento) + ")");
        System.out.println("Monto final: $" + String.format("%.2f", montoFinal));
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite el monto de la compra: $250
 * 
 * === CÁLCULO DE DESCUENTO ===
 * Monto original: $250.00
 * Descuento: 10% (-$25.00)
 * Monto final: $225.00
 */
