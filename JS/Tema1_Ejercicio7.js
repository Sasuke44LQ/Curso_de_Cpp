/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 7
 * ===========================================
 * Calcular IMC (Índice de Masa Corporal) y clasificarlo.
 * 
 * EXPLICACIÓN:
 * - Fórmula: IMC = peso / (altura²)
 * - Condicionales anidadas para clasificar IMC
 * - Rangos de IMC: Bajo peso, Normal, Sobrepeso, Obeso
 */

function calcularIMC(peso, altura) {
    return peso / (altura * altura);
}

function clasificarIMC(imc) {
    if (imc < 18.5) return "Bajo peso";
    if (imc < 25) return "Normal";
    if (imc < 30) return "Sobrepeso";
    return "Obeso";
}

const peso = 70;  // kg
const altura = 1.75;  // metros

const imc = calcularIMC(peso, altura);
const clasificacion = clasificarIMC(imc);

console.log("=== CÁLCULO DE IMC ===");
console.log(`Peso: ${peso} kg`);
console.log(`Altura: ${altura} m`);
console.log(`IMC: ${imc.toFixed(2)}`);
console.log(`Clasificación: ${clasificacion}`);

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE IMC ===
 * Peso: 70 kg
 * Altura: 1.75 m
 * IMC: 22.86
 * Clasificación: Normal
 */
