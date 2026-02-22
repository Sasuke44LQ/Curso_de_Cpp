/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 1
 * ========================================================
 * Introducción a clases en JavaScript.
 * 
 * EXPLICACIÓN:
 * - Clase: plantilla para crear objetos
 * - Constructor: inicializa propiedades
 * - Métodos: funciones dentro de la clase
 * - new: crea instancia
 */

class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    saludar() {
        return `Hola, soy ${this.nombre} y tengo ${this.edad} años`;
    }
    
    esMayorDeEdad() {
        return this.edad >= 18;
    }
}

class Vehiculo {
    constructor(marca, modelo, año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    obtenerInfo() {
        return `${this.año} ${this.marca} ${this.modelo}`;
    }
}

console.log("=== CLASES BÁSICAS ===\n");

const persona1 = new Persona("Juan", 25);
const persona2 = new Persona("Ana", 17);

console.log(persona1.saludar());
console.log(persona2.saludar());

console.log(`¿Juan es mayor de edad? ${persona1.esMayorDeEdad()}`);
console.log(`¿Ana es mayor de edad? ${persona2.esMayorDeEdad()}`);

const auto = new Vehiculo("Toyota", "Corolla", 2022);
console.log(`\nVehículo: ${auto.obtenerInfo()}`);

/*
 * SALIDA ESPERADA:
 * === CLASES BÁSICAS ===
 * 
 * Hola, soy Juan y tengo 25 años
 * Hola, soy Ana y tengo 17 años
 * ¿Juan es mayor de edad? true
 * ¿Ana es mayor de edad? false
 * 
 * Vehículo: 2022 Toyota Corolla
 */
