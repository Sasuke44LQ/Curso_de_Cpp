/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 7
 * ==============================================
 * Verificar si un número es palíndromo.
 * 
 * EXPLICACIÓN:
 * - Número palíndromo: se lee igual hacia adelante y hacia atrás
 * - Ejemplos: 121, 1331, 12321
 * - Conversión a string para invertir
 */

function esPalindromo(numero) {
    const original = String(numero);
    const invertido = original.split('').reverse().join('');
    
    return original === invertido;
}

function obtenerPalindrmomos(hasta) {
    const palindromos = [];
    
    for (let i = 0; i <= hasta; i++) {
        if (esPalindromo(i)) {
            palindromos.push(i);
        }
    }
    
    return palindromos;
}

console.log("=== NÚMEROS PALÍNDROMOS ===");

console.log("Palíndromos del 0 al 200:");
const palindromos = obtenerPalindrmomos(200);
console.log(palindromos.join(", "));

console.log("\nVerificaciones:");
console.log(`¿121 es palíndromo? ${esPalindromo(121)}`);
console.log(`¿123 es palíndromo? ${esPalindromo(123)}`);
console.log(`¿1331 es palíndromo? ${esPalindromo(1331)}`);
console.log(`¿9 es palíndromo? ${esPalindromo(9)}`);

/*
 * SALIDA ESPERADA:
 * === NÚMEROS PALÍNDROMOS ===
 * Palíndromos del 0 al 200:
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191
 * 
 * Verificaciones:
 * ¿121 es palíndromo? true
 * ¿123 es palíndromo? false
 * ¿1331 es palíndromo? true
 * ¿9 es palíndromo? true
 */
