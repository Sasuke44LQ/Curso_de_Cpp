/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 1
 * =========================================
 * Funciones básicas y sobrecarga.
 * 
 * EXPLICACIÓN:
 * - Funciones con parámetros por defecto
 * - Funciones con número variable de parámetros
 * - Uso de defaultparámetros
 */

function elevarAlCuadrado(numero) {
    return numero * numero;
}

function elevarAlCubo(numero) {
    return numero * numero * numero;
}

// Con parámetro por defecto
function potencia(base, exponente = 2) {
    return base ** exponente;
}

// Funciones flecha
const sumar = (a, b) => a + b;
const restarr = (a, b) => a - b;

console.log("=== FUNCIONES BÁSICAS ===");
console.log(`5² = ${elevarAlCuadrado(5)}`);
console.log(`3³ = ${elevarAlCubo(3)}`);

console.log(`\nCon parámetro por defecto:`);
console.log(`4² = ${potencia(4)}`);
console.log(`4³ = ${potencia(4, 3)}`);
console.log(`2⁵ = ${potencia(2, 5)}`);

console.log(`\nFunciones flecha:`);
console.log(`10 + 5 = ${sumar(10, 5)}`);
console.log(`10 - 3 = ${restarr(10, 3)}`);

/*
 * SALIDA ESPERADA:
 * === FUNCIONES BÁSICAS ===
 * 5² = 25
 * 3³ = 27
 * 
 * Con parámetro por defecto:
 * 4² = 16
 * 4³ = 64
 * 2⁵ = 32
 * 
 * Funciones flecha:
 * 10 + 5 = 15
 * 10 - 3 = 7
 */
