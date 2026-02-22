/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 6
 * ========================================
 * Búsqueda lineal y búsqueda binaria.
 * 
 * EXPLICACIÓN:
 * - Búsqueda lineal: recorre elemento por elemento
 * - Búsqueda binaria: divide y conquista (requiere array ordenado)
 * - indexOf() como alternativa nativa
 */

function busquedaLineal(arr, objetivo) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === objetivo) return i;
    }
    return -1;
}

function busquedaBinaria(arr, objetivo) {
    let izq = 0, der = arr.length - 1;
    
    while (izq <= der) {
        const mid = Math.floor((izq + der) / 2);
        if (arr[mid] === objetivo) return mid;
        if (arr[mid] < objetivo) izq = mid + 1;
        else der = mid - 1;
    }
    return -1;
}

const numeros = [10, 20, 30, 40, 50, 60, 70, 80, 90];
const objetivo = 40;

console.log("=== BÚSQUEDA EN ARRAYS ===");
console.log(`Array: ${numeros}`);
console.log(`Buscando: ${objetivo}`);

const indiceLineal = busquedaLineal(numeros, objetivo);
console.log(`\nBúsqueda lineal: índice ${indiceLineal}`);

const indiceBinaria = busquedaBinaria(numeros, objetivo);
console.log(`Búsqueda binaria: índice ${indiceBinaria}`);

console.log(`indexOf(): índice ${numeros.indexOf(objetivo)}`);

// No encontrado
console.log(`\nBuscando 55 (no existe):`);
console.log(`Búsqueda lineal: ${busquedaLineal(numeros, 55)}`);
console.log(`Búsqueda binaria: ${busquedaBinaria(numeros, 55)}`);

/*
 * SALIDA ESPERADA:
 * === BÚSQUEDA EN ARRAYS ===
 * Array: 10,20,30,40,50,60,70,80,90
 * Buscando: 40
 * 
 * Búsqueda lineal: índice 3
 * Búsqueda binaria: índice 3
 * indexOf(): índice 3
 * 
 * Buscando 55 (no existe):
 * Búsqueda lineal: -1
 * Búsqueda binaria: -1
 */
