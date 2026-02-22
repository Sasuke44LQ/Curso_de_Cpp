/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 6
 * ========================================================
 * Encapsulación: control de acceso.
 * 
 * EXPLICACIÓN:
 * - Ocultar detalles internos
 * - Exposición controlada a través de métodos
 * - Mantener invariantes de la clase
 */

class Empleado {
    constructor(nombre, salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bonificacion = 0;
    }
    
    agregarBonificacion(cantidad) {
        if (cantidad >= 0 && cantidad <= this.salarioBase * 0.5) {
            this.bonificacion = cantidad;
            return true;
        }
        console.warn(`Bonificación debe estar entre 0 y ${this.salarioBase * 0.5}`);
        return false;
    }
    
    obtenerSalarioTotal() {
        return this.salarioBase + this.bonificacion;
    }
    
    obtenerDetalle() {
        return `${this.nombre}: Salario base $${this.salarioBase} + Bonificación $${this.bonificacion} = $${this.obtenerSalarioTotal()}`;
    }
}

class Producto {
    constructor(nombre, precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descuento = 0;
    }
    
    aplicarDescuento(porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.descuento = porcentaje;
            return true;
        }
        console.warn("Descuento debe estar entre 0 y 100");
        return false;
    }
    
    obtenerPrecioFinal() {
        return this.precioBase * (1 - this.descuento / 100);
    }
    
    obtenerInfo() {
        const precioFinal = this.obtenerPrecioFinal();
        const ahorrado = this.precioBase - precioFinal;
        return `${this.nombre}: $${this.precioBase} - ${this.descuento}% = $${precioFinal.toFixed(2)} (Ahorro: $${ahorrado.toFixed(2)})`;
    }
}

console.log("=== ENCAPSULACIÓN ===\n");

const emp1 = new Empleado("Carlos", 2000);
console.log("Empleados:");
console.log(emp1.obtenerDetalle());

emp1.agregarBonificacion(300);
console.log(emp1.obtenerDetalle());

const prod = new Producto("Laptop", 1000);
console.log("\nProductos:");
console.log(prod.obtenerInfo());

prod.aplicarDescuento(20);
console.log(prod.obtenerInfo());

/*
 * SALIDA ESPERADA:
 * === ENCAPSULACIÓN ===
 * 
 * Empleados:
 * Carlos: Salario base $2000 + Bonificación $0 = $2000
 * Carlos: Salario base $2000 + Bonificación $300 = $2300
 * 
 * Productos:
 * Laptop: $1000 - 0% = $1000.00 (Ahorro: $0.00)
 * Laptop: $1000 - 20% = $800.00 (Ahorro: $200.00)
 */
