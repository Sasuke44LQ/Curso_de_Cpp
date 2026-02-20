/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 3
 * ==============================================
 * Crear patrón rectangular con bucles anidados.
 * 
 * EXPLICACIÓN:
 * - Bucles anidados (bucle dentro de bucle)
 * - Control de filas y columnas
 * - Impresión de caracteres
 */

console.log("=== PATRÓN RECTANGULAR ===");

const filas = 4;
const columnas = 6;

console.log("Patrón 1: Asteriscos");
for (let i = 0; i < filas; i++) {
    let fila = "";
    for (let j = 0; j < columnas; j++) {
        fila += "* ";
    }
    console.log(fila);
}

console.log("\nPatrón 2: Números");
for (let i = 1; i <= 3; i++) {
    let fila = "";
    for (let j = 1; j <= 5; j++) {
        fila += j + " ";
    }
    console.log(fila);
}

/*
 * SALIDA ESPERADA:
 * === PATRÓN RECTANGULAR ===
 * Patrón 1: Asteriscos
 * * * * * * 
 * * * * * * 
 * * * * * * 
 * * * * * * 
 * 
 * Patrón 2: Números
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 */
