/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 6
 * ===============================================
 * Demostrar operadores bit a bit.
 * 
 * EXPLICACIÓN:
 * - AND (&), OR (|), XOR (^), NOT (~)
 * - Desplazamientos: << (izquierda), >> (derecha)
 * - toString(2) convierte a representación binaria
 */

const a = 12;  // 1100 en binario
const b = 10;  // 1010 en binario

console.log("=== OPERADORES BIT A BIT ===");
console.log(`a = ${a} (${a.toString(2).padStart(4, '0')} en binario)`);
console.log(`b = ${b} (${b.toString(2).padStart(4, '0')} en binario)`);

const and = a & b;
const or = a | b;
const xor = a ^ b;

console.log(`\na & b = ${and} (${and.toString(2).padStart(4, '0')})`);
console.log(`a | b = ${or} (${or.toString(2).padStart(4, '0')})`);
console.log(`a ^ b = ${xor} (${xor.toString(2).padStart(4, '0')})`);

const desplazamientoIzq = a << 1;
const desplazamientoDer = a >> 1;

console.log(`\n${a} << 1 = ${desplazamientoIzq}`);
console.log(`${a} >> 1 = ${desplazamientoDer}`);

/*
 * SALIDA ESPERADA:
 * === OPERADORES BIT A BIT ===
 * a = 12 (1100 en binario)
 * b = 10 (1010 en binario)
 * 
 * a & b = 8 (1000)
 * a | b = 14 (1110)
 * a ^ b = 6 (0110)
 * 
 * 12 << 1 = 24
 * 12 >> 1 = 6
 */
