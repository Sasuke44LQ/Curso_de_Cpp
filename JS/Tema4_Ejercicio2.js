/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 2
 * ==============================================
 * Calcular suma de números del 1 al 100.
 * 
 * EXPLICACIÓN:
 * - Suma iterativa con bucle
 * - Fórmula matemática: n*(n+1)/2
 * - Comparación de ambos métodos
 */

console.log("=== SUMA DE 1 A 100 ===");

// Método 1: Iterativo
let suma = 0;
for (let i = 1; i <= 100; i++) {
    suma += i;
}
console.log(`Método iterativo: ${suma}`);

// Método 2: Fórmula de Gauss
const n = 100;
const sumaFormula = (n * (n + 1)) / 2;
console.log(`Método con fórmula: ${sumaFormula}`);

// Método 3: Array y reduce
const sumaReduce = Array.from({length: 100}, (_, i) => i + 1)
    .reduce((a, b) => a + b);
console.log(`Método con reduce: ${sumaReduce}`);

/*
 * SALIDA ESPERADA:
 * === SUMA DE 1 A 100 ===
 * Método iterativo: 5050
 * Método con fórmula: 5050
 * Método con reduce: 5050
 */
