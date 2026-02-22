/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 3
 * ========================================
 * Calcular suma y promedio de un array.
 * 
 * EXPLICACIÓN:
 * - Método reduce() para acumulación
 * - Cálculo de promedio
 * - Métodos de iteración
 */

function estadisticas(arr) {
    const suma = arr.reduce((acc, num) => acc + num, 0);
    const promedio = suma / arr.length;
    
    return {suma, promedio};
}

const calificaciones = [8.5, 7.0, 9.2, 8.8, 7.5, 9.0];

console.log("=== SUMA Y PROMEDIO ===");
console.log(`Calificaciones: ${calificaciones}`);

const resultado = estadisticas(calificaciones);
console.log(`\nSuma: ${resultado.suma.toFixed(2)}`);
console.log(`Promedio: ${resultado.promedio.toFixed(2)}`);

// Más ejemplos
const numeros = [10, 20, 30, 40, 50];
const stats = estadisticas(numeros);
console.log(`\nArray: ${numeros}`);
console.log(`Suma: ${stats.suma}`);
console.log(`Promedio: ${stats.promedio}`);

/*
 * SALIDA ESPERADA:
 * === SUMA Y PROMEDIO ===
 * Calificaciones: 8.5,7,9.2,8.8,7.5,9
 * 
 * Suma: 50.00
 * Promedio: 8.33
 * 
 * Array: 10,20,30,40,50
 * Suma: 150
 * Promedio: 30
 */
