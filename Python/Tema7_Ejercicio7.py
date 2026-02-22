"""
TEMA 7: FUNCIONES
EJERCICIO 7: MAP, FILTER, REDUCE
=================================

Funciones de orden superior en Python
"""

# MAP (APLICAR FUNCIÓN A CADA ELEMENTO)
print("=== MAP ===\n")

numeros = [1, 2, 3, 4, 5]

cuadrados = list(map(lambda x: x**2, numeros))
dobles = list(map(lambda x: x*2, numeros))

print(f"Números: {numeros}")
print(f"Cuadrados: {cuadrados}")
print(f"Dobles: {dobles}")

# FILTER (SELECCIONAR ELEMENTOS)
print("\n=== FILTER ===\n")

pares = list(filter(lambda x: x % 2 == 0, numeros))
mayores_3 = list(filter(lambda x: x > 3, numeros))
menores_4 = list(filter(lambda x: x < 4, numeros))

print(f"Números: {numeros}")
print(f"Pares: {pares}")
print(f"Mayor a 3: {mayores_3}")
print(f"Menor a 4: {menores_4}")

# REDUCE (ACUMULAR VALORES)
print("\n=== REDUCE ===\n")

from functools import reduce

suma = reduce(lambda a, b: a + b, numeros)
multiplicacion = reduce(lambda a, b: a * b, numeros)

print(f"Números: {numeros}")
print(f"Suma (reduce): {suma}")
print(f"Multiplicación (reduce): {multiplicacion}")

# COMBINACIÓN
print("\n=== COMBINACIÓN ===\n")

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Pares, luego doblar, luego sumar
pares = filter(lambda x: x % 2 == 0, numeros)
dobles = map(lambda x: x * 2, pares)
suma = reduce(lambda a, b: a + b, dobles)

print(f"Números: {numeros}")
print(f"Resultado (pares -> dobles -> suma): {suma}")

# CON DICCIONARIOS
print("\n=== CON DICCIONARIOS ===\n")

empleados = [
    {"nombre": "Juan", "salario": 2000},
    {"nombre": "Ana", "salario": 2500},
    {"nombre": "Carlos", "salario": 1800}
]

nombres = list(map(lambda e: e["nombre"], empleados))
premios = list(map(lambda e: {"nombre": e["nombre"], "premio": e["salario"] * 0.1}, empleados))
suma_salarios = reduce(lambda a, b: a + b["salario"], empleados, 0)

print(f"Nombres: {nombres}")
print(f"Con premios: {premios}")
print(f"Total salarios: {suma_salarios}")

"""
SALIDA ESPERADA:
=== MAP ===

Números: [1, 2, 3, 4, 5]
Cuadrados: [1, 4, 9, 16, 25]
Dobles: [2, 4, 6, 8, 10]

=== FILTER ===

Números: [1, 2, 3, 4, 5]
Pares: [2, 4]
Mayor a 3: [4, 5]
Menor a 4: [1, 2, 3]
...
"""
