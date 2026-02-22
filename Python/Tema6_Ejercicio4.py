"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 4: SPLIT Y JOIN
===========================

Separa y une strings usando split() y join()
"""

# SPLIT BÁSICO
print("=== SPLIT BÁSICO ===\n")

csv = "Juan,25,Madrid,Ingeniero"
datos = csv.split(",")

print(f"CSV: '{csv}'")
print(f"Split por ',': {datos}")
print(f"Nombre: {datos[0]}, Edad: {datos[1]}")

# SPLIT CON LIMITE
print("\n=== SPLIT CON LIMITE ===\n")

frase = "a-b-c-d-e"
print(f"Texto: '{frase}'")
print(f"split('-'): {frase.split('-')}")
print(f"split('-', 2): {frase.split('-', 2)}")

# SPLIT POR ESPACIOS
print("\n=== SPLIT POR ESPACIOS ===\n")

oracion = "Python   es   un   lenguaje   poderoso"
palabras = oracion.split()

print(f"Oración: '{oracion}'")
print(f"split(): {palabras}")
print(f"Cantidad de palabras: {len(palabras)}")

# JOIN
print("\n=== JOIN ===\n")

lista = ["Juan", "Ana", "Carlos"]
resultado = ", ".join(lista)

print(f"Lista: {lista}")
print(f"', '.join(): '{resultado}'")
print(f"' - '.join(): '{' - '.join(lista)}'")

# CONVERSIÓN LISTA A STRING
print("\n=== CONVERSIÓN ===\n")

numeros = [1, 2, 3, 4, 5]
print(f"Lista números: {numeros}")
print(f"','.join(map(str, ...)): '{''.join(map(str, numeros))}'")
print(f"''.join(str(n)+' ' for n in ...): '{' '.join(str(n) for n in numeros)}'")

"""
SALIDA ESPERADA:
=== SPLIT BÁSICO ===

CSV: 'Juan,25,Madrid,Ingeniero'
Split por ',': ['Juan', '25', 'Madrid', 'Ingeniero']
Nombre: Juan, Edad: 25
...
"""
