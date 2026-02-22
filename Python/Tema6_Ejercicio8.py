"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 8: STRIP O TRIM
==========================

Elimina espacios: strip(), lstrip(), rstrip()
"""

# STRIP BÁSICO
print("=== STRIP BÁSICO ===\n")

texto = "  Python  "

print(f"Original : '{texto}'")
print(f"strip()  : '{texto.strip()}'")
print(f"lstrip() : '{texto.lstrip()}'")
print(f"rstrip() : '{texto.rstrip()}'")

# ELIMINAR CARACTERES ESPECÍFICOS
print("\n=== CARACTERES ESPECÍFICOS ===\n")

texto = "***Python***"

print(f"Original     : '{texto}'")
print(f"strip('*')   : '{texto.strip('*')}'")
print(f"lstrip('*')  : '{texto.lstrip('*')}'")
print(f"rstrip('*')  : '{texto.rstrip('*')}'")

# CASOS DE USO PRÁCTICO
print("\n=== CASOS PRÁCTICOS ===\n")

entrada = "  juan perez  "
print(f"Entrada: '{entrada}'")
print(f"Limpiada: '{entrada.strip()}'")

csv = "Juan, 25, Madrid"
campos = [campo.strip() for campo in csv.split(",")]
print(f"\nCSV: '{csv}'")
print(f"Campos limpiados: {campos}")

# STRIP MÚLTIPLE
print("\n=== CARACTERES MÚLTIPLES ===\n")

texto = "...===Python===..."

print(f"Original              : '{texto}'")
print(f"strip('=.'): '{texto.strip('=.')}'")

# APLICACIÓN EN LISTA
print("\n=== APLICACIÓN EN LISTA ===\n")

lineas = ["  hola  ", "  mundo  ", "  python  "]
lineas_limpias = [linea.strip() for linea in lineas]

print("Original:")
for linea in lineas:
    print(f"  '{linea}'")

print("\nLimpiadas:")
for linea in lineas_limpias:
    print(f"  '{linea}'")

"""
SALIDA ESPERADA:
=== STRIP BÁSICO ===

Original : '  Python  '
strip()  : 'Python'
lstrip() : 'Python  '
rstrip() : '  Python'
...
"""
