"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 6: PALÍNDROMOS
=========================

Detecta y crea palíndromos
"""

# PALÍNDROMO SIMPLE
print("=== PALÍNDROMO SIMPLE ===\n")

def es_palindromo(s):
    limpio = s.lower().replace(" ", "")
    return limpio == limpio[::-1]

palabras = ["radar", "nivel", "oso", "hola", "anilina", "solos"]

for palabra in palabras:
    es_pal = es_palindromo(palabra)
    print(f"'{palabra}': {'✓ Palíndromo' if es_pal else '✗ No palíndromo'}")

# PALÍNDROMO CON PUNTUACIÓN
print("\n=== CON PUNTUACIÓN ===\n")

def es_palindromo_completo(s):
    limpio = ''.join(c for c in s if c.isalnum()).lower()
    return limpio == limpio[::-1]

frases = [
    "A man a plan a canal Panama",
    "Madam in Eden I made mad",
    "Hola mundo"
]

for frase in frases:
    es_pal = es_palindromo_completo(frase)
    print(f"'{frase}': {'Palíndromo' if es_pal else 'No'}")

# NÚMEROS PALÍNDROMO
print("\n=== NÚMEROS PALÍNDROMO ===\n")

def es_numero_palindromo(n):
    s = str(n)
    return s == s[::-1]

numeros = [121, 123, 1001, 1234, 9009]

for num in numeros:
    es_pal = es_numero_palindromo(num)
    print(f"{num}: {'Palíndromo' if es_pal else 'No'}")

# CREAR PALÍNDROMOS
print("\n=== CREAR PALÍNDROMOS ===\n")

def crear_palindromo(s):
    return s + s[::-1]

def crear_palindromo_espejo(s):
    return s + s[-2::-1]

textos = ["abc", "hola", "ab"]

for texto in textos:
    p1 = crear_palindromo(texto)
    p2 = crear_palindromo_espejo(texto)
    print(f"'{texto}':")
    print(f"  Forma 1: '{p1}' → {es_palindromo(p1)}")
    print(f"  Forma 2: '{p2}' → {es_palindromo(p2)}")

"""
SALIDA ESPERADA:
=== PALÍNDROMO SIMPLE ===

'radar': ✓ Palíndromo
'nivel': ✓ Palíndromo
'oso': ✓ Palíndromo
'hola': ✗ No palíndromo
...
"""
