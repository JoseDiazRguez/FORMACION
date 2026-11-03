# 05. Estructuras de datos en Java — Guía de estudio

> **Objetivo:** distinguir rápidamente `Array`, `ArrayList`, `HashSet` y `HashMap`, recordar sus operaciones y saber cuándo utilizar cada estructura. Esta guía complementa los ejercicios `c01_Arrays.java`, `c02_List.java`, `c03_Sets.java` y `c04_Maps.java`; no los reproduce.

## Índice

1. [Comparación general](#1-comparación-general)
2. [¿Cuál debo utilizar?](#2-cuál-debo-utilizar)
3. [Operaciones equivalentes](#3-operaciones-equivalentes)
4. [Array: posiciones y tamaño fijo](#4-array-posiciones-y-tamaño-fijo)
5. [ArrayList: lista flexible](#5-arraylist-lista-flexible)
6. [HashSet: elementos únicos](#6-hashset-elementos-únicos)
7. [HashMap: claves y valores](#7-hashmap-claves-y-valores)
8. [Operaciones de conjuntos](#8-operaciones-de-conjuntos)
9. [Errores y matices importantes](#9-errores-y-matices-importantes)
10. [Autoevaluación](#10-autoevaluación)

---

## 1. Comparación general

| Característica | `Array` | `ArrayList` | `HashSet` | `HashMap` |
|---|---|---|---|---|
| **Qué almacena** | Elementos del mismo tipo | Elementos del mismo tipo | Elementos **sin duplicados** | Pares **clave → valor** |
| **Tamaño** | Fijo | Dinámico | Dinámico | Dinámico |
| **Orden** | Conserva posiciones | Conserva orden de inserción | **No garantiza** orden de iteración | **No garantiza** orden de iteración |
| **Acceso por índice** | Sí: `[i]` | Sí: `get(i)` | No | No: se accede por **clave** |
| **Duplicados** | Sí | Sí | No, según `equals()` y `hashCode()` | Las claves son únicas; los valores pueden repetirse |
| **Tipos primitivos (`int`)** | Sí | No directamente: usar `Integer` | No directamente: usar `Integer` | No directamente: usar `Integer` |
| **Consulta de cantidad** | `.length` | `.size()` | `.size()` | `.size()` |
| **Ventaja principal** | Simplicidad y acceso directo | Añadir y quitar elementos | Evitar repetidos y buscar pertenencia | Localizar valores mediante una clave |
| **Limitación principal** | No cambia de tamaño | Buscar por valor suele requerir recorrer | No hay posiciones ni orden garantizado | Hay que conocer la clave; no hay índices |

**Idea para memorizar:**

- **Array** → casillas numeradas de tamaño fijo.
- **ArrayList** → lista numerada que crece y disminuye.
- **HashSet** → conjunto de elementos únicos, sin orden garantizado.
- **HashMap** → diccionario: buscar un **valor** mediante una **clave**.

## 2. ¿Cuál debo utilizar?

| Necesidad | Estructura recomendada | Motivo |
|---|---|---|
| Guardar exactamente 3 notas y acceder por posición | `Array` | Tamaño conocido y acceso con índice |
| Guardar una lista de alumnos que puede crecer | `ArrayList` | Permite `add()` y `remove()` |
| Guardar correos sin repetir ninguno | `HashSet` | Rechaza duplicados |
| Relacionar nombres con correos | `HashMap<String, String>` | Recuperar un correo a partir de su nombre/clave |
| Saber rápidamente si un elemento pertenece a un conjunto | `HashSet` | Búsqueda normalmente eficiente |
| Recuperar un dato por una clave única | `HashMap` | Acceso normalmente eficiente por clave |
| Mantener una secuencia ordenada de inserción y acceder con índices | `ArrayList` | Mantiene posición y orden |

> **Importante:** la rapidez de búsqueda en `HashSet` y `HashMap` es *habitualmente* O(1) en promedio, pero no está garantizada para todos los casos. Un `ArrayList.contains()` suele ser O(n).

## 3. Operaciones equivalentes

| Acción | `Array` | `ArrayList` | `HashSet` | `HashMap` |
|---|---|---|---|---|
| **Crear** | `int[] a = new int[3];` | `new ArrayList<String>()` | `new HashSet<String>()` | `new HashMap<String, String>()` |
| **Cantidad** | `a.length` | `lista.size()` | `set.size()` | `map.size()` |
| **Añadir** | No aumenta; asignar en índice existente | `lista.add(x)` | `set.add(x)` | `map.put(clave, valor)` |
| **Consultar** | `a[0]` | `lista.get(0)` | `set.contains(x)` | `map.get(clave)` |
| **Modificar** | `a[0] = x` | `lista.set(0, x)` | Quitar y añadir otro valor | `map.put(clave, nuevo)` o `replace()` |
| **Eliminar** | No reduce tamaño | `lista.remove(0)` / `remove(x)` | `set.remove(x)` | `map.remove(clave)` |
| **Buscar** | Recorrer o usar métodos auxiliares | `lista.contains(x)` | `set.contains(x)` | `map.containsKey(k)` / `containsValue(v)` |
| **Vaciar** | No se puede reducir a longitud 0 sin crear otro array | `lista.clear()` | `set.clear()` | `map.clear()` |
| **Mostrar contenido** | `Arrays.toString(a)` | `System.out.println(lista)` | `System.out.println(set)` | `System.out.println(map)` |

**Atención:** `HashSet.contains(x)` **comprueba si existe**, no devuelve el elemento. `HashMap.get(clave)` **devuelve el valor** asociado a una clave, o `null` si no hay asignación (salvo particularidades de mapas con valores `null`).

## 4. Array: posiciones y tamaño fijo

| Concepto | Recordatorio |
|---|---|
| `new int[3]` | Crear **3** posiciones: índices `0`, `1`, `2` |
| `a[0]` | Consultar la primera posición |
| `a[2] = 10` | Cambiar el tercer elemento |
| `a.length` | Consultar longitud; **sin paréntesis** |
| `Arrays.toString(a)` | Mostrar todos los elementos en una línea |
| `a[3]` si longitud = 3 | Error en ejecución: `ArrayIndexOutOfBoundsException` |

**Valores por defecto de arrays nuevos:**

| Tipo | Valor inicial |
|---|---|
| `int`, `long`, etc. | `0` |
| `double`, `float` | `0.0` |
| `boolean` | `false` |
| `char` | `\u0000` (carácter nulo) |
| Referencias, como `String` | `null` |

**Clave:** asignar `null` o `0` **no elimina** una posición; el array mantiene su longitud.

## 5. ArrayList: lista flexible

| Método | Qué hace | Ejemplo rápido |
|---|---|---|
| `add(x)` | Añadir un elemento al final | `names.add("Jose")` |
| `get(i)` | Obtener el elemento por índice | `names.get(0)` |
| `getFirst()` | Obtener el primero | `names.getFirst()` |
| `getLast()` | Obtener el último | `names.getLast()` |
| `set(i, x)` | Sustituir un elemento | `names.set(0, "Pepe")` |
| `remove(i)` | Eliminar por índice | `names.remove(1)` |
| `remove(x)` | Eliminar la primera coincidencia del objeto | `names.remove("Jose")` |
| `contains(x)` | Consultar si contiene el elemento | `names.contains("Jose")` |
| `size()` | Contar elementos | `names.size()` |
| `clear()` | Vaciar la lista | `names.clear()` |

**Recuerda:** `getFirst()` y `getLast()` están disponibles en `List`/`ArrayList` desde **Java 21**. En una lista vacía lanzan excepción. Se usan objetos envoltorio como `Integer`, no `int`, en genéricos.

## 6. HashSet: elementos únicos

| Concepto / método | Recordatorio |
|---|---|
| `add(x)` | Añadir si no existe uno equivalente; devuelve `true` si cambia el conjunto |
| `contains(x)` | Responder `true` / `false` según pertenencia |
| `remove(x)` | Eliminar por valor, no por posición |
| `size()` | Consultar cantidad de valores distintos |
| `clear()` | Vaciar |
| `get(0)` | **No existe**: un conjunto no tiene índices |
| Imprimir el conjunto | Posible, pero **no confiar** en el orden mostrado |

**Matiz importante:** los duplicados no se determinan simplemente porque dos objetos tengan el mismo `hashCode()`. La igualdad se determina mediante `equals()` en combinación con `hashCode()`: dos objetos distintos pueden tener el mismo hash.

## 7. HashMap: claves y valores

| Método | Qué hace | Resultado / detalle |
|---|---|---|
| `put(k, v)` | Añadir o sustituir un valor | Devuelve el valor anterior, o `null` si no lo había |
| `get(k)` | Consultar valor por clave | Valor asociado o `null` |
| `containsKey(k)` | Comprobar clave | `boolean` |
| `containsValue(v)` | Comprobar valor | `boolean` |
| `remove(k)` | Eliminar entrada por clave | Devuelve valor anterior o `null` |
| `remove(k, v)` | Eliminar solo si coincide el par | `boolean` |
| `replace(k, v)` | Sustituir solo si existe clave | Devuelve valor previo o `null` |
| `putIfAbsent(k, v)` | Añadir si falta asociación (o se asocia a `null`) | Devuelve valor previo o `null` |
| `keySet()` | Obtener las claves | Vista de tipo **`Set<K>`** |
| `values()` | Obtener los valores | Vista de tipo **`Collection<V>`**, **no `Set`** |
| `entrySet()` | Obtener pares clave-valor | Vista de tipo `Set<Map.Entry<K,V>>` |
| `isEmpty()` | Comprobar si está vacío | `boolean` |
| `clear()` | Eliminar todas las asociaciones | Sin valor de retorno |

**Clave para memorizar:** una clave aparece **una sola vez**. `put()` con la misma clave **reemplaza** el valor, no crea otra entrada. Varios nombres/claves pueden apuntar al mismo valor.

## 8. Operaciones de conjuntos

Partimos de **A = {Jose, Díaz}** y **B = {Díaz, Ana}**.

| Operación | Método sobre A | Resultado final de A |
|---|---|---|
| **Unión** (todo lo que hay en A o B) | `A.addAll(B)` | `{Jose, Díaz, Ana}` |
| **Diferencia** (lo de A que no está en B) | `A.removeAll(B)` | `{Jose}` |
| **Intersección** (lo común a ambos) | `A.retainAll(B)` | `{Díaz}` |

> Cada fila se calcula **partiendo del A original**. Son métodos que **modifican el conjunto** sobre el que se ejecutan. El orden de visualización de los elementos no está garantizado en `HashSet`.

## 9. Errores y matices importantes

| Confusión habitual | Forma correcta de entenderlo |
|---|---|
| `System.out.println(array)` muestra el contenido | En arrays, utilizar `Arrays.toString(array)`; la impresión directa muestra una representación de referencia, no una dirección de memoria literal |
| `new int[3]` crea cinco elementos | Crea **tres** elementos |
| `ArrayList` y `HashSet` son tipos de arrays | Son **colecciones**; no arrays |
| `Set` no admite duplicados porque el hash es único | No admite elementos equivalentes según igualdad; pueden existir **colisiones de hash** |
| `HashSet` mantiene un orden concreto | **No garantiza** orden de iteración |
| `HashMap.values()` devuelve un `Set` | Devuelve una **`Collection`**, con posibles valores repetidos |
| En `HashMap`, `putIfAbsent` modifica solo si no existe clave | También puede asociar si la clave existe pero tiene valor `null` |
| `remove(1)` siempre significa lo mismo | En `ArrayList<Integer>`, normalmente elimina por **índice**; en un `Set` se elimina por **valor** |
| `null` elimina un elemento de un array | No: ocupa la misma posición con referencia nula |

## 10. Autoevaluación

Intenta contestar **sin mirar las tablas**:

1. ¿Qué elegirías para guardar 10 temperaturas cuando sabes que siempre serán 10?
2. ¿Qué estructura utilizarías para almacenar nombres que se pueden repetir y consultar por posición?
3. ¿Cómo evitarías añadir el mismo correo dos veces?
4. ¿Cómo asociarías un DNI a una persona y recuperarías sus datos a partir del DNI?
5. ¿Qué diferencia hay entre `length` y `size()`?
6. ¿Por qué `HashSet` no admite `get(0)`?
7. ¿Qué ocurre si haces `map.put("Jose", "correo2")` y ya existía la clave `"Jose"`?
8. ¿Qué método conserva solo los elementos comunes de dos conjuntos?
9. ¿Qué método muestra un array como `[1, 2, 3]`?
10. ¿Qué diferencia hay entre `map.containsKey(k)` y `map.get(k)`?

<details>
<summary>Ver respuestas</summary>

1. `Array`.
2. `ArrayList`.
3. `HashSet`.
4. `HashMap`.
5. `length` es un campo de arrays; `size()` es un método de colecciones y mapas.
6. Porque no hay posiciones/indexación.
7. Sustituye el valor anterior de la clave.
8. `retainAll()`.
9. `Arrays.toString()`.
10. `containsKey()` comprueba si existe la clave; `get()` recupera su valor (que puede ser `null`).

</details>

---

**En una frase:** `Array` = tamaño fijo; `ArrayList` = lista dinámica y ordenada; `HashSet` = valores únicos; `HashMap` = asociaciones de clave y valor.
