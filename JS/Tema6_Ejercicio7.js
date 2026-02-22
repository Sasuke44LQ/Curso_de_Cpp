/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 7
 * ============================================
 * Verificar palabras y frases palíndromas.
 * 
 * EXPLICACIÓN:
 * - Palíndromo: se lee igual hacia adelante y atrás
 * - Ignorar espacios y puntuación
 * - Comparación case-insensitive
 */

function esPalindromo(texto) {
    const limpio = texto
        .toLowerCase()
        .replace(/[^a-z0-9]/g, '');
    
    const invertido = limpio.split('').reverse().join('');
    return limpio === invertido;
}

function obtenerPalindromos(palabras) {
    return palabras.filter(p => esPalindromo(p));
}

const palabras = ['radar', 'mundo', 'nivel', 'luz', 'oso', 'tabla'];
const frases = [
    'A man, a plan, a canal: Panama',
    'race car',
    'hello world',
    'A Santa at NASA'
];

console.log("=== VALIDACIÓN DE PALÍNDROMOS ===");

console.log("Palabras:");
palabras.forEach(p => {
    console.log(`- "${p}" es ${esPalindromo(p) ? 'PALÍNDROMO' : 'NO palíndromo'}`);
});

console.log(`\nPalabras palíndromas encontradas: ${obtenerPalindromos(palabras).join(", ")}`);

console.log(`\nFrases:`);
frases.forEach(f => {
    console.log(`- "${f}" es ${esPalindromo(f) ? 'PALÍNDROMO' : 'NO palíndromo'}`);
});

/*
 * SALIDA ESPERADA:
 * === VALIDACIÓN DE PALÍNDROMOS ===
 * Palabras:
 * - "radar" es PALÍNDROMO
 * - "mundo" es NO palíndromo
 * - "nivel" es PALÍNDROMO
 * - "luz" es NO palíndromo
 * - "oso" es PALÍNDROMO
 * - "tabla" es NO palíndromo
 * 
 * Palabras palíndromas encontradas: radar, nivel, oso
 * 
 * Frases:
 * - "A man, a plan, a canal: Panama" es PALÍNDROMO
 * - "race car" es PALÍNDROMO
 * - "hello world" es NO palíndromo
 * - "A Santa at NASA" es PALÍNDROMO
 */
