"""
TEMA 5: LISTAS Y ARREGLOS - EJERCICIO 2 A 10
=============================================
Ejercicios 2-10 de Tema 5 (Listas avanzadas)
"""

# EJERCICIO 2: Búsqueda y búsqueda
print("=== EJERCICIO 2: BÚSQUEDA ===\n")

numeros = [10, 25, 15, 30, 10]
print(f"Lista: {numeros}")
print(f"¿Contiene 25? {25 in numeros}")
print(f"Índice de 25: {numeros.index(25)}")
print(f"Conteo de 10: {numeros.count(10)}")

# EJERCICIO 3: Ordenamiento
print("\n=== EJERCICIO 3: ORDENAMIENTO ===\n")

numeros = [64, 34, 25, 12, 22, 11, 90]
numeros_ordenados = sorted(numeros)
print(f"Original: {numeros}")
print(f"Ordenada (ascendente): {numeros_ordenados}")
print(f"Ordenada (descendente): {sorted(numeros, reverse=True)}")

# EJERCICIO 4: Copias
print("\n=== EJERCICIO 4: COPIAS ===\n")

original = [1, 2, 3]
copia_superficial = original.copy()
copia_asignacion = original

print(f"Original: {original}")
print(f"Copia (copy): {copia_superficial}")
print(f"Asignación: {copia_asignacion}")

original.append(4)
print(f"\nDespués append(4):")
print(f"Original: {original}")
print(f"Copia (copy): {copia_superficial}")
print(f"Asignación: {copia_asignacion}")

# EJERCICIO 5: Comprensión de listas
print("\n=== EJERCICIO 5: COMPRENSIÓN ===\n")

pares = [n for n in range(1, 11) if n % 2 == 0]
cuadrados = [n**2 for n in range(1, 6)]
print(f"Pares 1-10: {pares}")
print(f"Cuadrados 1-5: {cuadrados}")

# EJERCICIO 6: Suma y promedio
print("\n=== EJERCICIO 6: ESTADÍSTICAS ===\n")

valores = [10, 15, 20, 25, 30]
print(f"Valores: {valores}")
print(f"Suma: {sum(valores)}")
print(f"Promedio: {sum(valores)/len(valores):.2f}")
print(f"Máximo: {max(valores)}")
print(f"Mínimo: {min(valores)}")

# EJERCICIO 7: Matrices
print("\n=== EJERCICIO 7: MATRICES ===\n")

matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Matriz:")
for fila in matriz:
    print(fila)

print(f"\nElemento [1][2]: {matriz[1][2]}")

# EJERCICIO 8: Invertir
print("\n=== EJERCICIO 8: INVERTIR ===\n")

lista = [1, 2, 3, 4, 5]
print(f"Original: {lista}")
print(f"Invertida: {lista[::-1]}")

lista_invertida = lista.copy()
lista_invertida.reverse()
print(f"Con reverse(): {lista_invertida}")

# EJERCICIO 9: Eliminar
print("\n=== EJERCICIO 9: ELIMINAR ===\n")

lista = [10, 20, 30, 40, 50]
print(f"Original: {lista}")

lista.remove(30)
print(f"Después remove(30): {lista}")

del lista[0]
print(f"Después del lista[0]: {lista}")

# EJERCICIO 10: Unión (zip)
print("\n=== EJERCICIO 10: ZIP ===\n")

nombres = ["Juan", "Ana", "Carlos"]
edades = [25, 23, 27]
ciudades = ["Madrid", "Barcelona", "Valencia"]

personas = list(zip(nombres, edades, ciudades))
print("Personas:")
for nombre, edad, ciudad in personas:
    print(f"  {nombre}: {edad} años, {ciudad}")

"""
SALIDA ESPERADA (Parcial):
=== EJERCICIO 2: BÚSQUEDA ===

Lista: [10, 25, 15, 30, 10]
¿Contiene 25? True
Índice de 25: 1
Conteo de 10: 2

...
"""
