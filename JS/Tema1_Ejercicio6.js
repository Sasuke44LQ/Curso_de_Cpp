/*
 * TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 6
 * ===========================================
 * Calcular el área de un triángulo.
 * 
 * EXPLICACIÓN:
 * - Fórmula de Heron para área de triángulo
 * - Semiperímetro
 * - Validación de triángulo válido
 */

function calcularAreaTriangulo(a, b, c) {
    // Validar que sea un triángulo válido
    if (a + b <= c || b + c <= a || a + c <= b) {
        return "No es un triángulo válido";
    }
    
    // Fórmula de Heron
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
}

const lado1 = 5, lado2 = 6, lado3 = 7;

console.log("=== ÁREA DE TRIÁNGULO ===");
console.log(`Lados: ${lado1}, ${lado2}, ${lado3}`);

const area = calcularAreaTriangulo(lado1, lado2, lado3);
if (typeof area === 'number') {
    console.log(`Área: ${area.toFixed(2)} unidades²`);
} else {
    console.log(area);
}

/*
 * SALIDA ESPERADA:
 * === ÁREA DE TRIÁNGULO ===
 * Lados: 5, 6, 7
 * Área: 14.70 unidades²
 */
