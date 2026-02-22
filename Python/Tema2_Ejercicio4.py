"""
TEMA 2: OPERADORES - EJERCICIO 4
=================================
Operadores bitwise (a nivel de bits).

EXPLICACIÓN:
- AND (&), OR (|), XOR (^), NOT (~)
- Desplazamientos: <<, >>
- Aplicaciones en programación
"""

print("=== OPERADORES BITWISE ===\n")

a = 12  # 1100 en binario
b = 10  # 1010 en binario

print(f"a = {a} ({bin(a)})")
print(f"b = {b} ({bin(b)})")

print(f"\na & b = {a & b} ({bin(a & b)})  [AND]")
print(f"a | b = {a | b} ({bin(a | b)})  [OR]")
print(f"a ^ b = {a ^ b} ({bin(a ^ b)})  [XOR]")
print(f"~a = {~a} ({bin(~a & 0xFF)})  [NOT]")

print(f"\na << 1 = {a << 1} ({bin(a << 1)})  [Desplazamiento izquierda]")
print(f"a >> 1 = {a >> 1} ({bin(a >> 1)})  [Desplazamiento derecha]")

print("\n=== CASOS DE USO ===\n")

# Verificar si es potencia de 2
numero = 16
es_potencia_2 = (numero != 0) and (numero & (numero - 1)) == 0
print(f"{numero} es potencia de 2: {es_potencia_2}")

numero = 15
es_potencia_2 = (numero != 0) and (numero & (numero - 1)) == 0
print(f"{numero} es potencia de 2: {es_potencia_2}")

# Conteo de bits 1
def contar_bits_1(n):
    cuenta = 0
    while n:
        cuenta += n & 1
        n >>= 1
    return cuenta

print(f"\nBits 1 en 13 ({bin(13)}): {contar_bits_1(13)}")
print(f"Bits 1 en 255 ({bin(255)}): {contar_bits_1(255)}")

"""
SALIDA ESPERADA:
=== OPERADORES BITWISE ===

a = 12 (0b1100)
b = 10 (0b1010)

a & b = 8 (0b1000)  [AND]
a | b = 14 (0b1110)  [OR]
a ^ b = 6 (0b110)  [XOR]
~a = -13 (0b11110011)  [NOT]

a << 1 = 24 (0b11000)  [Desplazamiento izquierda]
a >> 1 = 6 (0b110)  [Desplazamiento derecha]

=== CASOS DE USO ===

16 es potencia de 2: True
15 es potencia de 2: False

Bits 1 en 13 (0b1101): 3
Bits 1 en 255 (0b11111111): 8
"""
