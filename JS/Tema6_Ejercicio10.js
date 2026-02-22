/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 10
 * ==============================================
 * Ordenar strings en un array.
 * 
 * EXPLICACIÓN:
 * - Ordenamiento alfabético
 * - Ordenamiento por longitud
 * - Case-insensitive sorting
 */

function ordenarAlfabeticamente(arr) {
    return [...arr].sort();
}

function ordenarPorLongitud(arr) {
    return [...arr].sort((a, b) => a.length - b.length);
}

function ordenarCaseInsensitive(arr) {
    return [...arr].sort((a, b) => a.toLowerCase().localeCompare(b.toLowerCase()));
}

const palabras = ['zebra', 'apple', 'Banana', 'cherry', 'date'];

console.log("=== ORDENAMIENTO DE STRINGS ===");
console.log(`Original: [${palabras.map(p => `"${p}"`).join(", ")}]`);

console.log(`\nAlfabéticamente: [${ordenarAlfabeticamente(palabras).map(p => `"${p}"`).join(", ")}]`);
console.log(`Por longitud: [${ordenarPorLongitud(palabras).map(p => `"${p}"`).join(", ")}]`);
console.log(`Case-insensitive: [${ordenarCaseInsensitive(palabras).map(p => `"${p}"`).join(", ")}]`);

// Orden descendente
const descendente = [...palabras].sort().reverse();
console.log(`\nDescendente: [${descendente.map(p => `"${p}"`).join(", ")}]`);

/*
 * SALIDA ESPERADA:
 * === ORDENAMIENTO DE STRINGS ===
 * Original: ["zebra", "apple", "Banana", "cherry", "date"]
 * 
 * Alfabéticamente: ["Banana", "apple", "cherry", "date", "zebra"]
 * Por longitud: ["date", "apple", "zebra", "cherry", "Banana"]
 * Case-insensitive: ["apple", "Banana", "cherry", "date", "zebra"]
 * 
 * Descendente: ["zebra", "date", "cherry", "apple", "Banana"]
 */
