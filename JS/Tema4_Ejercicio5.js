/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 5
 * ==============================================
 * Usar do-while para acumular números.
 * 
 * EXPLICACIÓN:
 * - do-while: ejecuta al menos una vez
 * - Comprobación de condición al final
 * - Acumulación de valores
 */

console.log("=== BUCLE DO-WHILE ===");

const numeros = [5, 10, 3, 8, 12, 7];
let indice = 0;
let acumulado = 0;

console.log("Números a sumar:", numeros.join(", "));

do {
    acumulado += numeros[indice];
    console.log(`Paso ${indice + 1}: ${numeros[indice]} → Acumulado: ${acumulado}`);
    indice++;
} while (indice < numeros.length);

console.log(`\nTotal acumulado: ${acumulado}`);

// Ejemplo 2: Validación de entrada
console.log("\n=== VALIDACIÓN CON DO-WHILE ===");
let num = 0;
let validaciones = 0;

do {
    validaciones++;
    console.log(`Intento ${validaciones}: ${num} es el número`);
    num++;
} while (num < 3);

/*
 * SALIDA ESPERADA:
 * === BUCLE DO-WHILE ===
 * Números a sumar: 5, 10, 3, 8, 12, 7
 * Paso 1: 5 → Acumulado: 5
 * Paso 2: 10 → Acumulado: 15
 * Paso 3: 3 → Acumulado: 18
 * Paso 4: 8 → Acumulado: 26
 * Paso 5: 12 → Acumulado: 38
 * Paso 6: 7 → Acumulado: 45
 * 
 * Total acumulado: 45
 * 
 * === VALIDACIÓN CON DO-WHILE ===
 * Intento 1: 0 es el número
 * Intento 2: 1 es el número
 * Intento 3: 2 es el número
 */
