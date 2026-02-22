/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 4
 * =====================================================
 * Implementar una Queue (Cola FIFO).
 * 
 * EXPLICACIÓN:
 * - FIFO: First In, First Out
 * - Usar array con push() y shift()
 * - Aplicación: impresoras, procesos
 */

class Cola {
    constructor() {
        this.elementos = [];
    }
    
    encolar(elemento) {
        this.elementos.push(elemento);
    }
    
    desencolar() {
        return this.elementos.shift();
    }
    
    frente() {
        return this.elementos[0];
    }
    
    tamano() {
        return this.elementos.length;
    }
    
    estaVacia() {
        return this.elementos.length === 0;
    }
    
    limpiar() {
        this.elementos = [];
    }
    
    mostrar() {
        console.log(`[${this.elementos.join(" <- ")}]`);
    }
}

const colaTrabajo = new Cola();

console.log("=== COLA (FIFO) ===\n");

colaTrabajo.encolar("Tarea 1");
colaTrabajo.encolar("Tarea 2");
colaTrabajo.encolar("Tarea 3");

console.log("Después de encolar 3 tareas:");
colaTrabajo.mostrar();

console.log(`\nTamaño de cola: ${colaTrabajo.tamano()}`);
console.log(`Próxima tarea: ${colaTrabajo.frente()}`);

console.log(`\nDesencolando: ${colaTrabajo.desencolar()}`);
colaTrabajo.mostrar();

console.log(`\nDesencolando: ${colaTrabajo.desencolar()}`);
colaTrabajo.mostrar();

/*
 * SALIDA ESPERADA:
 * === COLA (FIFO) ===
 * 
 * Después de encolar 3 tareas:
 * [Tarea 1 <- Tarea 2 <- Tarea 3]
 * 
 * Tamaño de cola: 3
 * Próxima tarea: Tarea 1
 * 
 * Desencolando: Tarea 1
 * [Tarea 2 <- Tarea 3]
 * 
 * Desencolando: Tarea 2
 * [Tarea 3]
 */
