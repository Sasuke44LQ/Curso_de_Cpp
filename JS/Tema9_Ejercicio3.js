/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 3
 * ========================================================
 * Polimorfismo (métodos sobrescribidos).
 * 
 * EXPLICACIÓN:
 * - Polimorfismo: "muchas formas"
 * - Sobrescribir métodos en subclases
 * - Mismo método, comportamiento diferente
 */

class Forma {
    constructor(nombre) {
        this.nombre = nombre;
    }
    
    calcularArea() {
        throw new Error("Debe implementar calcularArea()");
    }
    
    mostrarInfo() {
        return `${this.nombre}: Área = ${this.calcularArea().toFixed(2)}`;
    }
}

class Circulo extends Forma {
    constructor(radio) {
        super("Círculo");
        this.radio = radio;
    }
    
    calcularArea() {
        return Math.PI * this.radio * this.radio;
    }
}

class Rectangulo extends Forma {
    constructor(base, altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    calcularArea() {
        return this.base * this.altura;
    }
}

class Triangulo extends Forma {
    constructor(base, altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }
    
    calcularArea() {
        return (this.base * this.altura) / 2;
    }
}

console.log("=== POLIMORFISMO ===\n");

const formas = [
    new Circulo(5),
    new Rectangulo(4, 6),
    new Triangulo(8, 5)
];

formas.forEach(forma => {
    console.log(forma.mostrarInfo());
});

/*
 * SALIDA ESPERADA:
 * === POLIMORFISMO ===
 * 
 * Círculo: Área = 78.54
 * Rectángulo: Área = 24.00
 * Triángulo: Área = 20.00
 */
