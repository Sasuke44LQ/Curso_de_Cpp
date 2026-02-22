/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 8
 * ========================================
 * Trabajar con matrices (arrays 2D).
 * 
 * EXPLICACIÓN:
 * - Matrix: array de arrays
 * - Acceso: matriz[fila][columna]
 * - Operaciones: suma de filas, columnas, diagonal
 */

function crearMatriz(filas, columnas) {
    return Array.from({length: filas}, () => Array(columnas).fill(0));
}

function sumaFila(matriz, fila) {
    return matriz[fila].reduce((a, b) => a + b, 0);
}

function sumaColumna(matriz, columna) {
    return matriz.reduce((suma, fila) => suma + fila[columna], 0);
}

function sumaDiagonalPrincipal(matriz) {
    let suma = 0;
    for (let i = 0; i < matriz.length; i++) {
        suma += matriz[i][i];
    }
    return suma;
}

const matriz = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16]
];

console.log("=== MATRICES (ARRAYS 2D) ===");
console.log("Matriz:");
matriz.forEach(fila => console.log(fila.join("\t")));

console.log(`\nSuma fila 0: ${sumaFila(matriz, 0)}`);
console.log(`Suma fila 2: ${sumaFila(matriz, 2)}`);

console.log(`\nSuma columna 1: ${sumaColumna(matriz, 1)}`);
console.log(`Suma columna 3: ${sumaColumna(matriz, 3)}`);

console.log(`\nSuma diagonal principal: ${sumaDiagonalPrincipal(matriz)}`);

/*
 * SALIDA ESPERADA:
 * === MATRICES (ARRAYS 2D) ===
 * Matriz:
 * 1	2	3	4
 * 5	6	7	8
 * 9	10	11	12
 * 13	14	15	16
 * 
 * Suma fila 0: 10
 * Suma fila 2: 42
 * 
 * Suma columna 1: 32
 * Suma columna 3: 40
 * 
 * Suma diagonal principal: 34
 */
