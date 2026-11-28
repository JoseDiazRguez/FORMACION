### Strings ###

# Strings

letter = 'P'        # Se puede poner "" o ''
print(letter)
print(len(letter))

my_string = "Mi string"                 # Se puede poner "" o ''
my_other_string = 'Mi otro String'      # Se puede poner "" o ''
print(len(my_string))
print(len(my_other_string))

# Cadenas de texto multilíneas

multiline_string = """Este es un texto escrito
en multilínea, ya que ocupa
mucho espacio."""
print(multiline_string + "\n")

### Secuencias de escape en cadenas de caracteres
# --> la barra invertida seguida de un carácter es una secuencia de escape

my_new_line_string = "Este es un String\ncon salto de línea"
print(my_new_line_string + "\n")

my_tab_string = "\tEste es un String con tabulación"
print(my_tab_string + "\n")

my_scape_string = "\tEste es un String con tabulación"

print('Dias\tTópicos\tEjercicios') # adding tab space or 4 spaces
print('Día 1\t5\t5')
print('Día 2\t6\t20')
print('Día 3\t5\t23')
print('Día 4\t1\t35')
print('Esta es una barra invertida (\\)') # Barra invertida (\ --> backslash)

### Concatenación

print(my_string + ", " + my_other_string + "\n")

### Formatear String --> de más adecuado a menos:
name, surname, age = "Jose", "Díaz", 35

# 1)  - Interpolación de cadenas / f-Strings (Python 3.6+)
print(f"Mi nombre es {name} {surname} y mi edad es {age}")

a = 4
b = 3
print(f'{a} + {b} = {a +b}')
print(f'{a} - {b} = {a - b}')
print(f'{a} * {b} = {a * b}')
print(f'{a} / {b} = {a / b:.2f}')
print(f'{a} % {b} = {a % b}')
print(f'{a} // {b} = {a // b}')
print(f'{a} ** {b} = {a ** b}')

# 2a) - Formato de cadena (str.format)
print("Mi nombre es {} {} y mi edad es {}".format(name, surname, age))
a = 4
b = 3
print('{} + {} = {}'.format(a, b, a + b))
print('{} - {} = {}'.format(a, b, a - b))
print('{} * {} = {}'.format(a, b, a * b))
print('{} / {} = {:.2f}'.format(a, b, a / b))   # Límite de dos dígitos decimales
print('{} % {} = {}'.format(a, b, a % b))
print('{} // {} = {}'.format(a, b, a // b))
print('{} ** {} = {}'.format(a, b, a ** b))

# 2b) - Strings  and numbers
radius = 10
pi = 3.14
area = pi * radius ** 2
formated_string = 'The area of a circle with a radius {} is {:.2f}.'.format(radius, area) # 2 digits after decimal
print(formated_string)

# 3) - Formato de cadena de estilo antiguo (operador %)
print("Mi nombre es %s %s y mi edad es %d" %(name, surname, age))

# 4) - También es posible, pero no aconsejado
print("Mi nombre es " + name + " " + surname + " y mi edad es " + str(age))

### Desempaquetado de caracteres

languaje = "Python"
a,b,c,d,e,f = languaje  # Desempaquetar secuencia de caracteres
print(a) # P
print(b) # y
print(c) # t
print(d) # h
print(e) # o
print(f) # n
print("\n")

### Acceso a caracteres en cadenas mediante índices

first_letter = languaje[0]
print(first_letter)
second_letter = languaje[1]
print(second_letter)
last_letter = languaje[len(languaje) -1]
print(last_letter)
print("\n")

# --> Si queremos comenzar desde el extremo derecho, podemos usar la indexación negativa
last_letter = languaje[-1]
print(last_letter)
second_last = languaje[-2]
print(second_letter)
print("\n")

### Segmentación de cadenas de Python
# --> Podemos dividir cadenas de texto en subcadenas

languaje = "Python"
first_three = languaje[0:3]
print(first_three)
last_three = languaje[3:6]
print(last_three)
last_three_2 = languaje[-3:]    # Otra forma de escribir las 3 últimas
print(last_three_2)
last_three_3 = languaje[3:]     # Otra forma de escribir las 3 últimas
print(last_three_3)

### Invertir una cadena

languaje = "Python"
print(languaje[::-1])

### Saltar caracteres al cortar

languaje = "Python"
pto = languaje[0:6:2]   # secuencia[inicio:fin:paso] --> paso: indica que va de dos en dos
print(pto)

### Métodos de cadena

# Convierte el primer carácter de la cadena a letra mayúscula
challenge ='hola mundo'
print(challenge.capitalize())

# Devuelve las ocurrencias de una subcadena en la cadena count(substring, start=.., end=..). 
# start es el índice inicial para el conteo y end es el último índice a contar
challenge ='hola a todo el mundo'
print(challenge.count('o'))         # Cuenta todas las 'o'
print(challenge.count('o', 9))      # Cuenta todas las 'o' a partir del índice 9 en adelante
print(challenge.count('o', 9, 12))  # Cuenta todas las 'o' a partir del índice 9 hasta el 12

# Comprueba si una cadena termina con un carácter especificado
challenge ='hola a todo el mundo'
print(challenge.endswith('o'))      # ¿Termina la cadena en 'o'?

# Reemplaza el carácter de tabulación con espacios
challenge ='hola\ta\ttodo\tel\tmundo'
print(challenge)
print(challenge.expandtabs(1))
print(challenge.expandtabs(3))
print(challenge.expandtabs(4))
print(challenge.expandtabs(8))
print(challenge.expandtabs())       # El tamaño de tabulación predeterminado es 8



