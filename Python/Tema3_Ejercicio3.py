"""
TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 3 A 10
=====================================================
Ejercicios 3-10 de Tema 3 (Condicionales avanzadas)
"""

# EJERCICIO 3: Comparación de tres números
print("=== EJERCICIO 3: MAYOR DE TRES NÚMEROS ===\n")

a, b, c = 15, 8, 23

if a > b and a > c:
    mayor = a
elif b > c:
    mayor = b
else:
    mayor = c

print(f"Números: {a}, {b}, {c}")
print(f"El mayor es: {mayor}")

# EJERCICIO  4: Números pares e impares
print("\n=== EJERCICIO 4: PARIDAD ===\n")

numeros = [10, 7, 14, 21, 6]
for num in numeros:
    if num % 2 == 0:
        print(f"{num}: Par")
    else:
        print(f"{num}: Impar")

# EJERCICIO 5: Verificar número primo
print("\n=== EJERCICIO 5: NÚMERO PRIMO ===\n")

def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

primos = [17, 20, 37, 48, 53]
for num in primos:
    print(f"{num}: {'Primo' if es_primo(num) else 'No primo'}")

# EJERCICIO 6: BMI (Índice de Masa Corporal)
print("\n=== EJERCICIO 6: BMI ===\n")

peso = 70
altura = 1.75

bmi = peso / (altura ** 2)

if bmi < 18.5:
    categoria = "Bajo peso"
elif bmi < 25:
    categoria = "Peso normal"
elif bmi < 30:
    categoria = "Sobrepeso"
else:
    categoria = "Obesidad"

print(f"Peso: {peso} kg, Altura: {altura} m")
print(f"BMI: {bmi:.2f} → {categoria}")

# EJERCICIO 7: Operador ternario (expresión condicional)
print("\n=== EJERCICIO 7: TERNARIO ===\n")

edad = 25
mensaje = "Adulto" if edad >= 18 else "Menor"
print(f"Edad {edad}: {mensaje}")

# EJERCICIO 8: Validación
print("\n=== EJERCICIO 8: VALIDACIÓN ===\n")

usuario = "Juan"
contraseña = "Pass123"

if usuario and contraseña:
    if len(contraseña) >= 6:
        print("✓ Credenciales válidas")
    else:
        print("✗ Contraseña muy corta")
else:
    print("✗ Usuario o contraseña vacía")

# EJERCICIO 9: Año bisiesto
print("\n=== EJERCICIO 9: AÑO BISIESTO ===\n")

def es_bisiesto(año):
    return (año % 4 == 0 and año % 100 != 0) or (año % 400 == 0)

años = [2020, 2021, 2024, 1900, 2000]
for año in años:
    print(f"{año}: {'Bisiesto' if es_bisiesto(año) else 'No bisiesto'}")

# EJERCICIO 10: Descuento por cantidad
print("\n=== EJERCICIO 10: DESCUENTO ===\n")

precio_unitario = 10
cantidad = 15

if cantidad >= 20:
    descuento = 0.20
elif cantidad >= 10:
    descuento = 0.10
elif cantidad >= 5:
    descuento = 0.05
else:
    descuento = 0

subtotal = precio_unitario * cantidad
total = subtotal * (1 - descuento)

print(f"Precio: ${precio_unitario}, Cantidad: {cantidad}")
print(f"Subtotal: ${subtotal}")
print(f"Descuento ({descuento*100}%): ${subtotal * descuento:.2f}")
print(f"Total: ${total:.2f}")

"""
SALIDA ESPERADA:
=== EJERCICIO 3: MAYOR DE TRES ===

Números: 15, 8, 23
El mayor es: 23

=== EJERCICIO 4: PARIDAD ===

10: Par
...
"""
