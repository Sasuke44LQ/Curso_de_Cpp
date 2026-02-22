"""
TEMA 6: CADENAS DE CARACTERES - EJERCICIO 1 A 10
=================================================
Ejercicios 1-10 de Tema 6 (Strings)
"""

# EJERCICIO 1: Métodos básicos de string
print("=== EJERCICIO 1: MÉTODOS BÁSICOS ===\n")

texto = "Python"
print(f"Texto: '{texto}'")
print(f"Longitud: {len(texto)}")
print(f"Mayúsculas: {texto.upper()}")
print(f"Minúsculas: {texto.lower()}")
print(f"Primera letra mayúscula: {texto.capitalize()}")

# EJERCICIO 2: Búsqueda en strings
print("\n=== EJERCICIO 2: BÚSQUEDA ===\n")

texto = "Hola Mundo"
print(f"Texto: '{texto}'")
print(f"¿Contiene 'Mundo'? {'Mundo' in texto}")
print(f"Posición de 'Mundo': {texto.find('Mundo')}")
print(f"Conteo de 'o': {texto.count('o')}")

# EJERCICIO 3: Reemplazo
print("\n=== EJERCICIO 3: REEMPLAZO ===\n")

texto = "gato gato gato"
print(f"Original: '{texto}'")
print(f"Replace (1°): '{texto.replace('gato', 'perro', 1)}'")
print(f"Replace (todas): '{texto.replace('gato', 'perro')}'")

# EJERCICIO 4: Split y Join
print("\n=== EJERCICIO 4: SPLIT/JOIN ===\n")

csv = "Juan,25,Madrid"
datos = csv.split(",")
print(f"CSV: '{csv}'")
print(f"Split: {datos}")
print(f"Join: '{' - '.join(datos)}'")

# EJERCICIO 5: Validaciones
print("\n=== EJERCICIO 5: VALIDACIONES ===\n")

texto = "12345"
print(f"'{texto}' es dígito: {texto.isdigit()}")
print(f"'{texto}' es alfabético: {texto.isalpha()}")
print(f"'{texto}' es alfanumérico: {texto.isalnum()}")

# EJERCICIO 6: Palindromo
print("\n=== EJERCICIO 6: PALINDROMO ===\n")

def es_palindromo_str(s):
    limpio = s.lower().replace(" ", "")
    return limpio == limpio[::-1]

palabras = ["radar", "nivel", "hola", "oso"]
for palabra in palabras:
    print(f"'{palabra}': {'Palíndromo' if es_palindromo_str(palabra) else 'No'}")

# EJERCICIO 7: Frecuencia de caracteres
print("\n=== EJERCICIO 7: FRECUENCIA ===\n")

texto = "programacion"
frecuencia = {}
for char in texto:
    frecuencia[char] = frecuencia.get(char, 0) + 1

print(f"Texto: '{texto}'")
for char, count in sorted(frecuencia.items()):
    print(f"  '{char}': {count}")

# EJERCICIO 8: Caso y capitalización
print("\n=== EJERCICIO 8: CAPITALIZACIÓN ===\n")

texto = "hola mundo python"
print(f"Original: '{texto}'")
print(f"Title: '{texto.title()}'")
print(f"Swapcase: '{texto.swapcase()}'")

# EJERCICIO 9: Strip y Lstrip
print("\n=== EJERCICIO 9: TRIM ===\n")

texto = "  Python  "
print(f"Original: '{texto}'")
print(f"Strip: '{texto.strip()}'")
print(f"Lstrip: '{texto.lstrip()}'")
print(f"Rstrip: '{texto.rstrip()}'")

# EJERCICIO 10: Format y f-strings
print("\n=== EJERCICIO 10: FORMATO ===\n")

nombre = "Juan"
edad = 25
ciudad = "Madrid"

print(f"Nombre: {nombre}, Edad: {edad}, Ciudad: {ciudad}")
print("Nombre: {}, Edad: {}, Ciudad: {}".format(nombre, edad, ciudad))
print(f"Información: {nombre} tiene {edad} años y vive en {ciudad}")

"""
SALIDA ESPERADA (Parcial):
=== EJERCICIO 1: MÉTODOS BÁSICOS ===

Texto: 'Python'
Longitud: 6
Mayúsculas: PYTHON
Minúsculas: python
Primera letra mayúscula: Python

...
"""
