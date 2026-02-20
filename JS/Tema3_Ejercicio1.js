/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 1
 * ================================================
 * Comparar dos números e indicar cuál es mayor.
 * 
 * EXPLICACIÓN:
 * - Sentencias if-else-if
 * - Operadores de comparación: <, >, ==
 * - Igualdad vs desigualdad
 */

function compararNumeros(a, b) {
    if (a > b) {
        return `${a} es mayor que ${b}`;
    } else if (a < b) {
        return `${a} es menor que ${b}`;
    } else {
        return `${a} es igual a ${b}`;
    }
}

console.log("=== COMPARACIÓN DE NÚMEROS ===");
console.log(compararNumeros(15, 10));
console.log(compararNumeros(5, 20));
console.log(compararNumeros(42, 42));

/*
 * SALIDA ESPERADA:
 * === COMPARACIÓN DE NÚMEROS ===
 * 15 es mayor que 10
 * 5 es menor que 20
 * 42 es igual a 42
 */
