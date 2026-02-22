/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 9
 * =====================================================
 * Red social simple con relaciones de amistad.
 * 
 * EXPLICACIÓN:
 * - Grafo: usuarios y conexiones
 * - Usar Map para usuarios y Set para amigos
 * - Operaciones: agregar usuario, crear amistad, listar amigos
 */

class RedSocial {
    constructor() {
        this.usuarios = new Map();
    }
    
    agregarUsuario(nombre) {
        if (!this.usuarios.has(nombre)) {
            this.usuarios.set(nombre, new Set());
        }
    }
    
    crearAmistad(usuario1, usuario2) {
        this.agregarUsuario(usuario1);
        this.agregarUsuario(usuario2);
        
        this.usuarios.get(usuario1).add(usuario2);
        this.usuarios.get(usuario2).add(usuario1);
    }
    
    obtenerAmigos(usuario) {
        return this.usuarios.get(usuario) || new Set();
    }
    
    contarAmigos(usuario) {
        return this.obtenerAmigos(usuario).size;
    }
    
    mostrarRed() {
        console.log("=== RED SOCIAL ===\n");
        this.usuarios.forEach((amigos, usuario) => {
            const listaAmigos = amigos.size > 0 
                ? [...amigos].join(", ")
                : "Sin amigos";
            console.log(`${usuario}: [${listaAmigos}] (${amigos.size})`);
        });
    }
}

const red = new RedSocial();

red.crearAmistad("Juan", "Ana");
red.crearAmistad("Juan", "Carlos");
red.crearAmistad("Ana", "Carlos");
red.crearAmistad("Ana", "Diana");
red.crearAmistad("Carlos", "Diana");

red.mostrarRed();

console.log(`\nAmigos de Juan: ${[...red.obtenerAmigos("Juan")].join(", ")}`);
console.log(`Amigos de Ana: ${[...red.obtenerAmigos("Ana")].join(", ")}`);

/*
 * SALIDA ESPERADA:
 * === RED SOCIAL ===
 * 
 * Juan: [Ana, Carlos] (2)
 * Ana: [Juan, Carlos, Diana] (3)
 * Carlos: [Juan, Ana, Diana] (3)
 * Diana: [Ana, Carlos] (2)
 * 
 * Amigos de Juan: Ana, Carlos
 * Amigos de Ana: Juan, Carlos, Diana
 */
