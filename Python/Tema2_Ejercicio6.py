"""
TEMA 2: OPERADORES - EJERCICIO 6 A 10
======================================
Ejercicios 6-10 de Tema 2 (Operadores avanzados y aplicaciones)
"""

# EJERCICIO 6: Potencias y raíces
print("=== EJERCICIO 6: POTENCIAS Y RAÍCES ===\n")

numero = 16
cuadrado = numero ** 2
raiz_cuadrada = numero ** 0.5

print(f"Número: {numero}")
print(f"Cuadrado: {numero}² = {cuadrado}")
print(f"Raíz cuadrada: √{numero} = {raiz_cuadrada:.4f}")

# EJERCICIO 7: Validación con operadores
print("\n=== EJERCICIO 7: VALIDACIÓN ===\n")

edad = 25
sueldo = 2500

puede_votar = edad >= 18
puede_conducir = edad >= 16
puede_trabajar = edad >= 14

print(f"Edad: {edad}")
print(f"¿Puede votar (>=18)? {puede_votar}")
print(f"¿Puede conducir (>=16)? {puede_conducir}")
print(f"¿Puede trabajar (>=14)? {puede_trabajar}")

solicitante_prestamo = edad >= 21 and sueldo >= 2000
print(f"\n¿Solicitante válido para préstamo? {solicitante_prestamo}")

# EJERCICIO 8: Conversión entre sistemas
print("\n=== EJERCICIO 8: SISTEMAS DE NUMERACIÓN ===\n")

decimal = 255
binario = bin(decimal)
octal = oct(decimal)
hexadecimal = hex(decimal)

print(f"Número decimal: {decimal}")
print(f"Binario: {binario}")
print(f"Octal: {octal}")
print(f"Hexadecimal: {hexadecimal}")

# EJERCICIO 9: Comparación múltiple
print("\n=== EJERCICIO 9: COMPARACIONES ===\n")

numeros = [5, 15, 25, -10, 0]
for num in numeros:
    es_positivo = num > 0
    es_negativo = num < 0
    es_cero = num == 0
    tipo = "positivo" if es_positivo else "negativo" if es_negativo else "cero"
    print(f"{num:3}: {tipo}")

# EJERCICIO 10: Aplicación práctica
print("\n=== EJERCICIO 10: DESCUENTO APLICADO ===\n")

precio_base = 100
cantidad = 5

subtotal = precio_base * cantidad
descuento = 0

if cantidad >= 10:
    descuento = 0.20
elif cantidad >= 5:
    descuento = 0.10

total_descuento = subtotal * descuento
total_final = subtotal - total_descuento

print(f"Precio unitario: ${precio_base}")
print(f"Cantidad: {cantidad}")
print(f"Subtotal: ${subtotal}")
print(f"Descuento ({descuento*100}%): ${total_descuento:.2f}")
print(f"Total: ${total_final:.2f}")

"""
SALIDA ESPERADA:
=== EJERCICIO 6: POTENCIAS Y RAÍCES ===

Número: 16
Cuadrado: 16² = 256
Raíz cuadrada: √16 = 4.0000

=== EJERCICIO 7: VALIDACIÓN ===

Edad: 25
¿Puede votar (>=18)? True
¿Puede conducir (>=16)? True
¿Puede trabajar (>=14)? True

¿Solicitante válido para préstamo? True

...
"""
