/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 6
 * ==============================================
 * Calcular factorial con bucle for.
 * 
 * EXPLICACIÓN:
 * - Factorial: n! = n * (n-1) * (n-2) * ... * 1
 * - Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120
 * - Mostrar pasos del cálculo
 */

function calcularFactorial(n) {
    if (n < 0) return "No definido";
    if (n === 0 || n === 1) return 1;
    
    let factorial = 1;
    const pasos = [];
    
    for (let i = n; i >= 1; i--) {
        factorial *= i;
        pasos.push(`Paso ${n - i + 1}: ${i} × ${factorial / i} = ${factorial}`);
    }
    
    return {factorial, pasos};
}

console.log("=== CÁLCULO DE FACTORIAL ===");

for (let num = 0; num <= 6; num++) {
    const resultado = calcularFactorial(num);
    console.log(`${num}! = ${typeof resultado === 'number' ? resultado : resultado.factorial}\n`);
    
    if (resultado.pasos) {
        resultado.pasos.forEach(paso => console.log(`  ${paso}`));
        console.log();
    }
}

/*
 * SALIDA ESPERADA:
 * === CÁLCULO DE FACTORIAL ===
 * 0! = 1
 * 
 * 1! = 1
 * 
 * 2! = 2
 * 
 *   Paso 1: 2 × 1 = 2
 * 
 * 3! = 6
 * 
 *   Paso 1: 3 × 1 = 3
 *   Paso 2: 2 × 3 = 6
 * 
 * 4! = 24
 * 
 *   Paso 1: 4 × 1 = 4
 *   Paso 2: 3 × 4 = 12
 *   Paso 3: 2 × 12 = 24
 * 
 * 5! = 120
 * ... (más pasos)
 * 
 * 6! = 720
 * ... (más pasos)
 */
