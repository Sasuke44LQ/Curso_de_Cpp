/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 1
 * ========================================
 * Crear y manipular un array de números.
 * 
 * EXPLICACIÓN:
 * - Declaración de arrays con []
 * - Acceso a elementos por índice
 * - Métodos: push(), pop(), length
 */

const numeros = [];

console.log("=== MANIPULACIÓN DE ARRAYS ===");

// Agregar elementos
numeros.push(10);
numeros.push(20);
numeros.push(30);
numeros.push(40);
numeros.push(50);

console.log("Array después de agregar elementos:");
console.log(numeros);
console.log(`Longitud: ${numeros.length}`);

// Acceder a elementos
console.log(`\nPrimer elemento: ${numeros[0]}`);
console.log(`Último elemento: ${numeros[numeros.length - 1]}`);

// Eliminar último elemento
const eliminado = numeros.pop();
console.log(`\nElemento eliminado: ${eliminado}`);
console.log(`Array actualizado: ${numeros}`);

/*
 * SALIDA ESPERADA:
 * === MANIPULACIÓN DE ARRAYS ===
 * Array después de agregar elementos:
 * [ 10, 20, 30, 40, 50 ]
 * Longitud: 5
 * 
 * Primer elemento: 10
 * Último elemento: 50
 * 
 * Elemento eliminado: 50
 * Array actualizado: 10,20,30,40
 */
