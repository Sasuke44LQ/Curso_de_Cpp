"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 6: DICT COMPREHENSION
================================

Crear diccionarios con comprensión
"""

# DICT COMPREHENSION BÁSICO
print("=== DICT COMPREHENSION ===\n")

cuadrados = {n: n**2 for n in range(1, 6)}
print(f"Cuadrados: {cuadrados}")

pares = {n: n*2 for n in range(1, 11) if n % 2 == 0}
print(f"Pares x2: {pares}")

# CONVERSIÓN DE LISTA A DICT
print("\n=== CONVERSIÓN ===\n")

lista = [("a", 1), ("b", 2), ("c", 3)]
diccionario = {k: v for k, v in lista}
print(f"Lista: {lista}")
print(f"Dict: {diccionario}")

# INVERTIR CLAVES Y VALORES
print("\n=== INVERTIR ===\n")

original = {"nombre": "Juan", "edad": 25}
invertido = {v: k for k, v in original.items()}

print(f"Original: {original}")
print(f"Invertido: {invertido}")

# AGRUPAR VALORES
print("\n=== AGRUPAR ===\n")

palabras = ["gato", "gorro", "casa", "guitarra", "gusano"]
agrupadas = {primera_letra: [p for p in palabras if p[0] == primera_letra] 
             for primera_letra in "gc"}

print(f"Palabras: {palabras}")
print(f"Agrupadas: {agrupadas}")

# TRANSFORMACIÓN CONDICIONAL
print("\n=== CONDICIONAL ===\n")

numeros = [1, 2, 3, 4, 5, 6]
clasificacion = {n: ("par" if n % 2 == 0 else "impar") for n in numeros}

print(f"Números: {numeros}")
print(f"Clasificación: {clasificacion}")

"""
SALIDA ESPERADA:
=== DICT COMPREHENSION ===

Cuadrados: {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}
Pares x2: {2: 4, 4: 8, 6: 12, 8: 16, 10: 20}

=== CONVERSIÓN ===

Lista: [('a', 1), ('b', 2), ('c', 3)]
Dict: {'a': 1, 'b': 2, 'c': 3}
...
"""
