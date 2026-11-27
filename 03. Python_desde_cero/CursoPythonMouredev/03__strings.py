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

# Secuencias de escape en cadenas de caracteres
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

# Concatenación

print(my_string + ", " + my_other_string + "\n")

# Formatear String
# De más adecuado a menos:
name, surname, age = "Jose", "Díaz", 35

print(f"Mi nombre es {name} {surname} y mi edad es {age}")                  # Interpolación de cadenas / f-Strings (Python 3.6+)
print("Mi nombre es {} {} y mi edad es {}".format(name, surname, age))      # formato de cadena (str.format)
print("Mi nombre es %s %s y mi edad es %d" %(name, surname, age))           # Formato de cadena de estilo antiguo (operador %)
print("Mi nombre es " + name + " " + surname + " y mi edad es " + str(age)) # También es posible, pero no aconsejado

# Desempaquetado de caracteres
