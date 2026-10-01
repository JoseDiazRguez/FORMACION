Markdown es un lenguaje fácil de leer y escribir para aplicar formato al texto sin formato. Puede usar la sintaxis Markdown, junto con algunas etiquetas HTML adicionales, para dar formato al texto en GitHub, en lugares como los archivos README del repositorio y los comentarios en solicitudes de incorporación de cambios e incidencias. En esta guía, aprenderás algunas opciones avanzadas de formato al crear o editar un README de tu perfil GitHub:

- https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github

Ejercicios:

Crea un encabezado de primer nivel

# Encabezado de primer nivel

Crea un encabezado de segundo nivel

## Encabezado de segundo nivel

Crea un encabezado de cuarto nivel

#### Encabezado de cuarto nivel

Pon una frase en negrita

**Frase en negrita**

Pon sólo una palabra de una frase en negrita

Sólo una **palabra** está en negrita

Pon una frase en cursiva

*Frase en cursiva*

Pon dos palabras alternas de una frase en cursiva

SÃ³lo dos *palabras* alternas *están* en cursiva

Pon una palabra en negrita y cursiva a la vez

***Palabra***

Subraya una frase

<ins>Esta frase está subrayada</ins>

Crea un subíndice

Este es un <sub>subíndice</sub>

Crea un superíndice

Este es un <sup>superíndice</sup>

Crea un link

[Link a mouredev.pro](https://mouredev.pro)

AÃ±ade una imagen desde una url remota

![](https://mouredev.pro/preview.jpg)

Crea una imagen con un link

[![Preview de mouredev pro](https://mouredev.pro/preview.jpg)](https://mouredev.pro)

Crea una cita

> Esta es una cita

Crea una lista con puntos

* Elemento 1
* Elemento 2
* Elemento 3

Crea una lista con puntos a diferentes niveles

* Elemento 1
	* Elemento 2
		* Elemento 3

Crea una lista con números

1. Elemento 1
2. Elemento 2
3. Elemento 3

Crea una lista con números a diferentes niveles

1. Elemento 1
	2. Elemento 2
		3. Elemento 3

Crea un texto con visualización de código

`print("Hola, Mundo!")`

Crea un bloque completo de código de más de una línea

```
for index in range(0, 10):
	print(f"{index}")
	if index == 5:
		break
```

Crea una tabla

| #  | Nombre         | Edad | Paí­s       |
|----|----------------|------|------------|
| 1  | Brais          | 37   | México     |
| 2  | María          | 34   | México     |
| 3  | Sara           | 22   | Argentina  |

Añade HTML

<table>
    <thead>
        <tr>
            <th>#</th>
            <th>Nombre</th>
            <th>Edad</th>
            <th>PaÃ­s</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td>Brais</td>
            <td>37</td>
            <td>España</td>
        </tr>
        <tr>
            <td>2</td>
            <td>María</td>
            <td>34</td>
            <td>México</td>
        </tr>
        <tr>
            <td>3</td>
            <td>Sara</td>
            <td>22</td>
            <td>Argentina</td>
        </tr>
    </tbody>
</table>

