"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 7: FRECUENCIA DE CARACTERES
======================================

Cuenta la frecuencia de caracteres en strings
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

# ORDENAR POR FRECUENCIA
print("\n=== ORDENAR POR FRECUENCIA ===\n")

texto = "mississippi"
frecuencia = {}

for char in texto:
    frecuencia[char] = frecuencia.get(char, 0) + 1

print(f"Texto: '{texto}'")
print("Ordenado por frecuencia:")
for char, count in sorted(frecuencia.items(), key=lambda x: x[1], reverse=True):
    print(f"  '{char}': {count}")

# CARÁCTER MÁS FRECUENTE
print("\n=== CARÁCTER MÁS FRECUENTE ===\n")

def char_mas_frecuente(s):
    s = s.lower().replace(" ", "")
    frecuencia = {}
    for c in s:
        frecuencia[c] = frecuencia.get(c, 0) + 1
    return max(frecuencia, key=frecuencia.get)

textos = ["hola mundo", "python", "aabbcc"]
for texto in textos:
    mas_freq = char_mas_frecuente(texto)
    print(f"'{texto}' → '{mas_freq}'")

# ANÁLISIS DE PALABRA
print("\n=== ANÁLISIS DE PALABRA ===\n")

palabra = "anagrama"
frecuencia = {}

for char in palabra:
    frecuencia[char] = frecuencia.get(char, 0) + 1

print(f"Palabra: '{palabra}'")
print(f"Caracteres únicos: {len(frecuencia)}")
print(f"Caracteres repetidos: {sum(1 for c in frecuencia.values() if c > 1)}")

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
