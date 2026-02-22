"""
TEMA 1: INTRODUCCIÓN BÁSICA - EJERCICIO 9
==========================================
Promedio de calificaciones.

EXPLICACIÓN:
- Listas de datos
- Cálculo de promedio
- Búsqueda de máximo y mínimo
"""

print("=== PROMEDIO DE CALIFICACIONES ===\n")

calificaciones = [8.5, 9.0, 7.5, 8.8, 9.2]

promedio = sum(calificaciones) / len(calificaciones)
maxima = max(calificaciones)
minima = min(calificaciones)

print(f"Calificaciones: {calificaciones}")
print(f"Promedio: {promedio:.2f}")
print(f"Máxima: {maxima}")
print(f"Mínima: {minima}")

# Determinar aprobación
if promedio >= 7:
    estado = "APROBADO"
else:
    estado = "REPROBADO"

print(f"Estado: {estado}")

# Múltiples estudiantes
print("\n=== REPORTE DE ESTUDIANTES ===")

estudiantes = {
    "Juan": [8.0, 7.5, 8.5],
    "Ana": [9.0, 9.2, 8.8],
    "Carlos": [6.5, 7.0, 6.8]
}

for nombre, notas in estudiantes.items():
    prom = sum(notas) / len(notas)
    resultado = "✓ Aprobado" if prom >= 7 else "✗ Reprobado"
    print(f"{nombre}: {prom:.2f} {resultado}")

"""
SALIDA ESPERADA:
=== PROMEDIO DE CALIFICACIONES ===

Calificaciones: [8.5, 9.0, 7.5, 8.8, 9.2]
Promedio: 8.60
Máxima: 9.2
Mínima: 7.5
Estado: APROBADO

=== REPORTE DE ESTUDIANTES ===
Juan: 8.00 ✓ Aprobado
Ana: 9.00 ✓ Aprobado
Carlos: 6.77 ✗ Reprobado
"""
