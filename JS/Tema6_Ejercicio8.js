/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 8
 * ============================================
 * Contar frecuencia de caracteres.
 * 
 * EXPLICACIÓN:
 * - Usar un objeto o Map para contar
 * - Iterar sobre caracteres
 * - Mostrar estadísticas
 */

function contarCaracteres(texto) {
    const frecuencia = {};
    
    for (let char of texto.toLowerCase()) {
        if (char !== ' ') {
            frecuencia[char] = (frecuencia[char] || 0) + 1;
        }
    }
    
    return frecuencia;
}

function mostrarFrecuencia(frecuencia) {
    const sorted = Object.entries(frecuencia)
        .sort((a, b) => b[1] - a[1]);
    
    sorted.forEach(([char, count]) => {
        console.log(`'${char}': ${'█'.repeat(count)} ${count}`);
    });
}

const texto = "hello world";

console.log("=== FRECUENCIA DE CARACTERES ===");
console.log(`Texto: "${texto}"`);

const frecuencia = contarCaracteres(texto);

console.log(`\nFrecuencia:`);
mostrarFrecuencia(frecuencia);

console.log(`\nCarácter más frecuente: '${Object.entries(frecuencia).sort((a, b) => b[1] - a[1])[0][0]}'`);

/*
 * SALIDA ESPERADA:
 * === FRECUENCIA DE CARACTERES ===
 * Texto: "hello world"
 * 
 * Frecuencia:
 * 'l': ██ 2
 * 'o': ██ 2
 * 'h': █ 1
 * 'e': █ 1
 * 'w': █ 1
 * 'r': █ 1
 * 'd': █ 1
 * 
 * Carácter más frecuente: 'l'
 */
