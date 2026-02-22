"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 10
===========================================
Números aleatorios y adivinanza.

EXPLICACIÓN:
- import random
- random.randint()
- Bucles while con condiciones
"""

import random

print("=== JUEGO DE ADIVINANZA ===\n")

numero_secreto = random.randint(1, 100)
intentos = 0
adivinado = False

print("Piensa en un número entre 1 y 100...")
print("Tienes 10 intentos para adivinarlo.\n")

while intentos < 10 and not adivinado:
    try:
        enter_numero = int(input("Ingresa tu número: "))
        intentos += 1
        
        if enter_numero == numero_secreto:
            print(f"✓ ¡Lo adivinaste! El número era {numero_secreto}")
            print(f"Intentos utilizados: {intentos}")
            adivinado = True
        elif enter_numero < numero_secreto:
            print("↑ El número es mayor")
        else:
            print("↓ El número es menor")
            
        print(f"Intentos restantes: {10 - intentos}\n")
        
    except ValueError:
        print("Error: ingresa un número válido\n")

if not adivinado:
    print(f"✗ Fin del juego. El número era {numero_secreto}")

"""
SALIDA ESPERADA (Ejemplo):
=== JUEGO DE ADIVINANZA ===

Piensa en un número entre 1 y 100...
Tienes 10 intentos para adivinarlo.

Ingresa tu número: 50
↓ El número es menor
Intentos restantes: 9

Ingresa tu número: 25
↑ El número es mayor
Intentos restantes: 8

Ingresa tu número: 35
✓ ¡Lo adivinaste! El número era 35
Intentos utilizados: 3
"""
