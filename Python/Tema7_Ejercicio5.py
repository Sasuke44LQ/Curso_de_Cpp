"""
TEMA 7: FUNCIONES
EJERCICIO 5: FUNCIONES ANIDADAS
================================

Funciones dentro de funciones (closures)
"""

# FUNCIÓN ANIDADA BÁSICA
print("=== FUNCIÓN ANIDADA ===\n")

def external(x):
    print(f"External: x={x}")
    
    def internal(y):
        print(f"  Internal: y={y}")
        return x + y
    
    return internal(10)

resultado = external(5)
print(f"Resultado: {resultado}\n")

# CLOSURE (CAPTURA DE VARIABLES)
print("=== CLOSURE ===\n")

def multiplicador(factor):
    def multiplica(numero):
        return numero * factor
    return multiplica

mult_3 = multiplicador(3)
mult_5 = multiplicador(5)

print(f"mult_3(10) = {mult_3(10)}")
print(f"mult_3(20) = {mult_3(20)}")
print(f"mult_5(10) = {mult_5(10)}")
print(f"mult_5(20) = {mult_5(20)}")

# CONTADOR CON CLOSURE
print("\n=== CONTADOR ===\n")

def crear_contador():
    count = 0
    
    def incrementar():
        nonlocal count
        count += 1
        return count
    
    return incrementar

contador1 = crear_contador()
contador2 = crear_contador()

print("Contador 1:")
for _ in range(3):
    print(f"  {contador1()}")

print("Contador 2:")
for _ in range(2):
    print(f"  {contador2()}")

# DECORADOR SIMPLE
print("\n=== DECORADOR SIMPLE ===\n")

def mi_decorador(func):
    def wrapper():
        print("  [Antes]")
        func()
        print("  [Después]")
    return wrapper

@mi_decorador
def saludo():
    print("  ¡Hola!")

saludo()

# FUNCIÓN GENERADORA DE FUNCIONES
print("\n=== GENERADORA DE FUNCIONES ===\n")

def crear_operacion(operador):
    def operacion(a, b):
        if operador == "+":
            return a + b
        elif operador == "-":
            return a - b
        elif operador == "*":
            return a * b
    return operacion

suma = crear_operacion("+")
resta = crear_operacion("-")

print(f"suma(10, 3) = {suma(10, 3)}")
print(f"resta(10, 3) = {resta(10, 3)}")

"""
SALIDA ESPERADA:
=== FUNCIÓN ANIDADA ===

External: x=5
  Internal: y=10
Resultado: 15

=== CLOSURE ===

mult_3(10) = 30
mult_3(20) = 60
mult_5(10) = 50
mult_5(20) = 100
...
"""
