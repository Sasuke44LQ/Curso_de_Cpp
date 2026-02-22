/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 8
 * ========================================================
 * Interfaces (contratos) usando herencia.
 * 
 * EXPLICACIÓN:
 * - Clase abstracta define métodos que deben implementarse
 * - Todas las subclases deben cumplir con la interfaz
 * - Garantizar consistencia
 */

class Pagador {
    pagar() {
        throw new Error("Debe implementar el método pagar()");
    }
}

class TarjetaCredito extends Pagador {
    constructor(numero, cvv) {
        super();
        this.numero = numero;
        this.cvv = cvv;
    }
    
    pagar(cantidad) {
        return `Pagando $${cantidad} con tarjeta ${this.numero.slice(-4)}`;
    }
}

class PayPal extends Pagador {
    constructor(email, contraseña) {
        super();
        this.email = email;
    }
    
    pagar(cantidad) {
        return `Pagando $${cantidad} vía PayPal (${this.email})`;
    }
}

class CriptoMoneda extends Pagador {
    constructor(moneda, billetera) {
        super();
        this.moneda = moneda;
        this.billetera = billetera;
    }
    
    pagar(cantidad) {
        return `Pagando ${cantidad}$ en ${this.moneda} desde billetera: ${this.billetera.slice(0, 10)}...`;
    }
}

class Carrito {
    constructor() {
        this.total = 0;
        this.metodoPago = null;
    }
    
    establecerMetodoPago(pagador) {
        if (pagador instanceof Pagador) {
            this.metodoPago = pagador;
            return true;
        }
        return false;
    }
    
    procesarPago() {
        if (!this.metodoPago) {
            return "Error: no hay método de pago asignado";
        }
        return this.metodoPago.pagar(this.total);
    }
}

console.log("=== INTERFACES ===\n");

const carrito = new Carrito();
carrito.total = 150;

const tarjeta = new TarjetaCredito("1234567890123456", "123");
carrito.establecerMetodoPago(tarjeta);
console.log(carrito.procesarPago());

const paypal = new PayPal("usuario@email.com", "pass");
carrito.establecerMetodoPago(paypal);
console.log(carrito.procesarPago());

const cripto = new CriptoMoneda("Bitcoin", "1A1z7agoat5WFheuQYyvHkQrCHTQiZiM18");
carrito.establecerMetodoPago(cripto);
console.log(carrito.procesarPago());

/*
 * SALIDA ESPERADA:
 * === INTERFACES ===
 * 
 * Pagando $150 con tarjeta 3456
 * Pagando $150 vía PayPal (usuario@email.com)
 * Pagando 150$ en Bitcoin desde billetera: 1A1z7agoa...
 */
