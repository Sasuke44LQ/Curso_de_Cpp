/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 4
 * ========================================================
 * Métodos estáticos y propiedades de clase.
 * 
 * EXPLICACIÓN:
 * - static: método/propiedad de la clase, no de instancia
 * - Se accede con NombreClase.metodo()
 * - No necesita crear instancia
 * - Caso de uso: funciones de utilidad, contadores
 */

class Contador {
    static numInstancias = 0;
    
    constructor(nombre) {
        this.nombre = nombre;
        Contador.numInstancias++;
    }
    
    static obtenerInstancias() {
        return `Total de instancias: ${Contador.numInstancias}`;
    }
    
    static resetear() {
        Contador.numInstancias = 0;
    }
}

class Matematica {
    static PI = 3.14159;
    
    static cuadrado(n) {
        return n * n;
    }
    
    static cubo(n) {
        return n * n * n;
    }
    
    static areaCirculo(radio) {
        return this.PI * radio * radio;
    }
}

console.log("=== MÉTODOS ESTÁTICOS ===\n");

console.log("Clase Matemática:");
console.log(`5² = ${Matematica.cuadrado(5)}`);
console.log(`3³ = ${Matematica.cubo(3)}`);
console.log(`Área círculo r=4: ${Matematica.areaCirculo(4).toFixed(2)}`);

console.log("\nContador:");
const obj1 = new Contador("A");
const obj2 = new Contador("B");
const obj3 = new Contador("C");

console.log(Contador.obtenerInstancias());

Contador.resetear();
console.log("Después de resetear:");
console.log(Contador.obtenerInstancias());

/*
 * SALIDA ESPERADA:
 * === MÉTODOS ESTÁTICOS ===
 * 
 * Clase Matemática:
 * 5² = 25
 * 3³ = 27
 * Área círculo r=4: 50.27
 * 
 * Contador:
 * Total de instancias: 3
 * Después de resetear:
 * Total de instancias: 0
 */
