/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 1
 * ===============================================
 * Evaluar expresiones respetando precedencia de operadores.
 * 
 * EXPLICACIÓN:
 * - Precedencia de operadores: *, / antes que +, -
 * - Paréntesis para cambiar orden de evaluación
 * - Operadores de comparación y lógicos
 */

// Expresiones matemáticas con precedencia
const resultado1 = 10 + 5 * 2;  // 20 (no 30)
const resultado2 = (10 + 5) * 2;  // 30
const resultado3 = 20 / 4 + 3;  // 8
const resultado4 = 20 / (4 + 2);  // 3.33

// Operadores lógicos
const a = true, b = false;
const andResult = a && b;  // false
const orResult = a || b;   // true
const notResult = !b;      // true

console.log("=== PRECEDENCIA DE OPERADORES ===");
console.log(`10 + 5 * 2 = ${resultado1}`);
console.log(`(10 + 5) * 2 = ${resultado2}`);
console.log(`20 / 4 + 3 = ${resultado3}`);
console.log(`20 / (4 + 2) = ${resultado4}`);

console.log("\n=== OPERADORES LÓGICOS ===");
console.log(`${a} && ${b} = ${andResult}`);
console.log(`${a} || ${b} = ${orResult}`);
console.log(`!${b} = ${notResult}`);

/*
 * SALIDA ESPERADA:
 * === PRECEDENCIA DE OPERADORES ===
 * 10 + 5 * 2 = 20
 * (10 + 5) * 2 = 30
 * 20 / 4 + 3 = 8
 * 20 / (4 + 2) = 3.3333333333333335
 * 
 * === OPERADORES LÓGICOS ===
 * true && false = false
 * true || false = true
 * !false = true
 */
