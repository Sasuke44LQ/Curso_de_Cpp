/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 7
 * =====================================================
 * Sistema de carrito de compras.
 * 
 * EXPLICACIÓN:
 * - Usar Map para almacenar productos
 * - Cálculos: subtotal, impuestos, total
 * - Operaciones: agregar, eliminar, modificar cantidad
 */

class CarritoCompras {
    constructor() {
        this.productos = new Map();
        this.impuesto = 0.16;  // 16% IVA
    }
    
    agregarProducto(id, nombre, precio, cantidad = 1) {
        if (this.productos.has(id)) {
            const p = this.productos.get(id);
            p.cantidad += cantidad;
        } else {
            this.productos.set(id, {nombre, precio, cantidad});
        }
    }
    
    eliminarProducto(id) {
        this.productos.delete(id);
    }
    
    calcularSubtotal() {
        let total = 0;
        this.productos.forEach(p => {
            total += p.precio * p.cantidad;
        });
        return total;
    }
    
    calcularImpuestos() {
        return this.calcularSubtotal() * this.impuesto;
    }
    
    calcularTotal() {
        return this.calcularSubtotal() + this.calcularImpuestos();
    }
    
    mostrarCarrito() {
        console.log("=== CARRITO DE COMPRAS ===\n");
        this.productos.forEach((p, id) => {
            const subtotal = p.precio * p.cantidad;
            console.log(`${p.nombre} x${p.cantidad} = $${subtotal.toFixed(2)}`);
        });
        console.log(`\nSubtotal: $${this.calcularSubtotal().toFixed(2)}`);
        console.log(`IVA (16%): $${this.calcularImpuestos().toFixed(2)}`);
        console.log(`TOTAL: $${this.calcularTotal().toFixed(2)}`);
    }
}

const carrito = new CarritoCompras();
carrito.agregarProducto(1, "Laptop", 999.99, 1);
carrito.agregarProducto(2, "Mouse", 25.50, 2);
carrito.agregarProducto(3, "Teclado", 75.00, 1);

carrito.mostrarCarrito();

/*
 * SALIDA ESPERADA:
 * === CARRITO DE COMPRAS ===
 * 
 * Laptop x1 = $999.99
 * Mouse x2 = $51.00
 * Teclado x1 = $75.00
 * 
 * Subtotal: $1125.99
 * IVA (16%): $180.16
 * TOTAL: $1306.15
 */
