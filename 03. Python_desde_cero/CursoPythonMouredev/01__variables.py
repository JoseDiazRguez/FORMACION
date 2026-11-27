# Variables: Se escriben todas en menúsculas, y si es compuesta se separa con "_" (snake_case)

my_string_variable = "My String variable"
print(my_string_variable)

my_int_variable = 5
print(my_int_variable)

my_bool_variable = True
print(my_bool_variable)

# Concatenación de variables en un print
print(my_string_variable, my_int_variable, my_bool_variable)
print("Este es el valor de:", my_bool_variable)

# str()
my_int_to_str_variable = str(my_int_variable)
print(my_int_to_str_variable)
print(type(my_int_to_str_variable))

# len()
print(len(my_string_variable))

# Variables en una sola línea
name, surname, alias, age = "Jose", "Díaz", "Jose Díaz", 43
print("Me llamo:", name, surname, ". Mi edad es:", age, ". Y mi alias: ", alias)

# Inputs
name = input("¿Cuál es tu nombre? ")
age = input("¿Cuántos años tienes? ")
print(name)
print(age)

# No tiene tipado fuerte --> Se puede cambiar el tipo de dato:
name = 43
age = "Jose"
print(name)
print(age)

# Forzamos el tipo y después le cambiamos la varible
# --> Cambia de tipo de variable de nuevo, solo se suele poner si queremos recordar qué tipo de variable tengo
address: str = "Mi dirección"
address = 32
print(type(address))