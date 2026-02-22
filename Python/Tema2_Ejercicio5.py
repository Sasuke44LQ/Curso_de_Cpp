"""
TEMA 2: OPERADORES - EJERCICIO 5
=================================
Precedencia y asociatividad de operadores.

EXPLICACIÓN:
- Orden de evaluación
- Uso de paréntesis
- Ejemplos de precedencia
"""

print("=== PRECEDENCIA DE OPERADORES ===\n")

resultado1 = 2 + 3 * 4
print(f"2 + 3 * 4 = {resultado1}")
print(f"  (La multiplicación se ejecuta primero)")

resultado2 = (2 + 3) * 4
print(f"\n(2 + 3) * 4 = {resultado2}")
print(f"  (Los paréntesis cambian el orden)")

print("\n=== OPERADORES LÓGICOS Y COMPARATIVOS ===\n")

a, b, c = 5, 10, 15

resultado = a < b < c
print(f"a < b < c = {a} < {b} < {c}")
print(f"Resultado: {resultado}")

resultado = a > 0 and b < 20 or c > 20
print(f"{a} > 0 and {b} < 20 or {c} > 20")
print(f"Resultado: {resultado}")

print("\n=== EXPRESIONES MIXTAS ===\n")

x = 10
y = 3

resultado = x ** 2 + y * 4 - x // y
print(f"x={x}, y={y}")
print(f"x**2 + y*4 - x//y = {x}**2 + {y}*4 - {x}//{y}")
print(f"= {x**2} + {y*4} - {x//y}")
print(f"= {resultado}")

# Orden de evaluación
print("\n=== CORTOCIRCUITO (Short-circuit) ===\n")

def funcion_verdadera():
    print("  - funcion_verdadera() ejecutada")
    return True

def funcion_falsa():
    print("  - funcion_falsa() ejecutada")
    return False

print("True or funcion_falsa():")
resultado = True or funcion_falsa()
print(f"Resultado: {resultado}\n")

print("False or funcion_verdadera():")
resultado = False or funcion_verdadera()
print(f"Resultado: {resultado}")

"""
SALIDA ESPERADA:
=== PRECEDENCIA DE OPERADORES ===

2 + 3 * 4 = 14
  (La multiplicación se ejecuta primero)

(2 + 3) * 4 = 20
  (Los paréntesis cambian el orden)

=== OPERADORES LÓGICOS Y COMPARATIVOS ===

a < b < c = 5 < 10 < 15
Resultado: True

5 > 0 and 10 < 20 or 15 > 20
Resultado: True

=== EXPRESIONES MIXTAS ===

x=10, y=3
x**2 + y*4 - x//y = 10**2 + 3*4 - 10//3
= 100 + 12 - 3
= 109

=== CORTOCIRCUITO (Short-circuit) ===

True or funcion_falsa():
Resultado: True

False or funcion_verdadera():
  - funcion_verdadera() ejecutada
Resultado: True
"""
