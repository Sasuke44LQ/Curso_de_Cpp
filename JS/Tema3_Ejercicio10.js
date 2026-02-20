/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 10
 * =================================================
 * Asignar calificación (A-F) según puntuación.
 * 
 * EXPLICACIÓN:
 * - Rangos de puntuación
 * - Asignación de letras (A, B, C, D, F)
 * - Escala: A(90+), B(80+), C(70+), D(60+), F(<60)
 */

function asignarCalificacion(puntuacion) {
    if (puntuacion <0 || puntuacion > 100) {
        return "Puntuación inválida";
    }
    
    if (puntuacion >= 90) {
        return "A";
    } else if (puntuacion >= 80) {
        return "B";
    } else if (puntuacion >= 70) {
        return "C";
    } else if (puntuacion >= 60) {
        return "D";
    } else {
        return "F";
    }
}

console.log("=== ASIGNACIÓN DE CALIFICACIONES ===");
const puntuaciones = [95, 87, 76, 65, 45, 100, 59];

puntuaciones.forEach(puntaje => {
    const calificacion = asignarCalificacion(puntaje);
    console.log(`Puntuación: ${puntaje} → Calificación: ${calificacion}`);
});

/*
 * SALIDA ESPERADA:
 * === ASIGNACIÓN DE CALIFICACIONES ===
 * Puntuación: 95 → Calificación: A
 * Puntuación: 87 → Calificación: B
 * Puntuación: 76 → Calificación: C
 * Puntuación: 65 → Calificación: D
 * Puntuación: 45 → Calificación: F
 * Puntuación: 100 → Calificación: A
 * Puntuación: 59 → Calificación: F
 */
