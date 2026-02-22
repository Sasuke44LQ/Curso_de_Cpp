"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 7: COMPOSICIÓN
==========================

Combina objetos (relación "tiene-un")
"""

# COMPOSICIÓN BÁSICA
print("=== COMPOSICIÓN BÁSICA ===\n")

class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia
    
    def info(self):
        return f"{self.tipo} ({self.potencia} HP)"

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
print(f"Motor: {auto.motor.info()}")

# COMPOSICIÓN COMPLEJA
print("\n=== COMPOSICIÓN COMPLEJA ===\n")

class Llantas:
    def __init__(self, marca, tamaño):
        self.marca = marca
        self.tamaño = tamaño

class AutoCompleto:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.motor = None
        self.llantas = []
    
    def instalar_motor(self, motor):
        self.motor = motor
    
    def instalar_llantas(self, cantidad, marca, tamaño):
        self.llantas = [Llantas(marca, tamaño) for _ in range(cantidad)]

auto = AutoCompleto("BMW", "X5")
auto.instalar_motor(Motor("V8TwinTurbo", 500))
auto.instalar_llantas(4, "Michelin", "20 pulgadas")

print(f"{auto.marca} {auto.modelo}")
print(f"Motor: {auto.motor.info()}")
print(f"Llantas: {len(auto.llantas)} x {auto.llantas[0].marca} {auto.llantas[0].tamaño}")

# OFICINA CON EMPLEADOS
print("\n=== OFICINA ===\n")

class Empleado:
    def __init__(self, nombre, cargo):
        self.nombre = nombre
        self.cargo = cargo

class Oficina:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []
    
    def contratar(self, nombre, cargo):
        self.empleados.append(Empleado(nombre, cargo))
    
    def listar_empleados(self):
        for emp in self.empleados:
            print(f"  {emp.nombre} - {emp.cargo}")

oficina = Oficina("Tech Solutions")
oficina.contratar("Juan", "Desarrollador")
oficina.contratar("Ana", "Diseñadora")
oficina.contratar("Carlos", "Gerente")

print(f"Empleados en {oficina.nombre}:")
oficina.listar_empleados()

"""
SALIDA ESPERADA:
=== COMPOSICIÓN BÁSICA ===

Toyota Corolla
Motor: V6 (200 HP)

=== COMPOSICIÓN COMPLEJA ===

BMW X5
Motor: V8TwinTurbo (500 HP)
Llantas: 4 x Michelin 20 pulgadas

=== OFICINA ===

Empleados en Tech Solutions:
  Juan - Desarrollador
  Ana - Diseñadora
  Carlos - Gerente
"""
