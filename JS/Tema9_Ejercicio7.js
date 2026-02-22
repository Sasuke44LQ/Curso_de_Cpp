/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 7
 * ========================================================
 * Composición (asociación entre objetos).
 * 
 * EXPLICACIÓN:
 * - Composición: contener objetos dentro de otros
 * - Alternativa a herencia
 * - Relación "tiene un"
 */

class Motor {
    constructor(tipo, potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    obtenerInfo() {
        return `${this.tipo} (${this.potencia} HP)`;
    }
}

class Llantas {
    constructor(marca, tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }
    
    obtenerInfo() {
        return `Llantas ${this.marca} ${this.tamaño}`;
    }
}

class Auto {
    constructor(marca, modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = null;
        this.llantas = null;
    }
    
    instalarMotor(motor) {
        this.motor = motor;
    }
    
    instalarLlantas(llantas) {
        this.llantas = llantas;
    }
    
    obtenerEspecificaciones() {
        console.log(`\n${this.marca} ${this.modelo}`);
        console.log(`Motor: ${this.motor ? this.motor.obtenerInfo() : "No instalado"}`);
        console.log(`Llantas: ${this.llantas ? this.llantas.obtenerInfo() : "No instaladas"}`);
    }
}

class Oficina {
    constructor(nombre, area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = [];
    }
    
    agregarEmpleado(empleado) {
        this.empleados.push(empleado);
    }
    
    contarEmpleados() {
        return this.empleados.length;
    }
    
    mostrarInfo() {
        console.log(`\nOficina: ${this.nombre} (${this.area}m²)`);
        console.log(`Empleados (${this.contarEmpleados()}): ${this.empleados.join(", ")}`);
    }
}

console.log("=== COMPOSICIÓN ===");

const motorV8 = new Motor("V8", 350);
const llantas = new Llantas("Michelin", "18 pulgadas");

const carro = new Auto("Ferrari", "F8");
carro.instalarMotor(motorV8);
carro.instalarLlantas(llantas);
carro.obtenerEspecificaciones();

const oficina = new Oficina("Desarrolladores", 200);
oficina.agregarEmpleado("Juan");
oficina.agregarEmpleado("Ana");
oficina.agregarEmpleado("Carlos");
oficina.mostrarInfo();

/*
 * SALIDA ESPERADA:
 * === COMPOSICIÓN ===
 * 
 * Ferrari F8
 * Motor: V8 (350 HP)
 * Llantas: Llantas Michelin 18 pulgadas
 * 
 * Oficina: Desarrolladores (200m²)
 * Empleados (3): Juan, Ana, Carlos
 */
