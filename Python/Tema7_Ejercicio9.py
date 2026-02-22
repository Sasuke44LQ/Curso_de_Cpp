"""
TEMA 7: FUNCIONES
EJERCICIO 9: DECORADORES
==========================

Funciones que modifican otras funciones
"""

# DECORADOR SIMPLE
print("=== DECORADOR SIMPLE ===\n")

def mi_decorador(func):
    def wrapper():
        print("  [Antes de ejecutar]")
        resultado = func()
        print("  [Después de ejecutar]")
        return resultado
    return wrapper

@mi_decorador
def saludar():
    print("  ¡Hola!")
    return "Saludado"

resultado = saludar()
print(f"Retorno: {resultado}\n")

# DECORADOR CON ARGUMENTOS EN LA FUNCIÓN
print("=== CON ARGUMENTOS ===\n")

def decorador_argumentos(func):
    def wrapper(*args, **kwargs):
        print(f"  Función: {func.__name__}")
        print(f"  Args: {args}, Kwargs: {kwargs}")
        resultado = func(*args, **kwargs)
        print(f"  Resultado: {resultado}")
        return resultado
    return wrapper

@decorador_argumentos
def suma(a, b):
    return a + b

suma(5, 3)

# DECORADOR CONTADOR
print("\n=== DECORADOR CONTADOR ===\n")

def contador_llamadas(func):
    def wrapper(*args, **kwargs):
        wrapper.llamadas += 1
        print(f"  Llamada #{wrapper.llamadas}")
        return func(*args, **kwargs)
    wrapper.llamadas = 0
    return wrapper

@contador_llamadas
def procesar():
    return "Procesado"

procesar()
procesar()
procesar()

# DECORADOR TIEMPO
print("\n=== DECORADOR TIEMPO ===\n")

import time

def medir_tiempo(func):
    def wrapper(*args, **kwargs):
        inicio = time.time()
        resultado = func(*args, **kwargs)
        fin = time.time()
        print(f"  Tiempo: {(fin - inicio)*1000:.2f}ms")
        return resultado
    return wrapper

@medir_tiempo
def calcular(n):
    total = 0
    for i in range(n):
        total += i
    return total

calcular(1000000)

# DECORADOR CON PARÁMETROS
print("\n=== DECORADOR CON PARÁMETROS ===\n")

def repetir(veces):
    def decorador(func):
        def wrapper(*args, **kwargs):
            for _ in range(veces):
                resultado = func(*args, **kwargs)
            return resultado
        return wrapper
    return decorador

@repetir(3)
def imprimir_mensaje():
    print("  Mensaje")

imprimir_mensaje()

"""
SALIDA ESPERADA (parcial):
=== DECORADOR SIMPLE ===

  [Antes de ejecutar]
  ¡Hola!
  [Después de ejecutar]
Retorno: Saludado

=== CON ARGUMENTOS ===

  Función: suma
  Args: (5, 3), Kwargs: {}
  Resultado: 8
...
"""
