/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 5
 * ============================================
 * Reemplazar contenido en strings.
 * 
 * EXPLICACIÓN:
 * - replace(): reemplaza primera ocurrencia
 * - replaceAll(): reemplaza todas (con regex o string)
 * - Usando expresiones regulares
 */

const texto = "gato come pescado, el gato es feliz y el gato juega";

console.log("=== REEMPLAZO DE CONTENIDO ===");
console.log(`Original: "${texto}"`);

// replace (solo primera)
const reemplazado1 = texto.replace("gato", "perro");
console.log(`\nReplace (1° ocurrencia): "${reemplazado1}"`);

// replaceAll (todas las ocurrencias)
const reemplazado2 = texto.replaceAll("gato", "perro");
console.log(`ReplaceAll (todas): "${reemplazado2}"`);

// Con expresión regular (case-insensitive)
const reemplazado3 = texto.replace(/gato/gi, "FELINO");
console.log(`Con regex (case-insensitive): "${reemplazado3}"`);

// Múltiples reemplazos
function reemplazarMultiple(str, buscar, reemplazos) {
    return buscar.reduce((acc, b, i) => acc.replaceAll(b, reemplazos[i]), str);
}

const resultado = reemplazarMultiple(
    "El día es hermoso y el día trae alegría",
    ["día", "hermoso", "alegría"],
    ["momento", "perfecto", "felicidad"]
);
console.log(`\nMúltiples reemplazos: "${resultado}"`);

/*
 * SALIDA ESPERADA:
 * === REEMPLAZO DE CONTENIDO ===
 * Original: "gato come pescado, el gato es feliz y el gato juega"
 * 
 * Replace (1° ocurrencia): "perro come pescado, el gato es feliz y el gato juega"
 * ReplaceAll (todas): "perro come pescado, el perro es feliz y el perro juega"
 * Con regex (case-insensitive): "FELINO come pescado, el FELINO es feliz y el FELINO juega"
 * 
 * Múltiples reemplazos: "El momento es perfecto y el momento trae felicidad"
 */
