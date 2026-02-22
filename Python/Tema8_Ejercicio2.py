"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 2: OPERACIONES EN DICCIONARIOS
=========================================

Crear, modificar y manipular diccionarios
"""

# CREAR DICCIONARIOS
print("=== CREAR DICCIONARIOS ===\n")

dict_vacio = {}
dict_valores = {"a": 1, "b": 2, "c": 3}
dict_constructor = dict(x=10, y=20)

print(f"Vacío: {dict_vacio}")
print(f"Valores: {dict_valores}")
print(f"Constructor: {dict_constructor}")

# AGREGAR Y MODIFICAR
print("\n=== AGREGAR/MODIFICAR ===\n")

diccionario = {"nombre": "Juan", "edad": 25}
print(f"Original: {diccionario}")

diccionario["ciudad"] = "Madrid"
diccionario["edad"] = 26

print(f"Modificado: {diccionario}")

# ACCESO SEGURO
print("\n=== ACCESO SEGURO ===\n")

diccionario = {"nombre": "Ana", "edad": 30}

print(f"nombre: {diccionario.get('nombre')}")
print(f"ciudad: {diccionario.get('ciudad', 'No especificada')}")

# ELIMINAR ELEMENTOS
print("\n=== ELIMINAR ===\n")

diccionario = {"a": 1, "b": 2, "c": 3}
print(f"Original: {diccionario}")

del diccionario["b"]
print(f"Después del: {diccionario}")

valor = diccionario.pop("c", "No encontrado")
print(f"Pop 'c': {valor}, Diccionario: {diccionario}")

# CLAVES, VALORES, ITEMS
print("\n=== KEYS, VALUES, ITEMS ===\n")

persona = {"nombre": "Carlos", "edad": 28, "ciudad": "Barcelona"}

print(f"Diccionario: {persona}")
print(f"Claves: {list(persona.keys())}")
print(f"Valores: {list(persona.values())}")
print(f"Items: {list(persona.items())}")

# ACTUALIZAR
print("\n=== ACTUALIZAR ===\n")

dict1 = {"a": 1, "b": 2}
dict2 = {"b": 20, "c": 30}

dict1.update(dict2)
print(f"Después update: {dict1}")

"""
SALIDA ESPERADA:
=== CREAR DICCIONARIOS ===

Vacío: {}
Valores: {'a': 1, 'b': 2, 'c': 3}
Constructor: {'x': 10, 'y': 20}

=== AGREGAR/MODIFICAR ===

Original: {'nombre': 'Juan', 'edad': 25}
Modificado: {'nombre': 'Juan', 'edad': 26, 'ciudad': 'Madrid'}
...
"""
