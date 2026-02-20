/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 10
 * ================================================
 * Calcular raíces cuadradas y cúbicas.
 * 
 * EXPLICACIÓN:
 * - Math.sqrt() para raíz cuadrada
 * - Potencias fraccionarias para raíces cúbicas
 * - Math.cbrt() para raíz cúbica (si está disponible)
 */

function raizCuadrada(numero) {
    return Math.sqrt(numero);
}

function raizCubica(numero) {
    // Dos formas de calcular raíz cúbica
    return numero ** (1/3);
}

function raizEnесima(numero, n) {
    return numero ** (1/n);
}

console.log("=== CÁLCULO DE RAÍCES ===");

console.log("Raíces cuadradas:");
console.log(`√4 = ${raizCuadrada(4)}`);
console.log(`√16 = ${raizCuadrada(16)}`);
console.log(`√100 = ${raizCuadrada(100)}`);
console.log(`√2 = ${raizCuadrada(2).toFixed(4)}`);

console.log("\nRaíces cúbicas:");
console.log(`∛8 = ${raizCubica(8)}`);
console.log(`∛27 = ${raizCubica(27)}`);
console.log(`∛64 = ${raizCubica(64)}`);

console.log("\nRaíces enésimas:");
console.log(`Raíz 4ª de 16 = ${raizEnесima(16, 4)}`);
console.log(`Raíz 5ª de 32 = ${raizEnесima(32, 5)}`);

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE RAÍCES ===
 * Raíces cuadradas:
 * √4 = 2
 * √16 = 4
 * √100 = 10
 * √2 = 1.4142
 * 
 * Raíces cúbicas:
 * ∛8 = 2
 * ∛27 = 3
 * ∛64 = 4
 * 
 * Raíces enésimas:
 * Raíz 4ª de 16 = 2
 * Raíz 5ª de 32 = 2
 */
