"""
TEMA 7: FUNCIONES
EJERCICIO 4: RECURSIÓN
======================

Funciones que se llaman a sí mismas
"""

# FACTORIAL (RECURSIVO)
print("=== FACTORIAL ===\n")

def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

for n in range(1, 6):
    print(f"{n}! = {factorial(n)}")

# FIBONACCI (RECURSIVO)
print("\n=== FIBONACCI ===\n")

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

print("Fibonacci:")
for n in range(8):
    print(f"F({n}) = {fibonacci(n)}", end="  ")

# POTENCIA (RECURSIVO)
print("\n\n=== POTENCIA ===\n")

def potencia(base, exp):
    if exp == 0:
        return 1
    return base * potencia(base, exp - 1)

print(f"2^5 = {potencia(2, 5)}")
print(f"3^4 = {potencia(3, 4)}")
print(f"5^3 = {potencia(5, 3)}")

# SUMA DE DÍGITOS (RECURSIVO)
print("\n=== SUMA DE DÍGITOS ===\n")

def suma_digitos(n):
    if n < 10:
        return n
    return (n % 10) + suma_digitos(n // 10)

numeros = [123, 456, 789]
for num in numeros:
    print(f"suma_digitos({num}) = {suma_digitos(num)}")

# BÚSQUEDA BINARIA (RECURSIVO)
print("\n=== BÚSQUEDA BINARIA ===\n")

def busqueda_binaria(lista, objetivo, izq=0, der=None):
    if der is None:
        der = len(lista) - 1
    
    if izq > der:
        return -1
    
    medio = (izq + der) // 2
    if lista[medio] == objetivo:
        return medio
    elif lista[medio] < objetivo:
        return busqueda_binaria(lista, objetivo, medio + 1, der)
    else:
        return busqueda_binaria(lista, objetivo, izq, medio - 1)

numeros = [1, 3, 5, 7, 9, 11, 13]
print(f"Lista: {numeros}")
print(f"Buscar 7: índice {busqueda_binaria(numeros, 7)}")
print(f"Buscar 9: índice {busqueda_binaria(numeros, 9)}")
print(f"Buscar 12: índice {busqueda_binaria(numeros, 12)}")

"""
SALIDA ESPERADA:
=== FACTORIAL ===

1! = 1
2! = 2
3! = 6
4! = 24
5! = 120

=== FIBONACCI ===

Fibonacci:
F(0) = 0  F(1) = 1  F(2) = 1  F(3) = 2  F(4) = 3  F(5) = 5 ...
"""
