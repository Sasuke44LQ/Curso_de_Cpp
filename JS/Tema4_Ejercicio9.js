/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 9
 * ==============================================
 * Filtrar pares e impares con continue.
 * 
 * EXPLICACIÓN:
 * - Continue para saltar a la siguiente iteración
 * - Filtrado de números según una condición
 * - Separación de pares e impares
 */

console.log("=== USO DE CONTINUE ===");

const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15];
const pares = [];
const impares = [];

console.log("Números originales:", numeros.join(", "));

// Usando continue para filtrar
for (let num of numeros) {
    if (num % 2 !== 0) {
        impares.push(num);
        continue;  // Salta sin ejecutar el resto
    }
    pares.push(num);
}

console.log("\nNúmeros PARES:", pares.join(", "));
console.log("Números IMPARES:", impares.join(", "));

// Otra forma: saltando números específicos
console.log("\n=== BUCLE CON CONTINUE ===");
console.log("Números pares del 1 al 10 (saltando 6):");
for (let i = 1; i <= 10; i++) {
    if (i % 2 !== 0) continue;  // Salta impares
    if (i === 6) continue;       // Salta el 6
    console.log(i);
}

/*
 * SALIDA ESPERADA:
 * === USO DE CONTINUE ===
 * Números originales: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
 * 
 * Números PARES: 2, 4, 6, 8, 10, 12, 14
 * Números IMPARES: 1, 3, 5, 7, 9, 11, 13, 15
 * 
 * === BUCLE CON CONTINUE ===
 * Números pares del 1 al 10 (saltando 6):
 * 2
 * 4
 * 8
 * 10
 */
