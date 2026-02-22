/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 10
 * =========================================
 * Combinar arrays de múltiples formas.
 * 
 * EXPLICACIÓN:
 * - Operador spread (...)
 * - concat(): combina arrays
 * - Aplanar arrays (flatten)
 */

function combinarArrays() {
    const arr1 = [1, 2, 3];
    const arr2 = [4, 5, 6];
    const arr3 = [7, 8, 9];
    
    // Método 1: spread operator
    const spread = [...arr1, ...arr2, ...arr3];
    
    // Método 2: concat
    const concatenado = arr1.concat(arr2, arr3);
    
    // Método 3: push con spread
    const resultado = [...arr1];
    resultado.push(...arr2, ...arr3);
    
    return {spread, concatenado, resultado};
}

function aplanarArray(arr) {
    return arr.flat(Infinity);
}

console.log("=== COMBINACIÓN DE ARRAYS ===");

const resultado = combinarArrays();
console.log(`Spread operator: ${resultado.spread}`);
console.log(`concat(): ${resultado.concatenado}`);
console.log(`push + spread: ${resultado.resultado}`);

// Aplanar array anidado
const anidado = [1, [2, 3], [4, [5, 6]], 7];
console.log(`\nArray anidado: ${JSON.stringify(anidado)}`);
console.log(`Aplanado: ${aplanarArray(anidado)}`);

// zip: combinar elementos de múltiples arrays
const nombres = ['Ana', 'Bob', 'Carlos'];
const edades = [25, 30, 28];
const ciudades = ['Madrid', 'Barcelona', 'Valencia'];

const personas = nombres.map((nombre, i) => ({
    nombre,
    edad: edades[i],
    ciudad: ciudades[i]
}));

console.log(`\nPersonas (zip de arrays):`);
personas.forEach(p => console.log(`- ${p.nombre}, ${p.edad} años, ${p.ciudad}`));

/*
 * SALIDA ESPERADA:
 * === COMBINACIÓN DE ARRAYS ===
 * Spread operator: 1,2,3,4,5,6,7,8,9
 * concat(): 1,2,3,4,5,6,7,8,9
 * push + spread: 1,2,3,4,5,6,7,8,9
 * 
 * Array anidado: [1,[2,3],[4,[5,6]],7]
 * Aplanado: 1,2,3,4,5,6,7
 * 
 * Personas (zip de arrays):
 * - Ana, 25 años, Madrid
 * - Bob, 30 años, Barcelona
 * - Carlos, 28 años, Valencia
 */
