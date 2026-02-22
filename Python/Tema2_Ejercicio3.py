"""
TEMA 2: OPERADORES - EJERCICIO 3
=================================
Operadores de pertenencia e identidad.

EXPLICACIÓN:
- in / not in: verificar pertenencia
- is / is not: verificar identidad
- Diferencia entre '==' e 'is'
"""

print("=== OPERADOR IN ===\n")

lista = [1, 2, 3, 4, 5]
print(f"Lista: {lista}")
print(f"3 in lista: {3 in lista}")
print(f"10 in lista: {10 in lista}")

texto = "Python"
print(f"\nTexto: '{texto}'")
print(f"'y' in texto: {'y' in texto}")
print(f"'x' in texto: {'x' in texto}")

print("\n=== OPERADOR IS ===\n")

a = [1, 2, 3]
b = [1, 2, 3]
c = a

print(f"a = {a}")
print(f"b = {b}")
print(f"c = a")
print(f"a == b (mismo contenido): {a == b}")
print(f"a is b (mismo objeto): {a is b}")
print(f"a is c (mismo objeto): {a is c}")

# Comparación con None
valor = None
print(f"\nvalor = None")
print(f"valor is None: {valor is None}")
print(f"valor == None: {valor == None}")

print("\n=== OPERADORES COMBINADOS ===\n")

dic = {'nombre': 'Juan', 'edad': 25, 'ciudad': 'Madrid'}
print(f"Diccionario: {dic}")
print(f"'nombre' in dic: {'nombre' in dic}")
print(f"'pais' in dic: {'pais' in dic}")
print(f"'nombre' not in dic: {'nombre' not in dic}")

"""
SALIDA ESPERADA:
=== OPERADOR IN ===

Lista: [1, 2, 3, 4, 5]
3 in lista: True
10 in lista: False

Texto: 'Python'
'y' in texto: True
'x' in texto: False

=== OPERADOR IS ===

a = [1, 2, 3]
b = [1, 2, 3]
c = a
a == b (mismo contenido): True
a is b (mismo objeto): False
a is c (mismo objeto): True

valor = None
valor is None: True
valor == None: True

=== OPERADORES COMBINADOS ===

Diccionario: {'nombre': 'Juan', 'edad': 25, 'ciudad': 'Madrid'}
'nombre' in dic: True
'pais' in dic: False
'nombre' not in dic: False
"""
