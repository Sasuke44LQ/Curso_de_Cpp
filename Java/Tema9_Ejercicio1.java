/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 1
 * ========================================================
 * Escriba un programa que implemente una clase Persona con atributos y métodos.
 */

public class Tema9_Ejercicio1 {
    
    // Clase Persona
    static class Persona {
        // Atributos
        private String nombre;
        private int edad;
        private String email;
        
        // Constructor
        public Persona(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }
        
        // Métodos getter
        public String getNombre() { return nombre; }
        public int getEdad() { return edad; }
        public String getEmail() { return email; }
        
        // Métodos setter
        public void setEmail(String email) { this.email = email; }
        public void setEdad(int edad) { this.edad = edad; }
        
        // Métodos adicionales
        public void presentarse() {
            System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años.");
        }
        
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Email: " + email);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== CLASE PERSONA ===");
        
        // Crear objetos
        Persona p1 = new Persona("Juan", 30, "juan@email.com");
        Persona p2 = new Persona("María", 28, "maria@email.com");
        
        System.out.println("\n--- Persona 1 ---");
        p1.presentarse();
        p1.mostrarInfo();
        
        System.out.println("\n--- Persona 2 ---");
        p2.presentarse();
        p2.mostrarInfo();
        
        // Modificar email
        System.out.println("\n--- Cambiar email de Persona 1 ---");
        p1.setEmail("juan.nuevo@email.com");
        System.out.println("Nuevo email: " + p1.getEmail());
    }
}

/*
 * SALIDA ESPERADA:
 * === CLASE PERSONA ===
 * 
 * --- Persona 1 ---
 * Hola, soy Juan, tengo 30 años.
 * Nombre: Juan
 * Edad: 30
 * Email: juan@email.com
 * 
 * --- Persona 2 ---
 * Hola, soy María, tengo 28 años.
 * Nombre: María
 * Edad: 28
 * Email: maria@email.com
 * 
 * --- Cambiar email de Persona 1 ---
 * Nuevo email: juan.nuevo@email.com
 */
