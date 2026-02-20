/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 9
 * ===========================================
 * Generar tabla de multiplicar.
 * 
 * EXPLICACIÓN:
 * - Bucles for
 * - Arrays y métodos de iteración
 * - Template literals para formateo
 */

function generarTablaMultiplicar(numero, limite = 10) {
    const tabla = [];
    for (let i = 1; i <= limite; i++) {
        tabla.push(`${numero} x ${i} = ${numero * i}`);
    }
    return tabla;
}

const numero = 5;
const tabla = generarTablaMultiplicar(numero);

console.log(`=== TABLA DE MULTIPLICAR DEL ${numero} ===`);
tabla.forEach(linea => console.log(linea));

/*
 * SALIDA ESPERADA:
 * === TABLA DE MULTIPLICAR DEL 5 ===
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */
