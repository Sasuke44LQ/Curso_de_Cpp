/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 4
 * ==============================================
 * Crear patrones triangulares.
 * 
 * EXPLICACIÓN:
 * - Triángulos ascendentes y descendentes
 * - Variación de bucles anidados
 * - Espacios y caracteres
 */

console.log("=== PATRONES TRIANGULARES ===");

// Triángulo ascendente
console.log("Triángulo ascendente:");
for (let i = 1; i <= 5; i++) {
    let fila = "";
    for (let j = 1; j <= i; j++) {
        fila += "* ";
    }
    console.log(fila);
}

// Triángulo descendente
console.log("\nTriángulo descendente:");
for (let i = 5; i >= 1; i--) {
    let fila = "";
    for (let j = 1; j <= i; j++) {
        fila += "* ";
    }
    console.log(fila);
}

// Triángulo de números
console.log("\nTriángulo de números:");
for (let i = 1; i <= 4; i++) {
    let fila = "";
    for (let j = 1; j <= i; j++) {
        fila += j + " ";
    }
    console.log(fila);
}

/*
 * SALIDA ESPERADA:
 * === PATRONES TRIANGULARES ===
 * Triángulo ascendente:
 * * 
 * * * 
 * * * * 
 * * * * * 
 * * * * * * 
 * 
 * Triángulo descendente:
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 
 * Triángulo de números:
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4 
 */
