/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 10
 * ============================================
 * Calcular suma de dígitos de un número.
 * 
 * EXPLICACIÓN:
 * - Conversión de número a string
 * - Métodos de array: split(), map(), reduce()
 * - Conversión de string a número con Number()
 */

function sumaDigitos(numero) {
    const digitos = String(numero)
        .split('')
        .map(d => Number(d));
    
    const suma = digitos.reduce((a, b) => a + b, 0);
    return suma;
}

const numero = 12345;
const suma = sumaDigitos(numero);

console.log("=== SUMA DE DÍGITOS ===");
console.log(`Número: ${numero}`);
console.log(`Dígitos: ${String(numero).split('').join(', ')}`);
console.log(`Suma: ${suma}`);

// Ejemplo adicional
const numero2 = 9876;
console.log(`\nNúmero: ${numero2}`);
console.log(`Suma de dígitos: ${sumaDigitos(numero2)}`);

/*
 * SALIDA ESPERADA:
 * === SUMA DE DÍGITOS ===
 * Número: 12345
 * Dígitos: 1, 2, 3, 4, 5
 * Suma: 15
 * 
 * Número: 9876
 * Suma de dígitos: 30
 */
