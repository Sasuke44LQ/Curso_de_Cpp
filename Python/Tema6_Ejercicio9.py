"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 9: FORMATO DE STRINGS
================================

Usa .format(), f-strings, % formatting
"""

# F-STRINGS (Python 3.6+)
print("=== F-STRINGS ===\n")

nombre = "Juan"
edad = 25
ciudad = "Madrid"

print(f"Hola {nombre}")
print(f"Tengo {edad} años")
print(f"{nombre} vive en {ciudad}")

# EXPRESIONES EN F-STRINGS
print("\n=== EXPRESIONES EN F-STRINGS ===\n")

x = 10
y = 20

print(f"{x} + {y} = {x + y}")
print(f"{x} * {y} = {x * y}")
print(f"Promedio: {(x + y) / 2}")

# .FORMAT()
print("\n=== .FORMAT() ===\n")

print("Hola {}".format(nombre))
print("{} tiene {} años".format(nombre, edad))
print("{0} vive en {1} y tiene {2} años".format(nombre, ciudad, edad))

# ALINEACIÓN Y RELLENO
print("\n=== ALINEACIÓN ===\n")

print(f"'{nombre:<10}' (izquierda)")
print(f"'{nombre:>10}' (derecha)")
print(f"'{nombre:^10}' (centro)")

# DECIMALES
print("\n=== DECIMALES ===\n")

pi = 3.14159265
precio = 19.999

print(f"π = {pi:.2f}")
print(f"π = {pi:.4f}")
print(f"Precio: ${precio:.2f}")

# PORCENTAJES
print("\n=== PORCENTAJES ===\n")

aciertos = 18
total = 20
porcentaje = aciertos / total

print(f"Aciertos: {aciertos}/{total}")
print(f"Porcentaje: {porcentaje:.0%}")
print(f"Porcentaje: {porcentaje:.1%}")

# MÚLTIPLES VALORES
print("\n=== MÚLTIPLES VALORES ===\n")

datos = ("Juan", 25, "Madrid", 1800.50)
print("{}tiene {} años, vive en {} y gana ${}".format(*datos))

"""
SALIDA ESPERADA:
=== F-STRINGS ===

Hola Juan
Tengo 25 años
Juan vive en Madrid

=== EXPRESIONES EN F-STRINGS ===

10 + 20 = 30
10 * 20 = 200
Promedio: 15.0
...
"""
