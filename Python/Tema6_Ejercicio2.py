"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 2: BÚSQUEDA Y REEMPLAZO
==================================

Explora métodos de búsqueda (find, count, startswith, endswith)
y reemplazo en strings
"""

# BÚSQUEDA EN STRINGS
print("=== BÚSQUEDA EN STRINGS ===\n")

texto = "Python es un lenguaje de programación muy poderoso"
palabra = "Python"

print(f"Texto: '{texto}'")
print(f"Palavra: '{palabra}'")
print(f"¿Contiene '{palabra}'? {palabra in texto}")
print(f"Posición de '{palabra}': {texto.find(palabra)}")
print(f"Última posición de 'o': {texto.rfind('o')}")
print(f"Conteo de 'a': {texto.count('a')}")

# VALIDACIONES DE INICIO/FIN
print("\n=== VALIDACIONES DE INICIO/FIN ===\n")

print(f"¿Comienza con 'Python'? {texto.startswith('Python')}")
print(f"¿Termina con 'poderoso'? {texto.endswith('poderoso')}")
print(f"¿Comienza con 'Java'? {texto.startswith('Java')}")

# REEMPLAZO
print("\n=== REEMPLAZO ===\n")

original = "gato gato gato"
print(f"Original: '{original}'")
print(f"Replace (1° ocurrencia): '{original.replace('gato', 'perro', 1)}'")
print(f"Replace (todas): '{original.replace('gato', 'perro')}'")

# BÚSQUEDA CON ÍNDICES
print("\n=== BÚSQUEDA CON ÍNDICES ===\n")

texto = "a-b-c-d-e"
print(f"Texto: '{texto}'")
print(f"Index de 'c': {texto.index('c')}")
print(f"Index de '-': {texto.index('-')}")

# REEMPLAZOS COMUNES
print("\n=== REEMPLAZOS COMUNES ===\n")

csv = "Juan,Ana,Carlos,Maria"
print(f"CSV: '{csv}'")
print(f"Reemplazar ',': '{csv.replace(',', ' | ')}'")

"""
SALIDA ESPERADA:
=== BÚSQUEDA EN STRINGS ===

Texto: 'Python es un lenguaje de programación muy poderoso'
Palavra: 'Python'
¿Contiene 'Python'? True
Posición de 'Python': 0
Última posición de 'o': 50
Conteo de 'a': 4
...
"""
