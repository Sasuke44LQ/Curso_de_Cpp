/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 8
 * ===============================================
 * Calcular MCM (Mínimo Común Múltiplo).
 * 
 * EXPLICACIÓN:
 * - Fórmula: MCM(a, b) = (a * b) / MCD(a, b)
 * - Primero se calcula el MCD
 * - Luego se usa para obtener el MCM
 */

function mcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

function mcm(a, b) {
    return (a * b) / mcd(a, b);
}

const num1 = 12;
const num2 = 18;

console.log("=== MCM (MÍNIMO COMÚN MÚLTIPLO) ===");
console.log(`MCD(${num1}, ${num2}) = ${mcd(num1, num2)}`);
console.log(`MCM(${num1}, ${num2}) = ${mcm(num1, num2)}`);

console.log(`\nMCM(15, 10) = ${mcm(15, 10)}`);
console.log(`MCM(21, 14) = ${mcm(21, 14)}`);
console.log(`MCM(7, 5) = ${mcm(7, 5)}`);

/*
 * SALIDA ESPERADA:
 * === MCM (MÍNIMO COMÚN MÚLTIPLO) ===
 * MCD(12, 18) = 6
 * MCM(12, 18) = 36
 * 
 * MCM(15, 10) = 30
 * MCM(21, 14) = 42
 * MCM(7, 5) = 35
 */
