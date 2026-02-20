/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 8
 * ================================================
 * Verificar si un año es bisiesto.
 * 
 * EXPLICACIÓN:
 * - Reglas de año bisiesto:
 *   1. Divisible por 4 y NO por 100 → Bisiesto
 *   2. Divisible por 400 → Bisiesto
 *   3. Otros casos → No bisiesto
 */

function esBisiesto(anio) {
    if (anio % 400 === 0) {
        return true;
    } else if (anio % 100 === 0) {
        return false;
    } else if (anio % 4 === 0) {
        return true;
    } else {
        return false;
    }
}

console.log("=== AÑO BISIESTO ===");
const anos = [2000, 1900, 2004, 2019, 2020, 2100];

anos.forEach(anio => {
    const es = esBisiesto(anio) ? "SÍ" : "NO";
    console.log(`¿${anio} es bisiesto? ${es}`);
});

/*
 * SALIDA ESPERADA:
 * === AÑO BISIESTO ===
 * ¿2000 es bisiesto? SÍ
 * ¿1900 es bisiesto? NO
 * ¿2004 es bisiesto? SÍ
 * ¿2019 es bisiesto? NO
 * ¿2020 es bisiesto? SÍ
 * ¿2100 es bisiesto? NO
 */
