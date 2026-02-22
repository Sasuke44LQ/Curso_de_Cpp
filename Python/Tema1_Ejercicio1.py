"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 1
==========================================
Operaciones aritméticas básicas.

EXPLICACIÓN:
- Función print() para salida
- Variables y tipos de datos
- Operaciones: suma, resta, multiplicación, división
"""

# Números enteros
num1 = 10
num2 = 3

print("=== OPERACIONES ARITMÉTICAS ===")
print(f"Números: {num1} y {num2}")
print(f"\nSuma: {num1} + {num2} = {num1 + num2}")
print(f"Resta: {num1} - {num2} = {num1 - num2}")
print(f"Multiplicación: {num1} * {num2} = {num1 * num2}")
print(f"División: {num1} / {num2} = {num1 / num2:.2f}")
print(f"División entera: {num1} // {num2} = {num1 // num2}")
print(f"Residuo: {num1} % {num2} = {num1 % num2}")
print(f"Potencia: {num1} ** {num2} = {num1 ** num2}")

# Variables flotantes
pi = 3.14159
radio = 5

area = pi * radio ** 2
print(f"\n=== CÁLCULO DE ÁREA ===")
print(f"Área de círculo con radio {radio}: {area:.2f}")

"""
SALIDA ESPERADA:
=== OPERACIONES ARITMÉTICAS ===
Números: 10 y 3

Suma: 10 + 3 = 13
Resta: 10 - 3 = 7
Multiplicación: 10 * 3 = 30
División: 10 / 3 = 3.33
División entera: 10 // 3 = 3
Residuo: 10 % 3 = 1
Potencia: 10 ** 3 = 1000

=== CÁLCULO DE ÁREA ===
Área de círculo con radio 5: 78.54
"""
