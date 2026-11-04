# 06. Bucles en Java — Guía de estudio

> **Objetivo:** identificar qué bucle utilizar, cómo recorrer estructuras de datos y cómo controlar las iteraciones. Resumen de la lección `c06_loops.c01_Loops`.

## Índice

| Apartado | Contenido |
|---|---|
| [1. Comparativa rápida](#1-comparativa-rápida) | Elegir entre `for`, `for-each`, `while` y `do-while` |
| [2. Sintaxis esencial](#2-sintaxis-esencial) | Plantillas y lógica de ejecución |
| [3. Recorrer estructuras](#3-recorrer-estructuras) | Array, `HashSet` y `HashMap` |
| [4. Control del bucle](#4-control-del-bucle) | `break`, `continue` y etiquetas |
| [5. Errores frecuentes](#5-errores-frecuentes) | Casos que conviene recordar |
| [6. Chuleta de decisión](#6-chuleta-de-decisión) | Qué usar según el objetivo |
| [7. Autoevaluación](#7-autoevaluación) | Preguntas rápidas |

---

## 1. Comparativa rápida

| Bucle | ¿Cuándo comprueba la condición? | ¿Mínimo de ejecuciones? | ¿Para qué resulta útil? | ¿Necesita índice? |
|---|---|---:|---|---|
| `for` | Antes de cada iteración | 0 | Repeticiones contadas; recorrer posiciones | No siempre, pero es habitual |
| `for-each` | Recorre los elementos disponibles | 0 | Leer elementos sin gestionar índices | No |
| `while` | Antes de cada iteración | 0 | Repetir mientras se cumpla una condición; búsquedas | No |
| `do-while` | Después de cada iteración | **1** | Ejecutar una acción al menos una vez | No |

**Clave para memorizar:** `for` = repeticiones/índice · `for-each` = cada elemento · `while` = mientras sea verdadero · `do-while` = primero ejecutar, después comprobar.

## 2. Sintaxis esencial

| Estructura | Esquema mínimo | Particularidad |
|---|---|---|
| `for` | `for (int i = 0; i < 5; i++) { ... }` | Inicialización → condición → cuerpo → actualización |
| `for-each` | `for (String name : names) { ... }` | `name` recibe cada elemento de `names` |
| `while` | `while (condicion) { ... }` | Puede no ejecutarse nunca |
| `do-while` | `do { ... } while (condicion);` | Se ejecuta al menos una vez; **lleva `;` al final** |

### Cómo funciona un `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// 0, 1, 2, 3, 4
```

| Parte | Significado |
|---|---|
| `int i = 0` | Inicializar el contador una sola vez |
| `i < 5` | Continuar mientras se cumpla la condición |
| `i++` | Incrementar después de cada iteración |
| `i < 5` frente a `i <= 5` | El primero produce 5 iteraciones (`0` a `4`); el segundo, 6 (`0` a `5`) |

### `while` frente a `do-while`

```java
int i = 5;
while (i < 5) { System.out.println(i); i++; } // 0 veces

do { System.out.println(i); i++; } while (i < 5); // 1 vez
```

**Corrección de concepto:** `do-while` no significa «repetir hasta que la condición sea verdadera». **También repite mientras la condición sea verdadera**, pero la evalúa al final.

## 3. Recorrer estructuras

| Estructura | Recorrido habitual | Qué debes recordar |
|---|---|---|
| Array `String[]` | `for (int i = 0; i < names.length; i++)` | Acceder por índice mediante `names[i]`; tamaño con `.length` |
| Array `String[]` | `for (String name : names)` | Leer cada elemento sin índice |
| `ArrayList<String>` | `for (String name : names)` | Conserva el orden de la lista; tamaño con `.size()` |
| `HashSet<Integer>` | `for (int number : numbers)` | No permite duplicados; **no garantiza orden** |
| `HashMap<String, String>` | `for (Map.Entry<String, String> e : emails.entrySet())` | Recorrer parejas clave-valor; **no garantiza orden** |

### `HashMap`: clave y valor

```java
for (Map.Entry<String, String> entry : emails.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

| Método | Resultado |
|---|---|
| `emails.keySet()` | Conjunto de claves |
| `emails.values()` | Colección de valores |
| `emails.entrySet()` | Conjunto de entradas (clave + valor) |
| `entry.getKey()` | Clave de la entrada actual |
| `entry.getValue()` | Valor de la entrada actual |

**Criterio práctico:** utiliza `for` cuando necesites la **posición**; `for-each` cuando solo necesites el **valor**. `for-each` no es necesariamente más rápido ni sirve para modificar posiciones de un array mediante la variable de iteración.

## 4. Control del bucle

| Instrucción | ¿Qué hace? | ¿Continúa el bucle? | Uso típico |
|---|---|---|---|
| `break` | Salir inmediatamente del bucle o `switch` correspondiente | No, sale de ese bucle | Detener una búsqueda al encontrar el elemento |
| `continue` | Saltar lo que resta de la iteración actual | Sí, pasa a la siguiente si procede | Omitir un valor sin detener el recorrido |
| `break etiqueta;` | Salir del bucle etiquetado, incluso si es exterior | No, sale del bucle indicado | Abandonar bucles anidados |
| `continue etiqueta;` | Pasar a la siguiente iteración del bucle etiquetado | Sí, en el bucle indicado | Controlar iteraciones anidadas; uso poco habitual |

### Diferencia visual: `break` y `continue`

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) break;
    System.out.print(i + " ");
}
// 0 1

for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.print(i + " ");
}
// 0 1 3 4
```

### Etiquetas en bucles anidados

```java
externo: for (int j = 0; j < 5; j++) {
    for (int k = 0; k < 5; k++) {
        if (j == 2 && k == 2) break externo;
    }
}
```

Sin etiqueta, `break` saldría **solo del bucle interior** (`k`). Con `break externo`, abandona también el exterior (`j`). Son válidas, aunque las etiquetas suelen reservarse para situaciones concretas porque pueden dificultar la lectura.

**Importante:** `break` **no crea ni deja hilos abiertos**. Solo altera el flujo de control. Si el código gestiona archivos, conexiones u otros recursos, hay que cerrarlos correctamente; para recursos compatibles suele ser útil `try-with-resources`.

## 5. Errores frecuentes

| Error o confusión | Corrección |
|---|---|
| Creer que `do-while` termina cuando la condición se vuelve verdadera | Repite **mientras** sea verdadera; termina cuando es falsa |
| Olvidar incrementar `i` en un `while` | Puede provocar un bucle infinito si la condición nunca cambia |
| Usar `i <= names.length` con `names[i]` | El último índice válido es `names.length - 1`; usar `i < names.length` |
| Suponer que `HashSet` o `HashMap` mantienen el orden de inserción | `HashSet` y `HashMap` no garantizan ese orden |
| Pensar que `break` equivale a `continue` | `break` **sale**; `continue` **salta una vuelta** |
| Escribir `do { ... } while (condicion)` sin `;` | La instrucción necesita punto y coma final |
| Comparar cadenas con `==` | Para comparar contenido, utilizar `name.equals("Díaz")` (o `"Díaz".equals(name)` si puede ser `null`) |
| Usar `Boolean find = false` sin necesidad | `boolean find = false` es suficiente si no necesitas un objeto anulable |

## 6. Chuleta de decisión

| Necesito… | Elegir | Motivo |
|---|---|---|
| Mostrar «Hola» exactamente 5 veces | `for` | Conozco el número de iteraciones |
| Recorrer un array y conocer su posición | `for` | Tengo acceso a `i` |
| Mostrar todos los nombres de un array | `for-each` | No necesito el índice |
| Recorrer un `HashSet` | `for-each` | No existen posiciones accesibles por índice |
| Recorrer claves y valores de un `HashMap` | `for-each` + `entrySet()` | Accedo a ambas partes |
| Buscar hasta encontrar «Díaz» | `while` o `for` + `break` | La búsqueda puede finalizar anticipadamente |
| Mostrar un menú al menos una vez | `do-while` | Primero se muestra, luego se comprueba |
| Omitir un nombre concreto | `continue` | No detengo todo el recorrido |
| Abandonar dos bucles anidados | `break etiqueta;` | Salgo del bucle externo identificado |

## 7. Autoevaluación

| Pregunta | Respuesta breve |
|---|---|
| ¿Qué bucle asegura una primera ejecución? | `do-while` |
| ¿Cuándo usar `for-each` frente a `for`? | Cuando solo interesan los elementos, no sus índices |
| ¿Qué imprime `for (int i = 0; i < 3; i++)`? | Si imprimes `i`: `0`, `1`, `2` |
| ¿Cuál es la diferencia entre `break` y `continue`? | Salir del bucle frente a saltar una iteración |
| ¿Cómo recorres un `HashMap` con clave y valor? | `for (Map.Entry<K,V> e : map.entrySet())` |
| ¿Tiene orden garantizado un `HashSet`? | No |
| ¿Qué riesgo hay en `while (i < 5)` si no cambias `i`? | Bucle infinito |
| ¿`break` deja hilos activos? | No; no crea hilos |

---

**Resumen de una línea:** `for` cuenta · `for-each` recorre · `while` comprueba antes · `do-while` comprueba después · `break` sale · `continue` salta.
