/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 3
 * ===========================================
 * Calcular área y perímetro de un círculo.
 * 
 * EXPLICACIÓN:
 * - Uso de Math.PI constante
 * - Operaciones con exponentes usando **
 * - Método toFixed() para decimales
 */

const radio = 5;
const PI = Math.PI;

// Cálculos
const area = PI * radio ** 2;
const perimetro = 2 * PI * radio;

console.log("=== CÍRCULO ===");
console.log(`Radio: ${radio} unidades`);
console.log(`Área: ${area.toFixed(2)} unidades²`);
console.log(`Perímetro: ${perimetro.toFixed(2)} unidades`);

/*
 * SALIDA ESPERADA:
 * === CÍRCULO ===
 * Radio: 5 unidades
 * Área: 78.54 unidades²
 * Perímetro: 31.42 unidades
 */
