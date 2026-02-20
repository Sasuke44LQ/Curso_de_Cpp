/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 8
 * ==========================================
 * Escriba un programa que use funciones varargs (número variable de argumentos).
 */

public class Tema7_Ejercicio8 {
    
    // Función varargs para sumar números
    static double sumar(double... numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }
    
    // Función varargs para concatenar cadenas
    static String concatenar(String... textos) {
        StringBuilder resultado = new StringBuilder();
        for (String texto : textos) {
            resultado.append(texto);
        }
        return resultado.toString();
    }
    
    // Función varargs para encontrar el máximo
    static double maximo(double... numeros) {
        if (numeros.length == 0) return 0;
        double max = numeros[0];
        for (double num : numeros) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("=== FUNCIONES VARARGS ===");
        
        System.out.println("\n--- Sumar ---");
        System.out.println("sumar(5) = " + sumar(5));
        System.out.println("sumar(5, 10) = " + sumar(5, 10));
        System.out.println("sumar(5, 10, 15, 20) = " + sumar(5, 10, 15, 20));
        
        System.out.println("\n--- Concatenar ---");
        System.out.println("concatenar(\"Java\") = " + concatenar("Java"));
        System.out.println("concatenar(\"Java\", \" es\", \" increíble\") = " + 
                         concatenar("Java", " es", " increíble"));
        
        System.out.println("\n--- Máximo ---");
        System.out.println("maximo(10) = " + maximo(10));
        System.out.println("maximo(45, 23, 78, 12, 89) = " + maximo(45, 23, 78, 12, 89));
    }
}

/*
 * SALIDA ESPERADA:
 * === FUNCIONES VARARGS ===
 * 
 * --- Sumar ---
 * sumar(5) = 5.0
 * sumar(5, 10) = 15.0
 * sumar(5, 10, 15, 20) = 50.0
 * 
 * --- Concatenar ---
 * concatenar("Java") = Java
 * concatenar("Java", " es", " increíble") = Java es increíble
 * 
 * --- Máximo ---
 * maximo(10) = 10.0
 * maximo(45, 23, 78, 12, 89) = 89.0
 */
