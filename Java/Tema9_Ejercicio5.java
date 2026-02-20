/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 5
 * ========================================================
 * Implemente polimorfismo con interfaz Animal.
 */

public class Tema9_Ejercicio5 {
    
    interface Animal {
        void sonido();
        void moverse();
        String getNombre();
    }
    
    static class Perro implements Animal {
        private String nombre;
        
        public Perro(String nombre) {
            this.nombre = nombre;
        }
        
        @Override
        public void sonido() {
            System.out.println("¡Guau guau!");
        }
        
        @Override
        public void moverse() {
            System.out.println("El perro corre alegremente");
        }
        
        @Override
        public String getNombre() {
            return nombre;
        }
    }
    
    static class Gato implements Animal {
        private String nombre;
        
        public Gato(String nombre) {
            this.nombre = nombre;
        }
        
        @Override
        public void sonido() {
            System.out.println("¡Miau miau!");
        }
        
        @Override
        public void moverse() {
            System.out.println("El gato camina sigilosamente");
        }
        
        @Override
        public String getNombre() {
            return nombre;
        }
    }
    
    static class Pajaro implements Animal {
        private String nombre;
        
        public Pajaro(String nombre) {
            this.nombre = nombre;
        }
        
        @Override
        public void sonido() {
            System.out.println("¡Pío pío pío!");
        }
        
        @Override
        public void moverse() {
            System.out.println("El pájaro vuela por el cielo");
        }
        
        @Override
        public String getNombre() {
            return nombre;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== POLIMORFISMO CON INTERFAZ ===");
        
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Misi"),
            new Pajaro("Tweety")
        };
        
        for (Animal animal : animales) {
            System.out.println("\n--- " + animal.getNombre() + " ---");
            animal.sonido();
            animal.moverse();
        }
    }
}

/*
 * SALIDA ESPERADA:
 * === POLIMORFISMO CON INTERFAZ ===
 * 
 * --- Rex ---
 * ¡Guau guau!
 * El perro corre alegremente
 * 
 * --- Misi ---
 * ¡Miau miau!
 * El gato camina sigilosamente
 * 
 * --- Tweety ---
 * ¡Pío pío pío!
 * El pájaro vuela por el cielo
 */
