"""
TEMA 8: DICCIONARIOS Y CONJUNTOS
EJERCICIO 10: APLICACIÓN INTEGRADA
===================================

Aplicación compleja usando diccionarios y conjuntos
"""

# GESTOR DE CONTACTOS
print("=== GESTOR DE CONTACTOS ===\n")

contactos = {
    "Juan": {"email": "juan@email.com", "teléfono": "123456"},
    "Ana": {"email": "ana@email.com", "teléfono": "654321"},
    "Carlos": {"email": "carlos@email.com", "teléfono": "789012"}
}

def agregar_contacto(nombre, email, telefono):
    contactos[nombre] = {"email": email, "teléfono": telefono}
    print(f"Contacto '{nombre}' agregado")

def buscar_contacto(nombre):
    if nombre in contactos:
        return contactos[nombre]
    return "No encontrado"

print("Contactos iniciales:")
for nombre, info in contactos.items():
    print(f"  {nombre}: {info['email']}")

agregar_contacto("Maria", "maria@email.com", "111222")
print(f"\nBúsqueda 'Maria': {buscar_contacto('Maria')}")

# ANÁLISIS DE DATOS
print("\n=== ANÁLISIS ===\n")

datos = [
    {"id": 1, "nombre": "Producto A", "categoría": "electrónica"},
    {"id": 2, "nombre": "Producto B", "categoría": "ropa"},
    {"id": 3, "nombre": "Producto C", "categoría": "electrónica"},
    {"id": 4, "nombre": "Producto D", "categoría": "alimentos"}
]

categorías = {}
for item in datos:
    cat = item["categoría"]
    if cat not in categorías:
        categorías[cat] = []
    categorías[cat].append(item["nombre"])

print("Productos por categoría:")
for cat, productos in categorías.items():
    print(f"  {cat}: {productos}")

# ESTADÍSTICAS
print("\n=== ESTADÍSTICAS ===\n")

calificaciones = {
    "Juan": [8, 9, 7, 8],
    "Ana": [9, 8, 9, 10],
    "Carlos": [6, 7, 8, 7]
}

estadisticas = {}
for nombre, notas in calificaciones.items():
    estadisticas[nombre] = {
        "promedio": sum(notas) / len(notas),
        "máximo": max(notas),
        "mínimo": min(notas)
    }

print("Estadísticas por estudiante:")
for nombre, stats in estadisticas.items():
    print(f"  {nombre}: {stats}")

"""
SALIDA ESPERADA:
=== GESTOR DE CONTACTOS ===

Contactos iniciales:
  Juan: juan@email.com
  Ana: ana@email.com
  Carlos: carlos@email.com
Contacto 'Maria' agregado

Búsqueda 'Maria': {'email': 'maria@email.com', 'teléfono': '111222'}

=== ANÁLISIS ===

Productos por categoría:
...
"""
