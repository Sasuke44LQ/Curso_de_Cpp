/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 3
 * ===============================================
 * Demostrar operadores de asignación compuesta.
 * 
 * EXPLICACIÓN:
 * - Operadores: +=, -=, *=, /=, %=, **=
 * - Actualizan variable en una sola operación
 * - Equivalente a: x = x + 5 es lo mismo que x += 5
 */

let valor = 20;

console.log("=== OPERADORES DE ASIGNACIÓN COMPUESTA ===");
console.log(`Valor inicial: ${valor}`);

valor += 10;
console.log(`Después de += 10: ${valor}`);

valor -= 5;
console.log(`Después de -= 5: ${valor}`);

valor *= 2;
console.log(`Después de *= 2: ${valor}`);

valor /= 3;
console.log(`Después de /= 3: ${valor}`);

valor %= 4;
console.log(`Después de %= 4: ${valor}`);

let base = 2;
base **= 3;
console.log(`2 **= 3: ${base}`);

/*
 * SALIDA ESPERADA:
 * === OPERADORES DE ASIGNACIÓN COMPUESTA ===
 * Valor inicial: 20
 * Después de += 10: 30
 * Después de -= 5: 25
 * Después de *= 2: 50
 * Después de /= 3: 16.666666666666668
 * Después de %= 4: 0.6666666666666661
 * 2 **= 3: 8
 */
