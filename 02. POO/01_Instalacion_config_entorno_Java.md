
## Instalación y configuración del entorno Java

### 1. Herramientas necesarias

Para desarrollar aplicaciones en Java se necesita un **JDK (Java Development Kit)**, que incluye las herramientas para compilar y ejecutar programas.

En esta formación se utilizará **OpenJDK 25 LTS** junto con **Visual Studio Code**.

| Herramienta | Descripción |
|-------------|-------------|
| **OpenJDK 25 LTS** | kit de desarrollo que permite compilar y ejecutar programas Java |
| **Visual Studio Code** | editor de código utilizado para desarrollar y ejecutar los ejercicios |
| **Extension Pack for Java** | paquete de extensiones de Microsoft que añade soporte para Java en VS Code |
| **IntelliJ IDEA** | IDE alternativo especializado en Java, compatible con los mismos archivos y proyectos Java |

> **Importante:**
> - Java 25 es una versión LTS (*Long-Term Support*), adecuada para mantener un entorno estable.
> - No es obligatorio instalar la versión más reciente de Java si el curso no la exige.
> - Es posible instalar varias versiones de JDK simultáneamente.
> - Cada proyecto puede utilizar una versión de Java diferente.
> - VS Code e IntelliJ IDEA pueden utilizarse indistintamente para proyectos Java, aunque algunas configuraciones específicas del IDE deben adaptarse.

### 2. Descargar e instalar OpenJDK

Descargar OpenJDK desde una distribución oficial o de confianza.

**Enlace:** https://jdk.java.net/archive/

**Pasos de instalación en Windows:**

1. Descargar el JDK correspondiente a Windows x64.
2. Descomprimir el archivo descargado.
3. Crear o utilizar una carpeta destinada a las versiones de Java.
4. Colocar el JDK descomprimido en dicha carpeta.
5. Comprobar que dentro de la carpeta se encuentran los directorios `bin`, `conf`, `lib`, etc.

**Ejemplo de instalación:**

```text
C:\Users\josed\.jdks\
├── ms-21.0.6\
├── openjdk-24\
└── openjdk-25.0.1\
    ├── bin\
    ├── conf\
    ├── include\
    ├── jmods\
    └── lib\
```

> **Importante:**
> - No eliminar las versiones anteriores de Java si existen proyectos que puedan necesitarlas.
> - El archivo `java.exe` debe encontrarse dentro de la carpeta `bin` del JDK.
> - La carpeta `.jdks` es una ubicación habitual cuando se utiliza IntelliJ IDEA, aunque no es obligatoria.
> - No es necesario modificar `JAVA_HOME` ni el `PATH` global de Windows para configurar un JDK directamente en VS Code.

### 3. Comprobar la instalación de Java

Desde PowerShell, ejecutar los siguientes comandos indicando la ruta del JDK.

| Comando | Descripción |
|---------|-------------|
| `java -version` | mostrar la versión de Java disponible en el `PATH` de la terminal |
| `javac -version` | mostrar la versión del compilador Java disponible en el `PATH` |
| `where.exe java` | localizar los ejecutables de Java accesibles desde el `PATH` de Windows |
| `where.exe javac` | localizar los compiladores Java accesibles desde el `PATH` de Windows |

**Comprobar directamente el JDK 25 instalado:**

```powershell
& "C:\Users\josed\.jdks\openjdk-25.0.1\bin\java.exe" -version

& "C:\Users\josed\.jdks\openjdk-25.0.1\bin\javac.exe" -version
```

**Resultado esperado:**

```text
openjdk version "25.0.1"
javac 25.0.1
```

> **Importante:**
> - `java` permite ejecutar aplicaciones Java.
> - `javac` permite compilar archivos `.java` y generar archivos `.class`.
> - En PowerShell, `&` permite ejecutar un programa indicando su ruta.
> - Si `java -version` muestra otra versión, no significa necesariamente que Java 25 esté mal instalado: puede haber otra versión configurada en el `PATH`.

#### Comprobar Java desde WSL

Si se utiliza Ubuntu mediante WSL, puede ejecutarse el JDK de Windows indicando su ubicación en `/mnt/c/`.

```bash
"/mnt/c/Users/josed/.jdks/openjdk-25.0.1/bin/java.exe" -version

"/mnt/c/Users/josed/.jdks/openjdk-25.0.1/bin/javac.exe" -version
```

> **Importante:** ejecutar `java.exe` desde WSL utiliza el JDK instalado en Windows. No equivale a instalar Java de forma nativa en Ubuntu.

### 4. Instalar y configurar Visual Studio Code

Descargar e instalar Visual Studio Code desde:

https://code.visualstudio.com/

Después, instalar el paquete **Extension Pack for Java**, desarrollado por Microsoft.

**Enlace:** https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

**Pasos:**

1. Abrir Visual Studio Code.
2. Acceder a **Extensiones** mediante `Ctrl + Shift + X`.
3. Buscar `Extension Pack for Java`.
4. Seleccionar la extensión publicada por Microsoft.
5. Pulsar **Instalar** si todavía no está instalada.

El paquete incluye herramientas para:

| Funcionalidad | Descripción |
|---------------|-------------|
| IntelliSense | ofrecer autocompletado y asistencia para escribir código Java |
| Debugger | ejecutar y depurar programas |
| Test Runner | ejecutar pruebas con JUnit y TestNG |
| Maven | gestionar proyectos y dependencias mediante Maven |
| Gradle | ofrecer soporte para proyectos Gradle |
| Java Project Manager | facilitar la creación y gestión de proyectos Java |

### 5. Configurar Java 25 en VS Code

Para utilizar OpenJDK 25 sin modificar las variables globales de Windows, se puede registrar directamente en la configuración de VS Code.

**Pasos:**

1. Pulsar `Ctrl + Shift + P`.
2. Buscar `Preferences: Open User Settings (JSON)`.
3. Abrir el archivo `settings.json`.
4. Añadir la configuración del JDK respetando las propiedades existentes.
5. Guardar mediante `Ctrl + S`.

**Configuración que debe incorporarse al objeto JSON existente:**

```json
"java.configuration.runtimes": [
    {
        "name": "JavaSE-25",
        "path": "C:\\Users\\josed\\.jdks\\openjdk-25.0.1",
        "default": true
    }
]
```

> **Importante:**
> - La ruta debe coincidir con la ubicación real del JDK.
> - En JSON, las barras invertidas de las rutas de Windows deben escribirse como `\\`.
> - Si existen otras propiedades en `settings.json`, deben separarse mediante comas.
> - No sustituir todo el contenido del archivo: añadir únicamente la propiedad necesaria.
> - `"default": true` establece Java 25 como entorno predeterminado para los proyectos Java compatibles.
> - Esta configuración corresponde a VS Code ejecutando las extensiones Java en Windows. Una sesión remota WSL necesita un JDK apropiado para Linux.

### 6. Crear el primer proyecto Java

**Pasos:**

1. Abrir VS Code.
2. Pulsar `Ctrl + Shift + P`.
3. Buscar `Java: Create Java Project`.
4. Seleccionar **No build tools**.
5. Elegir la carpeta donde se guardará el proyecto.
6. Introducir el nombre del proyecto, por ejemplo `HolaMundo`.
7. Abrir el proyecto generado.

**Ejemplo de estructura:**

```text
CursoJavaMouredev/
└── HolaMundo/
    ├── .vscode/
    │   └── settings.json
    ├── lib/
    ├── src/
    │   └── App.java
    └── README.md
```

| Carpeta o archivo | Descripción |
|-------------------|-------------|
| `.vscode/` | almacenar configuraciones específicas de VS Code para el proyecto |
| `lib/` | guardar bibliotecas externas que necesite el proyecto |
| `src/` | almacenar los archivos de código fuente Java |
| `App.java` | contener la clase principal del programa de ejemplo |
| `README.md` | documentar información básica del proyecto |
| `bin/` | almacenar los archivos compilados `.class`, cuando se genere la salida de compilación |

> **Importante:** la opción `No build tools` permite comenzar con proyectos sencillos sin configurar Maven ni Gradle. Para proyectos más complejos pueden utilizarse esas herramientas.

### 7. Configuración del proyecto Java

VS Code puede generar un archivo `.vscode/settings.json` con la configuración específica del proyecto.

**Ejemplo:**

```json
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```

| Configuración | Descripción |
|---------------|-------------|
| `java.project.sourcePaths` | indicar la carpeta donde se encuentra el código fuente |
| `java.project.outputPath` | indicar la carpeta donde se guardarán los archivos compilados |
| `java.project.referencedLibraries` | indicar la ubicación de las bibliotecas externas `.jar` |

> **Importante:** no es necesario modificar esta configuración si el proyecto funciona correctamente.

### 8. Crear y ejecutar el primer programa

Abrir el archivo `src/App.java` e introducir:

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Ejecutar desde VS Code:**

1. Abrir `App.java`.
2. Pulsar **Run**, situado encima del método `main`.
3. Comprobar el resultado en la terminal.

**Resultado esperado:**

```text
Hello, World!
```

También puede ejecutarse directamente desde PowerShell, situándose en el directorio que contiene el archivo:

```powershell
& "C:\Users\josed\.jdks\openjdk-25.0.1\bin\java.exe" App.java
```

#### Compilar y ejecutar manualmente

Desde la carpeta que contiene `App.java`:

```powershell
& "C:\Users\josed\.jdks\openjdk-25.0.1\bin\javac.exe" App.java

& "C:\Users\josed\.jdks\openjdk-25.0.1\bin\java.exe" App
```

| Comando | Descripción |
|---------|-------------|
| `javac App.java` | compilar el código fuente y generar `App.class` |
| `java App` | ejecutar la clase compilada que contiene el método `main` |
| `java App.java` | ejecutar directamente un programa Java desde su archivo fuente, en los casos compatibles |

> **Importante:**
> - El nombre del archivo debe coincidir con el nombre de la clase cuando esta se declara `public`.
> - `System.out.println()` permite mostrar texto en la salida estándar.
> - El método `main` es un punto de entrada habitual para ejecutar aplicaciones Java.
> - No es necesario añadir `.class` al ejecutar una clase mediante `java App`.

### 9. Utilizar VS Code e IntelliJ IDEA

Los proyectos Java pueden abrirse en diferentes IDE.

| Elemento | ¿Se conserva al cambiar de IDE? |
|----------|----------------------------------|
| Código fuente `.java` | Sí |
| Clases y paquetes | Sí |
| Historial Git | Sí |
| Proyectos Maven o Gradle | Sí |
| Configuración del JDK | puede ser necesario seleccionar nuevamente la versión |
| Configuración `.vscode` | específica de VS Code |
| Configuración `.idea` | específica de IntelliJ IDEA |

> **Importante:**
> - No es necesario utilizar IntelliJ IDEA para aprender Java si el curso permite elegir editor.
> - VS Code e IntelliJ pueden trabajar con el mismo código fuente.
> - Las configuraciones de cada IDE son independientes.
> - Conviene mantener separados los proyectos de diferentes cursos y asignaturas.

### 10. Resumen de comandos

| Comando | Descripción |
|---------|-------------|
| `java -version` | consultar la versión de Java activa en la terminal |
| `javac -version` | consultar la versión del compilador |
| `where.exe java` | localizar Java en el `PATH` de Windows |
| `git --version` | comprobar la instalación de Git si se utiliza control de versiones |
| `javac App.java` | compilar un programa Java |
| `java App` | ejecutar una clase Java compilada |
| `java App.java` | ejecutar directamente un archivo Java compatible |
| `Ctrl + Shift + X` | abrir las extensiones de VS Code |
| `Ctrl + Shift + P` | abrir la paleta de comandos de VS Code |
| `Ctrl + S` | guardar el archivo actual |
| `Ctrl + K`, `Ctrl + O` | abrir una carpeta en VS Code |

---

> **Conclusión:** con OpenJDK 25 LTS, VS Code y Extension Pack for Java es posible desarrollar, compilar, ejecutar y depurar programas Java sin necesidad de modificar instalaciones anteriores ni utilizar obligatoriamente IntelliJ IDEA.
