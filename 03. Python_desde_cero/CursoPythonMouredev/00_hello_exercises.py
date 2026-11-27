# 1. Imprime "¡Hola Mundo!" por consola.

print("¡Hola Mundo!")

# 2. Escribe un comentario de una sola línea explicando qué hace el código del Ejercicio 1.

# Imprime ¿Hola Mundo! por pantalla
print("¡Hola Mundo!")

# 3. Imprime tu nombre y edad en la misma línea utilizando la función print.

print("Jose Díaz")

# 4. Usa la función type() para imprimir el tipo de dato de una cadena de texto, un número entero y un número decimal.

print(type("Jose Díaz"))
print(type(10))
print(type(1.25))
print(type(print(type(1.25))))

# 5. Escribe un comentario en varias líneas explicando qué son los tipos de datos en Python.

"""
¿Qué son los tipos de datos en Python?
Los tipos de datos son categorías
que determinan qué valores podemos representar y 
qué operaciones admiten, así como su comportamiento.
"""

# 6. Imprime el resultado de concatenar dos cadenas de texto, por ejemplo: "Hola" y "Mundo".

print("Hola" + "Mundo")

# 7. Crea una variable para almacenar tu nombre, otra para tu edad, e imprime ambas en la misma línea.

name = "Jose"
age = 43

print("Mi nombre es", name, "y tengo", age, "años.")

# 8. Escribe un programa que solicite al usuario su nombre y lo imprima junto con un saludo.

name = input("Introduce tu nombre: ")
print(name)

# 9. Usa print() para mostrar el resultado de la suma de dos números enteros y el tipo de dato resultante.

num1 = 2
num2 = 3
result = num1 + num2
print(result)
print(type(result))

# 10. Comenta el código del Ejercicio 9, y explica qué hace cada línea usando comentarios de una sola línea.

num1 = 2                # Declara una variable de valor 2 (int)
num2 = 3                # Declara una variable de valor 3 (int)
result = num1 + num2    # Realiza la operación suma: 2 + 3 (int)
print(result)           # Imprime el resultado de la operación: 5
print(type(result))     # Imprime el tipo de la variable result: 'int'
