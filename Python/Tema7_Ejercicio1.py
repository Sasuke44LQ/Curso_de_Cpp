"""
TEMA 7: FUNCIONES - EJERCICIO 1 A 10
=====================================
Ejercicios 1-10 de Tema 7 (Funciones)
"""

# EJERCICIO 1: Funciones básicas
print("=== EJERCICIO 1: FUNCIONES BÁSICAS ===\n")

def saludar(nombre):
    return f"Hola, {nombre}!"

def sumar(a, b):
    return a + b

print(saludar("Juan"))
print(f"5 + 3 = {sumar(5, 3)}")

# EJERCICIO 2: Parámetros por defecto
print("\n=== EJERCICIO 2: PARÁMETROS POR DEFECTO ===\n")

def potencia(base, exponente=2):
    return base ** exponente

print(f"4² = {potencia(4)}")
print(f"2³ = {potencia(2, 3)}")

# EJERCICIO 3: Argumentos variables
print("\n=== EJERCICIO 3: ARGUMENTOS VARIABLES ===\n")

def sumar_todos(*numeros):
    return sum(numeros)

def info_persona(**datos):
    for clave, valor in datos.items():
        print(f"  {clave}: {valor}")

print(f"Suma: {sumar_todos(1, 2, 3, 4, 5)}")

print("Información:")
info_persona(nombre="Juan", edad=25, ciudad="Madrid")

# EJERCICIO 4: Recursión
print("\n=== EJERCICIO 4: RECURSIÓN ===\n")

def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

print(f"5! = {factorial(5)}")
print(f"F(8) = {fibonacci(8)}")

# EJERCICIO 5: Funciones anidadas
print("\n=== EJERCICIO 5: FUNCIONES ANIDADAS ===\n")

def multiplicar_by(x):
    def operacion(y):
        return x * y
    return operacion

mult_5 = multiplicar_by(5)
print(f"5 * 3 = {mult_5(3)}")
print(f"5 * 7 = {mult_5(7)}")

# EJERCICIO 6: Lambda
print("\n=== EJERCICIO 6: LAMBDA ===\n")

cuadrado = lambda x: x ** 2
numeros = [1, 2, 3, 4, 5]
cuadrados = list(map(cuadrado, numeros))

print(f"Números: {numeros}")
print(f"Cuadrados: {cuadrados}")

# EJERCICIO 7: Filter y Map
print("\n=== EJERCICIO 7: FILTER/MAP ===\n")

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

pares = list(filter(lambda x: x % 2 == 0, numeros))
dobles = list(map(lambda x: x * 2, numeros))

print(f"Pares: {pares}")
print(f"Dobles: {dobles}")

# EJERCICIO 8: Documentación (docstring)
print("\n=== EJERCICIO 8: DOCSTRING ===\n")

def area_circulo(radio):
    """Calcula el área de un círculo.
    
    Args:
        radio: Radio del círculo
        
    Returns:
        El área del círculo
    """
    import math
    return math.pi * radio ** 2

print(area_circulo.__doc__)
print(f"Área (r=5): {area_circulo(5):.2f}")

# EJERCICIO 9: Scope
print("\n=== EJERCICIO 9: SCOPE ===\n")

global_var = "Global"

def funcion():
    local_var = "Local"
    print(f"  Acceso a global: {global_var}")
    print(f"  Variable local: {local_var}")

print("Dentro función:")
funcion()
print(f"Acceso a global: {global_var}")

# EJERCICIO 10: Función que retorna múltiples valores
print("\n=== EJERCICIO 10: RETORNO MÚLTIPLE ===\n")

def dividir_resto(a, b):
    return a // b, a % b

cociente, residuo = dividir_resto(17, 5)
print(f"17 ÷ 5 = {cociente} resto {residuo}")

def estadisticas(numeros):
    return min(numeros), max(numeros), sum(numeros) / len(numeros)

datos = [10, 20, 30, 40, 50]
minimo, maximo, promedio = estadisticas(datos)
print(f"Datos: {datos}")
print(f"Min: {minimo}, Max: {maximo}, Prom: {promedio}")

"""
SALIDA ESPERADA (Parcial):
=== EJERCICIO 1: FUNCIONES BÁSICAS ===

Hola, Juan!
5 + 3 = 8

...
"""
