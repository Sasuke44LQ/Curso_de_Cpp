/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 9
 * ===============================================
 * Calcular potencias usando el operador **.
 * 
 * EXPLICACIÓN:
 * - Operador ** para potenciación
 * - Equivalente a Math.pow()
 * - Exponentes positivos y negativos
 */

function calcularPotencias(base, exponente) {
    const resultado = base ** exponente;
    return resultado;
}

console.log("=== CÁLCULO DE POTENCIAS ===");

console.log("Potencias positivas:");
console.log(`2^3 = ${calcularPotencias(2, 3)}`);
console.log(`5^2 = ${calcularPotencias(5, 2)}`);
console.log(`10^3 = ${calcularPotencias(10, 3)}`);

console.log("\nPotencias negativas (inverso):");
console.log(`2^-1 = ${calcularPotencias(2, -1)}`);
console.log(`5^-2 = ${calcularPotencias(5, -2)}`);

console.log("\nPotencias fraccionarias (raíces):");
console.log(`16^(1/2) = ${calcularPotencias(16, 1/2)}`);  // Raíz cuadrada
console.log(`27^(1/3) = ${calcularPotencias(27, 1/3)}`);  // Raíz cúbica

console.log("\nComparación con Math.pow():");
console.log(`Math.pow(2, 3) = ${Math.pow(2, 3)}`);
console.log(`2 ** 3 = ${2 ** 3}`);

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE POTENCIAS ===
 * Potencias positivas:
 * 2^3 = 8
 * 5^2 = 25
 * 10^3 = 1000
 * 
 * Potencias negativas (inverso):
 * 2^-1 = 0.5
 * 5^-2 = 0.04
 * 
 * Potencias fraccionarias (raíces):
 * 16^(1/2) = 4
 * 27^(1/3) = 3
 * 
 * Comparación con Math.pow():
 * Math.pow(2, 3) = 8
 * 2 ** 3 = 8
 */
