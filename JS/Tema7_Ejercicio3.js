/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 3
 * =========================================
 * Recursión: factorial y fibonacci.
 * 
 * EXPLICACIÓN:
 * - Función llamándose a sí misma
 * - Caso base para evitar infinito
 * - Aplicaciones: factorial, fibonacci, búsqueda
 */

function factorial(n) {
    if (n < 0) return "Error";
    if (n === 0 || n === 1) return 1;
    return n * factorial(n - 1);
}

function fibonacci(n) {
    if (n <= 0) return 0;
    if (n === 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Fibonacci con memoización (memorizar resultados)
function fibonacciMemo(n, memo = {}) {
    if (n in memo) return memo[n];
    if (n <= 1) return n;
    
    memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
    return memo[n];
}

console.log("=== RECURSIÓN ===");

console.log("Factoriales:");
for (let i = 0; i <= 5; i++) {
    console.log(`${i}! = ${factorial(i)}`);
}

console.log("\nSucesión Fibonacci (primeros 10):");
for (let i = 0; i < 10; i++) {
    console.log(`F(${i}) = ${fibonacci(i)}`);
}

console.log("\nFibonacci con memoización:");
console.log(`F(30) = ${fibonacciMemo(30)}`);

/*
 * SALIDA ESPERADA:
 * === RECURSIÓN ===
 * Factoriales:
 * 0! = 1
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 
 * Sucesión Fibonacci (primeros 10):
 * F(0) = 0
 * F(1) = 1
 * F(2) = 1
 * F(3) = 2
 * F(4) = 3
 * F(5) = 5
 * F(6) = 8
 * F(7) = 13
 * F(8) = 21
 * F(9) = 34
 * 
 * Fibonacci con memoización:
 * F(30) = 832040
 */
