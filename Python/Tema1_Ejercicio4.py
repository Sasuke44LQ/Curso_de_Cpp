"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 4
==========================================
Conversión de temperaturas y unidades.

EXPLICACIÓN:
- Fórmulas de conversión
- Manejo de variables
- Presentación de resultados
"""

print("=== CONVERSIÓN DE TEMPERATURAS ===\n")

# Celsius a Fahrenheit y Kelvin
celsius = 25
fahrenheit = (celsius * 9/5) + 32
kelvin = celsius + 273.15

print(f"Temperatura: {celsius}°C")
print(f"  En Fahrenheit: {fahrenheit:.2f}°F")
print(f"  En Kelvin: {kelvin:.2f}K")

print("\n=== CONVERSIÓN DE DISTANCIA ===\n")

# Metros a otras unidades
metros = 1500
kilometros = metros / 1000
centimetros = metros * 100
milimetros = metros * 1000

print(f"Distancia: {metros} metros")
print(f"  En kilómetros: {kilometros} km")
print(f"  En centímetros: {centimetros} cm")
print(f"  En milímetros: {milimetros} mm")

print("\n=== CONVERSIÓN DE PESO ===\n")

# Kilogramos a otras unidades
kg = 75
gramos = kg * 1000
libras = kg * 2.20462

print(f"Peso: {kg} kg")
print(f"  En gramos: {gramos} g")
print(f"  En libras: {libras:.2f} lb")

"""
SALIDA ESPERADA:
=== CONVERSIÓN DE TEMPERATURAS ===

Temperatura: 25°C
  En Fahrenheit: 77.00°F
  En Kelvin: 298.15K

=== CONVERSIÓN DE DISTANCIA ===

Distancia: 1500 metros
  En kilómetros: 1.5 km
  En centímetros: 150000 cm
  En milímetros: 1500000 mm

=== CONVERSIÓN DE PESO ===

Peso: 75 kg
  En gramos: 75000 g
  En libras: 165.35 lb
"""
