/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 7
 * ========================================================
 * Implemente métodos estáticos y atributos estáticos.
 */

public class Tema9_Ejercicio7 {
    
    static class Contador {
        private static int instancias = 0;  // Atributo estático compartido
        private int id;
        
        public Contador() {
            instancias++;
            this.id = instancias;
        }
        
        public static int obtenerTotalInstancias() {
            return instancias;
        }
        
        public int getId() {
            return id;
        }
        
        public void mostrarInfo() {
            System.out.println("Contador ID: " + id);
            System.out.println("Total de instancias: " + instancias);
        }
    }
    
    static class Temperatura {
        // Método estático para conversión
        public static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        
        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== ATRIBUTOS Y MÉTODOS ESTÁTICOS ===");
        
        // Crear instancias de Contador
        System.out.println("\n--- Contador ---");
        Contador c1 = new Contador();
        c1.mostrarInfo();
        
        Contador c2 = new Contador();
        c2.mostrarInfo();
        
        Contador c3 = new Contador();
        c3.mostrarInfo();
        
        System.out.println("Total final: " + Contador.obtenerTotalInstancias());
        
        // Usar métodos estáticos de Temperatura
        System.out.println("\n--- Conversión de temperaturas (métodos estáticos) ---");
        System.out.println("0°C = " + Temperatura.celsiusAFahrenheit(0) + "°F");
        System.out.println("100°C = " + Temperatura.celsiusAFahrenheit(100) + "°F");
        System.out.println("32°F = " + Temperatura.fahrenheitACelsius(32) + "°C");
    }
}

/*
 * SALIDA ESPERADA:
 * === ATRIBUTOS Y MÉTODOS ESTÁTICOS ===
 * 
 * --- Contador ---
 * Contador ID: 1
 * Total de instancias: 1
 * Contador ID: 2
 * Total de instancias: 2
 * Contador ID: 3
 * Total de instancias: 3
 * Total final: 3
 * 
 * --- Conversión de temperaturas (métodos estáticos) ---
 * 0°C = 32.0°F
 * 100°C = 212.0°F
 * 32°F = 0.0°C
 */
