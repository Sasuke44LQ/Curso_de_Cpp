/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 3
 * =====================================================
 * Trabajar con TreeMap equivalente (Map ordenado).
 * 
 * EXPLICACIÓN:
 * - Objetos ordenados de forma manual
 * - Simulación de TreeMap de Java
 * - Mantener estructura ordenada
 */

class ContactoAgenda {
    constructor() {
        this.agendaMap = new Map();
    }
    
    agregar(nombre, numero) {
        this.agendaMap.set(nombre.toLowerCase(), {nombre, numero});
        this.ordenar();
    }
    
    ordenar() {
        const ordenado = new Map([...this.agendaMap.entries()].sort());
        this.agendaMap = ordenado;
    }
    
    obtener(nombre) {
        return this.agendaMap.get(nombre.toLowerCase());
    }
    
    listar() {
        console.log("Agenda (ordenada alfabéticamente):");
        this.agendaMap.forEach((info, clave) => {
            console.log(`- ${info.nombre}: ${info.numero}`);
        });
    }
}

const agenda = new ContactoAgenda();
agenda.agregar("Carlos", "555-1234");
agenda.agregar("Ana", "555-5678");
agenda.agregar("Bob", "555-9012");
agenda.agregar("Diana", "555-3456");

console.log("=== AGENDA ORDENADA ===\n");
agenda.listar();

console.log(`\nBuscando 'Bob': ${agenda.obtener("Bob").numero}`);

/*
 * SALIDA ESPERADA:
 * === AGENDA ORDENADA ===
 * 
 * Agenda (ordenada alfabéticamente):
 * - Ana: 555-5678
 * - Bob: 555-9012
 * - Carlos: 555-1234
 * - Diana: 555-3456
 * 
 * Buscando 'Bob': 555-9012
 */
