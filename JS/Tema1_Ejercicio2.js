/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 2
 * ===========================================
 * Programa que clasifica un número en positivo, negativo o cero.
 * 
 * EXPLICACIÓN:
 * - Operador ternario (? :)
 * - Sentencias condicionales: if-else
 * - Template literals para formatear strings
 */

const numero = 42;

// Clasificar número
let clasificacion;
if (numero > 0) {
    clasificacion = "Positivo";
} else if (numero < 0) {
    clasificacion = "Negativo";
} else {
    clasificacion = "Cero";
}

console.log(`=== CLASIFICACIÓN DE NÚMEROS ===`);
console.log(`El número ${numero} es: ${clasificacion}`);

// Usar operador ternario para el mismo resultado
const tipo = numero > 0 ? "Positivo" : (numero < 0 ? "Negativo" : "Cero");
console.log(`Con ternario: ${tipo}`);

/*
 * SALIDA ESPERADA:
 * === CLASIFICACIÓN DE NÚMEROS ===
 * El número 42 es: Positivo
 * Con ternario: Positivo
 */
