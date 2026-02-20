/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 10
 * =========================================================
 * Implemente clases con abstracción: Figuras geométricas.
 */

import java.util.ArrayList;

public class Tema9_Ejercicio10 {
    
    abstract static class Figura {
        protected String nombre;
        
        public Figura(String nombre) {
            this.nombre = nombre;
        }
        
        abstract public double calcularArea();
        abstract public double calcularPerimetro();
        
        public void mostrarInfo() {
            System.out.println("\n" + nombre);
            System.out.printf("Área: %.2f%n", calcularArea());
            System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
        }
    }
    
    static class Circulo extends Figura {
        private double radio;
        
        public Circulo(double radio) {
            super("Círculo");
            this.radio = radio;
        }
        
        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
        
        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }
    
    static class Cuadrado extends Figura {
        private double lado;
        
        public Cuadrado(double lado) {
            super("Cuadrado");
            this.lado = lado;
        }
        
        @Override
        public double calcularArea() {
            return lado * lado;
        }
        
        @Override
        public double calcularPerimetro() {
            return lado * 4;
        }
    }
    
    static class Triangulo extends Figura {
        private double base;
        private double altura;
        private double lado1, lado2, lado3;
        
        public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
            super("Triángulo");
            this.base = base;
            this.altura = altura;
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
        
        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
        
        @Override
        public double calcularPerimetro() {
            return lado1 + lado2 + lado3;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Triangulo(6, 4, 5, 5, 6));
        
        System.out.println("=== FIGURAS GEOMÉTRICAS ===");
        
        double areaTotal = 0;
        for (Figura figura : figuras) {
            figura.mostrarInfo();
            areaTotal += figura.calcularArea();
        }
        
        System.out.println("\n--- Resumen ---");
        System.out.println("Total de figuras: " + figuras.size());
        System.out.printf("Área total: %.2f%n", areaTotal);
    }
}

/*
 * SALIDA ESPERADA:
 * === FIGURAS GEOMÉTRICAS ===
 * 
 * Círculo
 * Área: 78.54
 * Perímetro: 31.42
 * 
 * Cuadrado
 * Área: 16.00
 * Perímetro: 16.00
 * 
 * Triángulo
 * Área: 12.00
 * Perímetro: 16.00
 * 
 * --- Resumen ---
 * Total de figuras: 3
 * Área total: 106.54
 */
