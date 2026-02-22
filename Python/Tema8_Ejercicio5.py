"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 5: OPERACIONES SET
=============================

Unión, intersección, diferencia
"""

# DEFINIR CONJUNTOS
print("=== CONJUNTOS ===\n")

a = {1, 2, 3, 4, 5}
b = {4, 5, 6, 7, 8}

print(f"A: {a}")
print(f"B: {b}")

# UNIÓN
print("\n=== UNIÓN ===\n")

union = a | b
print(f"A | B: {union}")
print(f"A.union(B): {a.union(b)}")

# INTERSECCIÓN
print("\n=== INTERSECCIÓN ===\n")

intersecion = a & b
print(f"A & B: {intersecion}")
print(f"A.intersection(B): {a.intersection(b)}")

# DIFERENCIA
print("\n=== DIFERENCIA ===\n")

diferencia_a = a - b
diferencia_b = b - a

print(f"A - B: {diferencia_a}")
print(f"B - A: {diferencia_b}")

# DIFERENCIA SIMÉTRICA
print("\n=== DIFERENCIA SIMÉTRICA ===\n")

simetrica = a ^ b
print(f"A ^ B: {simetrica}")
print(f"A.symmetric_difference(B): {a.symmetric_difference(b)}")

# SUBCONJUNTO Y SUPERCONJUNTO
print("\n=== SUB/SUPER CONJUNTO ===\n")

x = {1, 2}
y = {1, 2, 3, 4}

print(f"X: {x}")
print(f"Y: {y}")
print(f"X ⊆ Y: {x.issubset(y)}")
print(f"Y ⊇ X: {y.issuperset(x)}")

# EJEMPLO PRÁCTICO
print("\n=== EJEMPLO PRÁCTICO ===\n")

deportes_juan = {"fútbol", "tenis", "natación"}
deportes_ana = {"tenis", "basketball", "natación"}

print(f"Juan: {deportes_juan}")
print(f"Ana: {deportes_ana}")
print(f"Ambos practican: {deportes_juan & deportes_ana}")
print(f"Alguno practica: {deportes_juan | deportes_ana}")
print(f"Solo Juan: {deportes_juan - deportes_ana}")

"""
SALIDA ESPERADA:
=== CONJUNTOS ===

A: {1, 2, 3, 4, 5}
B: {4, 5, 6, 7, 8}

=== UNIÓN ===

A | B: {1, 2, 3, 4, 5, 6, 7, 8}
A.union(B): {1, 2, 3, 4, 5, 6, 7, 8}

=== INTERSECCIÓN ===

A & B: {4, 5}
A.intersection(B): {4, 5}
...
"""
