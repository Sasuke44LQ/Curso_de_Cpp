/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 5
 * =========================================
 * Funciones estadísticas.
 * 
 * EXPLICACIÓN:
 * - Media, mediana, moda
 * - Varianza y desviación estándar
 * - Análisis de datos
 */

function media(arr) {
    return arr.reduce((a, b) => a + b, 0) / arr.length;
}

function mediana(arr) {
    const sorted = [...arr].sort((a, b) => a - b);
    const mid = Math.floor(sorted.length / 2);
    return sorted.length % 2 !== 0 
        ? sorted[mid] 
        : (sorted[mid - 1] + sorted[mid]) / 2;
}

function moda(arr) {
    const frecuencia = {};
    arr.forEach(n => frecuencia[n] = (frecuencia[n] || 0) + 1);
    return Object.keys(frecuencia).reduce((a, b) => 
        frecuencia[a] > frecuencia[b] ? a : b);
}

function desviacionEstandar(arr) {
    const m = media(arr);
    const varianza = arr.reduce((sum, n) => sum + Math.pow(n - m, 2), 0) / arr.length;
    return Math.sqrt(varianza);
}

const datos = [5, 7, 8, 10, 5, 9, 6, 5];

console.log("=== ESTADÍSTICAS ===");
console.log(`Datos: [${datos}]`);

console.log(`Media: ${media(datos).toFixed(2)}`);
console.log(`Mediana: ${mediana(datos)}`);
console.log(`Moda: ${moda(datos)}`);
console.log(`Desviación estándar: ${desviacionEstandar(datos).toFixed(2)}`);

/*
 * SALIDA ESPERADA:
 * === ESTADÍSTICAS ===
 * Datos: [5,7,8,10,5,9,6,5]
 * Media: 7.38
 * Mediana: 7.5
 * Moda: 5
 * Desviación estándar: 1.69
 */
