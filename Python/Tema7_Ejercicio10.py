"""
TEMA 7: FUNCIONES
EJERCICIO 10: GENERALIZACIÓN
=============================

Ejercicios integradores combinando conceptos de funciones
"""

# PROCESADOR DE DATOS
print("=== PROCESADOR DE DATOS ===\n")

def procesar_datos(datos, filtro=None, transformar=None, reducir=None):
    """Procesa datos con operaciones configurables."""
    
    # Filtrar
    if filtro:
        datos = list(filter(filtro, datos))
    
    # Transformar
    if transformar:
        datos = list(map(transformar, datos))
    
    # Reducir
    if reducir:
        from functools import reduce
        datos = reduce(reducir, datos)
    
    return datos

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

pares_dobles = procesar_datos(
    numeros,
    filtro=lambda x: x % 2 == 0,
    transformar=lambda x: x * 2
)

print(f"Números: {numeros}")
print(f"Pares dobles: {pares_dobles}")

# CACHEADOR DE RESULTADOS
print("\n=== CACHEADOR ===\n")

def cachear(func):
    cache = {}
    
    def wrapper(n):
        if n not in cache:
            print(f"  Calculando {func.__name__}({n})")
            cache[n] = func(n)
        else:
            print(f"  Usando cache para {func.__name__}({n})")
        return cache[n]
    
    return wrapper

@cachear
def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

print(f"fib(5) = {fibonacci(5)}")
print(f"fib(5) = {fibonacci(5)}")

# VALIDADOR CON DECORADOR
print("\n=== VALIDADOR ===\n")

def validar(**restricciones):
    def decorador(func):
        def wrapper(*args, **kwargs):
            for key, value in kwargs.items():
                if key in restricciones:
                    validador = restricciones[key]
                    if not validador(value):
                        raise ValueError(f"Validación fallida para {key}")
            return func(*args, **kwargs)
        return wrapper
    return decorador

@validar(edad=lambda x: x >= 0 and x <= 150,
         email=lambda x: "@" in x)
def registrar_usuario(nombre, edad=None, email=None):
    print(f"  Usuario {nombre} registrado")
    return True

registrar_usuario("Juan", edad=25, email="juan@example.com")

# GENERADOR DE FUNCIONES
print("\n=== GENERADOR DE FUNCIONES ===\n")

def crear_multiplicador(n):
    """Retorna una función que multiplica por n."""
    return lambda x: x * n

mult_2 = crear_multiplicador(2)
mult_5 = crear_multiplicador(5)
mult_10 = crear_multiplicador(10)

for multiplicador in [mult_2, mult_5, mult_10]:
    print(f"  100 * ? = {multiplicador(100)}")

# COMPOSICIÓN DE FUNCIONES
print("\n=== COMPOSICIÓN ===\n")

def componer(*funciones):
    """Compone múltiples funciones."""
    def composicion(x):
        for func in reversed(funciones):
            x = func(x)
        return x
    return composicion

suma_1 = lambda x: x + 1
mult_2 = lambda x: x * 2
cuadrado = lambda x: x ** 2

resultado_final = componer(suma_1, mult_2, cuadrado)
print(f"(5² * 2) + 1 = {resultado_final(5)}")

"""
SALIDA ESPERADA (parcial):
=== PROCESADOR DE DATOS ===

Números: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Pares dobles: [4, 8, 12, 16, 20]

=== CACHEADOR ===

  Calculando fibonacci(5)
  Usando cache para fibonacci(5)
...
"""
