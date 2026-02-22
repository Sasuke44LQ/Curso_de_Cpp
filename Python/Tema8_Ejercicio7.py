"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 7: CONTEO DE FRECUENCIA
==================================

Usar diccionarios para contar ocurrencias
"""

# FRECUENCIA BÁSICA
print("=== FRECUENCIA BÁSICA ===\n")

texto = "programacion"
frecuencia = {}

for char in texto:
    frecuencia[char] = frecuencia.get(char, 0) + 1

print(f"Texto: '{texto}'")
print("Frecuencia:")
for char in sorted(frecuencia):
    print(f"  '{char}': {frecuencia[char]}")

# CON COLLECTIONS.COUNTER
print("\n=== COLLECTIONS.COUNTER ===\n")

from collections import Counter

frecuencia = Counter(texto)
print(f"Texto: '{texto}'")
print(f"Counter: {frecuencia}")
print(f"Más comunes: {frecuencia.most_common(3)}")

# PALABRAS
print("\n=== FRECUENCIA DE PALABRAS ===\n")

oracion = "el gato y el perro y el pajaro"
palabras = oracion.split()
frecuencia = Counter(palabras)

print(f"Oración: '{oracion}'")
for palabra, count in frecuencia.most_common():
    print(f"  '{palabra}': {count}")

# CONTEO MANUAL
print("\n=== CONTEO MANUAL ===\n")

numeros = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
conteo = {}

for num in numeros:
    conteo[num] = conteo.get(num, 0) + 1

print(f"Números: {numeros}")
print(f"Frecuencia: {conteo}")

# ANÁLISIS DE DATOS
print("\n=== ANÁLISIS ===\n")

datos = ["a", "b", "a", "c", "b", "a"]
frecuencia = Counter(datos)

print(f"Datos: {datos}")
print(f"Total: {len(datos)}")
print(f"Únicos: {len(frecuencia)}")
print(f"Más frecuente: {frecuencia.most_common(1)[0][0]}")

"""
SALIDA ESPERADA:
=== FRECUENCIA BÁSICA ===

Texto: 'programacion'
Frecuencia:
  'a': 2
  'c': 1
  'g': 1
  'i': 1
  'm': 1
  'o': 2
  'p': 1
  'r': 1

...
"""
