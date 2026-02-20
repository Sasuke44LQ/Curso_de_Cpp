/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 1
 * ==============================================
 * Imprimir números del 1 al 10 usando while.
 * 
 * EXPLICACIÓN:
 * - Bucle while: ejecuta mientras condición sea verdadera
 * - Control manual con variable contador
 * - Incremento manual del contador
 */

console.log("=== BUCLE WHILE (1 al 10) ===");
let contador = 1;

while (contador <= 10) {
    console.log(contador);
    contador++;
}

// Versión inversa
console.log("\n=== BUCLE WHILE (10 al 1) ===");
contador = 10;

while (contador >= 1) {
    console.log(contador);
    contador--;
}

/*
 * SALIDA ESPERADA:
 * === BUCLE WHILE (1 al 10) ===
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 
 * === BUCLE WHILE (10 al 1) ===
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 */
