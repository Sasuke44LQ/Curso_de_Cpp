"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 3
==========================================
Cálculo del área y perímetro de formas geométricas.

EXPLICACIÓN:
- Constantes (PI)
- Fórmulas matemáticas
- Redondeo con round()
"""

import math

print("=== GEOMETRÍA BÁSICA ===\n")

# Círculo
radio = 5
area_circulo = math.pi * radio ** 2
perimetro_circulo = 2 * math.pi * radio

print(f"Círculo (radio = {radio}):")
print(f"  Área: {area_circulo:.2f}")
print(f"  Perímetro: {perimetro_circulo:.2f}")

# Cuadrado
lado = 4
area_cuadrado = lado ** 2
perimetro_cuadrado = 4 * lado

print(f"\nCuadrado (lado = {lado}):")
print(f"  Área: {area_cuadrado}")
print(f"  Perímetro: {perimetro_cuadrado}")

# Rectángulo
largo = 10
ancho = 6
area_rect = largo * ancho
perimetro_rect = 2 * (largo + ancho)

print(f"\nRectángulo ({largo}x{ancho}):")
print(f"  Área: {area_rect}")
print(f"  Perímetro: {perimetro_rect}")

# Triángulo
base = 8
altura = 5
area_triangulo = (base * altura) / 2

print(f"\nTriángulo (base={base}, altura={altura}):")
print(f"  Área: {area_triangulo}")

"""
SALIDA ESPERADA:
=== GEOMETRÍA BÁSICA ===

Círculo (radio = 5):
  Área: 78.54
  Perímetro: 31.42

Cuadrado (lado = 4):
  Área: 16
  Perímetro: 16

Rectángulo (10x6):
  Área: 60
  Perímetro: 32

Triángulo (base=8, altura=5):
  Área: 20.0
"""
