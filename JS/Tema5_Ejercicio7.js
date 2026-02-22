/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 7
 * ========================================
 * Usar array methods: map(), filter(), forEach().
 * 
 * EXPLICACIÓN:
 * - map(): transforma cada elemento
 * - filter(): selecciona elementos que cumplen condición
 * - forEach(): itera sin retornar
 */

const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log("=== ARRAY METHODS ===");
console.log(`Array original: ${numeros}`);

// map(): duplicar cada número
const duplicados = numeros.map(n => n * 2);
console.log(`\ndoble de cada número: ${duplicados}`);

// filter(): números pares
const pares = numeros.filter(n => n % 2 === 0);
console.log(`Números pares: ${pares}`);

// forEach(): mostrar con mensaje
console.log(`\nIteración con forEach():`);
numeros.slice(0, 5).forEach((n, i) => {
    console.log(`Posición ${i}: ${n}`);
});

// Combinación: pares duplicados
const paresDobles = numeros
    .filter(n => n % 2 === 0)
    .map(n => n * 2);
console.log(`\nPares duplicados: ${paresDobles}`);

// find(): primer elemento que cumple
const primoPar = numeros.find(n => n > 5 && n % 2 === 0);
console.log(`Primer número par mayor a 5: ${primoPar}`);

/*
 * SALIDA ESPERADA:
 * === ARRAY METHODS ===
 * Array original: 1,2,3,4,5,6,7,8,9,10
 * 
 * doble de cada número: 2,4,6,8,10,12,14,16,18,20
 * Números pares: 2,4,6,8,10
 * 
 * Iteración con forEach():
 * Posición 0: 1
 * Posición 1: 2
 * Posición 2: 3
 * Posición 3: 4
 * Posición 4: 5
 * 
 * Pares duplicados: 4,8,12,16,20
 * Primer número par mayor a 5: 6
 */
