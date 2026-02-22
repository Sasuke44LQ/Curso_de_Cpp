"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 1 A 10
===========================================================
Ejercicios 1-10 de Tema 9 (POO en Python)
"""

# EJERCICIO 1: Clases básicas
print("=== EJERCICIO 1: CLASES BÁSICAS ===\n")

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    def saludar(self):
        return f"Hola, soy {self.nombre} y tengo {self.edad} años"

persona1 = Persona("Juan", 25)
print(persona1.saludar())

# EJERCICIO 2: Herencia
print("\n=== EJERCICIO 2: HERENCIA ===\n")

class Animal:
    def __init__(self, nombre, sonido):
        self.nombre = nombre
        self.sonido = sonido
    
    def hacer_sonido(self):
        return f"{self.nombre} hace: {self.sonido}"

class Perro(Animal):
    def traer_pelota(self):
        return f"{self.nombre} trae la pelota"

perro = Perro("Rex", "¡Guau guau!")
print(perro.hacer_sonido())
print(perro.traer_pelota())

# EJERCICIO 3: Polimorfismo
print("\n=== EJERCICIO 3: POLIMORFISMO ===\n")

class Forma:
    def calcular_area(self):
        raise NotImplementedError

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

formas = [Circulo(5), Rectangulo(4, 6)]
for forma in formas:
    print(f"Área: {forma.calcular_area():.2f}")

# EJERCICIO 4: Métodos estáticos
print("\n=== EJERCICIO 4: MÉTODOS ESTÁTICOS ===\n")

class Matematica:
    @staticmethod
    def sumar(a, b):
        return a + b
    
    @staticmethod
    def multiplicar(a, b):
        return a * b

print(f"5 + 3 = {Matematica.sumar(5, 3)}")
print(f"5 * 3 = {Matematica.multiplicar(5, 3)}")

# EJERCICIO 5: Propiedades (property)
print("\n=== EJERCICIO 5: PROPIEDADES ===\n")

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
            print("Error: saldo no puede ser negativo")
    
    def depositar(self, cantidad):
        self._saldo += cantidad

cuenta = Cuenta("Juan", 1000)
print(f"Saldo: ${cuenta.saldo}")
cuenta.depositar(500)
print(f"Después depositar: ${cuenta.saldo}")

# EJERCICIO 6: Encapsulación
print("\n=== EJERCICIO 6: ENCAPSULACIÓN ===\n")

class Empleado:
    def __init__(self, nombre, salario):
        self.nombre = nombre
        self.__salario = salario
    
    def obtener_salario(self):
        return self.__salario
    
    def aumentar_salario(self, porcentaje):
        self.__salario *= (1 + porcentaje / 100)

emp = Empleado("Carlos", 2000)
print(f"Salario inicial: ${emp.obtener_salario()}")
emp.aumentar_salario(10)
print(f"Con 10% aumento: ${emp.obtener_salario():.2f}")

# EJERCICIO 7: Composición
print("\n=== EJERCICIO 7: COMPOSICIÓN ===\n")

class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

class Auto:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.motor = None
    
    def instalar_motor(self, motor):
        self.motor = motor

auto = Auto("Toyota", "Corolla")
auto.instalar_motor(Motor("V6", 200))
print(f"{auto.marca} {auto.modelo}")
print(f"Motor: {auto.motor.tipo} ({auto.motor.potencia} HP)")

# EJERCICIO 8: Métodos especiales
print("\n=== EJERCICIO 8: MÉTODOS ESPECIALES ===\n")

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def __str__(self):
        return f"Punto({self.x}, {self.y})"
    
    def __repr__(self):
        return f"Punto(x={self.x}, y={self.y})"

p = Punto(3, 4)
print(f"str: {str(p)}")
print(f"repr: {repr(p)}")

# EJERCICIO 9: Clases abstractas
print("\n=== EJERCICIO 9: ABSTRACTAS ===\n")

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

tarjeta = TarjetaCredito("1234-5678-9012-3456")
print(tarjeta.pagar(100))

# EJERCICIO 10: Sistema completo
print("\n=== EJERCICIO 10: SISTEMA COMPLETO ===\n")

class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
        self.publicaciones = []
    
    def publicar(self, contenido):
        self.publicaciones.append(contenido)

class RedSocial:
    def __init__(self):
        self.usuarios = {}
    
    def registrar(self, nombre, email):
        self.usuarios[nombre] = Usuario(nombre, email)
    
    def publicar(self, usuario, contenido):
        if usuario in self.usuarios:
            self.usuarios[usuario].publicar(contenido)

red = RedSocial()
red.registrar("Juan", "juan@email.com")
red.publicar("Juan", "¡Hola a todos!")
print(f"Publicaciones de Juan: {len(red.usuarios['Juan'].publicaciones)}")

"""
SALIDA ESPERADA (Parcial):
=== EJERCICIO 1: CLASES BÁSICAS ===

Hola, soy Juan y tengo 25 años

...
"""
