/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 5
 * ===========================================
 * Convertir temperaturas entre Celsius, Fahrenheit y Kelvin.
 * 
 * EXPLICACIÓN:
 * - Funciones para conversión
 * - Fórmulas de conversión de temperatura
 * - Reutilización de funciones
 */

function celsiusAFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
}

function celsiusAKelvin(celsius) {
    return celsius + 273.15;
}

function fahrenheitACelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}

const tempCelsius = 25;
const tempFahrenheit = 77;

console.log("=== CONVERSIÓN DE TEMPERATURAS ===");
console.log(`${tempCelsius}°C = ${celsiusAFahrenheit(tempCelsius).toFixed(2)}°F`);
console.log(`${tempCelsius}°C = ${celsiusAKelvin(tempCelsius).toFixed(2)}K`);
console.log(`${tempFahrenheit}°F = ${fahrenheitACelsius(tempFahrenheit).toFixed(2)}°C`);

/*
 * SALIDA ESPERADA:
 * === CONVERSIÓN DE TEMPERATURAS ===
 * 25°C = 77.00°F
 * 25°C = 298.15K
 * 77°F = 25.00°C
 */
