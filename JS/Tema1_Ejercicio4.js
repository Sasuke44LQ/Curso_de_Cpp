/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 4
 * ===========================================
 * Calcular área, perímetro y diagonal de un cuadrado.
 * 
 * EXPLICACIÓN:
 * - Math.sqrt() para raíz cuadrada
 * - Fórmula del teorema de Pitágoras
 * - Template literals para salida formateada
 */

const lado = 6;

// Cálculos
const area = lado * lado;
const perimetro = lado * 4;
const diagonal = lado * Math.sqrt(2);

console.log("=== CUADRADO ===");
console.log(`Lado: ${lado} unidades`);
console.log(`Área: ${area.toFixed(2)} unidades²`);
console.log(`Perímetro: ${perimetro.toFixed(2)} unidades`);
console.log(`Diagonal: ${diagonal.toFixed(2)} unidades`);

/*
 * SALIDA ESPERADA:
 * === CUADRADO ===
 * Lado: 6 unidades
 * Área: 36.00 unidades²
 * Perímetro: 24.00 unidades
 * Diagonal: 8.49 unidades
 */
