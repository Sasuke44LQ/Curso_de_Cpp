/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 4
 * =========================================
 * Detectar números primos.
 * 
 * EXPLICACIÓN:
 * - Función reutilizable
 * - Optimización: verificar hasta √n
 * - Función wrapper para múltiples números
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

function obtenerPrimosHasta(limite) {
    const primos = [];
    for (let i = 2; i <= limite; i++) {
        if (esPrimo(i)) primos.push(i);
    }
    return primos;
}

function contarPrimos(numeros) {
    return numeros.filter(n => esPrimo(n)).length;
}

console.log("=== NÚMEROS PRIMOS ===");

const numeros = [17, 20, 37, 48, 53];
console.log(`Verificación individual:`);
numeros.forEach(n => {
    console.log(`¿${n} es primo? ${esPrimo(n)}`);
});

const hasta20 = obtenerPrimosHasta(20);
console.log(`\nPrimos del 1 al 20: ${hasta20.join(", ")}`);

const hasta100 = obtenerPrimosHasta(100);
console.log(`Cantidad de primos hasta 100: ${hasta100.length}`);

/*
 * SALIDA ESPERADA:
 * === NÚMEROS PRIMOS ===
 * Verificación individual:
 * ¿17 es primo? true
 * ¿20 es primo? false
 * ¿37 es primo? true
 * ¿48 es primo? false
 * ¿53 es primo? true
 * 
 * Primos del 1 al 20: 2, 3, 5, 7, 11, 13, 17, 19
 * Cantidad de primos hasta 100: 25
 */
