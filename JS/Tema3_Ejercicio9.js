/*
 * TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 9
 * ================================================
 * Calcular descuento según monto de compra.
 * 
 * EXPLICACIÓN:
 * - Descuentos en cascada según rango de cantidad
 * - Múltiples condicionales con rangos
 * - Cálculo de porcentaje
 */

function calcularDescuento(monto) {
    let porcentaje = 0;
    
    if (monto >= 1000) {
        porcentaje = 20;
    } else if (monto >= 500) {
        porcentaje = 15;
    } else if (monto >= 100) {
        porcentaje = 10;
    } else if (monto >= 50) {
        porcentaje = 5;
    }
    
    const descuento = monto * (porcentaje / 100);
    const montoFinal = monto - descuento;
    
    return {monto, porcentaje, descuento, montoFinal};
}

console.log("=== DESCUENTOS POR COMPRA ===");
const montos = [30, 75, 150, 500, 1000, 1500];

montos.forEach(monto => {
    const resultado = calcularDescuento(monto);
    console.log(`Compra de $${resultado.monto}: ${resultado.porcentaje}% descuento = $${resultado.montoFinal.toFixed(2)}`);
});

/*
 * SALIDA ESPERADA:
 * === DESCUENTOS POR COMPRA ===
 * Compra de $30: 0% descuento = $30.00
 * Compra de $75: 5% descuento = $71.25
 * Compra de $150: 10% descuento = $135.00
 * Compra de $500: 15% descuento = $425.00
 * Compra de $1000: 20% descuento = $800.00
 * Compra de $1500: 20% descuento = $1200.00
 */
