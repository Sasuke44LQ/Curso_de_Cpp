/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 4
 * ============================================
 * Extraer subcadenas con substring y slice.
 * 
 * EXPLICACIÓN:
 * - substring(inicio, fin): extrae porción
 * - slice(inicio, fin): similar, pero con índices negativos
 * - substr(inicio, longitud): obsoleto pero útil
 */

const texto = "JavaScript es muy poderoso";

console.log("=== EXTRACCIÓN DE SUBCADENAS ===");
console.log(`Texto original: "${texto}"`);

// substring
console.log(`\nsubstring(0, 10): "${texto.substring(0, 10)}"`);
console.log(`substring(11, 13): "${texto.substring(11, 13)}"`);

// slice
console.log(`\nslice(0, 10): "${texto.slice(0, 10)}"`);
console.log(`slice(-9): "${texto.slice(-9)}"`);  // Últimos 9 caracteres
console.log(`slice(11, -7): "${texto.slice(11, -7)}"`);

// Extraer palabra
function extraerPalabra(texto, inicio, fin) {
    return texto.substring(inicio, fin);
}

console.log(`\nPrimer palabra: "${extraerPalabra(texto, 0, 10)}"`);
console.log(`Última palabra: "${texto.substring(texto.lastIndexOf(' ') + 1)}"`);

/*
 * SALIDA ESPERADA:
 * === EXTRACCIÓN DE SUBCADENAS ===
 * Texto original: "JavaScript es muy poderoso"
 * 
 * substring(0, 10): "JavaScript"
 * substring(11, 13): "es"
 * 
 * slice(0, 10): "JavaScript"
 * slice(-9): "poderoso"
 * slice(11, -7): "es muy"
 * 
 * Primer palabra: "JavaScript"
 * Última palabra: "poderoso"
 */
