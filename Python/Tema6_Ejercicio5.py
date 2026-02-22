"""
TEMA 6: CADENAS DE CARACTERES
EJERCICIO 5: VALIDACIONES
==========================

Valida tipos de caracteres: isdigit, isalpha, isalnum, isspace
"""

# VALIDACIONES BÁSICAS
print("=== VALIDACIONES BÁSICAS ===\n")

pruebas = ["12345", "abcde", "abc123", "....", "     "]

for texto in pruebas:
    print(f"'{texto}': ", end="")
    if texto.isdigit():
        print("Dígitos")
    elif texto.isalpha():
        print("Alfabético")
    elif texto.isalnum():
        print("Alfanumérico")
    elif texto.isspace():
        print("Espacios")
    else:
        print("Símbolos/Mixto")

# VALIDACIÓN INDIVIDUAL
print("\n=== VALIDACIÓN INDIVIDUAL ===\n")

pruebas_dict = {
    "12345": ["isdigit", "isalnum"],
    "abcde": ["isalpha", "isalnum"],
    "aBcDe": ["isalpha", "isupper", "islower"],
    "     ": ["isspace"],
    "Hello123": ["isalnum"]
}

for texto, metodos in pruebas_dict.items():
    print(f"'{texto}':")
    for metodo in metodos:
        resultado = getattr(texto, metodo)()
        print(f"  {metodo}(): {resultado}")

# VALIDACIÓN PRÁCTICA
print("\n=== VALIDACIÓN PRÁCTICA ===\n")

def validar_entrada(entrada):
    if entrada.isdigit():
        return "Es número"
    elif entrada.isalpha():
        return "Es texto"
    elif entrada.isalnum():
        return "Es texto+número"
    else:
        return "Contiene símbolos"

entradas = ["123", "abc", "abc123", "abc-123"]
for entrada in entradas:
    print(f"{entrada}: {validar_entrada(entrada)}")

"""
SALIDA ESPERADA:
=== VALIDACIONES BÁSICAS ===

'12345': Dígitos
'abcde': Alfabético
'abc123': Alfanumérico
'....': Símbolos/Mixto
'     ': Espacios
...
"""
