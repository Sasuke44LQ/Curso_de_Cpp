"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 4: MÉTODOS ESTÁTICOS Y DE CLASE
===========================================

Métodos que pertenecen a la clase, no a instancias
"""

# MÉTODOS ESTÁTICOS
print("=== MÉTODOS ESTÁTICOS ===\n")

class Matematica:
    @staticmethod
    def sumar(a, b):
        return a + b
    
    @staticmethod
    def multiplicar(a, b):
        return a * b
    
    @staticmethod
    def es_par(n):
        return n % 2 == 0

print(f"5 + 3 = {Matematica.sumar(5, 3)}")
print(f"5 * 3 = {Matematica.multiplicar(5, 3)}")
print(f"4 es par: {Matematica.es_par(4)}")

# MÉTODOS DE CLASE (CLASSMETHOD)
print("\n=== MÉTODOS DE CLASE ===\n")

class Contador:
    instancias = 0
    
    def __init__(self, nombre):
        self.nombre = nombre
        Contador.instancias += 1
    
    @classmethod
    def obtener_total(cls):
        return cls.instancias

c1 = Contador("A")
c2 = Contador("B")
c3 = Contador("C")

print(f"Total de instancias: {Contador.obtener_total()}")

# COMBINACIÓN
print("\n=== COMBINACIÓN ===\n")

class Configuracion:
    idioma = "español"
    volumen = 80
    
    @classmethod
    def cambiar_idioma(cls, nuevo_idioma):
        cls.idioma = nuevo_idioma
        print(f"Idioma cambiado a: {nuevo_idioma}")
    
    @staticmethod
    def validar_volumen(vol):
        return 0 <= vol <= 100

print(f"Idioma: {Configuracion.idioma}")
Configuracion.cambiar_idioma("inglés")
print(f"Volumen válido: {Configuracion.validar_volumen(50)}")

"""
SALIDA ESPERADA:
=== MÉTODOS ESTÁTICOS ===

5 + 3 = 8
5 * 3 = 15
4 es par: True

=== MÉTODOS DE CLASE ===

Total de instancias: 3

=== COMBINACIÓN ===

Idioma: español
Idioma cambiado a: inglés
Volumen válido: True
"""
