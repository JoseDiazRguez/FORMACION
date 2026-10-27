
## Personalización de la terminal de VS Code con Oh My Posh

### 1. Qué es Oh My Posh

**Oh My Posh** es una herramienta que permite personalizar la apariencia del prompt de la terminal, mostrando información del usuario, directorio actual, rama Git y estado de los comandos mediante colores y segmentos.

En esta configuración se utilizará **PowerShell con el tema Agnoster**, para conseguir una apariencia similar a Oh My Zsh en Linux.

| Herramienta | Descripción |
|-------------|-------------|
| PowerShell | intérprete de comandos utilizado en Windows |
| Oh My Posh | personalizar la apariencia de la terminal |
| Agnoster | tema visual basado en segmentos de colores |
| VS Code | editor que integra la terminal PowerShell |
| Nerd Font / Powerline | fuentes compatibles con los separadores e iconos especiales |

> **Importante:**
> - Oh My Posh modifica la apariencia de la terminal, no el funcionamiento de los comandos.
> - La configuración de PowerShell es independiente de la configuración de Zsh en WSL.
> - No afecta a las instalaciones de Java, Python, Git ni otros entornos de desarrollo.

### 2. Instalar Oh My Posh en Windows

Abrir PowerShell y ejecutar:

```powershell
winget install JanDeDobbeleer.OhMyPosh --source winget
```

Cerrar la terminal y abrir una nueva.

**Comprobar la instalación:**

```powershell
oh-my-posh version
```

El comando debe mostrar la versión instalada.

> **Importante:** si `oh-my-posh` no se reconoce inmediatamente después de instalarlo, cerrar y volver a abrir PowerShell para actualizar el entorno de la sesión.

### 3. Activar el tema Agnoster

Oh My Posh permite cargar temas predefinidos mediante su nombre.

**Probar Agnoster temporalmente:**

```powershell
oh-my-posh init pwsh --config agnoster | Invoke-Expression
```

El prompt cambiará inmediatamente de apariencia.

| Comando | Descripción |
|---------|-------------|
| `oh-my-posh version` | consultar la versión instalada |
| `oh-my-posh init pwsh --config agnoster \| Invoke-Expression` | activar temporalmente Agnoster en la sesión actual |
| `oh-my-posh config export --config agnoster --output "$HOME\agnoster.omp.json"` | exportar el tema para personalizarlo |
| `code "$HOME\agnoster.omp.json"` | abrir el archivo de configuración del tema en VS Code |

> **Importante:**
> - La activación mediante `oh-my-posh init` solo afecta a la sesión actual si no se guarda en el perfil.
> - La configuración exportada permite modificar colores, iconos y segmentos.
> - El tema Agnoster de Oh My Posh puede tener diferencias respecto al tema Agnoster de Oh My Zsh.

### 4. Crear una configuración personalizada

Exportar el tema original a un archivo JSON:

```powershell
oh-my-posh config export --config agnoster --output "$HOME\agnoster.omp.json"
```

Abrirlo:

```powershell
code "$HOME\agnoster.omp.json"
```

Sustituir el contenido por esta configuración personalizada:

```json
{
  "$schema": "https://raw.githubusercontent.com/JanDeDobbeleer/oh-my-posh/main/themes/schema.json",
  "version": 4,
  "final_space": true,
  "blocks": [
    {
      "type": "prompt",
      "alignment": "left",
      "segments": [
        {
          "type": "session",
          "style": "powerline",
          "template": " {{ .UserName }}@{{ .HostName }} ",
          "foreground": "#FFFFFF",
          "background": "#24242B",
          "powerline_symbol": "\ue0b0"
        },
        {
          "type": "path",
          "style": "powerline",
          "template": " {{ .Path }} ",
          "foreground": "#FFFFFF",
          "background": "#435AB3",
          "powerline_symbol": "\ue0b0",
          "options": {
            "style": "full"
          }
        },
        {
          "type": "git",
          "style": "powerline",
          "template": " {{ .HEAD }} ",
          "foreground": "#FFFFFF",
          "background": "#B88643",
          "powerline_symbol": "\ue0b0"
        },
        {
          "type": "status",
          "style": "plain",
          "template": " ✘ ",
          "foreground": "#ff5555",
          "properties": {
            "always_enabled": false
          }
        }
      ]
    }
  ]
}
```

#### Colores utilizados

| Segmento | Color | Código hexadecimal |
|----------|-------|--------------------|
| Usuario y equipo | negro grafito | `#24242B` |
| Ruta actual | azul índigo | `#435AB3` |
| Rama Git | naranja apagado | `#B88643` |
| Texto | blanco | `#FFFFFF` |
| Indicador de error | rojo | `#FF5555` |

> **Importante:**
> - El segmento `session` muestra el usuario y el equipo.
> - El segmento `path` muestra la ruta actual.
> - El segmento `git` muestra la rama cuando se trabaja dentro de un repositorio Git.
> - El segmento `status` permite señalar comandos que terminan con error.
> - `powerline_symbol` define el separador entre segmentos.
> - Eliminar los iconos de carpetas del tema original permite conseguir un diseño más limpio y similar al de WSL.

### 5. Probar el tema personalizado

Después de guardar `agnoster.omp.json`, ejecutar:

```powershell
oh-my-posh init pwsh --config "$HOME\agnoster.omp.json" | Invoke-Expression
```

El prompt debería mostrar los segmentos con los colores personalizados.

> **Importante:** este comando aplica la configuración a la sesión actual. Para utilizarla automáticamente en futuras terminales, hay que modificar el perfil de PowerShell.

### 6. Activar Oh My Posh permanentemente

PowerShell permite ejecutar automáticamente comandos al iniciar una sesión mediante su archivo `$PROFILE`.

**Consultar la ubicación del perfil:**

```powershell
$PROFILE
```

**Crear el archivo si no existe:**

```powershell
if (!(Test-Path $PROFILE)) {
    New-Item -ItemType File -Path $PROFILE -Force
}
```

**Abrirlo en VS Code:**

```powershell
code $PROFILE
```

Añadir al archivo:

```powershell
oh-my-posh init pwsh --config "$HOME\agnoster.omp.json" | Invoke-Expression
```

Guardar mediante `Ctrl + S`.

Cerrar la terminal y abrir una nueva para comprobar que el tema se carga automáticamente.

| Comando | Descripción |
|---------|-------------|
| `$PROFILE` | mostrar la ruta del perfil de PowerShell |
| `Test-Path $PROFILE` | comprobar si existe el archivo de configuración |
| `code $PROFILE` | editar el perfil mediante VS Code |
| `. $PROFILE` | cargar nuevamente la configuración del perfil en la sesión actual |

> **Importante:**
> - El archivo `$PROFILE` puede tener una ubicación diferente según la versión y el entorno de PowerShell.
> - No duplicar la línea de inicialización de Oh My Posh.
> - Si existen configuraciones anteriores, conservarlas salvo que entren en conflicto.
> - El perfil puede quedar sujeto a las políticas de ejecución de scripts de PowerShell.

### 7. Establecer PowerShell como terminal predeterminada en VS Code

**Pasos:**

1. Abrir VS Code.
2. Pulsar `Ctrl + Shift + P`.
3. Buscar `Terminal: Select Default Profile`.
4. Seleccionar **PowerShell**.
5. Cerrar las terminales anteriores.
6. Abrir una nueva terminal.

VS Code utilizará PowerShell con el tema personalizado cuando se cargue el perfil correspondiente.

> **Importante:**
> - El perfil predeterminado determina qué terminal se abre al crear una nueva.
> - Es posible utilizar PowerShell y Ubuntu WSL simultáneamente en VS Code.
> - Cambiar el perfil predeterminado no modifica el intérprete de los scripts ni los JDK configurados para los proyectos.

### 8. Configurar la fuente de la terminal

Los temas Powerline utilizan símbolos especiales para representar separadores.

Si aparecen cuadrados, interrogantes o iconos incorrectos, comprobar la fuente utilizada en la terminal.

**Pasos:**

1. Abrir la configuración de VS Code mediante `Ctrl + ,`.
2. Buscar `terminal.integrated.fontFamily`.
3. Seleccionar una fuente compatible con Powerline o Nerd Fonts.
4. Abrir una nueva terminal para comprobar el resultado.

**Ejemplo de configuración en `settings.json`:**

```json
"terminal.integrated.fontFamily": "MesloLGS NF"
```

> **Importante:**
> - El ejemplo anterior requiere que la fuente indicada esté instalada.
> - No es necesario cambiar de fuente si los separadores ya se muestran correctamente.
> - `terminal.integrated.fontFamily` afecta a la terminal, no a la fuente del editor de código.

### 9. Diferencias entre Oh My Zsh y Oh My Posh

| Característica | Oh My Zsh | Oh My Posh |
|----------------|-----------|------------|
| Entorno habitual | Zsh en Linux, macOS o WSL | PowerShell, Zsh, Bash y otros shells |
| Configuración | `~/.zshrc` | archivo de tema y perfil del shell |
| Tema utilizado | `agnoster` | `agnoster.omp.json` personalizado |
| Colores | definidos por el tema Zsh | configurables mediante JSON |
| Integración con Git | mediante el tema y complementos | mediante el segmento `git` |

> **Importante:** aunque ambos utilizan el nombre Agnoster, sus configuraciones no son directamente intercambiables.

### 10. Resumen de comandos

| Comando | Descripción |
|---------|-------------|
| `winget install JanDeDobbeleer.OhMyPosh --source winget` | instalar Oh My Posh en Windows |
| `oh-my-posh version` | consultar la versión instalada |
| `oh-my-posh init pwsh --config agnoster \| Invoke-Expression` | activar el tema Agnoster temporalmente |
| `oh-my-posh config export --config agnoster --output "$HOME\agnoster.omp.json"` | exportar el tema a un archivo editable |
| `code "$HOME\agnoster.omp.json"` | editar los colores y segmentos |
| `oh-my-posh init pwsh --config "$HOME\agnoster.omp.json" \| Invoke-Expression` | cargar la configuración personalizada |
| `$PROFILE` | consultar la ubicación del perfil PowerShell |
| `code $PROFILE` | editar la configuración de inicio de PowerShell |
| `. $PROFILE` | recargar el perfil en la sesión actual |

---

> **Conclusión:** con Oh My Posh y un archivo JSON personalizado se puede conseguir una terminal PowerShell visualmente similar a Agnoster de Oh My Zsh, manteniendo la compatibilidad con el entorno de desarrollo de Windows y la ejecución de programas Java desde VS Code.
