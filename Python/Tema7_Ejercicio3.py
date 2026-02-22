"""
TEMA 7: FUNCIONES
EJERCICIO 3: ARGUMENTOS VARIABLES
==================================

Usa *args y **kwargs
"""

# *ARGS (ARGUMENTOS VARIABLE)
print("=== *ARGS ===\n")

def sumar_todos(*numeros):
    print(f"  Argumentos: {numeros}")
    return sum(numeros)

print(f"sumar_todos(1, 2, 3): {sumar_todos(1, 2, 3)}")
print(f"sumar_todos(10, 20): {sumar_todos(10, 20)}")
print(f"sumar_todos(5, 5, 5, 5): {sumar_todos(5, 5, 5, 5)}")

# **KWARGS (ARGUMENTOS NOMBRADOS VARIABLE)
print("\n=== **KWARGS ===\n")

def info_persona(**datos):
    for clave, valor in datos.items():
        print(f"  {clave}: {valor}")

print("info_persona(nombre='Juan', edad=25):")
info_persona(nombre="Juan", edad=25)

print("\ninfo_persona(nombre='Ana', edad=30, ciudad='Madrid'):")
info_persona(nombre="Ana", edad=30, ciudad="Madrid")

# COMBINACIÓN *ARGS Y **KWARGS
print("\n=== COMBINACIÓN ===\n")

def funcion(positivo, *args, **kwargs):
    print(f"Positional: {positivo}")
    print(f"*args: {args}")
    print(f"**kwargs: {kwargs}")

funcion(1, 2, 3, 4, nombre="Juan", edad=25)

# CASOS PRÁCTICOS
print("\n=== CASOS PRÁCTICOS ===\n")

def crear_diccionario(*claves, **valores):
    return {k: valores.get(k) for k in claves}

resultado = crear_diccionario("nombre", "edad", nombre="Juan", edad=25, ciudad="Madrid")
print(f"crear_diccionario: {resultado}")

# DESEMPAQUETAR
print("\n=== DESEMPAQUETAR ===\n")

def imprimir(a, b, c):
    print(f"a={a}, b={b}, c={c}")

lista = [1, 2, 3]
diccionario = {"a": 10, "b": 20, "c": 30}

print("Con *:")
imprimir(*lista)

print("\nCon **:")
imprimir(**diccionario)

"""
SALIDA ESPERADA:
=== *ARGS ===

  Argumentos: (1, 2, 3)
sumar_todos(1, 2, 3): 6
  Argumentos: (10, 20)
sumar_todos(10, 20): 30
...
"""
