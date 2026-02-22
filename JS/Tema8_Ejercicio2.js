/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 2
 * =====================================================
 * Trabajar con conjuntos (Set).
 * 
 * EXPLICACIÓN:
 * - Set: colección de valores únicos
 * - Métodos: add, has, delete, clear
 * - Eliminación automática de duplicados
 * - Operaciones: unión, intersección, diferencia
 */

function union(set1, set2) {
    return new Set([...set1, ...set2]);
}

function interseccion(set1, set2) {
    return new Set([...set1].filter(x => set2.has(x)));
}

function diferencia(set1, set2) {
    return new Set([...set1].filter(x => !set2.has(x)));
}

const numeros1 = new Set([1, 2, 3, 4, 5]);
const numeros2 = new Set([4, 5, 6, 7, 8]);

console.log("=== CONJUNTOS (SET) ===");

console.log(`Set 1: {${[...numeros1]}}`);
console.log(`Set 2: {${[...numeros2]}}`);

console.log(`\nUnión: {${[...union(numeros1, numeros2)]}}`);
console.log(`Intersección: {${[...interseccion(numeros1, numeros2)]}}`);
console.log(`Diferencia (Set1 - Set2): {${[...diferencia(numeros1, numeros2)]}}`);

// Eliminar duplicados
const datos = [1, 2, 2, 3, 4, 4, 5, 5];
const unicos = new Set(datos);
console.log(`\nDatos: [${datos}]`);
console.log(`Sin duplicados: [${[...unicos]}]`);

/*
 * SALIDA ESPERADA:
 * === CONJUNTOS (SET) ===
 * Set 1: {1,2,3,4,5}
 * Set 2: {4,5,6,7,8}
 * 
 * Unión: {1,2,3,4,5,6,7,8}
 * Intersección: {4,5}
 * Diferencia (Set1 - Set2): {1,2,3}
 * 
 * Datos: [1,2,2,3,4,4,5,5]
 * Sin duplicados: [1,2,3,4,5]
 */
