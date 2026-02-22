"""
TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 3
==============================================
Bucles anidados y patrones.

EXPLICACIÓN:
- Bucles dentro de bucles
- Patrones geométricos
- Matrices simples
"""

print("=== TABLA DE MULTIPLICACIÓN ===\n")

for i in range(1, 4):
    for j in range(1, 4):
        print(f"{i*j:3}", end=" ")
    print()

print("\n=== RECTÁNGULO DE ASTERISCOS ===\n")

ancho = 5
alto = 3

for i in range(alto):
    for j in range(ancho):
        print("*", end="")
    print()

print("\n=== TRIÁNGULO ASCENDENTE ===\n")

for i in range(1, 6):
    for j in range(i):
        print("*", end="")
    print()

print("\n=== TRIÁNGULO DESCENDENTE ===\n")

for i in range(5, 0, -1):
    for j in range(i):
        print("*", end="")
    print()

"""
SALIDA ESPERADA:
=== TABLA DE MULTIPLICACIÓN ===

  1   2   3
  2   4   6
  3   6   9

=== RECTÁNGULO DE ASTERISCOS ===

*****
*****
*****

=== TRIÁNGULO ASCENDENTE ===

*
**
***
****
*****

=== TRIÁNGULO DESCENDENTE ===

*****
****
***
**
*
"""
