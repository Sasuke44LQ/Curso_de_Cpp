"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 2
==========================================
Entrada y salida de datos con input().

EXPLICACIÓN:
- input(): solicitar datos al usuario
- int() y float(): convertir a números
- f-strings: formatear texto
"""

# Solicitar datos
nombre = input("¿Cuál es tu nombre? ")
edad = int(input("¿Cuántos años tienes? "))
altura = float(input("¿Cuál es tu altura en metros? "))

print("\n=== DATOS PERSONALES ===")
print(f"Nombre: {nombre}")
print(f"Edad: {edad} años")
print(f"Altura: {altura:.2f} metros")

# Cálculos basados en entrada
año_nacimiento = 2026 - edad
print(f"\nNacimiento aproximado: {año_nacimiento}")

if altura >= 1.75:
    print("Estatura: Alto/a")
elif altura >= 1.60:
    print("Estatura: Promedio")
else:
    print("Estatura: Bajo/a")

"""
SALIDA ESPERADA (Ejemplo con entrada "Juan", 25, 1.75):
¿Cuál es tu nombre? Juan
¿Cuántos años tienes? 25
¿Cuál es tu altura en metros? 1.75

=== DATOS PERSONALES ===
Nombre: Juan
Edad: 25 años
Altura: 1.75 metros

Nacimiento aproximado: 2001
Estatura: Alto/a
"""
