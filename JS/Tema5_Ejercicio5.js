/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 5
 * ========================================
 * Invertir un array (in-place y copia).
 * 
 * EXPLICACIÓN:
 * - Método reverse() modifica el original
 * - Crear copia invertida
 * - Dos enfoques diferentes
 */

function invertirInPlace(arr) {
    return arr.reverse();
}

function invertirCopia(arr) {
    return [...arr].reverse();
}

function invertirManual(arr) {
    const resultado = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        resultado.push(arr[i]);
    }
    return resultado;
}

const original = [1, 2, 3, 4, 5];

console.log("=== INVERTIR ARRAYS ===");
console.log(`Array original: ${original}`);

const copia1 = [...original];
const invertida1 = invertirInPlace(copia1);
console.log(`Con reverse(): ${invertida1}`);
console.log(`Original modificado: ${copia1}`);

const invertida2 = invertirCopia(original);
console.log(`\nCopia invertida: ${invertida2}`);
console.log(`Original intacto: ${original}`);

const invertida3 = invertirManual(original);
console.log(`\nManualmente: ${invertida3}`);

/*
 * SALIDA ESPERADA:
 * === INVERTIR ARRAYS ===
 * Array original: 1,2,3,4,5
 * Con reverse(): 5,4,3,2,1
 * Original modificado: 5,4,3,2,1
 * 
 * Copia invertida: 5,4,3,2,1
 * Original intacto: 1,2,3,4,5
 * 
 * Manualmente: 5,4,3,2,1
 */
