"""
TEMA 8: DICCIONARIOS Y CONJUNTOS - EJERCICIO 1 A 10
====================================================
Ejercicios 1-10 de Tema 8 (Diccionarios y Sets)
"""

# EJERCICIO 1: Diccionarios básicos
print("=== EJERCICIO 1: DICCIONARIOS ===\n")

persona = {
    "nombre": "Juan",
    "edad": 25,
    "ciudad": "Madrid"
}

print(f"Persona: {persona}")
print(f"Nombre: {persona['nombre']}")
print(f"Edad: {persona['edad']}")

# EJERCICIO 2: Operaciones en dict
print("\n=== EJERCICIO 2: OPERACIONES ===\n")

dict_vacio = {}
dict_vacio['clave1'] = 'valor1'
dict_vacio['clave2'] = 'valor2'

print(f"Diccionario: {dict_vacio}")
print(f"Claves: {list(dict_vacio.keys())}")
print(f"Valores: {list(dict_vacio.values())}")
print(f"¿Contiene 'clave1'? {'clave1' in dict_vacio}")

# EJERCICIO 3: Iteración en dict
print("\n=== EJERCICIO 3: ITERACIÓN ===\n")

estudiantes = {
    "Juan": 8.5,
    "Ana": 9.2,
    "Carlos": 7.8
}

for nombre, nota in estudiantes.items():
    print(f"{nombre}: {nota}")

# EJERCICIO 4: Sets básicos
print("\n=== EJERCICIO 4: SETS ===\n")

numeros = [1, 2, 2, 3, 3, 3, 4, 5]
conjunto = set(numeros)

print(f"Lista: {numeros}")
print(f"Set (sin duplicados): {conjunto}")

# EJERCICIO 5: Operaciones con sets
print("\n=== EJERCICIO 5: OPERACIONES SET ===\n")

set_a = {1, 2, 3, 4, 5}
set_b = {4, 5, 6, 7, 8}

print(f"A: {set_a}")
print(f"B: {set_b}")
print(f"Unión: {set_a | set_b}")
print(f"Intersección: {set_a & set_b}")
print(f"Diferencia: {set_a - set_b}")

# EJERCICIO 6: Métodos de dict
print("\n=== EJERCICIO 6: MÉTODOS DICT ===\n")

config = {"idioma": "español", "tema": "oscuro"}
print(f"Original: {config}")

config.update({"volumen": 80, "tema": "claro"})
print(f"Después update: {config}")

valor = config.get("idioma", "no encontrado")
print(f"get('idioma'): {valor}")

valor = config.get("pais", "no encontrado")
print(f"get('pais'): {valor}")

# EJERCICIO 7: Dict comprehension
print("\n=== EJERCICIO 7: DICT COMPREHENSION ===\n")

cuadrados = {n: n**2 for n in range(1, 6)}
pares = {n: n*2 for n in range(1, 11) if n % 2 == 0}

print(f"Cuadrados: {cuadrados}")
print(f"Pares x2: {pares}")

# EJERCICIO 8: Conteo de frecuencia
print("\n=== EJERCICIO 8: FRECUENCIA ===\n")

texto = "programacion"
frecuencia = {}

for char in texto:
    frecuencia[char] = frecuencia.get(char, 0) + 1

print(f"Texto: '{texto}'")
print(f"Frecuencia: {frecuencia}")

# EJERCICIO 9: Carrito de compras
print("\n=== EJERCICIO 9: CARRITO ===\n")

carrito = {
    "manzana": {"precio": 2.50, "cantidad": 3},
    "banana": {"precio": 1.50, "cantidad": 2},
    "naranja": {"precio": 3.00, "cantidad": 4}
}

total = 0
for producto, info in carrito.items():
    subtotal = info["precio"] * info["cantidad"]
    total += subtotal
    print(f"{producto}: ${info['precio']} x {info['cantidad']} = ${subtotal:.2f}")

print(f"\nTotal: ${total:.2f}")

# EJERCICIO 10: Merge de diccionarios
print("\n=== EJERCICIO 10: MERGE ===\n")

dict1 = {"a": 1, "b": 2}
dict2 = {"c": 3, "d": 4}

merged = dict1 | dict2
print(f"Dict1: {dict1}")
print(f"Dict2: {dict2}")
print(f"Merged: {merged}")

"""
SALIDA ESPERADA (Parcial):
=== EJERCICIO 1: DICCIONARIOS ===

Persona: {'nombre': 'Juan', 'edad': 25, 'ciudad': 'Madrid'}
Nombre: Juan
Edad: 25

...
"""
