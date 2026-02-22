"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 5: PROPERTIES (PROPIEDADES)
======================================

Usa @property para getters y setters
"""

# PROPERTY BÁSICA
print("=== @PROPERTY ===\n")

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self._edad = edad
    
    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self, valor):
        if valor >= 0:
            self._edad = valor
        else:
            print("Error: edad no puede ser negativa")

persona = Persona("Juan", 25)
print(f"Edad: {persona.edad}")

persona.edad = 26
print(f"Nueva edad: {persona.edad}")

persona.edad = -5

# VALIDACIÓN EN PROPERTY
print("\n=== VALIDACIÓN ===\n")

class Cuenta:
    def __init__(self, titular, saldo=0):
        self.titular = titular
        self._saldo = saldo
    
    @property
    def saldo(self):
        return self._saldo
    
    @saldo.setter
    def saldo(self, cantidad):
        if cantidad >= 0:
            self._saldo = cantidad
        else:
            print("Error: Saldo no puede ser negativo")

cuenta = Cuenta("Ana", 1000)
print(f"Saldo: ${cuenta.saldo}")

cuenta.saldo = 1500
print(f"Nuevo saldo: ${cuenta.saldo}")

cuenta.saldo = -100

# PROPERTY CALCULADA
print("\n=== CALCULADA ===\n")

class Temperatura:
    def __init__(self, celsius):
        self._celsius = celsius
    
    @property
    def fahrenheit(self):
        return (self._celsius * 9/5) + 32

temp = Temperatura(25)
print(f"Celsius: {temp._celsius}")
print(f"Fahrenheit: {temp.fahrenheit:.2f}")

"""
SALIDA ESPERADA:
=== @PROPERTY ===

Edad: 25
Nueva edad: 26
Error: edad no puede ser negativa

=== VALIDACIÓN ===

Saldo: $1000
Nuevo saldo: $1500
Error: Saldo no puede ser negativo

=== CALCULADA ===

Celsius: 25
Fahrenheit: 77.00
"""
