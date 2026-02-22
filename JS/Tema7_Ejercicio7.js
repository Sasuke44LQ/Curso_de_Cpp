/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 7
 * =========================================
 * Funciones de manipulación de strings.
 * 
 * EXPLICACIÓN:
 * - Contar vocales y consonantes
 * - Verificar palíndromo
 * - Truncar texto
 */

function contarVocales(texto) {
    const vocales = texto.toLowerCase().match(/[aeiou]/g);
    return vocales ? vocales.length : 0;
}

function esPalindromo(texto) {
    const limpio = texto.toLowerCase().replace(/[^a-z0-9]/g, '');
    return limpio === limpio.split('').reverse().join('');
}

function truncarTexto(texto, longitud = 20, sufijo = '...') {
    if (texto.length <= longitud) return texto;
    return texto.substring(0, longitud) + sufijo;
}

function invertirPalabras(texto) {
    return texto.split(' ').reverse().join(' ');
}

console.log("=== MANIPULACIÓN DE STRINGS ===");

const texto = "JavaScript es increíble";
console.log(`Texto: "${texto}"`);
console.log(`Vocales: ${contarVocales(texto)}`);

console.log(`\nPalíndromos:`);
const palabras = ['radar', 'mundo', 'level', 'hello'];
palabras.forEach(p => {
    console.log(`"${p}": ${esPalindromo(p)}`);
});

console.log(`\nTruncamiento:`);
const largo = "Este es un texto muy largo que necesita ser truncado";
console.log(`Original: "${largo}"`);
console.log(`Truncado: "${truncarTexto(largo, 30)}"`);

console.log(`\nInversión de palabras:`);
console.log(`Original: "${texto}"`);
console.log(`Invertido: "${invertirPalabras(texto)}"`);

/*
 * SALIDA ESPERADA:
 * === MANIPULACIÓN DE STRINGS ===
 * Texto: "JavaScript es increíble"
 * Vocales: 8
 * 
 * Palíndromos:
 * "radar": true
 * "mundo": false
 * "level": true
 * "hello": false
 * 
 * Truncamiento:
 * Original: "Este es un texto muy largo que necesita ser truncado"
 * Truncado: "Este es un texto muy largo ..."
 * 
 * Inversión de palabras:
 * Original: "JavaScript es increíble"
 * Invertido: "increíble es JavaScript"
 */
