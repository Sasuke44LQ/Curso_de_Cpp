"""
TEMA 4: ESTRUCTURAS REPETITIVAS - EJERCICIO 4 A 10
===================================================
Ejercicios 4-10 de Tema 4 (Bucles avanzados)
"""

# EJERCICIO 4: Break y continue
print("=== EJERCICIO 4: BREAK Y CONTINUE ===\n")

print("Números hasta encontrar 5:")
for i in range(1, 11):
    if i == 5:
        break
    print(i, end=" ")

print("\n\nNúmeros sin el 5:")
for i in range(1, 11):
    if i == 5:
        continue
    print(i, end=" ")

print("\n")

# EJERCICIO 5: Do-while simulado
print("\n=== EJERCICIO 5: REPETIR HASTA ===\n")

numero = 0
while True:
    numero += 1
    print(f"Intentos: {numero}")
    if numero >= 3:
        break

# EJERCICIO 6: Factorial
print("\n=== EJERCICIO 6: FACTORIAL ===\n")

def factorial(n):
    resultado = 1
    for i in range(1, n + 1):
        resultado *= i
    return resultado

for n in range(6):
    print(f"{n}! = {factorial(n)}")

# EJERCICIO 7: Número palíndromo
print("\n=== EJERCICIO 7: PALÍNDROMO ===\n")

def es_palindromo_numero(n):
    original = str(n)
    invertido = original[::-1]
    return original == invertido

numeros = [121, 123, 1001, 999, 12321]
for num in numeros:
    print(f"{num}: {'Palíndromo' if es_palindromo_numero(num) else 'No palíndromo'}")

# EJERCICIO 8: Fibonacci
print("\n=== EJERCICIO 8: SERIE FIBONACCI ===\n")

a, b = 0, 1
print(f"{a} ", end="")
for _ in range(9):
    print(f"{b} ", end="")
    a, b = b, a + b

# EJERCICIO 9: Números primos hasta N
print("\n\n=== EJERCICIO 9: PRIMOS HASTA 30 ===\n")

def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

primos = [n for n in range(30) if es_primo(n)]
print(f"Primos: {primos}")

# EJERCICIO 10: Suma y promedio
print("\n=== EJERCICIO 10: ESTADÍSTICAS ===\n")

numeros = [10, 20, 30, 40, 50]
suma = 0
cantidad = 0

for num in numeros:
    suma += num
    cantidad += 1

promedio = suma / cantidad

print(f"Números: {numeros}")
print(f"Suma: {suma}")
print(f"Promedio: {promedio}")

"""
SALIDA ESPERADA:
=== EJERCICIO 4: BREAK Y CONTINUE ===

Números hasta encontrar 5:
1 2 3 4

Números sin el 5:
1 2 3 4 6 7 8 9 10

...
"""
