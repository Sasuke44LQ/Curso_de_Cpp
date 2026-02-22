"""
TEMA 7: FUNCIONES
EJERCICIO 2: PARÁMETROS POR DEFECTO
====================================

Define funciones con parámetros predeterminados
"""

# PARÁMETRO POR DEFECTO BÁSICO
print("=== PARÁMETRO POR DEFECTO ===\n")

def potencia(base, exponente=2):
    return base ** exponente

print(f"potencia(5): {potencia(5)}")
print(f"potencia(5, 3): {potencia(5, 3)}")
print(f"potencia(2, 8): {potencia(2, 8)}")

# MÚLTIPLES PARÁMETROS POR DEFECTO
print("\n=== MÚLTIPLES PARÁMETROS ===\n")

def saludar(nombre, saludo="Hola", puntuacion="!"):
    return f"{saludo}, {nombre}{puntuacion}"

print(saludar("Juan"))
print(saludar("Ana", "Hola"))
print(saludar("Carlos", "Buenos días", "..."))

# PARÁMETROS NOMBRADOS
print("\n=== PARÁMETROS NOMBRADOS ===\n")

def rectangulo(base=10, altura=5):
    return base * altura

print(f"rectangulo(): {rectangulo()}")
print(f"rectangulo(20): {rectangulo(20)}")
print(f"rectangulo(altura=15): {rectangulo(altura=15)}")
print(f"rectangulo(base=20, altura=15): {rectangulo(base=20, altura=15)}")

# VALORES POR DEFECTO PRÁCTICOS
print("\n=== CASOS PRÁCTICOS ===\n")

def division(dividendo, divisor=1):
    if divisor == 0:
        return "Error: divisor no puede ser 0"
    return dividendo / divisor

print(f"division(10): {division(10)}")
print(f"division(10, 2): {division(10, 2)}")
print(f"division(10, 0): {division(10, 0)}")

# LISTAS COMO PARÁMETRO PREDETERMINADO (CUIDADO)
print("\n=== PARÁMETRO LISTA (CUIDADO) ===\n")

def agregar_defecto_mal(valor, lista=[]):
    lista.append(valor)
    return lista

print(agregar_defecto_mal(1))
print(agregar_defecto_mal(2))  # ¡Nota: 1 y 2 en la misma lista!

# FORMA CORRECTA
print("\n=== FORMA CORRECTA ===\n")

def agregar_defecto(valor, lista=None):
    if lista is None:
        lista = []
    lista.append(valor)
    return lista

print(agregar_defecto(1))
print(agregar_defecto(2))  # Nueva lista

"""
SALIDA ESPERADA:
=== PARÁMETRO POR DEFECTO ===

potencia(5): 25
potencia(5, 3): 125
potencia(2, 8): 256

=== MÚLTIPLES PARÁMETROS ===

Hola, Juan!
Hola, Ana!
Buenos días, Carlos...
...
"""
