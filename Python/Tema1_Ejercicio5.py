"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 5
==========================================
Cálculo del Índice de Masa Corporal (IMC).

EXPLICACIÓN:
- Fórmula IMC = peso / (altura^2)
- Clasificación de resultados
- Condicionales simples
"""

print("=== CÁLCULO DE IMC ===\n")

# Datos
peso_kg = 70
altura_m = 1.75

# Cálculo
imc = peso_kg / (altura_m ** 2)

print(f"Datos:")
print(f"  Peso: {peso_kg} kg")
print(f"  Altura: {altura_m} m")
print(f"  IMC: {imc:.2f}")

# Clasificación
print(f"\nClasificación:")
if imc < 18.5:
    categoria = "Bajo peso"
elif imc < 25:
    categoria = "Peso normal"
elif imc < 30:
    categoria = "Sobrepeso"
else:
    categoria = "Obesidad"

print(f"  {categoria}")

# Múltiples ejemplos
print("\n=== TABLA DE EJEMPLOS ===")
ejemplos = [
    ("Juan", 60, 1.70),
    ("Ana", 55, 1.65),
    ("Carlos", 95, 1.80)
]

for nombre, peso, altura in ejemplos:
    imc_temp = peso / (altura ** 2)
    print(f"{nombre}: {imc_temp:.2f} IMC")

"""
SALIDA ESPERADA:
=== CÁLCULO DE IMC ===

Datos:
  Peso: 70 kg
  Altura: 1.75 m
  IMC: 22.86

Clasificación:
  Peso normal

=== TABLA DE EJEMPLOS ===
Juan: 20.76 IMC
Ana: 20.20 IMC
Carlos: 29.30 IMC
"""
