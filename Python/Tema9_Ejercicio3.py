"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 3: POLIMORFISMO
===========================

Múltiples clases, mismo método, diferentes implementaciones
"""

# POLIMORFISMO CON FIGURAS
print("=== POLIMORFISMO: FIGURAS ===\n")

class Forma:
    def calcular_area(self):
        raise NotImplementedError("Debes implementar calcular_area")

class Circulo(Forma):
    def __init__(self, radio):
        self.radio = radio
    
    def calcular_area(self):
        import math
        return math.pi * self.radio ** 2

class Rectangulo(Forma):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def calcular_area(self):
        return self.base * self.altura

class Triangulo(Forma):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def calcular_area(self):
        return (self.base * self.altura) / 2

formas = [
    Circulo(5),
    Rectangulo(4, 6),
    Triangulo(3, 4)
]

print("Áreas:")
for forma in formas:
    print(f"  {forma.__class__.__name__}: {forma.calcular_area():.2f}")

# PROCESAMIENTO POLIMÓRFICO
print("\n=== PROCESAMIENTO ===\n")

def imprimir_info(forma):
    print(f"{forma.__class__.__name__}: {forma.calcular_area():.2f}")

for forma in formas:
    imprimir_info(forma)

"""
SALIDA ESPERADA:
=== POLIMORFISMO: FIGURAS ===

Áreas:
  Circulo: 78.54
  Rectangulo: 24.00
  Triangulo: 6.00

=== PROCESAMIENTO ===

Circulo: 78.54
Rectangulo: 24.00
Triangulo: 6.00
"""
