/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 2
 * ===============================================
 * Demostrar operadores relacionales y lógicos.
 * 
 * EXPLICACIÓN:
 * - Operadores de comparación: ==, ===, !=, !==, <, >, <=, >=
 * - Diferencia entre == y ===
 * - Operadores lógicos: &&, ||, !
 */

const num = 10;
const str = "10";

console.log("=== OPERADORES RELACIONALES ===");
console.log(`${num} == "${str}": ${num == str}`);  // true (coerción de tipos)
console.log(`${num} === "${str}": ${num === str}`);  // false (comparación estricta)
console.log(`${num} != "${str}": ${num != str}`);   // false
console.log(`${num} !== "${str}": ${num !== str}`);  // true
console.log(`${num} > 5: ${num > 5}`);
console.log(`${num} <= 10: ${num <= 10}`);

console.log("\n=== OPERADORES LÓGICOS ===");
const x = 15;
console.log(`(${x} > 10) && (${x} < 20): ${(x > 10) && (x < 20)}`);
console.log(`(${x} < 10) || (${x} > 12): ${(x < 10) || (x > 12)}`);
console.log(`!(${x} == 20): ${!(x == 20)}`);

/*
 * SALIDA ESPERADA:
 * === OPERADORES RELACIONALES ===
 * 10 == "10": true
 * 10 === "10": false
 * 10 != "10": false
 * 10 !== "10": true
 * 10 > 5: true
 * 10 <= 10: true
 * 
 * === OPERADORES LÓGICOS ===
 * (15 > 10) && (15 < 20): true
 * (15 < 10) || (15 > 12): true
 * !(15 == 20): true
 */
