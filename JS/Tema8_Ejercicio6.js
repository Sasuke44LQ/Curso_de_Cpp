/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 6
 * =====================================================
 * Registrar estudiantes y calificaciones.
 * 
 * EXPLICACIÓN:
 * - Map de Maps: estudiante -> asignaturas -> calificaciones
 * - Operaciones: agregar, actualizar, promediar
 * - Reportes y estadísticas
 */

class RegistroEstudiantes {
    constructor() {
        this.estudiantes = new Map();
    }
    
    agregarEstudiante(nombre) {
        if (!this.estudiantes.has(nombre)) {
            this.estudiantes.set(nombre, new Map());
        }
    }
    
    agregarCalificacion(nombre, asignatura, calificacion) {
        if (!this.estudiantes.has(nombre)) {
            this.agregarEstudiante(nombre);
        }
        const asignaturas = this.estudiantes.get(nombre);
        asignaturas.set(asignatura, calificacion);
    }
    
    promedioEstudiante(nombre) {
        const asignaturas = this.estudiantes.get(nombre);
        if (!asignaturas || asignaturas.size === 0) return 0;
        
        const suma = [...asignaturas.values()].reduce((a, b) => a + b, 0);
        return suma / asignaturas.size;
    }
    
    reporteCompleto() {
        console.log("=== REGISTRO DE ESTUDIANTES ===\n");
        this.estudiantes.forEach((asignaturas, nombre) => {
            console.log(`${nombre}:`);
            asignaturas.forEach((calif, asignatura) => {
                console.log(`  ${asignatura}: ${calif}`);
            });
            console.log(`  Promedio: ${this.promedioEstudiante(nombre).toFixed(2)}\n`);
        });
    }
}

const registro = new RegistroEstudiantes();

registro.agregarCalificacion("Juan", "Matemática", 8.5);
registro.agregarCalificacion("Juan", "Español", 9.0);
registro.agregarCalificacion("Juan", "Inglés", 7.8);

registro.agregarCalificacion("Ana", "Matemática", 9.2);
registro.agregarCalificacion("Ana", "Español", 8.7);
registro.agregarCalificacion("Ana", "Inglés", 9.1);

registro.reporteCompleto();

/*
 * SALIDA ESPERADA:
 * === REGISTRO DE ESTUDIANTES ===
 * 
 * Juan:
 *   Matemática: 8.5
 *   Español: 9
 *   Inglés: 7.8
 *   Promedio: 8.43
 * 
 * Ana:
 *   Matemática: 9.2
 *   Español: 8.7
 *   Inglés: 9.1
 *   Promedio: 9.00
 */
