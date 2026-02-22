"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 2: HERENCIA
======================

Define clases padre e hijas con herencia
"""

# HERENCIA BÁSICA
print("=== HERENCIA BÁSICA ===\n")

class Animal:
    def __init__(self, nombre, sonido):
        self.nombre = nombre
        self.sonido = sonido
    
    def hacer_sonido(self):
        return f"{self.nombre} hace: {self.sonido}"

class Perro(Animal):
    def traer(self):
        return f"{self.nombre} trae la pelota"

class Gato(Animal):
    def arañar(self):
        return f"{self.nombre} araña los muebles"

perro = Perro("Rex", "¡Guau!")
gato = Gato("Misu", "Miau")

print(perro.hacer_sonido())
print(perro.traer())

print("\n" + gato.hacer_sonido())
print(gato.arañar())

# HERENCIA MULTINIVEL
print("\n=== HERENCIA MULTINIVEL ===\n")

class Vehiculo:
    def __init__(self, marca):
        self.marca = marca

class Auto(Vehiculo):
    def __init__(self, marca, modelo):
        super().__init__(marca)
        self.modelo = modelo

class ElectricAuto(Auto):
    def __init__(self, marca, modelo, bateria):
        super().__init__(marca, modelo)
        self.bateria = bateria

auto = ElectricAuto("Tesla", "Model 3", "100 kWh")
print(f"Auto: {auto.marca} {auto.modelo}, Batería: {auto.bateria}")

# MÉTODO SUPER()
print("\n=== SUPER() ===\n")

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Empleado(Persona):
    def __init__(self, nombre, edad, salario):
        super().__init__(nombre, edad)
        self.salario = salario
    
    def info(self):
        return f"{self.nombre}, {self.edad} años, ${self.salario}"

emp = Empleado("Juan", 25, 2000)
print(emp.info())

"""
SALIDA ESPERADA:
=== HERENCIA BÁSICA ===

Rex hace: ¡Guau!
Rex trae la pelota

Misu hace: Miau
Misu araña los muebles

=== HERENCIA MULTINIVEL ===

Auto: Tesla Model 3, Batería: 100 kWh
...
"""
