/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 9
 * =========================================
 * Sobrecarga de funciones.
 * 
 * EXPLICACIÓN:
 * - Simular sobrecarga usando parámetros opcionales
 * - Detectar tipos de argumento
 * - Comportamiento diferente según entrada
 */

function procesar(a, b) {
    // Suma de dos números
    if (typeof a === 'number' && typeof b === 'number') {
        return a + b;
    }
    
    // Concatenación de strings
    if (typeof a === 'string' && typeof b === 'string') {
        return a + " " + b;
    }
    
    // Repetir array
    if (Array.isArray(a) && typeof b === 'number') {
        return Array(b).fill(a).flat();
    }
    
    return "Tipos no soportados";
}

function info(valor) {
    const tipo = typeof valor;
    
    if (tipo === 'number') {
        return `Número: ${valor}`;
    } else if (tipo === 'string') {
        return `String: "${valor}"`;
    } else if (Array.isArray(valor)) {
        return `Array: [${valor}]`;
    } else {
        return `${tipo}: ${valor}`;
    }
}

console.log("=== SOBRECARGA DE FUNCIONES ===");

console.log("Función procesar():");
console.log(`procesar(10, 5) = ${procesar(10, 5)}`);
console.log(`procesar("Hola", "mundo") = "${procesar("Hola", "mundo")}"`);
console.log(`procesar([1, 2], 3) = [${procesar([1, 2], 3)}]`);

console.log("\nFunción info():");
console.log(info(42));
console.log(info("JavaScript"));
console.log(info([1, 2, 3]));

/*
 * SALIDA ESPERADA:
 * === SOBRECARGA DE FUNCIONES ===
 * Función procesar():
 * procesar(10, 5) = 15
 * procesar("Hola", "mundo") = "Hola mundo"
 * procesar([1, 2], 3) = [1,2,1,2,1,2]
 * 
 * Función info():
 * Número: 42
 * String: "JavaScript"
 * Array: [1,2,3]
 */
