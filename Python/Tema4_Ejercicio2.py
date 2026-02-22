"""
TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 2
==============================================
Bucle for básico y range().

EXPLICACIÓN:
- for: iteración sobre secuencia
- range(inicio, fin, paso)
- Iteración sobre strings y listas
"""

print("=== FOR CON RANGE ===\n")

for i in range(1, 6):
    print(f"Número: {i}")

print(f"\n=== RANGE CON PASO ===\n")

print("Números pares del 1 al 10:")
for i in range(2, 11, 2):
    print(i, end=" ")

print("\n\nNúmeros descendentes:")
for i in range(10, 0, -1):
    print(i, end=" ")

print("\n\n=== ITERACIÓN SOBRE STRINGS ===\n")

texto = "Python"
for letra in texto:
    print(letra, end=" ")

print("\n\n=== ITERACIÓN SOBRE LISTAS ===\n")

frutas = ["manzana", "banana", "cereza"]
for fruta in frutas:
    print(f"- {fruta}")

"""
SALIDA ESPERADA:
=== FOR CON RANGE ===

Número: 1
Número: 2
Número: 3
Número: 4
Número: 5

=== RANGE CON PASO ===

Números pares del 1 al 10:
2 4 6 8 10

Números descendentes:
10 9 8 7 6 5 4 3 2 1

=== ITERACIÓN SOBRE STRINGS ===

P y t h o n

=== ITERACIÓN SOBRE LISTAS ===

- manzana
- banana
- cereza
"""
