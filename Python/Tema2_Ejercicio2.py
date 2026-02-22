"""
TEMA 2: OPERADORES - EJERCICIO 2
=================================
Operadores aritméticos avanzados.

EXPLICACIÓN:
- Operadores: +, -, *, /, //, %, **
- Operaciones con decimales
- Operaciones modulares
"""

print("=== OPERADORES ARITMÉTICOS ===\n")

num1 = 17
num2 = 5

print(f"num1 = {num1}, num2 = {num2}")
print(f"Suma: {num1} + {num2} = {num1 + num2}")
print(f"Resta: {num1} - {num2} = {num1 - num2}")
print(f"Multiplicación: {num1} * {num2} = {num1 * num2}")
print(f"División: {num1} / {num2} = {num1 / num2:.4f}")
print(f"División entera: {num1} // {num2} = {num1 // num2}")
print(f"Módulo: {num1} % {num2} = {num1 % num2}")
print(f"Potencia: {num1} ** {num2} = {num1 ** num2}")

print("\n=== OPERADORES COMPUESTOS ===\n")

numero = 10
print(f"Número inicial: {numero}")

numero += 5
print(f"Después de += 5: {numero}")

numero -= 3
print(f"Después de -= 3: {numero}")

numero *= 2
print(f"Después de *= 2: {numero}")

numero //= 4
print(f"Después de //= 4: {numero}")

print("\n=== CÁLCULOS ESPECIALES ===\n")

# Máximo Común Divisor (MCD)
def mcd(a, b):
    while b:
        a, b = b, a % b
    return a

print(f"MCD(48, 18) = {mcd(48, 18)}")

# Mínimo Común Múltiplo (MCM)
def mcm(a, b):
    return (a * b) // mcd(a, b)

print(f"MCM(48, 18) = {mcm(48, 18)}")

"""
SALIDA ESPERADA:
=== OPERADORES ARITMÉTICOS ===

num1 = 17, num2 = 5
Suma: 17 + 5 = 22
Resta: 17 - 5 = 12
Multiplicación: 17 * 5 = 85
División: 17 / 5 = 3.4000
División entera: 17 // 5 = 3
Módulo: 17 % 5 = 2
Potencia: 17 ** 5 = 1419857

=== OPERADORES COMPUESTOS ===

Número inicial: 10
Después de += 5: 15
Después de -= 3: 12
Después de *= 2: 24
Después de //= 4: 6

=== CÁLCULOS ESPECIALES ===

MCD(48, 18) = 6
MCM(48, 18) = 144
"""
