/*
 * TEMA 2: EXPRESIONES Y OPERADORES - EJERCICIO 5
 * ===============================================
 * Utilizar operador ternario para evaluaciones condicionales.
 * 
 * EXPLICACIÓN:
 * - Operador ternario: condición ? valorSiVerdadero : valorSiFalso
 * - Equivalente a un if-else en una sola expresión
 * - Útil para asignaciones condicionales simples
 */

const edad = 25;
const esEstudiante = true;
const dinero = 100;

// Operador ternario simple
const mayoria = edad >= 18 ? "Mayor de edad" : "Menor de edad";

// Operador ternario anidado
const descuento = esEstudiante ? 
    dinero * 0.15 : 
    dinero * 0.05;

const preciofinal = dinero - descuento;

console.log("=== OPERADOR TERNARIO ===");
console.log(`Edad: ${edad}`);
console.log(`Estado: ${mayoria}`);

console.log(`\nEs estudiante: ${esEstudiante}`);
console.log(`Dinero inicial: $${dinero}`);
console.log(`Descuento aplicado: $${descuento.toFixed(2)}`);
console.log(`Precio final: $${preciofinal.toFixed(2)}`);

// Clasificar números
const numero = 42;
const clasificacion = numero % 2 === 0 ? "PAR" : "IMPAR";
console.log(`\n${numero} es: ${clasificacion}`);

/*
 * SALIDA ESPERADA:
 * === OPERADOR TERNARIO ===
 * Edad: 25
 * Estado: Mayor de edad
 * 
 * Es estudiante: true
 * Dinero inicial: $100
 * Descuento aplicado: $15.00
 * Precio final: $85.00
 * 
 * 42 es: PAR
 */
