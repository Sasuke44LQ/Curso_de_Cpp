/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 10
 * ===========================================
 * Diferentes implementaciones de fibonacci.
 * 
 * EXPLICACIÓN:
 * - Recursivo simple (ineficiente)
 * - Iterativo (eficiente)
 * - Con memoización (optimizado)
 */

// 1. Recursivo simple
function fibRecursivo(n) {
    if (n <= 1) return n;
    return fibRecursivo(n - 1) + fibRecursivo(n - 2);
}

// 2. Iterativo
function fibIterativo(n) {
    if (n <= 1) return n;
    let a = 0, b = 1;
    for (let i = 2; i <= n; i++) {
        [a, b] = [b, a + b];
    }
    return b;
}

// 3. Con memoización
function fibMemoizacion(n, cache = {}) {
    if (n in cache) return cache[n];
    if (n <= 1) return n;
    cache[n] = fibMemoizacion(n - 1, cache) + fibMemoizacion(n - 2, cache);
    return cache[n];
}

console.log("=== FIBONACCI: TRES IMPLEMENTACIONES ===");

// Comparar para números pequeños
const n = 10;
console.log(`Fib(${n}):`);
console.log(`Recursivo: ${fibRecursivo(n)}`);
console.log(`Iterativo: ${fibIterativo(n)}`);
console.log(`Memoizado: ${fibMemoizacion(n)}`);

// Comparar velocidad para números grandes
console.log(`\nFib(35):`);
console.time("Memoización");
const res = fibMemoizacion(35);
console.timeEnd("Memoización");
console.log(`Resultado: ${res}`);

// Secuencia
console.log(`\nPrimeros 15 números de Fibonacci:`);
const secuencia = Array.from({length: 15}, (_, i) => fibIterativo(i));
console.log(secuencia.join(", "));

/*
 * SALIDA ESPERADA:
 * === FIBONACCI: TRES IMPLEMENTACIONES ===
 * Fib(10):
 * Recursivo: 55
 * Iterativo: 55
 * Memoizado: 55
 * 
 * Fib(35):
 * Memoización: 0.05ms (aproximado)
 * Resultado: 9227465
 * 
 * Primeros 15 números de Fibonacci:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
 */
