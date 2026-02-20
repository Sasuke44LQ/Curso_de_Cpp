/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 2
 * ================================================
 * Determinar si un número es par o impar.
 * 
 * EXPLICACIÓN:
 * - Operador módulo (%) para obtener residuo
 * - Números pares: n % 2 === 0
 * - Números impares: n % 2 !== 0
 */

function esPar(numero) {
    return numero % 2 === 0;
}

function clasificarNumero(numero) {
    if (esPar(numero)) {
        return `${numero} es PAR`;
    } else {
        return `${numero} es IMPAR`;
    }
}

console.log("=== PAR O IMPAR ===");
for (let i = 1; i <= 10; i++) {
    console.log(clasificarNumero(i));
}

/*
 * SALIDA ESPERADA:
 * === PAR O IMPAR ===
 * 1 es IMPAR
 * 2 es PAR
 * 3 es IMPAR
 * 4 es PAR
 * 5 es IMPAR
 * 6 es PAR
 * 7 es IMPAR
 * 8 es PAR
 * 9 es IMPAR
 * 10 es PAR
 */
