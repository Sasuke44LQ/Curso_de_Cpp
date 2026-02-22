/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 2
 * ========================================================
 * Herencia entre clases.
 * 
 * EXPLICACIÓN:
 * - extends: hereda de otra clase
 * - super(): llama al constructor de la clase padre
 * - Reutilizar código
 * - Relación padre-hijo
 */

class Animal {
    constructor(nombre, sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }
    
    hacer_sonido() {
        return `${this.nombre} hace: ${this.sonido}`;
    }
}

class Perro extends Animal {
    constructor(nombre, raza) {
        super(nombre, "¡Guau guau!");
        this.raza = raza;
    }
    
    traerPelota() {
        return `${this.nombre} trae la pelota`;
    }
}

class Gato extends Animal {
    constructor(nombre, color) {
        super(nombre, "¡Miau!");
        this.color = color;
    }
    
    rasgunar() {
        return `${this.nombre} rasguña el sofá`;
    }
}

console.log("=== HERENCIA ===\n");

const perro = new Perro("Rex", "Labrador");
const gato = new Gato("Whiskers", "Negro");

console.log(perro.hacer_sonido());
console.log(perro.traerPelota());

console.log(gato.hacer_sonido());
console.log(gato.rasgunar());

console.log(`\nPerro: ${perro.nombre} (${perro.raza})`);
console.log(`Gato: ${gato.nombre} (${gato.color})`);

/*
 * SALIDA ESPERADA:
 * === HERENCIA ===
 * 
 * Rex hace: ¡Guau guau!
 * Rex trae la pelota
 * Whiskers hace: ¡Miau!
 * Whiskers rasguña el sofá
 * 
 * Perro: Rex (Labrador)
 * Gato: Whiskers (Negro)
 */
