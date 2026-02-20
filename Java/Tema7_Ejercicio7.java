/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 7
 * ==========================================
 * Escriba un programa que verifique si una cadena es un palíndromo usando función.
 */

public class Tema7_Ejercicio7 {
    
    static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }
    
    static int contarVocales(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        System.out.println("=== FUNCIONES CON CADENAS ===");
        
        String[] textos = {"Anita lava la tina", "Hola mundo", "Reconocer", "Java"};
        
        for (String texto : textos) {
            System.out.println("\nTexto: '" + texto + "'");
            System.out.println("  ¿Es palíndromo? " + esPalindromo(texto));
            System.out.println("  Vocales: " + contarVocales(texto));
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === FUNCIONES CON CADENAS ===
 * 
 * Texto: 'Anita lava la tina'
 *   ¿Es palíndromo? true
 *   Vocales: 6
 * 
 * Texto: 'Hola mundo'
 *   ¿Es palíndromo? false
 *   Vocales: 4
 * 
 * Texto: 'Reconocer'
 *   ¿Es palíndromo? true
 *   Vocales: 3
 * 
 * Texto: 'Java'
 *   ¿Es palíndromo? false
 *   Vocales: 2
 */
