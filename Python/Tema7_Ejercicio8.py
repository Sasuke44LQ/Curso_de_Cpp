"""
TEMA 7: FUNCIONES
EJERCICIO 8: DOCSTRINGS
========================

Documentación de funciones
"""

# DOCSTRING SIMPLE
print("=== DOCSTRING SIMPLE ===\n")

def saludar(nombre):
    """Saluda a una persona."""
    return f"Hola, {nombre}"

print(f"Función: saludar")
print(f"Docstring: {saludar.__doc__}")
print(f"Resultado: {saludar('Juan')}\n")

# DOCSTRING COMPLETO
print("=== DOCSTRING COMPLETO ===\n")

def area_circulo(radio):
    """Calcula el área de un círculo.
    
    Esta función utiliza la fórmula A = π * r²
    
    Args:
        radio (float): Radio del círculo (debe ser positivo)
    
    Returns:
        float: El área del círculo
    
    Examples:
        >>> area_circulo(5)
        78.53981633974483
    
    Raises:
        ValueError: Si el radio es negativo
    """
    if radio < 0:
        raise ValueError("El radio debe ser positivo")
    
    import math
    return math.pi * radio ** 2

print(f"Función: area_circulo")
print(f"Docstring:\n{area_circulo.__doc__}")
print(f"Resultado: {area_circulo(5):.2f}\n")

# CONSULTAR DOCSTRING
print("=== HELP ===\n")

def mcd(a, b):
    """Calcula el máximo común divisor.
    
    Usa el algoritmo de Euclides.
    """
    while b:
        a, b = b, a % b
    return a

help(mcd)

# ATRIBUTOS DE FUNCIÓN
print("\n=== ATRIBUTOS ===\n")

def funcion_ejemplo(x, y):
    """Esta es una función ejemplo."""
    return x + y

print(f"Nombre: {funcion_ejemplo.__name__}")
print(f"Módulo: {funcion_ejemplo.__module__}")
print(f"Docstring: {funcion_ejemplo.__doc__}")

# FUNCIÓN CON TIPOS
print("\n=== CON TYPE HINTS ===\n")

def dividir(a: float, b: float) -> float:
    """Divide dos números.
    
    Args:
        a (float): Dividendo
        b (float): Divisor (no puede ser 0)
    
    Returns:
        float: Resultado de la división
    """
    if b == 0:
        raise ValueError("Divisor no puede ser 0")
    return a / b

print(f"Type hints: {dividir.__annotations__}")
print(f"Resultado: {dividir(10, 3):.2f}")

"""
SALIDA ESPERADA (parcial):
=== DOCSTRING SIMPLE ===

Función: saludar
Docstring:  Saluda a una persona.
Resultado: Hola, Juan

...
"""
