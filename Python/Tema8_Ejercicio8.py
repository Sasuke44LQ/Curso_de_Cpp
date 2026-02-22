"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 8: CARRITO DE COMPRAS
================================

Estructura de datos compleja con diccionarios
"""

# CARRITO SIMPLE
print("=== CARRITO SIMPLE ===\n")

carrito = {
    "manzana": 3,
    "banana": 2,
    "naranja": 4
}

print("Carrito:")
for producto, cantidad in carrito.items():
    print(f"  {producto}: {cantidad}")

# CARRITO AVANZADO
print("\n=== CARRITO AVANZADO ===\n")

carrito = {
    "manzana": {"precio": 0.50, "cantidad": 3},
    "banana": {"precio": 0.30, "cantidad": 2},
    "naranja": {"precio": 0.75, "cantidad": 4}
}

total = 0
print("Compra:")
for producto, info in carrito.items():
    subtotal = info["precio"] * info["cantidad"]
    total += subtotal
    print(f"  {producto}: ${info['precio']} x {info['cantidad']} = ${subtotal:.2f}")

print(f"Total: ${total:.2f}")

# SISTEMA DE INVENTARIO
print("\n=== INVENTARIO ===\n")

inventario = {
    "laptops": {"precio": 1000, "stock": 5},
    "tablets": {"precio": 500, "stock": 10},
    "teléfonos": {"precio": 800, "stock": 8}
}

def comprar(producto, cantidad):
    if producto in inventario:
        if inventario[producto]["stock"] >= cantidad:
            inventario[producto]["stock"] -= cantidad
            costo = inventario[producto]["precio"] * cantidad
            return f"Compra exitosa: ${costo:.2f}"
        else:
            return "Stock insuficiente"
    return "Producto no encontrado"

print(comprar("laptops", 2))
print(f"Stock laptops: {inventario['laptops']['stock']}")
print(comprar("tablets", 15))

"""
SALIDA ESPERADA:
=== CARRITO SIMPLE ===

Carrito:
  manzana: 3
  banana: 2
  naranja: 4

=== CARRITO AVANZADO ===

Compra:
  manzana: $0.5 x 3 = $1.50
  banana: $0.3 x 2 = $0.60
  naranja: $0.75 x 4 = $3.00
Total: $5.10
...
"""
