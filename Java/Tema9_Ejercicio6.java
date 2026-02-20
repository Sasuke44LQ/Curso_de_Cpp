/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 6
 * ========================================================
 * Implemente una clase Estudiante con sobrecarga de constructores.
 */

public class Tema9_Ejercicio6 {
    
    static class Estudiante {
        private String nombre;
        private int edad;
        private String carrera;
        private double promedio;
        
        // Constructor 1: Con todos los parámetros
        public Estudiante(String nombre, int edad, String carrera, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = promedio;
        }
        
        // Constructor 2: Sin promedio (valor por defecto 0)
        public Estudiante(String nombre, int edad, String carrera) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = 0.0;
        }
        
        // Constructor 3: Solo nombre y carrera
        public Estudiante(String nombre, String carrera) {
            this.nombre = nombre;
            this.carrera = carrera;
            this.edad = 0;
            this.promedio = 0.0;
        }
        
        public void actualizar Promedio(double promedio) {
            this.promedio = promedio;
        }
        
        public String obtenerEstado() {
            if (promedio >= 7) {
                return "APROBADO";
            } else if (promedio > 0) {
                return "REPROBADO";
            } else {
                return "SIN CALIFICACIONES";
            }
        }
        
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + (edad > 0 ? edad : "No especificada"));
            System.out.println("Carrera: " + carrera);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Estado: " + obtenerEstado());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== SOBRECARGA DE CONSTRUCTORES ===");
        
        // Diferentes formas de crear estudiantes
        Estudiante e1 = new Estudiante("Juan", 20, "Ingeniería", 8.5);
        Estudiante e2 = new Estudiante("María", 19, "Biología");
        Estudiante e3 = new Estudiante("Carlos", "Química");
        
        System.out.println("\n--- Estudiante 1 ---");
        e1.mostrarInfo();
        
        System.out.println("\n--- Estudiante 2 ---");
        e2.mostrarInfo();
        e2.actualizarPromedio(7.0);
        System.out.println("Después de actualizar:");
        e2.mostrarInfo();
        
        System.out.println("\n--- Estudiante 3 ---");
        e3.mostrarInfo();
    }
}

/*
 * SALIDA ESPERADA:
 * === SOBRECARGA DE CONSTRUCTORES ===
 * 
 * --- Estudiante 1 ---
 * Nombre: Juan
 * Edad: 20
 * Carrera: Ingeniería
 * Promedio: 8.50
 * Estado: APROBADO
 * 
 * --- Estudiante 2 ---
 * Nombre: María
 * Edad: 19
 * Carrera: Biología
 * Promedio: 0.00
 * Estado: SIN CALIFICACIONES
 * Después de actualizar:
 * Nombre: María
 * Edad: 19
 * Carrera: Biología
 * Promedio: 7.00
 * Estado: APROBADO
 * 
 * --- Estudiante 3 ---
 * Nombre: Carlos
 * Edad: No especificada
 * Carrera: Química
 * Promedio: 0.00
 * Estado: SIN CALIFICACIONES
 */
