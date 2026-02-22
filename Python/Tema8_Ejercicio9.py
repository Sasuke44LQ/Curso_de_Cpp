"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 9: MERGE DE DICCIONARIOS
===================================

Combinar y unificar diccionarios
"""

# MERGE BÁSICO
print("=== MERGE BÁSICO ===\n")

dict1 = {"a": 1, "b": 2}
dict2 = {"c": 3, "d": 4}

merged = dict1 | dict2
print(f"Dict1: {dict1}")
print(f"Dict2: {dict2}")
print(f"Merged: {merged}")

# UPDATE
print("\n=== UPDATE ===\n")

dict1 = {"a": 1, "b": 2}
dict2 = {"b": 20, "c": 30}

print(f"Original: {dict1}")
dict1.update(dict2)
print(f"Después update: {dict1}")

# MERGE CON CONFLICTOS
print("\n=== CON CONFLICTOS ===\n")

dict1 = {"nombre": "Juan", "edad": 25}
dict2 = {"edad": 26, "ciudad": "Madrid"}

merged = {**dict1, **dict2}
print(f"Dict1: {dict1}")
print(f"Dict2: {dict2}")
print(f"Merged (prioridad dict2): {merged}")

# MERGE RECURSIVO
print("\n=== MERGE RECURSIVO ===\n")

def merge_recursivo(d1, d2):
    merged = d1.copy()
    for k, v in d2.items():
        if k in merged and isinstance(merged[k], dict) and isinstance(v, dict):
            merged[k] = merge_recursivo(merged[k], v)
        else:
            merged[k] = v
    return merged

config1 = {"bd": {"host": "localhost", "puerto": 5432}}
config2 = {"bd": {"usuario": "admin"}}

resultado = merge_recursivo(config1, config2)
print(f"Config1: {config1}")
print(f"Config2: {config2}")
print(f"Merged: {resultado}")

# COMBINAR MÚLTIPLES
print("\n=== MÚLTIPLES DICTS ===\n")

dicts = [
    {"a": 1, "b": 2},
    {"b": 20, "c": 30},
    {"c": 300, "d": 400}
]

resultado = {}
for d in dicts:
    resultado.update(d)

print(f"Resultado: {resultado}")

"""
SALIDA ESPERADA:
=== MERGE BÁSICO ===

Dict1: {'a': 1, 'b': 2}
Dict2: {'c': 3, 'd': 4}
Merged: {'a': 1, 'b': 2, 'c': 3, 'd': 4}

=== UPDATE ===

Original: {'a': 1, 'b': 2}
Después update: {'a': 1, 'b': 2, 'c': 30}
...
"""
