"""
TEMA 7: FUNCIONES
EJERCICIO 6: EXPRESIONES LAMBDA
================================

Pequeñas funciones anónimas con lambda
"""

# LAMBDA BÁSICA
print("=== LAMBDA BÁSICA ===\n")

cuadrado = lambda x: x ** 2
triple = lambda x: x * 3

print(f"cuadrado(5) = {cuadrado(5)}")
print(f"triple(7) = {triple(7)}")

# LAMBDA EN LISTAS
print("\n=== LAMBDA EN LISTAS ===\n")

numeros = [1, 2, 3, 4, 5]

cuadrados = list(map(lambda x: x**2, numeros))
pares = list(filter(lambda x: x % 2 == 0, numeros))

print(f"Números: {numeros}")
print(f"Cuadrados: {cuadrados}")
print(f"Pares: {pares}")

# LAMBDA CON SORTED
print("\n=== LAMBDA CON SORTED ===\n")

lista = [(2, "b"), (1, "a"), (3, "c")]
print(f"Original: {lista}")
print(f"Sorted (0°): {sorted(lista)}")
print(f"Sorted key=lambda x: x[1]: {sorted(lista, key=lambda x: x[1])}")

# LAMBDA CON DICCIONARIOS
print("\n=== LAMBDA CON DICCIONARIOS ===\n")

estudiantes = [
    {"nombre": "Juan", "nota": 8.5},
    {"nombre": "Ana", "nota": 9.2},
    {"nombre": "Carlos", "nota": 7.8}
]

print("Original:")
for est in estudiantes:
    print(f"  {est}")

print("\nOrdenado por nota:")
for est in sorted(estudiantes, key=lambda x: x["nota"], reverse=True):
    print(f"  {est}")

# CONDICIONAL EN LAMBDA
print("\n=== CONDICIONAL EN LAMBDA ===\n")

clasificar = lambda x: "Par" if x % 2 == 0 else "Impar"

numeros = [1, 2, 3, 4, 5, 6]
for num in numeros:
    print(f"{num}: {clasificar(num)}")

# LAMBDA CON MÚLTIPLES ARGUMENTOS
print("\n=== MÚLTIPLES ARGUMENTOS ===\n")

suma = lambda a, b: a + b
promedio = lambda a, b: (a + b) / 2

print(f"suma(5, 3) = {suma(5, 3)}")
print(f"promedio(5, 3) = {promedio(5, 3)}")

"""
SALIDA ESPERADA:
=== LAMBDA BÁSICA ===

cuadrado(5) = 25
triple(7) = 21

=== LAMBDA EN LISTAS ===

Números: [1, 2, 3, 4, 5]
Cuadrados: [1, 4, 9, 16, 25]
Pares: [2, 4]
...
"""
