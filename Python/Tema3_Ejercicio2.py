"""
TEMA 3: ESTRUCTURAS CONDICIONALES - EJERCICIO 2
================================================
Instrucción if-elif-else para múltiples condiciones.

EXPLICACIÓN:
- elif: condición adicional
- Cadenas de condiciones
- Evitar if anidados
"""

print("=== IF-ELIF-ELSE ===\n")

nota = 85

if nota >= 90:
    grado = "A"
    descripcion = "Excelente"
elif nota >= 80:
    grado = "B"
    descripcion = "Muy Bien"
elif nota >= 70:
    grado = "C"
    descripcion = "Bien"
elif nota >= 60:
    grado = "D"
    descripcion = "Aprobado"
else:
    grado = "F"
    descripcion = "Reprobado"

print(f"Nota: {nota}")
print(f"Grado: {grado} ({descripcion})")

print("\n=== CLASIFICACIÓN DE EDAD ===\n")

edad = 15

if edad < 13:
    categoria = "Niño"
elif edad < 18:
    categoria = "Adolescente"
elif edad < 65:
    categoria = "Adulto"
else:
    categoria = "Adulto Mayor"

print(f"Edad: {edad} → {categoria}")

print("\n=== CLASIFICACIÓN DE NÚMEROS ===\n")

numero = 0

if numero > 0:
    tipo = "Positivo"
elif numero < 0:
    tipo = "Negativo"
else:
    tipo = "Cero"

print(f"Número: {numero} → {tipo}")

"""
SALIDA ESPERADA:
=== IF-ELIF-ELSE ===

Nota: 85
Grado: B (Muy Bien)

=== CLASIFICACIÓN DE EDAD ===

Edad: 15 → Adolescente

=== CLASIFICACIÓN DE NÚMEROS ===

Número: 0 → Cero
"""
