/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 6
 * ============================================
 * Dividir (split) y unir (join) strings.
 * 
 * EXPLICACIÓN:
 * - split(): convierte string en array
 * - join(): convierte array en string
 * - Separadores personalizados
 */

const csv = "Juan,25,Madrid,Ingeniero";
const frase = "JavaScript es un lenguaje versátil";

console.log("=== SPLIT Y JOIN ===");

// Split con diferentes separadores
console.log("CSV parsing:");
console.log(`Original: "${csv}"`);
const datos = csv.split(",");
console.log(`Array: [${datos.map(d => `"${d}"`).join(", ")}]`);

console.log(`\nParseo de frase:`);
console.log(`Original: "${frase}"`);
const palabras = frase.split(" ");
console.log(`Palabras: [${palabras.map(p => `"${p}"`).join(", ")}]`);

// Join con diferentes separadores
console.log(`\nReconstrucción:`);
console.log(`Con espacio: "${palabras.join(" ")}"`);
console.log(`Con guión: "${palabras.join("-")}"`);
console.log(`Con punto: "${palabras.join(".")}"`);

// Procesamiento: convertir a mayúsculas
const mayusculas = frase
    .split(" ")
    .map(p => p.toUpperCase())
    .join(" ");
console.log(`\nVersión mayúscula: "${mayusculas}"`);

/*
 * SALIDA ESPERADA:
 * === SPLIT Y JOIN ===
 * CSV parsing:
 * Original: "Juan,25,Madrid,Ingeniero"
 * Array: ["Juan", "25", "Madrid", "Ingeniero"]
 * 
 * Parseo de frase:
 * Original: "JavaScript es un lenguaje versátil"
 * Palabras: ["JavaScript", "es", "un", "lenguaje", "versátil"]
 * 
 * Reconstrucción:
 * Con espacio: "JavaScript es un lenguaje versátil"
 * Con guión: "JavaScript-es-un-lenguaje-versátil"
 * Con punto: "JavaScript.es.un.lenguaje.versátil"
 * 
 * Versión mayúscula: "JAVASCRIPT ES UN LENGUAJE VERSÁTIL"
 */
