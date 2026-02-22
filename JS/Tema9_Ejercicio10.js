/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 10
 * =========================================================
 * Sistema completo: Red social con OOP.
 * 
 * EXPLICACIÓN:
 * - Integración de todos los conceptos
 * - Herencia, composición, encapsulación
 * - Sistema funcional completo
 */

class Usuario {
    #contraseña = "";
    #amigos = [];
    
    constructor(nombre, email, contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.#contraseña = contraseña;
        this.publicaciones = [];
    }
    
    publicar(contenido) {
        const post = {
            id: this.publicaciones.length + 1,
            contenido,
            fecha: new Date().toLocaleDateString(),
            likes: 0
        };
        this.publicaciones.push(post);
    }
    
    agregarAmigo(usuario) {
        if (!this.#amigos.includes(usuario)) {
            this.#amigos.push(usuario);
        }
    }
    
    get amigos() {
        return this.#amigos.map(a => a.nombre);
    }
    
    set contraseña(nueva) {
        if (nueva.length >= 6) {
            this.#contraseña = nueva;
        }
    }
    
    obtenerPerfil() {
        return `${this.nombre} (${this.email}) - ${this.#amigos.length} amigos`;
    }
}

class Publicacion {
    constructor(usuario, contenido) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.fecha = new Date().toLocaleDateString();
        this.likes = 0;
    }
    
    darLike() {
        this.likes++;
    }
    
    obtenerInfo() {
        return `${this.usuario.nombre}: "${this.contenido}" (${this.likes} likes)`;
    }
}

class RedSocial {
    constructor(nombre) {
        this.nombre = nombre;
        this.usuarios = new Map();
    }
    
    registrarUsuario(nombre, email, contraseña) {
        const usuario = new Usuario(nombre, email, contraseña);
        this.usuarios.set(nombre, usuario);
        return usuario;
    }
    
    conectarAmigos(nombre1, nombre2) {
        const u1 = this.usuarios.get(nombre1);
        const u2 = this.usuarios.get(nombre2);
        if (u1 && u2) {
            u1.agregarAmigo(u2);
            u2.agregarAmigo(u1);
        }
    }
    
    mostrarInfoUsuario(nombre) {
        const usuario = this.usuarios.get(nombre);
        console.log(`\n${usuario.obtenerPerfil()}`);
        console.log(`Amigos: ${usuario.amigos.join(", ") || "Sin amigos"}`);
        console.log(`Publicaciones: ${usuario.publicaciones.length}`);
        usuario.publicaciones.forEach(p => {
            console.log(`  - ${p.contenido}`);
        });
    }
}

console.log("=== RED SOCIAL ===\n");

const red = new RedSocial("TechNet");

const juan = red.registrarUsuario("Juan", "juan@email.com", "password123");
const ana = red.registrarUsuario("Ana", "ana@email.com", "secure456");
const carlos = red.registrarUsuario("Carlos", "carlos@email.com", "pass789");

juan.publicar("¡Hola a todos!");
juan.publicar("Aprendiendo JavaScript OOP");

ana.publicar("Primer día en TechNet");

red.conectarAmigos("Juan", "Ana");
red.conectarAmigos("Juan", "Carlos");
red.conectarAmigos("Ana", "Carlos");

red.mostrarInfoUsuario("Juan");
red.mostrarInfoUsuario("Ana");
red.mostrarInfoUsuario("Carlos");

/*
 * SALIDA ESPERADA:
 * === RED SOCIAL ===
 * 
 * Juan (juan@email.com) - 2 amigos
 * Amigos: Ana, Carlos
 * Publicaciones: 2
 *   - ¡Hola a todos!
 *   - Aprendiendo JavaScript OOP
 * 
 * Ana (ana@email.com) - 2 amigos
 * Amigos: Juan, Carlos
 * Publicaciones: 1
 *   - Primer día en TechNet
 * 
 * Carlos (carlos@email.com) - 2 amigos
 * Amigos: Juan, Ana
 * Publicaciones: 0
 */
