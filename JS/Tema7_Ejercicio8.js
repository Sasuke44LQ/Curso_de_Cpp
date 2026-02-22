/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 8
 * =========================================
 * Funciones con argumentos variables (rest parameters).
 * 
 * EXPLICACIÓN:
 * - Rest parameter: ...args
 * - Argumentación variable
 * - Operaciones con múltiples valores
 */

function sumarTodos(...numeros) {
    return numeros.reduce((a, b) => a + b, 0);
}

function concatenarPalabras(...palabras) {
    return palabras.join(" ");
}

function encontrarMaximo(...numeros) {
    return Math.max(...numeros);
}

function filtrarPares(...numeros) {
    return numeros.filter(n => n % 2 === 0);
}

console.log("=== ARGUMENTOS VARIABLES ===");

console.log("Suma de múltiples números:");
console.log(`sumarTodos(1, 2, 3) = ${sumarTodos(1, 2, 3)}`);
console.log(`sumarTodos(10, 20, 30, 40) = ${sumarTodos(10, 20, 30, 40)}`);

console.log("\nConcatenación:");
console.log(`concatenarPalabras("Hola", "mundo", "desde", "JavaScript") = "${concatenarPalabras("Hola", "mundo", "desde", "JavaScript")}"`);

console.log("\nMáximo:");
console.log(`encontrarMaximo(5, 12, 9, 3) = ${encontrarMaximo(5, 12, 9, 3)}`);

console.log("\nFiltrar pares:");
console.log(`filtrarPares(1, 2, 3, 4, 5, 6) = [${filtrarPares(1, 2, 3, 4, 5, 6)}]`);

/*
 * SALIDA ESPERADA:
 * === ARGUMENTOS VARIABLES ===
 * Suma de múltiples números:
 * sumarTodos(1, 2, 3) = 6
 * sumarTodos(10, 20, 30, 40) = 100
 * 
 * Concatenación:
 * concatenarPalabras("Hola", "mundo", "desde", "JavaScript") = "Hola mundo desde JavaScript"
 * 
 * Máximo:
 * encontrarMaximo(5, 12, 9, 3) = 12
 * 
 * Filtrar pares:
 * filtrarPares(1, 2, 3, 4, 5, 6) = [2,4,6]
 */
