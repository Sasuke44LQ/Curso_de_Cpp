"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 3: ITERACIÓN EN DICCIONARIOS
======================================

Recorrer diccionarios de diferentes formas
"""

# ITERAR SOBRE CLAVES
print("=== ITERAR CLAVES ===\n")

diccionario = {"nombre": "Juan", "edad": 25, "ciudad": "Madrid"}

print("Claves:")
for clave in diccionario:
    print(f"  {clave}")

# ITERAR SOBRE VALORES
print("\n=== ITERAR VALORES ===\n")

print("Valores:")
for valor in diccionario.values():
    print(f"  {valor}")

# ITERAR SOBRE ITEMS
print("\n=== ITERAR ITEMS ===\n")

print("Items:")
for clave, valor in diccionario.items():
    print(f"  {clave}: {valor}")

# ESTUDIANTES Y CALIFICACIONES
print("\n=== ESTUDIANTES ===\n")

estudiantes = {
    "Juan": 8.5,
    "Ana": 9.2,
    "Carlos": 7.8,
    "Maria": 9.5
}

print("Calificaciones:")
for nombre, nota in estudiantes.items():
    estado = "Aprobado" if nota >= 7 else "Reprobado"
    print(f"  {nombre}: {nota} ({estado})")

# BÚSQUEDA Y FILTRADO
print("\n=== BÚSQUEDA ===\n")

aprobados = {k: v for k, v in estudiantes.items() if v >= 8}
print(f"Con nota >= 8: {aprobados}")

# TRANSFORMACIÓN
print("\n=== TRANSFORMACIÓN ===\n")

calificaciones = {k: v*10 for k, v in estudiantes.items()}
print(f"Calificaciones x10: {calificaciones}")

"""
SALIDA ESPERADA:
=== ITERAR CLAVES ===

Claves:
  nombre
  edad
  ciudad

=== ITERAR VALORES ===

Valores:
  Juan
  25
  Madrid

=== ITERAR ITEMS ===

Items:
  nombre: Juan
  edad: 25
  ciudad: Madrid
...
"""
