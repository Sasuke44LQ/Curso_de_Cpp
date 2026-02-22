"""
TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 1
==============================================
Bucle while básico.

EXPLICACIÓN:
- while: repetición condicional
- Condición de salida
- Variables acumuladoras
"""

print("=== WHILE BÁSICO ===\n")

contador = 1
while contador <= 5:
    print(f"Iteración {contador}")
    contador += 1

print("\n=== SUMA ACUMULATIVA ===\n")

numero = 1
suma = 0

while numero <= 10:
    suma += numero
    numero += 1

print(f"Suma de 1 a 10: {suma}")

print("\n=== TABLA DE POTENCIAS ===\n")

base = 2
exponente = 0

while exponente <= 5:
    resultado = base ** exponente
    print(f"2^{exponente} = {resultado}")
    exponente += 1

print("\n=== CONTAR HACIA ATRÁS ===\n")

numero = 5
while numero >= 1:
    print(numero, end=" ")
    numero -= 1

print("\n")

"""
SALIDA ESPERADA:
=== WHILE BÁSICO ===

Iteración 1
Iteración 2
Iteración 3
Iteración 4
Iteración 5

=== SUMA ACUMULATIVA ===

Suma de 1 a 10: 55

=== TABLA DE POTENCIAS ===

2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32

=== CONTAR HACIA ATRÁS ===

5 4 3 2 1
"""
