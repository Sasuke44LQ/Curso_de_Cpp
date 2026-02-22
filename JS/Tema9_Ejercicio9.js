/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 9
 * ========================================================
 * Patrón Singleton (instancia única).
 * 
 * EXPLICACIÓN:
 * - Singleton: una única instancia de la clase
 * - Acceso global a esa instancia
 * - Casos: conexión BD, configuración, logger
 */

class BaseDatos {
    static instancia = null;
    
    constructor() {
        if (BaseDatos.instancia !== null) {
            return BaseDatos.instancia;
        }
        this.conectado = false;
        this.datos = [];
        BaseDatos.instancia = this;
    }
    
    conectar() {
        this.conectado = true;
        return "Conectado a la base de datos";
    }
    
    desconectar() {
        this.conectado = false;
        return "Desconectado de la base de datos";
    }
    
    insertar(valor) {
        if (this.conectado) {
            this.datos.push(valor);
            return `Insertado: ${valor}`;
        }
        return "Error: no conectado";
    }
    
    obtenerDatos() {
        return [...this.datos];
    }
}

class Configuracion {
    static instancia = null;
    
    constructor() {
        if (Configuracion.instancia !== null) {
            return Configuracion.instancia;
        }
        this.idioma = "español";
        this.tema = "oscuro";
        this.volumen = 80;
        Configuracion.instancia = this;
    }
    
    establecerIdioma(idioma) {
        this.idioma = idioma;
    }
    
    obtenerConfig() {
        return `Idioma: ${this.idioma}, Tema: ${this.tema}, Volumen: ${this.volumen}%`;
    }
}

console.log("=== PATRÓN SINGLETON ===\n");

const db1 = new BaseDatos();
const db2 = new BaseDatos();

console.log(`¿db1 === db2? ${db1 === db2}`);

console.log(db1.conectar());
console.log(db1.insertar("Usuario1"));
console.log(db1.insertar("Usuario2"));

console.log("\nUsando db2:");
console.log(`Datos en db2: ${db2.obtenerDatos()}`);

console.log("\nConfiguración:");
const config1 = new Configuracion();
const config2 = new Configuracion();

console.log(`¿config1 === config2? ${config1 === config2}`);
console.log(config1.obtenerConfig());

config2.establecerIdioma("inglés");
console.log(`Después de cambiar en config2: ${config1.obtenerConfig()}`);

/*
 * SALIDA ESPERADA:
 * === PATRÓN SINGLETON ===
 * 
 * ¿db1 === db2? true
 * Conectado a la base de datos
 * Insertado: Usuario1
 * Insertado: Usuario2
 * 
 * Usando db2:
 * Datos en db2: Usuario1,Usuario2
 * 
 * Configuración:
 * ¿config1 === config2? true
 * Idioma: español, Tema: oscuro, Volumen: 80%
 * Después de cambiar en config2: Idioma: inglés, Tema: oscuro, Volumen: 80%
 */
