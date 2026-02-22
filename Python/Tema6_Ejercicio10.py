"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 10: PROCESAMIENTO AVANZADO
=====================================

Slicing, reverse, procesamiento complejo
"""

# SLICING BÁSICO
print("=== SLICING ===\n")

texto = "Python"

print(f"Texto: '{texto}'")
print(f"[0]: '{texto[0]}'")
print(f"[1:4]: '{texto[1:4]}'")
print(f"[::2]: '{texto[::2]}'")
print(f"[::-1]: '{texto[::-1]}'")

# REVERSE
print("\n=== REVERSE ===\n")

numeros = "0123456789"

print(f"Original: '{numeros}'")
print(f"Invertido: '{numeros[::-1]}'")
print(f"Cada 2: '{numeros[::2]}'")
print(f"Inverso cada 2: '{numeros[::-2]}'")

# EXTRACCIÓN
print("\n=== EXTRACCIÓN ===\n")

url = "https://www.google.com/search"

print(f"URL: '{url}'")
print(f"Protocolo: '{url.split('://')[0]}'")
print(f"Dominio: '{url.split('/')[2]}'")

# BÚSQUEDA Y EXTRACCIÓN
print("\n=== BÚSQUEDA Y EXTRACCIÓN ===\n")

email = "usuario@gmail.com"
nombre, dominio = email.split("@")

print(f"Email: '{email}'")
print(f"Usuario: '{nombre}'")
print(f"Dominio: '{dominio}'")

# PROCESAMIENTO DE LÍNEAS
print("\n=== PROCESAMIENTO DE LÍNEAS ===\n")

datos_csv = "Juan,25,Madrid\nAna,30,Barcelona\nCarlos,28,Valencia"

for linea in datos_csv.split("\n"):
    campos = linea.split(",")
    print(f"{campos[0]}: {campos[1]} años, {campos[2]}")

# TRANSFORMACIÓN COMPLEJA
print("\n=== TRANSFORMACIÓN COMPLEJA ===\n")

contraseña = "12345"
def enmascarar(s):
    return "*" * len(s)

texto = "Mi contraseña es 12345"
print(f"Original: {texto}")
texto_enmascarado = texto.replace("12345", enmascarar("12345"))
print(f"Enmascarado: {texto_enmascarado}")

"""
SALIDA ESPERADA:
=== SLICING ===

Texto: 'Python'
[0]: 'P'
[1:4]: 'yth'
[::2]: 'Pto'
[::-1]: 'nohtyP'

=== REVERSE ===

Original: '0123456789'
Invertido: '9876543210'
Cada 2: '02468'
...
"""
