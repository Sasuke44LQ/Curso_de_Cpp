/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 4
 * ================================================
 * Determinar si un número es primo.
 * 
 * EXPLICACIÓN:
 * - Número primo: solo divisible por 1 y sí mismo
 * - Iteración hasta Math.sqrt(n) para eficiencia
 * - Números primos: 2, 3, 5, 7, 11, 13...
 */

function esPrimo(numero) {
    if (numero < 2) return false;
    if (numero === 2) return true;
    if (numero % 2 === 0) return false;
    
    for (let i = 3; i <= Math.sqrt(numero); i += 2) {
        if (numero % i === 0) return false;
    }
    return true;
}

console.log("=== NÚMEROS PRIMOS ===");

console.log("Números primos del 1 al 20:");
const primos = [];
for (let i = 1; i <= 20; i++) {
    if (esPrimo(i)) {
        primos.push(i);
    }
}
console.log(primos.join(", "));

console.log("\nVerificaciones:");
console.log(`¿17 es primo? ${esPrimo(17)}`);
console.log(`¿20 es primo? ${esPrimo(20)}`);
console.log(`¿37 es primo? ${esPrimo(37)}`);

/*
 * SALIDA ESPERADA:
 * === NÚMEROS PRIMOS ===
 * Números primos del 1 al 20:
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 * Verificaciones:
 * ¿17 es primo? true
 * ¿20 es primo? false
 * ¿37 es primo? true
 */
