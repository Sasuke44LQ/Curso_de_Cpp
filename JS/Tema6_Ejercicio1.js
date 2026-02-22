/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 1
 * ============================================
 * Operaciones básicas con strings.
 * 
 * EXPLICACIÓN:
 * - Propiedades: length
 * - Métodos: charAt(), charCodeAt(), indexOf()
 * - Acceso por índice
 */

const texto = "Hola Mundo";

console.log("=== OPERACIONES CON STRINGS ===");
console.log(`Texto: "${texto}"`);
console.log(`Longitud: ${texto.length}`);

console.log(`\nCarácter en posición 0: '${texto[0]}'`);
console.log(`Carácter en posición 5: '${texto[5]}'`);
console.log(`Último carácter: '${texto[texto.length - 1]}'`);

console.log(`\nCódigo ASCII de 'H': ${texto.charCodeAt(0)}`);
console.log(`Posición de 'o': ${texto.indexOf('o')}`);
console.log(`Posición de 'Mundo': ${texto.indexOf('Mundo')}`);
console.log(`¿Contiene 'Mundo'? ${texto.includes('Mundo')}`);

/*
 * SALIDA ESPERADA:
 * === OPERACIONES CON STRINGS ===
 * Texto: "Hola Mundo"
 * Longitud: 10
 * 
 * Carácter en posición 0: 'H'
 * Carácter en posición 5: 'M'
 * Último carácter: 'o'
 * 
 * Código ASCII de 'H': 72
 * Posición de 'o': 1
 * Posición de 'Mundo': 5
 * ¿Contiene 'Mundo'? true
 */
