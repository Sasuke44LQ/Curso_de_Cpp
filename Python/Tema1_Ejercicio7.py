"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 7
==========================================
Suma de dígitos de un número.

EXPLICACIÓN:
- Conversión string a entero
- Iteración sobre dígitos
- Acumuladores
"""

print("=== SUMA DE DÍGITOS ===\n")

# Método 1: Usando string
numero1 = 12345
suma1 = sum(int(digito) for digito in str(numero1))

print(f"Número: {numero1}")
print(f"Suma de dígitos: {suma1}")

# Método 2: Usando aritmética
numero2 = 456
suma2 = 0
temp = numero2

while temp > 0:
    digito = temp % 10
    suma2 += digito
    temp //= 10

print(f"\nNúmero: {numero2}")
print(f"Suma de dígitos: {suma2}")

# Varios ejemplos
print("\n=== TABLA DE EJEMPLOS ===")
numeros = [123, 999, 1001, 5555]

for num in numeros:
    suma = sum(int(d) for d in str(num))
    print(f"{num}: suma = {suma}")

"""
SALIDA ESPERADA:
=== SUMA DE DÍGITOS ===

Número: 12345
Suma de dígitos: 15

Número: 456
Suma de dígitos: 15

=== TABLA DE EJEMPLOS ===
123: suma = 6
999: suma = 27
1001: suma = 2
5555: suma = 20
"""
