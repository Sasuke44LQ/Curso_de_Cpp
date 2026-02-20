/*
 * TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 8
 * ==============================================
 * Juego de adivinanza con break.
 * 
 * EXPLICACIÓN:
 * - Break para salir del bucle cuando se adivina
 * - Contador de intentos
 * - Comparación de números
 */

function juegoAdivinanza(numeroSecreto = 42, maxIntentos = 7) {
    console.log("=== JUEGO DE ADIVINANZA ===");
    console.log(`Intenta adivinar un número entre 1 y 100.`);
    console.log(`Tienes hasta ${maxIntentos} intentos.\n`);
    
    // Simulación con números predefinidos
    const intentos = [50, 30, 40, 45, 42];
    
    for (let i = 0; i < Math.min(intentos.length, maxIntentos); i++) {
        const intento = intentos[i];
        console.log(`Intento ${i + 1}: ${intento}`);
        
        if (intento === numeroSecreto) {
            console.log(`¡CORRECTO! ¡Ganaste en ${i + 1} intentos!`);
            break;  // Sale del bucle
        } else if (intento < numeroSecreto) {
            console.log(`  → Es mayor`);
        } else {
            console.log(`  → Es menor`);
        }
        
        if (i === Math.min(intentos.length, maxIntentos) - 1) {
            console.log(`\n¡Perdiste! El número era: ${numeroSecreto}`);
        }
    }
}

juegoAdivinanza();

/*
 * SALIDA ESPERADA:
 * === JUEGO DE ADIVINANZA ===
 * Intenta adivinar un número entre 1 y 100.
 * Tienes hasta 7 intentos.
 * 
 * Intento 1: 50
 *   → Es menor
 * Intento 2: 30
 *   → Es mayor
 * Intento 3: 40
 *   → Es mayor
 * Intento 4: 45
 *   → Es menor
 * Intento 5: 42
 * ¡CORRECTO! ¡Ganaste en 5 intentos!
 */
