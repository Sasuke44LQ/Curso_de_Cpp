"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 9: PATRÓN SINGLETON
================================

Garantiza una única instancia de una clase
"""

# SINGLETON SIMPLE
print("=== SINGLETON ===\n")

class BaseDatos:
    _instancia = None
    
    def __new__(cls):
        if cls._instancia is None:
            print("  Creando instancia de BaseDatos")
            cls._instancia = super().__new__(cls)
        return cls._instancia
    
    def conectar(self):
        return "Conectado a la base de datos"

bd1 = BaseDatos()
bd2 = BaseDatos()

print(f"bd1 es bd2: {bd1 is bd2}")
print(bd1.conectar())

# SINGLETON CON INICIALIZACIÓN
print("\n=== CON INICIALIZACIÓN ===\n")

class Configuracion:
    _instancia = None
    
    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia.idioma = "español"
            cls._instancia.tema = "claro"
            cls._instancia.volumen = 80
        return cls._instancia

config1 = Configuracion()
config2 = Configuracion()

print(f"config1 idioma: {config1.idioma}")
config1.idioma = "inglés"
print(f"config2 idioma: {config2.idioma}")
print(f"Misma instancia: {config1 is config2}")

# SINGLETON CON DECORATOR
print("\n=== CON DECORATOR ===\n")

def singleton(cls):
    instancia = {}
    
    def obtener_instancia(*args, **kwargs):
        if cls not in instancia:
            instancia[cls] = cls(*args, **kwargs)
        return instancia[cls]
    
    return obtener_instancia

@singleton
class Logger:
    def __init__(self):
        self.mensajes = []
    
    def log(self, mensaje):
        self.mensajes.append(mensaje)
        print(f"  Log: {mensaje}")

logger1 = Logger()
logger2 = Logger()

logger1.log("Evento 1")
logger2.log("Evento 2")

print(f"Instancias iguales: {logger1 is logger2}")
print(f"Total mensajes: {len(logger1.mensajes)}")

"""
SALIDA ESPERADA:
=== SINGLETON ===

  Creando instancia de BaseDatos
bd1 es bd2: True
Conectado a la base de datos

=== CON INICIALIZACIÓN ===

config1 idioma: español
config2 idioma: inglés
Misma instancia: True

=== CON DECORATOR ===

  Log: Evento 1
  Log: Evento 2
Instancias iguales: True
Total mensajes: 2
"""
