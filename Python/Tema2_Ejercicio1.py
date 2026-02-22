"""
TEMA 2: OPERADORES - EJERCICIO 1
=================================
Operadores relacionales y lógicos.

EXPLICACIÓN:
- Comparadores: ==, !=, <, >, <=, >=
- Lógicos: and, or, not
- Resultados booleanos
"""

print("=== OPERADORES RELACIONALES ===\n")

a = 10
b = 5

print(f"a = {a}, b = {b}")
print(f"a == b: {a == b}")
print(f"a != b: {a != b}")
print(f"a > b: {a > b}")
print(f"a < b: {a < b}")
print(f"a >= b: {a >= b}")
print(f"a <= b: {a <= b}")

print("\n=== OPERADORES LÓGICOS ===\n")

x = True
y = False

print(f"x = {x}, y = {y}")
print(f"x and y: {x and y}")
print(f"x or y: {x or y}")
print(f"not x: {not x}")

print("\n=== EXPRESIONES COMPLEJAS ===\n")

edad = 25
ingresos = 3000

es_mayor = edad >= 18
tiene_dinero = ingresos > 2000
puede_comprar = es_mayor and tiene_dinero

print(f"Edad: {edad}, Ingresos: ${ingresos}")
print(f"Es mayor de edad: {es_mayor}")
print(f"Tiene suficientes ingresos: {tiene_dinero}")
print(f"Puede comprar casa: {puede_comprar}")

"""
SALIDA ESPERADA:
=== OPERADORES RELACIONALES ===

a = 10, b = 5
a == b: False
a != b: True
a > b: True
a < b: False
a >= b: True
a <= b: False

=== OPERADORES LÓGICOS ===

x = True, y = False
x and y: False
x or y: True
not x: False

=== EXPRESIONES COMPLEJAS ===

Edad: 25, Ingresos: $3000
Es mayor de edad: True
Tiene suficientes ingresos: True
Puede comprar casa: True
"""
