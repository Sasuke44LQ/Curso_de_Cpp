/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 6
 * ==========================================
 * Escriba un programa con funciones para conversión de unidades.
 */

public class Tema7_Ejercicio6 {
    
    // Conversiones de temperatura
    static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Conversiones de distancia
    static double kmAMillas(double km) {
        return km * 0.621371;
    }
    
    static double millasAKm(double millas) {
        return millas * 1.60934;
    }
    
    // Conversiones de peso
    static double kgALibras(double kg) {
        return kg * 2.20462;
    }
    
    static double librasAKg(double libras) {
        return libras * 0.453592;
    }
    
    public static void main(String[] args) {
        System.out.println("=== CONVERSIONES DE UNIDADES ===");
        
        System.out.println("\n--- Temperatura ---");
        System.out.println("0°C = " + String.format("%.2f", celsiusAFahrenheit(0)) + "°F");
        System.out.println("100°C = " + String.format("%.2f", celsiusAFahrenheit(100)) + "°F");
        
        System.out.println("\n--- Distancia ---");
        System.out.println("10 km = " + String.format("%.2f", kmAMillas(10)) + " millas");
        System.out.println("5 millas = " + String.format("%.2f", millasAKm(5)) + " km");
        
        System.out.println("\n--- Peso ---");
        System.out.println("70 kg = " + String.format("%.2f", kgALibras(70)) + " libras");
        System.out.println("150 libras = " + String.format("%.2f", librasAKg(150)) + " kg");
    }
}

/*
 * SALIDA ESPERADA:
 * === CONVERSIONES DE UNIDADES ===
 * 
 * --- Temperatura ---
 * 0°C = 32.00°F
 * 100°C = 212.00°F
 * 
 * --- Distancia ---
 * 10 km = 6.21 millas
 * 5 millas = 8.05 km
 * 
 * --- Peso ---
 * 70 kg = 154.32 libras
 * 150 libras = 68.04 kg
 */
