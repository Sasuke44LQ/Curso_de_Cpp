"""
TEMA 5: LISTAS Y ARREGLOS - EJERCICIO 1
========================================
Operaciones básicas con listas.

EXPLICACIÓN:
- Crear listas
- Acceso por índice
- Métodos: append, pop, extend, insert
"""

print("=== CREACIÓN Y ACCESO ===\n")

numeros = [10, 20, 30, 40, 50]
print(f"Lista: {numeros}")
print(f"Primer elemento: {numeros[0]}")
print(f"Último elemento: {numeros[-1]}")
print(f"Longitud: {len(numeros)}")

print("\n=== MÉTODOS DE LISTA ===\n")

lista = [1, 2, 3]
print(f"Inicial: {lista}")

lista.append(4)
print(f"Después append(4): {lista}")

lista.extend([5, 6])
print(f"Después extend([5,6]): {lista}")

lista.insert(0, 0)
print(f"Después insert(0, 0): {lista}")

removido = lista.pop()
print(f"Después pop(): {lista} (removido: {removido})")

print("\n=== SLICING ===\n")

numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(f"Lista: {numeros}")
print(f"numeros[2:5]: {numeros[2:5]}")
print(f"numeros[:3]: {numeros[:3]}")
print(f"numeros[7:]: {numeros[7:]}")
print(f"numeros[::2]: {numeros[::2]}")
print(f"numeros[::-1]: {numeros[::-1]}")

"""
SALIDA ESPERADA:
=== CREACIÓN Y ACCESO ===

Lista: [10, 20, 30, 40, 50]
Primer elemento: 10
Último elemento: 50
Longitud: 5

=== MÉTODOS DE LISTA ===

Inicial: [1, 2, 3]
Después append(4): [1, 2, 3, 4]
Después extend([5,6]): [1, 2, 3, 4, 5, 6]
Después insert(0, 0): [0, 1, 2, 3, 4, 5, 6]
Después pop(): [0, 1, 2, 3, 4, 5] (removido: 6)

=== SLICING ===

Lista: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
numeros[2:5]: [2, 3, 4]
numeros[:3]: [0, 1, 2]
numeros[7:]: [7, 8, 9]
numeros[::2]: [0, 2, 4, 6, 8]
numeros[::-1]: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
"""
