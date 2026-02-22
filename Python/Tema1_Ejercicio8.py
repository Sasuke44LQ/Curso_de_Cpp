"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 8
==========================================
Clasificación de números.

EXPLICACIÓN:
- if/elif/else anidados
- Propiedades de números
- Validación de entrada
"""

print("=== CLASIFICACIÓN DE NÚMEROS ===\n")

def clasificar(numero):
    tipos = []
    
    if numero > 0:
        tipos.append("positivo")
    elif numero < 0:
        tipos.append("negativo")
    else:
        tipos.append("cero")
    
    if numero % 2 == 0:
        tipos.append("par")
    else:
        tipos.append("impar")
    
    return tipos

# Ejemplos
numeros_prueba = [7, 14, -5, 0, 42, -3]

for num in numeros_prueba:
    clasificacion = clasificar(num)
    print(f"{num:3}: {', '.join(clasificacion)}")

# Detección de número perfecto
print("\n=== NÚMEROS ESPECIALES ===")

def es_perfecto(n):
    if n <= 1:
        return False
    divisores = [i for i in range(1, n) if n % i == 0]
    return sum(divisores) == n

numeros = [6, 28, 10, 15]
for num in numeros:
    print(f"{num}: {'Perfecto' if es_perfecto(num) else 'No perfecto'}")

"""
SALIDA ESPERADA:
=== CLASIFICACIÓN DE NÚMEROS ===

  7: positivo, impar
 14: positivo, par
 -5: negativo, impar
  0: cero, par
 42: positivo, par
 -3: negativo, impar

=== NÚMEROS ESPECIALES ===
6: Perfecto
28: Perfecto
10: No perfecto
15: No perfecto
"""
