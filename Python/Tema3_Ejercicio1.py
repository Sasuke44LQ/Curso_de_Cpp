"""
TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 1
================================================
Instrucción if básica y if-else.

EXPLICACIÓN:
- if: ejecución condicional
- else: alternativa
- Indentación en Python
"""

print("=== IF BÁSICO ===\n")

numero = 10

if numero > 0:
    print(f"{numero} es positivo")

numero = -5
if numero < 0:
    print(f"{numero} es negativo")

print("\n=== IF-ELSE ===\n")

edad = 20

if edad >= 18:
    print(f"{edad} años: Es mayor de edad")
else:
    print(f"{edad} años: Es menor de edad")

# Otro ejemplo
calificacion = 8

if calificacion >= 7:
    estado = "Aprobado"
else:
    estado = "Reprobado"

print(f"Calificación: {calificacion} → {estado}")

print("\n=== CONDICIONALES ANIDADAS ===\n")

temperatura = 25

if temperatura > 30:
    print("Hace mucho calor")
else:
    if temperatura > 20:
        print("Temperatura agradable")
    else:
        print("Hace frío")

"""
SALIDA ESPERADA:
=== IF BÁSICO ===

10 es positivo
-5 es negativo

=== IF-ELSE ===

20 años: Es mayor de edad
Calificación: 8 → Aprobado

=== CONDICIONALES ANIDADAS ===

Temperatura agradable
"""
