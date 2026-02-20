/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 4
 * ========================================================
 * Implemente una clase CuentaBancaria con encapsulación.
 */

public class Tema9_Ejercicio4 {
    
    static class CuentaBancaria {
        private String titular;
        private String numeroCuenta;
        private double saldo;
        private double limiteCredito;
        
        public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
            this.titular = titular;
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldoInicial;
            this.limiteCredito = 1000;  // Límite por defecto
        }
        
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("La cantidad debe ser positiva.");
            }
        }
        
        public boolean retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
                return true;
            } else {
                System.out.println("Fondos insuficientes.");
                return false;
            }
        }
        
        public double consultarSaldo() {
            return saldo;
        }
        
        public void mostrarInfo() {
            System.out.println("\n--- Información de Cuenta ---");
            System.out.println("Titular: " + titular);
            System.out.println("Número de cuenta: " + numeroCuenta);
            System.out.println("Saldo: $" + saldo);
            System.out.println("Límite de crédito: $" + limiteCredito);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== CUENTA BANCARIA ===");
        
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "123456789", 1000);
        
        cuenta.mostrarInfo();
        
        System.out.println("\n--- Operaciones ---");
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000);  // No hay fondos suficientes
        
        System.out.println("\nSaldo actual: $" + cuenta.consultarSaldo());
    }
}

/*
 * SALIDA ESPERADA:
 * === CUENTA BANCARIA ===
 * 
 * --- Información de Cuenta ---
 * Titular: Juan Pérez
 * Número de cuenta: 123456789
 * Saldo: $1000.0
 * Límite de crédito: $1000.0
 * 
 * --- Operaciones ---
 * Depósito de $500.0 realizado. Nuevo saldo: $1500.0
 * Retiro de $200.0 realizado. Nuevo saldo: $1300.0
 * Fondos insuficientes.
 * 
 * Saldo actual: $1300.0
 */
