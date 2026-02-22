/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 2
 * ========================================
 * Encontrar máximo y mínimo en un array.
 * 
 * EXPLICACIÓN:
 * - Método Math.max() y Math.min()
 * - Esparcelado de arrays con ...
 * - Iteración con reduce()
 */

function encontrarMaxMin(arr) {
    const max = Math.max(...arr);
    const min = Math.min(...arr);
    return {max, min};
}

function encontrarMaxMinReduce(arr) {
    return arr.reduce((acc, num) => ({
        max: num > acc.max ? num : acc.max,
        min: num < acc.min ? num : acc.min
    }), {max: arr[0], min: arr[0]});
}

const numeros = [45, 12, 89, 34, 67, 23, 56, 91, 15];

console.log("=== MÁXIMO Y MÍNIMO ===");
console.log(`Array: ${numeros}`);

const resultado1 = encontrarMaxMin(numeros);
console.log(`\nCon Math.max/min:`);
console.log(`Máximo: ${resultado1.max}`);
console.log(`Mínimo: ${resultado1.min}`);

const resultado2 = encontrarMaxMinReduce(numeros);
console.log(`\nCon reduce():`);
console.log(`Máximo: ${resultado2.max}`);
console.log(`Mínimo: ${resultado2.min}`);

/*
 * SALIDA ESPERADA:
 * === MÁXIMO Y MÍNIMO ===
 * Array: 45,12,89,34,67,23,56,91,15
 * 
 * Con Math.max/min:
 * Máximo: 91
 * Mínimo: 12
 * 
 * Con reduce():
 * Máximo: 91
 * Mínimo: 12
 */
