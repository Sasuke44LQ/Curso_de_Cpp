/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 7
 * ===============================================
 * Calcular MCD (Máximo Común Divisor) usando algoritmo de Euclides.
 * 
 * EXPLICACIÓN:
 * - Algoritmo de Euclides: MCD(a,b) = MCD(b, a % b)
 * - Caso base: MCD(n, 0) = n
 * - Utiliza operador módulo (%)
 */

function mcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Versión recursiva
function mcdRecursivo(a, b) {
    return b === 0 ? a : mcdRecursivo(b, a % b);
}

const num1 = 48;
const num2 = 18;

console.log("=== MCD (MÁXIMO COMÚN DIVISOR) ===");
console.log(`MCD(${num1}, ${num2}) = ${mcd(num1, num2)}`);
console.log(`MCD recursivo(${num1}, ${num2}) = ${mcdRecursivo(num1, num2)}`);

console.log(`\nMCD(100, 40) = ${mcd(100, 40)}`);
console.log(`MCD(17, 13) = ${mcd(17, 13)}`);

/*
 * SALIDA ESPERADA:
 * === MCD (MÁXIMO COMÚN DIVISOR) ===
 * MCD(48, 18) = 6
 * MCD recursivo(48, 18) = 6
 * 
 * MCD(100, 40) = 20
 * MCD(17, 13) = 1
 */
