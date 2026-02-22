/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 5
 * ========================================================
 * Getters y Setters para encapsulación.
 * 
 * EXPLICACIÓN:
 * - get: acceder a propiedad como si fuera atributo
 * - set: asignar valor como si fuera atributo
 * - Validación en setter
 * - Propiedades privadas con #
 */

class CuentaBancaria {
    #saldo = 0;  // Propiedad privada
    
    constructor(titular, saldoInicial = 0) {
        this.titular = titular;
        this.#saldo = saldoInicial;
    }
    
    get saldo() {
        return this.#saldo;
    }
    
    set saldo(cantidad) {
        if (cantidad < 0) {
            console.error("Error: el saldo no puede ser negativo");
            return;
        }
        this.#saldo = cantidad;
    }
    
    depositar(cantidad) {
        if (cantidad > 0) {
            this.#saldo += cantidad;
            return `Depósito de $${cantidad} realizado`;
        }
        return "Error: cantidad debe ser positiva";
    }
    
    retirar(cantidad) {
        if (cantidad > this.#saldo) {
            return "Error: saldo insuficiente";
        }
        this.#saldo -= cantidad;
        return `Retiro de $${cantidad} realizado`;
    }
}

class Estudiante {
    #calificaciones = [];
    
    constructor(nombre) {
        this.nombre = nombre;
    }
    
    agregarCalificacion(calificacion) {
        if (calificacion >= 0 && calificacion <= 100) {
            this.#calificaciones.push(calificacion);
        }
    }
    
    get promedio() {
        if (this.#calificaciones.length === 0) return 0;
        const suma = this.#calificaciones.reduce((a, b) => a + b, 0);
        return suma / this.#calificaciones.length;
    }
    
    get calificaciones() {
        return [...this.#calificaciones];
    }
}

console.log("=== GETTERS Y SETTERS ===\n");

const cuenta = new CuentaBancaria("Juan", 1000);
console.log(`Cuenta de ${cuenta.titular}`);
console.log(`Saldo inicial: $${cuenta.saldo}`);

console.log(cuenta.depositar(500));
console.log(`Nuevo saldo: $${cuenta.saldo}`);

console.log(cuenta.retirar(200));
console.log(`Saldo final: $${cuenta.saldo}`);

console.log("\nEstudiante:");
const estudiante = new Estudiante("Ana");
estudiante.agregarCalificacion(85);
estudiante.agregarCalificacion(90);
estudiante.agregarCalificacion(88);

console.log(`${estudiante.nombre}`);
console.log(`Calificaciones: [${estudiante.calificaciones}]`);
console.log(`Promedio: ${estudiante.promedio.toFixed(2)}`);

/*
 * SALIDA ESPERADA:
 * === GETTERS Y SETTERS ===
 * 
 * Cuenta de Juan
 * Saldo inicial: $1000
 * Depósito de $500 realizado
 * Nuevo saldo: $1500
 * Retiro de $200 realizado
 * Saldo final: $1300
 * 
 * Estudiante:
 * Ana
 * Calificaciones: [85,90,88]
 * Promedio: 87.67
 */
