/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 9
 * ============================================
 * Escriba un programa que valide si una contraseña cumple ciertos requisitos.
 */

import java.util.Scanner;

public class Tema6_Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite una contraseña: ");
        String password = scanner.nextLine();
        
        System.out.println("\n=== VALIDACIÓN DE CONTRASEÑA ===");
        
        boolean tieneMayuscula = !password.equals(password.toLowerCase());
        boolean tieneMinuscula = !password.equals(password.toUpperCase());
        boolean tieneNumero = password.matches(".*\\d.*");
        boolean tieneCaracterEspecial = password.matches(".*[!@#$%^&*()].*");
        boolean tieneAlMenos8 = password.length() >= 8;
        
        System.out.println("Contraseña: " + password);
        System.out.println("Longitud: " + password.length());
        System.out.println("\nRequisitos:");
        System.out.println("✓ Mayúsculas: " + (tieneMayuscula ? "Sí" : "No"));
        System.out.println("✓ Minúsculas: " + (tieneMinuscula ? "Sí" : "No"));
        System.out.println("✓ Números: " + (tieneNumero ? "Sí" : "No"));
        System.out.println("✓ Caracteres especiales: " + (tieneCaracterEspecial ? "Sí" : "No"));
        System.out.println("✓ Al menos 8 caracteres: " + (tieneAlMenos8 ? "Sí" : "No"));
        
        boolean esValida = tieneMayuscula && tieneMinuscula && tieneNumero && 
                          tieneCaracterEspecial && tieneAlMenos8;
        
        System.out.println("\n" + (esValida ? "✓ Contraseña FUERTE" : "✗ Contraseña DÉBIL"));
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * Digite una contraseña: MyPassword123!
 * 
 * === VALIDACIÓN DE CONTRASEÑA ===
 * Contraseña: MyPassword123!
 * Longitud: 14
 * 
 * Requisitos:
 * ✓ Mayúsculas: Sí
 * ✓ Minúsculas: Sí
 * ✓ Números: Sí
 * ✓ Caracteres especiales: Sí
 * ✓ Al menos 8 caracteres: Sí
 * 
 * ✓ Contraseña FUERTE
 */
