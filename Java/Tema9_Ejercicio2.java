/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 2
 * ========================================================
 * Implemente una clase Rectangulo con cálculo de área y perímetro.
 */

public class Tema9_Ejercicio2 {
    
    static class Rectangulo {
        private double ancho;
        private double alto;
        
        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
        
        public double calcularArea() {
            return ancho * alto;
        }
        
        public double calcularPerimetro() {
            return 2 * (ancho + alto);
        }
        
        public double calcularDiagonal() {
            return Math.sqrt(ancho * ancho + alto * alto);
        }
        
        public void mostrarInfo() {
            System.out.println("Rectángulo: " + ancho + " x " + alto);
            System.out.printf("Área: %.2f%n", calcularArea());
            System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
            System.out.printf("Diagonal: %.2f%n", calcularDiagonal());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== CLASE RECTÁNGULO ===");
        
        Rectangulo rect1 = new Rectangulo(5, 3);
        Rectangulo rect2 = new Rectangulo(10, 8);
        
        System.out.println("\n--- Rectángulo 1 ---");
        rect1.mostrarInfo();
        
        System.out.println("\n--- Rectángulo 2 ---");
        rect2.mostrarInfo();
    }
}

/*
 * SALIDA ESPERADA:
 * === CLASE RECTÁNGULO ===
 * 
 * --- Rectángulo 1 ---
 * Rectángulo: 5.0 x 3.0
 * Área: 15.00
 * Perímetro: 16.00
 * Diagonal: 5.83
 * 
 * --- Rectángulo 2 ---
 * Rectángulo: 10.0 x 8.0
 * Área: 80.00
 * Perímetro: 36.00
 * Diagonal: 12.81
 */
