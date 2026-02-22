/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 3
 * ============================================
 * Contar y buscar subcadenas.
 * 
 * EXPLICACIÓN:
 * - indexOf(): busca una cadena
 * - lastIndexOf(): última ocurrencia
 * - Contar repeticiones con bucle
 */

function contarOcurrencias(texto, subcadena) {
    let contador = 0;
    let pos = 0;
    
    while ((pos = texto.indexOf(subcadena, pos)) !== -1) {
        contador++;
        pos += subcadena.length;
    }
    
    return contador;
}

const texto = "JavaScript es genial. Aprender JavaScript es muy rewarding.";
const palabra = "JavaScript";

console.log("=== BÚSQUEDA Y CONTEO ===");
console.log(`Texto: "${texto}"`);

const ocurrencias = contarOcurrencias(texto, palabra);
console.log(`\nOcurrencias de '${palabra}': ${ocurrencias}`);

console.log(`Primera ocurrencia: posición ${texto.indexOf(palabra)}`);
console.log(`Última ocurrencia: posición ${texto.lastIndexOf(palabra)}`);

// Buscar múltiples palabras
const palabras = ['es', 'JavaScript', 'learning'];
console.log(`\nBúsqueda múltiple:`);
palabras.forEach(p => {
    const count = contarOcurrencias(texto, p);
    console.log(`- '${p}': ${count} veces`);
});

/*
 * SALIDA ESPERADA:
 * === BÚSQUEDA Y CONTEO ===
 * Texto: "JavaScript es genial. Aprender JavaScript es muy rewarding."
 * 
 * Ocurrencias de 'JavaScript': 2
 * Primera ocurrencia: posición 0
 * Última ocurrencia: posición 33
 * 
 * Búsqueda múltiple:
 * - 'es': 2 veces
 * - 'JavaScript': 2 veces
 * - 'learning': 0 veces
 */
