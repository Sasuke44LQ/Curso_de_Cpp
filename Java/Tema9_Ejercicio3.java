/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 3
 * ========================================================
 * Implemente herencia: Clase Vehículo y subclases Auto y Moto.
 */

public class Tema9_Ejercicio3 {
    
    // Clase base
    static abstract class Vehiculo {
        protected String marca;
        protected String modelo;
        protected int año;
        
        public Vehiculo(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }
        
        public abstract void acelerar();
        public abstract void frenar();
        
        public void mostrarInfo() {
            System.out.println(marca + " " + modelo + " (" + año + ")");
        }
    }
    
    // Subclase Auto
    static class Auto extends Vehiculo {
        private int puertas;
        
        public Auto(String marca, String modelo, int año, int puertas) {
            super(marca, modelo, año);
            this.puertas = puertas;
        }
        
        @Override
        public void acelerar() {
            System.out.println("Auto acelerando: VROOM VROOM");
        }
        
        @Override
        public void frenar() {
            System.out.println("Auto frenando con sistema ABS");
        }
        
        public void abrirMaletero() {
            System.out.println("Abriendo maletero del auto...");
        }
    }
    
    // Subclase Moto
    static class Moto extends Vehiculo {
        private int cilindrada;
        
        public Moto(String marca, String modelo, int año, int cilindrada) {
            super(marca, modelo, año);
            this.cilindrada = cilindrada;
        }
        
        @Override
        public void acelerar() {
            System.out.println("Moto acelerando: VRUUUUM");
        }
        
        public void frenar() {
            System.out.println("Moto frenando con discos de carbono");
        }
        
        public void haciePie() {
            System.out.println("Levantando la rueda delantera");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== HERENCIA EN OOP ===");
        
        Auto auto = new Auto("Toyota", "Corolla", 2023, 4);
        Moto moto = new Moto("Honda", "CBR500", 2023, 500);
        
        System.out.println("\n--- Auto ---");
        auto.mostrarInfo();
        auto.acelerar();
        auto.frenar();
        auto.abrirMaletero();
        
        System.out.println("\n--- Moto ---");
        moto.mostrarInfo();
        moto.acelerar();
        moto.frenar();
        moto.haciePie();
    }
}

/*
 * SALIDA ESPERADA:
 * === HERENCIA EN OOP ===
 * 
 * --- Auto ---
 * Toyota Corolla (2023)
 * Auto acelerando: VROOM VROOM
 * Auto frenando con sistema ABS
 * Abriendo maletero del auto...
 * 
 * --- Moto ---
 * Honda CBR500 (2023)
 * Moto acelerando: VRUUUUM
 * Moto frenando con discos de carbono
 * Levantando la rueda delantera
 */
