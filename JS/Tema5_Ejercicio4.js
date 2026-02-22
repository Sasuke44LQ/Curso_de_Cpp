/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 4
 * ========================================
 * Implementar ordenamiento (bubble sort y sort()).
 * 
 * EXPLICACIÓN:
 * - Bubble sort: algoritmo simple de ordenamiento
 * - Array.sort(): método nativo
 * - Comparación de métodos
 */

function bubbleSort(arr) {
    const copia = [...arr];
    for (let i = 0; i < copia.length; i++) {
        for (let j = 0; j < copia.length - i - 1; j++) {
            if (copia[j] > copia[j + 1]) {
                [copia[j], copia[j + 1]] = [copia[j + 1], copia[j]];
            }
        }
    }
    return copia;
}

const numeros = [64, 34, 25, 12, 22, 11, 90, 88];

console.log("=== ORDENAMIENTO DE ARRAYS ===");
console.log(`Array original: ${numeros}`);

const ordenadoBubble = bubbleSort(numeros);
console.log(`\nBubble sort: ${ordenadoBubble}`);

const ordenadoSort = [...numeros].sort((a, b) => a - b);
console.log(`Array.sort(): ${ordenadoSort}`);

// Ordenamiento descendente
const descendente = [...numeros].sort((a, b) => b - a);
console.log(`Descendente: ${descendente}`);

/*
 * SALIDA ESPERADA:
 * === ORDENAMIENTO DE ARRAYS ===
 * Array original: 64,34,25,12,22,11,90,88
 * 
 * Bubble sort: 11,12,22,25,34,64,88,90
 * Array.sort(): 11,12,22,25,34,64,88,90
 * Descendente: 90,88,64,34,25,22,12,11
 */
