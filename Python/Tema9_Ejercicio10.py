"""
TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS
EJERCICIO 10: RED SOCIAL (INTEGRACIÓN)
======================================

Sistema completo integrando todos los conceptos
"""

# RED SOCIAL
print("=== RED SOCIAL ===\n")

from datetime import datetime

class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
        self._amigos = set()
        self.publicaciones = []
    
    def agregar_amigo(self, usuario):
        self._amigos.add(usuario.nombre)
        print(f"  {self.nombre} y {usuario.nombre} son amigos")
    
    def obtener_amigos(self):
        return list(self._amigos)
    
    def publicar(self, contenido):
        pub = {"contenido": contenido, "fecha": datetime.now()}
        self.publicaciones.append(pub)
        print(f"  {self.nombre} publicó: {contenido}")

class Publicacion:
    def __init__(self, autor, contenido):
        self.autor = autor
        self.contenido = contenido
        self.likes = 0
        self.comentarios = []
    
    def dar_like(self):
        self.likes += 1
    
    def comentar(self, comentario):
        self.comentarios.append(comentario)

class RedSocial:
    def __init__(self, nombre):
        self.nombre = nombre
        self.usuarios = {}
    
    def registrar_usuario(self, nombre, email):
        if nombre not in self.usuarios:
            self.usuarios[nombre] = Usuario(nombre, email)
            print(f"  Usuario '{nombre}' registrado")
            return self.usuarios[nombre]
        return None
    
    def conectar_usuarios(self, nombre1, nombre2):
        if nombre1 in self.usuarios and nombre2 in self.usuarios:
            self.usuarios[nombre1].agregar_amigo(self.usuarios[nombre2])
            self.usuarios[nombre2].agregar_amigo(self.usuarios[nombre1])
    
    def obtener_usuario(self, nombre):
        return self.usuarios.get(nombre)

# CREAR RED SOCIAL
print(f"Creando '{usuario}\n")

red = RedSocial("Mi Red Social")

# Registrar usuarios
juan = red.registrar_usuario("Juan", "juan@email.com")
ana = red.registrar_usuario("Ana", "ana@email.com")
carlos = red.registrar_usuario("Carlos", "carlos@email.com")

# Conectar usuarios
print("\nConectando usuarios:")
red.conectar_usuarios("Juan", "Ana")
red.conectar_usuarios("Juan", "Carlos")
red.conectar_usuarios("Ana", "Carlos")

# Publicar
print("\nPublicando contenido:")
juan.publicar("¡Hola a todos!")
ana.publicar("¿Cómo están?")
carlos.publicar("Saludos desde Madrid")

# Mostrar información
print("\nInformación de usuarios:")
for nombre in ["Juan", "Ana", "Carlos"]:
    usuario = red.obtener_usuario(nombre)
    print(f"  {usuario.nombre}:")
    print(f"    Email: {usuario.email}")
    print(f"    Amigos: {usuario.obtener_amigos()}")
    print(f"    Publicaciones: {len(usuario.publicaciones)}")

"""
SALIDA ESPERADA:
=== RED SOCIAL ===

Creando red social

  Usuario 'Juan' registrado
  Usuario 'Ana' registrado
  Usuario 'Carlos' registrado

Conectando usuarios:
  Juan y Ana son amigos
  Ana y Juan son amigos
  Juan y Carlos son amigos
  Carlos y Juan son amigos
  Ana y Carlos son amigos
  Carlos y Ana son amigos

Publicando contenido:
  Juan publicó: ¡Hola a todos!
  Ana publicó: ¿Cómo están?
  Carlos publicó: Saludos desde Madrid

Información de usuarios:
  Juan:
    Email: juan@email.com
    Amigos: ['Ana', 'Carlos']
    Publicaciones: 1
...
"""
