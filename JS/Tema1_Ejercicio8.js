/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 8
 * ===========================================
 * Calcular promedio de calificaciones y determinar aprobado/reprobado.
 * 
 * EXPLICACIÓN:
 * - Arrays en JavaScript
 * - Método reduce() para suma
 * - Condicionales para evaluación
 */

function calcularPromedio(calificaciones) {
    const suma = calificaciones.reduce((a, b) => a + b, 0);
    return suma / calificaciones.length;
}

function determinarEstado(promedio) {
    return promedio >= 7 ? "APROBADO" : "REPROBADO";
}

const calificaciones = [8.5, 7.0, 9.0, 6.5, 8.0];

const promedio = calcularPromedio(calificaciones);
const estado = determinarEstado(promedio);

console.log("=== CÁLCULO DE PROMEDIO ===");
console.log(`Calificaciones: ${calificaciones.join(", ")}`);
console.log(`Promedio: ${promedio.toFixed(2)}`);
console.log(`Estado: ${estado}`);

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE PROMEDIO ===
 * Calificaciones: 8.5, 7, 9, 6.5, 8
 * Promedio: 7.80
 * Estado: APROBADO
 */
