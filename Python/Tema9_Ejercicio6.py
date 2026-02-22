"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 6: ENCAPSULACIÓN
===========================

Controla el acceso a atributos privados
"""

# ATRIBUTOS PRIVADOS
print("=== PRIVADOS ===\n")

class Empleado:
    def __init__(self, nombre, salario):
        self.nombre = nombre
        self.__salario = salario
    
    def obtener_salario(self):
        return self.__salario
    
    def aumentar_salario(self, porcentaje):
        if porcentaje > 50:
            print("Error: aumento máximo 50%")
            return
        self.__salario *= (1 + porcentaje / 100)

emp = Empleado("Carlos", 2000)
print(f"Salario: ${emp.obtener_salario()}")

emp.aumentar_salario(10)
print(f"Con 10% aumento: ${emp.obtener_salario():.2f}")

emp.aumentar_salario(60)

# MÉTODOS DE VALIDACIÓN
print("\n=== VALIDACIÓN ===\n")

class BancoCuenta:
    def __init__(self, numero, saldo=0):
        self.__numero = numero
        self.__saldo = saldo
        self.__historial = []
    
    def depositar(self, cantidad):
        if cantidad <= 0:
            print("Error: cantidad debe ser positiva")
            return
        self.__saldo += cantidad
        self.__historial.append(f"Depósito: ${cantidad}")
    
    def retirar(self, cantidad):
        if cantidad <= 0:
            print("Error: cantidad debe ser positiva")
            return
        if cantidad > self.__saldo:
            print("Error: fondos insuficientes")
            return
        self.__saldo -= cantidad
        self.__historial.append(f"Retiro: ${cantidad}")
    
    def obtener_saldo(self):
        return self.__saldo

cuenta = BancoCuenta("123456", 1000)
print(f"Saldo inicial: ${cuenta.obtener_saldo()}")

cuenta.depositar(500)
print(f"Después depositar: ${cuenta.obtener_saldo()}")

cuenta.retirar(200)
print(f"Después retirar: ${cuenta.obtener_saldo()}")

cuenta.retirar(2000)

"""
SALIDA ESPERADA:
=== PRIVADOS ===

Salario: $2000
Con 10% aumento: $2200.00
Error: aumento máximo 50%

=== VALIDACIÓN ===

Saldo inicial: $1000
Después depositar: $1500
Después retirar: $1300
Error: fondos insuficientes
"""
