/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 5
 * ================================================
 * Crear un menú con sentencia switch.
 * 
 * EXPLICACIÓN:
 * - Sentencia switch para múltiples opciones
 * - Break para evitar caída de casos
 * - Default para caso no contemplado
 */

function calculadora(a, b, operacion) {
    let resultado;
    
    switch (operacion) {
        case '+':
            resultado = a + b;
            break;
        case '-':
            resultado = a - b;
            break;
        case '*':
            resultado = a * b;
            break;
        case '/':
            resultado = b !== 0 ? a / b : "Error: División por cero";
            break;
        case '%':
            resultado = a % b;
            break;
        default:
            resultado = "Operación no reconocida";
    }
    
    return resultado;
}

console.log("=== CALCULADORA CON SWITCH ===");
console.log(`10 + 5 = ${calculadora(10, 5, '+')}`);
console.log(`10 - 5 = ${calculadora(10, 5, '-')}`);
console.log(`10 * 5 = ${calculadora(10, 5, '*')}`);
console.log(`10 / 5 = ${calculadora(10, 5, '/')}`);
console.log(`10 % 3 = ${calculadora(10, 3, '%')}`);
console.log(`10 ^ 5 = ${calculadora(10, 5, '^')}`);

/*
 * SALIDA ESPERADA:
 * === CALCULADORA CON SWITCH ===
 * 10 + 5 = 15
 * 10 - 5 = 5
 * 10 * 5 = 50
 * 10 / 5 = 2
 * 10 % 3 = 1
 * 10 ^ 5 = Operación no reconocida
 */
