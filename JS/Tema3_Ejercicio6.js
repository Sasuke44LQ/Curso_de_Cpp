/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 6
 * ================================================
 * Clasificar edad en categorías.
 * 
 * EXPLICACIÓN:
 * - Rangos de edades
 * - Múltiples condiciones if-else if
 * - Clasificación por grupos etarios
 */

function clasificarEdad(edad) {
    if (edad < 0 || edad > 150) {
        return "Edad inválida";
    } else if (edad < 5) {
        return "Infante";
    } else if (edad < 12) {
        return "Niño";
    } else if (edad < 18) {
        return "Adolescente";
    } else if (edad < 65) {
        return "Adulto";
    } else {
        return "Adulto mayor";
    }
}

console.log("=== CLASIFICACIÓN POR EDAD ===");
const edades = [2, 8, 15, 25, 45, 70, 120, -5];

edades.forEach(edad => {
    console.log(`Edad ${edad}: ${clasificarEdad(edad)}`);
});

/*
 * SALIDA ESPERADA:
 * === CLASIFICACIÓN POR EDAD ===
 * Edad 2: Infante
 * Edad 8: Niño
 * Edad 15: Adolescente
 * Edad 25: Adulto
 * Edad 45: Adulto
 * Edad 70: Adulto mayor
 * Edad 120: Edad inválida
 * Edad -5: Edad inválida
 */
