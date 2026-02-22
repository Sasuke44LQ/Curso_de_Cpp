"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 6
==========================================
Tabla de multiplicar.

EXPLICACIÓN:
- Bucles for
- Múltiplos
- Formateo de salida
"""

print("=== TABLA DE MULTIPLICAR ===\n")

numero = 7

print(f"Tabla del {numero}:")
for i in range(1, 11):
    resultado = numero * i
    print(f"{numero} x {i:2} = {resultado:3}")

print("\n=== TABLAS DEL 1 AL 5 ===\n")

for num in range(1, 6):
    print(f"Tabla del {num}:")
    for i in range(1, 6):
        print(f"  {num} x {i} = {num * i}")
    print()

# Tabla de multiplicación (vista de cuadrícula)
print("=== TABLA DE 3x3 ===")
print("  1 2 3")
for fila in range(1, 4):
    print(f"{fila} ", end="")
    for col in range(1, 4):
        print(f"{fila * col} ", end="")
    print()

"""
SALIDA ESPERADA:
=== TABLA DE MULTIPLICAR ===

Tabla del 7:
7 x  1 =   7
7 x  2 =  14
7 x  3 =  21
7 x  4 =  28
7 x  5 =  35
7 x  6 =  42
7 x  7 =  49
7 x  8 =  56
7 x  9 =  63
7 x 10 =  70

=== TABLAS DEL 1 AL 5 ===

Tabla del 1:
  1 x 1 = 1
  1 x 2 = 2
  1 x 3 = 3
  1 x 4 = 4
  1 x 5 = 5

...

=== TABLA DE 3x3 ===
  1 2 3
1 1 2 3
2 2 4 6
3 3 6 9
"""
