/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 6
 * =========================================
 * Conversiones de unidades.
 * 
 * EXPLICACIÓN:
 * - Funciones para convertir entre unidades
 * - Temperatura, distancia, peso
 * - Factores de conversión
 */

const Conversiones = {
    temperatura: {
        celsiusAFahrenheit: (c) => (c * 9/5) + 32,
        fahrenheitACelsius: (f) => (f - 32) * 5/9,
        celsiusAKelvin: (c) => c + 273.15
    },
    
    distancia: {
        metrosaKilometros: (m) => m / 1000,
        kilometrosAMetros: (km) => km * 1000,
        metrosApies: (m) => m * 3.28084,
        piesAMetros: (ft) => ft / 3.28084
    },
    
    peso: {
        gramosAKilogramos: (g) => g / 1000,
        kilogramosAGramos: (kg) => kg * 1000,
        kilogramosaLibras: (kg) => kg * 2.20462,
        librasAKilogramos: (lb) => lb / 2.20462
    }
};

console.log("=== FUNCIONES DE CONVERSIÓN ===");

console.log("Temperatura:");
console.log(`25°C = ${Conversiones.temperatura.celsiusAFahrenheit(25).toFixed(2)}°F`);
console.log(`77°F = ${Conversiones.temperatura.fahrenheitACelsius(77).toFixed(2)}°C`);
console.log(`0°C = ${Conversiones.temperatura.celsiusAKelvin(0).toFixed(2)}K`);

console.log("\nDistancia:");
console.log(`1500 m = ${Conversiones.distancia.metrosaKilometros(1500)} km`);
console.log(`10 m = ${Conversiones.distancia.metrosApies(10).toFixed(2)} ft`);

console.log("\nPeso:");
console.log(`2500 g = ${Conversiones.peso.gramosAKilogramos(2500)} kg`);
console.log(`70 kg = ${Conversiones.peso.kilogramosaLibras(70).toFixed(2)} lb`);

/*
 * SALIDA ESPERADA:
 * === FUNCIONES DE CONVERSIÓN ===
 * Temperatura:
 * 25°C = 77.00°F
 * 77°F = 25.00°C
 * 0°C = 273.15K
 * 
 * Distancia:
 * 1500 m = 1.5 km
 * 10 m = 32.81 ft
 * 
 * Peso:
 * 2500 g = 2.5 kg
 * 70 kg = 154.32 lb
 */
