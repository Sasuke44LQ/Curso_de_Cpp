/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 4
 * ===============================================
 * Demostrar operadores de incremento y decremento.
 * 
 * EXPLICACIÓN:
 * - ++variable (preincremento): incrementa y retorna nuevo valor
 * - variable++ (postincremento): retorna valor antiguo y luego incrementa
 * - --variable (predecremento): decrementa y retorna nuevo valor
 * - variable-- (postdecremento): retorna valor antiguo y luego decrementa
 */

let preincremento = 5;
let postincremento = 5;
let predecremento = 5;
let postdecremento = 5;

console.log("=== OPERADORES DE INCREMENTO/DECREMENTO ===");

console.log("\nPREINCREMENTO (++x):");
let resultadoPre = ++preincremento;
console.log(`++x donde x=5: ${resultadoPre}, x ahora es ${preincremento}`);

console.log("\nPOSTINCREMENTO (x++):");
let resultadoPost = postincremento++;
console.log(`x++ donde x=5: ${resultadoPost}, x ahora es ${postincremento}`);

console.log("\nPREDECREMENTO (--x):");
let resultadoPreDec = --predecremento;
console.log(`--x donde x=5: ${resultadoPreDec}, x ahora es ${predecremento}`);

console.log("\nPOSTDECREMENTO (x--):");
let resultadoPostDec = postdecremento--;
console.log(`x-- donde x=5: ${resultadoPostDec}, x ahora es ${postdecremento}`);

/*
 * SALIDA ESPERADA:
 * === OPERADORES DE INCREMENTO/DECREMENTO ===
 * 
 * PREINCREMENTO (++x):
 * ++x donde x=5: 6, x ahora es 6
 * 
 * POSTINCREMENTO (x++):
 * x++ donde x=5: 5, x ahora es 6
 * 
 * PREDECREMENTO (--x):
 * --x donde x=5: 4, x ahora es 4
 * 
 * POSTDECREMENTO (x--):
 * x-- donde x=5: 5, x ahora es 4
 */
