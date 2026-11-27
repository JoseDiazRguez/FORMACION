### Operadores ###

# Arithmetic Operations in Python

print(3 + 4)                        # Adición
print(3 - 4)                        # Sustracción
print(3 * 4)                        # Multiplicación
print(3 / 4)                        # División
print(10 % 3)                       # Módulo
print(10 // 3)                      # División entera (redondea hacia abajo) [Floor division]
print(2 ** 3)                       # Potencia (2^3) [Exponentiation]

print('Addition: ', 1 + 2)          # 3
print('Subtraction: ', 2 - 1)       # 1
print('Multiplication: ', 2 * 3)    # 6
print ('Division: ', 4 / 2)         # 2.0  Division in Python gives floating number
print('Division: ', 6 / 2)          # 3.0         
print('Division: ', 7 / 2)          # 3.5
print('Division without the remainder: ', 7 // 2)   # 3,  gives without the floating number or without the remaining
print ('Division without the remainder: ',7 // 3)   # 2
print('Modulus: ', 3 % 2)           # 1, Gives the remainder
print('Exponentiation: ', 2 ** 3)   # 8 it means 2 * 2 * 2

print(2 ** 3 + 3 - 7 / 1 // 4)

# Complex numbers

print('Complex number: ', 1 + 1j)
print('Multiplying complex numbers: ',(1 + 1j) * (1 - 1j))

#### Ejemplos ####

# Calculating area of a circle
radius = 10                                 # radius of a circle
area_of_circle = 3.14 * radius ** 2         # two * sign means exponent or power
print('Area of a circle:', area_of_circle)

# Calculating area of a rectangle
length = 10
width = 20
area_of_rectangle = length * width
print('Area of rectangle:', area_of_rectangle)

# Calculating a weight of an object
mass = 75
gravity = 9.81
weight = mass * gravity
print(weight, 'N')                         # Adding unit to the weight

# Calculate the density of a liquid
mass = 75 # in Kg
volume = 0.075 # in cubic meter
density = mass / volume # 1000 Kg/m^3
print(density, 'Kg/m^3') # Adding unit to the density

print("Hola " + "Python")       # Hola Python
print("Hola " + str(5))         # Hola 5
print("Hola " * 5)              # Hola Hola Hola Hola Hola 
print("Hola " * (2 ** 3))       # Hola Hola Hola Hola Hola Hola Hola Hola
print("Hola " * int(2.5 * 2))   # Hola Hola Hola Hola Hola 


### Operadores comparativos ###

print (3 > 4)           # False
print (3 < 4)           # True
print (3 >= 4)          # False
print (3 == 4)          # False
print (3 <= 4)          # True
print (3 != 4)          # True
print (3 > 4 == 2)      # False

# No cuenta letras ---> Ordenación alfabética por ASCII
print ("Hola" > "Python")   # False
print ("Hola" < "Python")   # True
print ("Hola" >= "Python")  # False
print ("Hola" >= "Bola")    # True:    Ordenación alfabética por ASCII
print ("Hola" >= "Zola")    # False:   Ordenación alfabética por ASCII
print ("Hola" == "Python")  # False
print ("Hola" <= "Python")  # True
print ("Hola" != "Python")  # True

# Cuenta caracteres
print (len("Hola") > len("Python")) # False

### Operadores lógicos ###

print(3 > 4 and "Hola" > "Python")  # False
print(3 > 4 or "Hola" > "Python")   # False

print(3 < 4 and "Hola" < "Python")  # True
print(3 < 4 or "Hola" < "Python")   # True

print(3 < 4 and "Hola" > "Python")  # False
print(3 < 4 or "Hola" > "Python")   # True

print(3 < 4 or ("Hola" > "Python" and 4==4))    # True

print(not("Hola" > "Python"))       # True