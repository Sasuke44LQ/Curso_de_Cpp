/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 5
 * =====================================================
 * Implementar una Pila (Stack LIFO).
 * 
 * EXPLICACIÓN:
 * - LIFO: Last In, First Out
 * - Usar array con push() y pop()
 * - Validador de paréntesis como ejemplo
 */

class Pila {
    constructor() {
        this.elementos = [];
    }
    
    apilar(elemento) {
        this.elementos.push(elemento);
    }
    
    desapilar() {
        return this.elementos.pop();
    }
    
    cima() {
        return this.elementos[this.elementos.length - 1];
    }
    
    estaVacia() {
        return this.elementos.length === 0;
    }
    
    tamano() {
        return this.elementos.length;
    }
    
    mostrar() {
        console.log(`[${this.elementos.reverse().join(" | ")}]`);
        this.elementos.reverse();
    }
}

function validarParentesis(expresion) {
    const pila = new Pila();
    const pares = {'(': ')', '[': ']', '{': '}'};
    
    for (let char of expresion) {
        if (char === '(' || char === '[' || char === '{') {
            pila.apilar(char);
        } else if (char === ')' || char === ']' || char === '}') {
            if (pila.estaVacia()) return false;
            if (pares[pila.desapilar()] !== char) return false;
        }
    }
    
    return pila.estaVacia();
}

console.log("=== PILA (LIFO) ===\n");

const pila = new Pila();
pila.apilar('A');
pila.apilar('B');
pila.apilar('C');

console.log("Después de apilar A, B, C:");
pila.mostrar();

console.log(`\nDesapilando: ${pila.desapilar()}`);
pila.mostrar();

console.log("\n=== VALIDADOR DE PARÉNTESIS ===");
const expresiones = [
    "({[]})",
    "({[}])",
    "()",
    "({[}",
    "((()))"
];

expresiones.forEach(exp => {
    console.log(`"${exp}": ${validarParentesis(exp) ? '✓ VÁLIDO' : '✗ INVÁLIDO'}`);
});

/*
 * SALIDA ESPERADA:
 * === PILA (LIFO) ===
 * 
 * Después de apilar A, B, C:
 * [C | B | A]
 * 
 * Desapilando: C
 * [B | A]
 * 
 * === VALIDADOR DE PARÉNTESIS ===
 * "({[]})": ✓ VÁLIDO
 * "({[}])": ✗ INVÁLIDO
 * "()": ✓ VÁLIDO
 * "({[}": ✗ INVÁLIDO
 * "((()))": ✓ VÁLIDO
 */
