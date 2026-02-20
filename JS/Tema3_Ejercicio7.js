/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 7
 * ================================================
 * Determinar si un carácter es vocal o consonante.
 * 
 * EXPLICACIÓN:
 * - Métodos de string: toLowerCase(), includes()
 * - Array de vocales para verificación
 * - Validación que sea una letra
 */

function clasificarCaracter(caracter) {
    if (caracter.length !== 1) {
        return "Ingrese un solo carácter";
    }
    
    const vocal = caracter.toLowerCase();
    const vocales = ['a', 'e', 'i', 'o', 'u'];
    
    if (vocales.includes(vocal)) {
        return `'${caracter}' es una VOCAL`;
    } else if (/[a-z]/i.test(caracter)) {
        return `'${caracter}' es una CONSONANTE`;
    } else {
        return `'${caracter}' no es una letra`;
    }
}

console.log("=== VOCAL O CONSONANTE ===");
const caracteres = ['A', 'b', 'E', 'x', '3', 'o'];

caracteres.forEach(c => {
    console.log(clasificarCaracter(c));
});

/*
 * SALIDA ESPERADA:
 * === VOCAL O CONSONANTE ===
 * 'A' es una VOCAL
 * 'b' es una CONSONANTE
 * 'E' es una VOCAL
 * 'x' es una CONSONANTE
 * '3' no es una letra
 * 'o' es una VOCAL
 */
