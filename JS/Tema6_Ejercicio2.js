/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 2
 * ============================================
 * Conversión de mayúsculas/minúsculas.
 * 
 * EXPLICACIÓN:
 * - toUpperCase(): convertir a mayúsculas
 * - toLowerCase(): convertir a minúsculas
 * - Casos de uso comunes
 */

const texto = "Desarrollo En JavaScript";

console.log("=== CONVERSIÓN DE CASO ===");
console.log(`Original: "${texto}"`);
console.log(`Mayúsculas: "${texto.toUpperCase()}"`);
console.log(`Minúsculas: "${texto.toLowerCase()}"`);

// Primera letra mayúscula
function capitalizarPrimera(str) {
    return str.charAt(0).toUpperCase() + str.slice(1);
}

// Capitalize cada palabra
function capitalizarPalabras(str) {
    return str.split(' ').map(palabra => capitalizarPrimera(palabra)).join(' ');
}

console.log(`\nPrimera letra mayúscula: "${capitalizarPrimera(texto.toLowerCase())}"`);
console.log(`Cada palabra capitalizada: "${capitalizarPalabras(texto.toLowerCase())}"`);

/*
 * SALIDA ESPERADA:
 * === CONVERSIÓN DE CASO ===
 * Original: "Desarrollo En JavaScript"
 * Mayúsculas: "DESARROLLO EN JAVASCRIPT"
 * Minúsculas: "desarrollo en javascript"
 * 
 * Primera letra mayúscula: "Desarrollo en javascript"
 * Cada palabra capitalizada: "Desarrollo En Javascript"
 */
