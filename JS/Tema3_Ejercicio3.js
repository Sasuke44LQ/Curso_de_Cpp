/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 3
 * ================================================
 * Encontrar el máximo de tres números.
 * 
 * EXPLICACIÓN:
 * - Comparaciones anidadas
 * - Múltiples condiciones if-else
 * - Math.max() como alternativa
 */

function maximoTresNumeros(a, b, c) {
    if (a >= b && a >= c) {
        return a;
    } else if (b >= a && b >= c) {
        return b;
    } else {
        return c;
    }
}

const num1 = 25, num2 = 42, num3 = 15;

console.log("=== MÁXIMO DE TRES NÚMEROS ===");
console.log(`Números: ${num1}, ${num2}, ${num3}`);
console.log(`Máximo: ${maximoTresNumeros(num1, num2, num3)}`);

// Usando Math.max()
console.log(`Con Math.max(): ${Math.max(num1, num2, num3)}`);

// Otros ejemplos
console.log(`Máximo de 10, 5, 8: ${maximoTresNumeros(10, 5, 8)}`);
console.log(`Máximo de 3, 3, 3: ${maximoTresNumeros(3, 3, 3)}`);

/*
 * SALIDA ESPERADA:
 * === MÁXIMO DE TRES NÚMEROS ===
 * Números: 25, 42, 15
 * Máximo: 42
 * Con Math.max(): 42
 * Máximo de 10, 5, 8: 10
 * Máximo de 3, 3, 3: 3
 */
