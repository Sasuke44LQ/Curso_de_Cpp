"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 8: CLASES ABSTRACTAS
================================

Define interfaces y contratos de clases
"""

# CLASES ABSTRACTAS BÁSICAS
print("=== CLASES ABSTRACTAS ===\n")

from abc import ABC, abstractmethod

class Pagador(ABC):
    @abstractmethod
    def pagar(self, cantidad):
        pass

class TarjetaCredito(Pagador):
    def __init__(self, numero):
        self.numero = numero
    
    def pagar(self, cantidad):
        return f"Pagando ${cantidad} con tarjeta {self.numero}"

class PayPal(Pagador):
    def __init__(self, email):
        self.email = email
    
    def pagar(self, cantidad):
        return f"Pagando ${cantidad} mediante PayPal ({self.email})"

class Bitcoin(Pagador):
    def __init__(self, billetera):
        self.billetera = billetera
    
    def pagar(self, cantidad):
        return f"Pagando ${cantidad} en Bitcoin a {self.billetera}"

# PROCESAR PAGOS
print("Procesando pagos:")

pagadores = [
    TarjetaCredito("1234-5678-9012-3456"),
    PayPal("usuario@gmail.com"),
    Bitcoin("1A1z7agoat2AxWLcHE8yyQkqesSqrE9Vc")
]

for pagador in pagadores:
    print(f"  {pagador.pagar(100)}")

# MÉTODO ABSTRACTO CON IMPLEMENTACIÓN
print("\n=== CON IMPLEMENTACIÓN ===\n")

class Vehículo(ABC):
    def __init__(self, marca):
        self.marca = marca
    
    @abstractmethod
    def acelerar(self):
        pass
    
    def obtener_marca(self):
        return self.marca

class Coche(Vehículo):
    def acelerar(self):
        return f"{self.marca}: ¡Brrrr!"

class Bicicleta(Vehículo):
    def acelerar(self):
        return f"{self.marca}: Pedalea fuerte"

vehiculos = [Coche("Ferrari"), Bicicleta("Trek")]
for v in vehiculos:
    print(f"{v.obtener_marca()}: {v.acelerar()}")

"""
SALIDA ESPERADA:
=== CLASES ABSTRACTAS ===

Procesando pagos:
  Pagando $100 con tarjeta 1234-5678-9012-3456
  Pagando $100 mediante PayPal (usuario@gmail.com)
  Pagando $100 en Bitcoin a 1A1z7agoat2AxWLcHE8yyQkqesSqrE9Vc

=== CON IMPLEMENTACIÓN ===

Ferrari: ¡Brrrr!
Trek: Pedalea fuerte
"""
