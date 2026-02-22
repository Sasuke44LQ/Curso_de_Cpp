"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 3: MÉTODOS DE CAPITALIZACIÓN
========================================

Explora métodos: upper, lower, capitalize, title, swapcase
"""

# CONVERSIÓN DE MAYÚSCULAS/MINÚSCULAS
print("=== CONVERSIÓN DE CASOS ===\n")

texto = "Python en Python"

print(f"Original: '{texto}'")
print(f"upper(): '{texto.upper()}'")
print(f"lower(): '{texto.lower()}'")
print(f"capitalize(): '{texto.capitalize()}'")
print(f"title(): '{texto.title()}'")
print(f"swapcase(): '{texto.swapcase()}'")

# VALIDACIÓN DE CASO
print("\n=== VALIDACIÓN DE CASO ===\n")

print(f"'PYTHON'.isupper(): {'PYTHON'.isupper()}")
print(f"'python'.islower(): {'python'.islower()}")
print(f"'Python'.istitle(): {'Python Design Patterns'.istitle()}")

# CONVERSIONES PRÁCTICAS
print("\n=== CONVERSIONES PRÁCTICAS ===\n")

nombre = "juan perez"
print(f"Nombre: '{nombre}'")
print(f"Primer nombre mayúscula: '{nombre.capitalize()}'")
print(f"Cada palabra mayúscula: '{nombre.title()}'")

email = "JuanPerez@Gmail.Com"
print(f"\nEmail: '{email}'")
print(f"Email normalizado: '{email.lower()}'")

"""
SALIDA ESPERADA:
=== CONVERSIÓN DE CASOS ===

Original: 'Python en Python'
upper(): 'PYTHON EN PYTHON'
lower(): 'python en python'
capitalize(): 'Python en python'
title(): 'Python En Python'
swapcase(): 'pYTHON EN pYTHON'
...
"""
