/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 9
 * ========================================
 * Contar frecuencia de elementos con Map.
 * 
 * EXPLICACIÓN:
 * - Objeto Map para pares clave-valor
 * - Contar ocurrencias
 * - Encontrar elemento más frecuente
 */

function contarFrecuencia(arr) {
    const frecuencia = new Map();
    
    arr.forEach(elemento => {
        if (frecuencia.has(elemento)) {
            frecuencia.set(elemento, frecuencia.get(elemento) + 1);
        } else {
            frecuencia.set(elemento, 1);
        }
    });
    
    return frecuencia;
}

function elementoMasFrecuente(arr) {
    const frecuencia = contarFrecuencia(arr);
    let max = 0, elemento = null;
    
    frecuencia.forEach((count, elem) => {
        if (count > max) {
            max = count;
            elemento = elem;
        }
    });
    
    return {elemento, frecuencia: max};
}

const datos = ['a', 'b', 'a', 'c', 'b', 'a', 'd', 'b', 'a', 'c'];

console.log("=== CONTEO DE FRECUENCIA ===");
console.log(`Array: ${datos}`);

const frecuencia = contarFrecuencia(datos);
console.log(`\nFrecuencia de elementos:`);
frecuencia.forEach((count, elem) => {
    console.log(`'${elem}': ${count} veces`);
});

const masFrecuente = elementoMasFrecuente(datos);
console.log(`\nElemento más frecuente: '${masFrecuente.elemento}' (${masFrecuente.frecuencia} veces)`);

/*
 * SALIDA ESPERADA:
 * === CONTEO DE FRECUENCIA ===
 * Array: a,b,a,c,b,a,d,b,a,c
 * 
 * Frecuencia de elementos:
 * 'a': 4 veces
 * 'b': 3 veces
 * 'c': 2 veces
 * 'd': 1 veces
 * 
 * Elemento más frecuente: 'a' (4 veces)
 */
