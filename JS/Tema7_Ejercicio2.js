/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 2
 * =========================================
 * Funciones de utilidad matemática.
 * 
 * EXPLICACIÓN:
 * - Funciones para operaciones comunes
 * - Métodos Math
 * - Validación de entrada
 */

function absoluto(n) {
    return Math.abs(n);
}

function raiz(n) {
    return n >= 0 ? Math.sqrt(n) : "Error: número negativo";
}

function redondear(n, decimales = 0) {
    return Math.round(n * Math.pow(10, decimales)) / Math.pow(10, decimales);
}

function esNumero(valor) {
    return !isNaN(valor) && isFinite(valor);
}

console.log("=== FUNCIONES DE UTILIDAD ===");

console.log(`Valor absoluto:`);
console.log(`|−15| = ${absoluto(-15)}`);
console.log(`|42| = ${absoluto(42)}`);

console.log(`\nRaíz cuadrada:`);
console.log(`√16 = ${raiz(16)}`);
console.log(`√-9 = ${raiz(-9)}`);

console.log(`\nRedondeo:`);
console.log(`3.14159 a 2 decimales = ${redondear(3.14159, 2)}`);
console.log(`3.14159 a 0 decimales = ${redondear(3.14159)}`);

console.log(`\nValidación:`);
console.log(`¿42 es número? ${esNumero(42)}`);
console.log(`¿"texto" es número? ${esNumero("texto")}`);

/*
 * SALIDA ESPERADA:
 * === FUNCIONES DE UTILIDAD ===
 * Valor absoluto:
 * |−15| = 15
 * |42| = 42
 * 
 * Raíz cuadrada:
 * √16 = 4
 * √-9 = Error: número negativo
 * 
 * Redondeo:
 * 3.14159 a 2 decimales = 3.14
 * 3.14159 a 0 decimales = 3
 * 
 * Validación:
 * ¿42 es número? true
 * ¿"texto" es número? false
 */
