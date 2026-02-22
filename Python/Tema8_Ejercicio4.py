"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 4: CONJUNTOS (SETS)
==============================

Crear y operar con conjuntos
"""

# CREAR CONJUNTOS
print("=== CREAR CONJUNTOS ===\n")

conjunto_vacio = set()
conjunto_numeros = {1, 2, 3, 4, 5}
conjunto_desde_lista = set([1, 2, 2, 3, 3, 3])

print(f"Vacío: {conjunto_vacio}")
print(f"Números: {conjunto_numeros}")
print(f"Desde lista: {conjunto_desde_lista}")

# PROPIEDADES
print("\n=== PROPIEDADES ===\n")

lista = [1, 2, 2, 3, 3, 3, 4, 5, 5]
conjunto = set(lista)

print(f"Lista: {lista}")
print(f"Set (sin duplicados): {conjunto}")
print(f"Duplicados eliminados: {len(lista) - len(conjunto)}")

# OPERACIONES BÁSICAS
print("\n=== OPERACIONES ===\n")

conjunto = {1, 2, 3}
print(f"Conjunto: {conjunto}")
print(f"2 en conjunto: {2 in conjunto}")
print(f"4 en conjunto: {4 in conjunto}")

# AGREGAR/REMOVER
print("\n=== AGREGAR/REMOVER ===\n")

conjunto = {1, 2, 3}
print(f"Original: {conjunto}")

conjunto.add(4)
print(f"Después add(4): {conjunto}")

conjunto.remove(2)
print(f"Después remove(2): {conjunto}")

"""
SALIDA ESPERADA:
=== CREAR CONJUNTOS ===

Vacío: set()
Números: {1, 2, 3, 4, 5}
Desde lista: {1, 2, 3}

=== PROPIEDADES ===

Lista: [1, 2, 2, 3, 3, 3, 4, 5, 5]
Set (sin duplicados): {1, 2, 3, 4, 5}
Duplicados eliminados: 4
...
"""
