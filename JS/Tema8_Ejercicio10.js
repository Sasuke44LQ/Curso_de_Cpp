/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 10
 * ======================================================
 * Estructura de datos compleja: Sistema de biblioteca.
 * 
 * EXPLICACIÓN:
 * - Combinar múltiples estructuras
 * - Map de libros, usuarios y préstamos
 * - Operaciones: agregar libro, prestar, devolver
 */

class Biblioteca {
    constructor() {
        this.libros = new Map();
        this.usuarios = new Map();
        this.prestamos = [];
    }
    
    agregarLibro(id, titulo, autor, copias = 1) {
        this.libros.set(id, {titulo, autor, copias});
    }
    
    registrarUsuario(id, nombre) {
        this.usuarios.set(id, {nombre, librosPrestados: []});
    }
    
    prestarLibro(idUsuario, idLibro) {
        const usuario = this.usuarios.get(idUsuario);
        const libro = this.libros.get(idLibro);
        
        if (!usuario || !libro || libro.copias === 0) {
            return false;
        }
        
        libro.copias--;
        usuario.librosPrestados.push(idLibro);
        this.prestamos.push({usuario: idUsuario, libro: idLibro, fecha: new Date()});
        return true;
    }
    
    devolverLibro(idUsuario, idLibro) {
        const usuario = this.usuarios.get(idUsuario);
        const libro = this.libros.get(idLibro);
        
        if (!usuario || !libro) return false;
        
        const indice = usuario.librosPrestados.indexOf(idLibro);
        if (indice > -1) {
            usuario.librosPrestados.splice(indice, 1);
            libro.copias++;
            return true;
        }
        return false;
    }
    
    mostrarStatus() {
        console.log("=== SISTEMA DE BIBLIOTECA ===\n");
        
        console.log("LIBROS:");
        this.libros.forEach((info, id) => {
            console.log(`- ${info.titulo} por ${info.autor} (${info.copias} copias)`);
        });
        
        console.log("\nUSUARIOS:");
        this.usuarios.forEach((info, id) => {
            const libros = info.librosPrestados
                .map(idL => this.libros.get(idL).titulo)
                .join(", ") || "Sin préstamos";
            console.log(`- ${info.nombre}: [${libros}]`);
        });
    }
}

const biblioteca = new Biblioteca();

biblioteca.agregarLibro(1, "Cien Años de Soledad", "García Márquez", 2);
biblioteca.agregarLibro(2, "1984", "George Orwell", 1);
biblioteca.agregarLibro(3, "Don Quijote", "Cervantes", 3);

biblioteca.registrarUsuario(101, "Juan");
biblioteca.registrarUsuario(102, "Ana");

biblioteca.prestarLibro(101, 1);
biblioteca.prestarLibro(102, 2);
biblioteca.prestarLibro(102, 3);

biblioteca.mostrarStatus();

console.log("\n--- Juan devuelve 'Cien Años de Soledad' ---");
biblioteca.devolverLibro(101, 1);

biblioteca.mostrarStatus();

/*
 * SALIDA ESPERADA:
 * === SISTEMA DE BIBLIOTECA ===
 * 
 * LIBROS:
 * - Cien Años de Soledad por García Márquez (2 copias)
 * - 1984 por George Orwell (1 copias)
 * - Don Quijote por Cervantes (3 copias)
 * 
 * USUARIOS:
 * - Juan: [Cien Años de Soledad]
 * - Ana: [1984, Don Quijote]
 * 
 * --- Juan devuelve 'Cien Años de Soledad' ---
 * 
 * === SISTEMA DE BIBLIOTECA ===
 * 
 * LIBROS:
 * - Cien Años de Soledad por García Márquez (3 copias)
 * - 1984 por George Orwell (1 copias)
 * - Don Quijote por Cervantes (3 copias)
 * 
 * USUARIOS:
 * - Juan: [Sin préstamos]
 * - Ana: [1984, Don Quijote]
 */
