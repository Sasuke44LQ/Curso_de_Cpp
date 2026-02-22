/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 8
 * =====================================================
 * Sistema de manejo de tareas por prioridad.
 * 
 * EXPLICACIÓN:
 * - Organizar tareas por nivel de prioridad
 * - Usar Map para prioridades
 * - Operaciones: agregar, completar, listar
 */

class ManejadorTareas {
    constructor() {
        this.tareas = new Map([
            ["ALTA", []],
            ["MEDIA", []],
            ["BAJA", []]
        ]);
    }
    
    agregarTarea(descripcion, prioridad = "MEDIA") {
        if (this.tareas.has(prioridad)) {
            this.tareas.get(prioridad).push({
                descripcion,
                completada: false
            });
        }
    }
    
    completarTarea(prioridad, indice) {
        const tareas = this.tareas.get(prioridad);
        if (tareas && tareas[indice]) {
            tareas[indice].completada = true;
        }
    }
    
    listarTareas() {
        console.log("=== GESTOR DE TAREAS ===\n");
        let numeroTotal = 0;
        
        this.tareas.forEach((tareas, prioridad) => {
            if (tareas.length > 0) {
                console.log(`${prioridad}:`);
                tareas.forEach((t, i) => {
                    const estado = t.completada ? "✓" : "○";
                    console.log(`  ${estado} ${i + 1}. ${t.descripcion}`);
                    numeroTotal++;
                });
                console.log();
            }
        });
        
        console.log(`Total de tareas: ${numeroTotal}`);
    }
}

const gestor = new ManejadorTareas();

gestor.agregarTarea("Arreglar bug crítico", "ALTA");
gestor.agregarTarea("Llamar al cliente", "ALTA");
gestor.agregarTarea("Revisar código", "MEDIA");
gestor.agregarTarea("Escribir documentación", "MEDIA");
gestor.agregarTarea("Limpiar escritorio", "BAJA");

gestor.completarTarea("ALTA", 0);
gestor.completarTarea("MEDIA", 0);

gestor.listarTareas();

/*
 * SALIDA ESPERADA:
 * === GESTOR DE TAREAS ===
 * 
 * ALTA:
 *   ✓ 1. Arreglar bug crítico
 *   ○ 2. Llamar al cliente
 * 
 * MEDIA:
 *   ✓ 1. Revisar código
 *   ○ 2. Escribir documentación
 * 
 * BAJA:
 *   ○ 1. Limpiar escritorio
 * 
 * Total de tareas: 5
 */
