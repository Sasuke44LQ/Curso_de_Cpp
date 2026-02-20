/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 10
 * ================================================
 * Generar serie de Fibonacci.
 * 
 * EXPLICACIÓN:
 * - Fibonacci: cada número es suma de los dos anteriores
 * - 0, 1, 1, 2, 3, 5, 8, 13, 21...
 * - Dos métodos: iterativo y recursivo
 */

function fibonacci(n) {
    if (n <= 0) return [];
    if (n === 1) return [0];
    
    const serie = [0, 1];
    
    for (let i = 2; i < n; i++) {
        serie.push(serie[i - 1] + serie[i - 2]);
    }
    
    return serie;
}

function fibonacciRecursivo(n) {
    if (n <= 0) return 0;
    if (n === 1) return 1;
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}

console.log("=== SERIE DE FIBONACCI ===");

// Método iterativo
console.log("Primeros 15 números de Fibonacci:");
const serie = fibonacci(15);
console.log(serie.join(", "));

// Método recursivo
console.log("\nUsando recursión:");
const fibRecur = [];
for (let i = 0; i < 10; i++) {
    fibRecur.push(fibonacciRecursivo(i));
}
console.log(fibRecur.join(", "));

// Búsqueda de Fibonacci mayor a 1000
console.log("\nNúmeros de Fibonacci menores a 1000:");
const grandeSerie = [];
let n = 1;
while (true) {
    const num = fibonacciRecursivo(n);
    if (num >= 1000) break;
    grandeSerie.push(num);
    n++;
}
console.log(grandeSerie.join(", "));

/*
 * SALIDA ESPERADA:
 * === SERIE DE FIBONACCI ===
 * Primeros 15 números de Fibonacci:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
 * 
 * Usando recursión:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * 
 * Números de Fibonacci menores a 1000:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
 */
