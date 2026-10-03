# GitHub Actions — Guía rápida de consulta

> Guía práctica para recordar cómo se estructura, ejecuta y mantiene un workflow de GitHub Actions sin convertirlo en un manual exhaustivo.
> [Retos Brais MoureDev — stats.yml](https://github.com/mouredev/roadmap-retos-programacion/blob/main/.github/workflows/stats.yml)

## 1. Qué es GitHub Actions

**GitHub Actions** es la plataforma de automatización de GitHub. Permite ejecutar procesos cuando ocurre un evento en un repositorio: un `push`, una Pull Request, una ejecución manual, una programación, etc.

Se utiliza habitualmente para **CI/CD**:

- **CI (Continuous Integration / Integración continua):** compilar, validar y probar cambios automáticamente.
- **CD (Continuous Delivery/Deployment):** preparar o desplegar versiones automáticamente.

También puede automatizar tareas como generar documentación, actualizar estadísticas, etiquetar issues, publicar paquetes o modificar archivos del repositorio.

Flujo mental básico:

```text
Evento → Workflow → Job → Runner → Steps
```

Un **workflow** se define mediante YAML y normalmente se guarda en:

```text
.github/workflows/
```

Recursos:

- [GitHub Actions — Documentación oficial](https://docs.github.com/es/actions)
- [GitHub Actions — Página del producto](https://github.com/features/actions)

---

## 2. Estructura de un workflow

Ejemplo mínimo:

```yaml
name: Ejemplo

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v7

      - name: Ejecutar comando
        run: echo "Hola GitHub Actions"
```

Elementos principales:

| Elemento | Función |
|---|---|
| `name` | Nombre visible del workflow |
| `on` | Evento que inicia el workflow |
| `jobs` | Trabajos que debe ejecutar |
| `runs-on` | Runner donde se ejecuta un job |
| `permissions` | Permisos concedidos al `GITHUB_TOKEN` |
| `steps` | Pasos secuenciales dentro de un job |
| `uses` | Ejecuta una Action reutilizable |
| `run` | Ejecuta un comando o script |
| `with` | Parámetros enviados a una Action |
| `env` | Variables de entorno |

---

## 3. Eventos o triggers

### Push

```yaml
on:
  push:
    branches:
      - main
```

Ejecuta el workflow cuando se hace `push` a `main`.

### Pull Request

```yaml
on:
  pull_request:
```

Ejecuta el workflow ante eventos relacionados con Pull Requests.

### Ejecución manual

```yaml
on:
  workflow_dispatch:
```

Permite ejecutar el workflow manualmente desde **Actions → Run workflow**, además de CLI o API.

### Ejecución programada

```yaml
on:
  schedule:
    - cron: '0 0 * * *'
```

`cron` utiliza cinco campos:

```text
minuto hora día-mes mes día-semana
```

Por tanto:

```text
0 0 * * *
```

significa **todos los días a las 00:00**.

GitHub ejecuta las programaciones en **UTC por defecto**, aunque actualmente permite indicar una zona horaria IANA mediante `timezone`.

Ejemplo:

```yaml
on:
  schedule:
    - cron: '0 8 * * 1-5'
      timezone: 'Europe/Madrid'
```

---

## 4. Workflow, jobs, steps y runners

Jerarquía:

```text
Workflow
└── Jobs
    └── Job
        └── Steps
```

- Un **workflow** contiene uno o más jobs.
- Un **job** se ejecuta en un runner.
- Un **step** ejecuta una Action o un comando.
- Los steps de un mismo job normalmente se ejecutan en orden.
- Los jobs son independientes por defecto y pueden ejecutarse en paralelo.
- `needs` permite establecer dependencias entre jobs.

Ejemplo:

```yaml
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - run: echo "Tests"

  deploy:
    needs: test
    runs-on: ubuntu-latest
    steps:
      - run: echo "Deploy"
```

`deploy` no comenzará hasta que termine correctamente `test`.

Runners habituales:

```yaml
runs-on: ubuntu-latest
runs-on: windows-latest
runs-on: macos-latest
```

GitHub también permite runners autohospedados.

---

## 5. `uses` frente a `run`

### `uses`

Ejecuta una **Action reutilizable**:

```yaml
- uses: actions/checkout@v7
```

La forma habitual es:

```text
propietario/repositorio@versión
```

### `run`

Ejecuta directamente un comando en el runner:

```yaml
- run: python script.py
```

Regla rápida:

```text
uses → reutilizar una Action
run  → ejecutar un comando
```

---

## 6. Actions reutilizables

Una **Action** encapsula una tarea reutilizable para no tener que implementar manualmente toda su lógica.

Ejemplo:

```yaml
uses: actions/checkout@v7
```

Recursos principales:

- [Actions creadas por GitHub](https://github.com/actions)
- [GitHub Actions Marketplace](https://github.com/marketplace?type=actions)

### Actions oficiales

Normalmente se encuentran bajo la organización `actions`, por ejemplo:

```text
actions/checkout
actions/setup-python
```

### Actions de terceros

Son mantenidas por otros desarrolladores u organizaciones.

Antes de usar una Action de terceros conviene revisar:

- autor;
- mantenimiento reciente;
- documentación;
- permisos necesarios;
- versión utilizada;
- reputación y uso del proyecto.

Para producción, es buena práctica fijar una versión conocida o incluso un SHA cuando el nivel de seguridad requerido sea alto.

---

## 7. Actions importantes

### Checkout

[actions/checkout](https://github.com/actions/checkout)

```yaml
- uses: actions/checkout@v7
```

Descarga/prepara el contenido del repositorio dentro del runner para que los siguientes steps puedan trabajar con el código y los archivos.

Sin `checkout`, un runner recién creado no dispone automáticamente del contenido de tu repositorio.

---

### Setup Python

[actions/setup-python](https://github.com/actions/setup-python)

```yaml
- uses: actions/setup-python@v7
  with:
    python-version: '3.11'
```

Prepara la versión de Python indicada.

`with` pasa parámetros a la Action. En este caso:

```yaml
python-version: '3.11'
```

indica la versión de Python que debe configurarse.

---

### Git Auto Commit Action

[stefanzweifel/git-auto-commit-action](https://github.com/stefanzweifel/git-auto-commit-action)

Permite detectar cambios realizados durante el workflow, crear un commit y hacer `push` automáticamente.

```yaml
- name: Commit and Push changes
  uses: stefanzweifel/git-auto-commit-action@v7
  with:
    commit_message: Update stats
```

Es útil cuando un workflow genera o modifica archivos, por ejemplo:

- estadísticas;
- documentación;
- archivos generados;
- formateo automático;
- datos actualizados periódicamente.

Para escribir en el repositorio normalmente necesitará:

```yaml
permissions:
  contents: write
```

---

## 8. Permissions

GitHub crea un `GITHUB_TOKEN` para cada job. La clave `permissions` controla qué puede hacer.

Solo lectura:

```yaml
permissions:
  contents: read
```

Lectura y escritura:

```yaml
permissions:
  contents: write
```

Si el workflow debe crear commits o modificar contenido del repositorio, puede necesitar `write`.

Principio recomendado:

> Conceder únicamente los permisos necesarios para realizar la tarea.

---

## 9. Secrets, variables y `env`

### Secrets

Datos sensibles:

```yaml
${{ secrets.API_KEY }}
```

Ejemplos:

- tokens;
- claves API;
- credenciales;
- contraseñas.

No deben escribirse directamente en el YAML.

### Variables de configuración

```yaml
${{ vars.ENTORNO }}
```

Adecuadas para configuración no secreta.

### Variables de entorno

```yaml
env:
  ENTORNO: production
```

Después pueden utilizarse desde los comandos ejecutados en el runner.

---

## 10. Condiciones y contexto `github`

`if:` permite ejecutar un job o step únicamente cuando se cumple una condición.

```yaml
if: github.ref == 'refs/heads/main'
```

El contexto `github` contiene información sobre la ejecución, por ejemplo:

```text
github.repository
github.ref
github.sha
github.actor
github.event
```

Esto permite adaptar el workflow según repositorio, rama, commit, usuario o evento.

---

## 11. Artifacts

Un **artifact** es un archivo o conjunto de archivos conservados después de que un job los genere.

Ejemplos:

- binarios compilados;
- informes;
- resultados de tests;
- logs;
- documentación generada.

También permiten compartir archivos entre jobs de un mismo workflow.

---

# 12. Caso real: `stats.yml` de MoureDev

Workflow:

[Retos Brais MoureDev — stats.yml](https://github.com/mouredev/roadmap-retos-programacion/blob/main/.github/workflows/stats.yml)

Su estructura actual es esencialmente:

```yaml
name: Stats

on:
  schedule:
    - cron: '0 0 * * *'

jobs:
  build:
    if: github.repository == 'mouredev/roadmap-retos-programacion' && github.ref == 'refs/heads/main'
    runs-on: ubuntu-latest

    permissions:
      contents: write

    steps:
      - name: Checkout repo
        uses: actions/checkout@v4

      - name: Setup Python
        uses: actions/setup-python@v5
        with:
          python-version: '3.11'

      - name: Run script
        run: python ./Roadmap/stats.py

      - name: Commit and Push changes
        uses: stefanzweifel/git-auto-commit-action@v5
        with:
          commit_message: Update stats
          commit_user_name: Brais Moure [GitHub Actions]
          commit_user_email: mouredev@gmail.com
          commit_author: mouredev <mouredev@gmail.com>
```

> Este workflow real conserva versiones anteriores de algunas Actions (`checkout@v4`, `setup-python@v5` y `git-auto-commit-action@v5`). Para workflows nuevos conviene revisar siempre la versión mayor actualmente recomendada por cada Action.

### `name`

```yaml
name: Stats
```

Nombre con el que aparece el workflow en GitHub Actions.

### `schedule`

```yaml
on:
  schedule:
    - cron: '0 0 * * *'
```

Se programa diariamente a las **00:00 UTC** al no especificarse otra zona horaria.

### Job

```yaml
jobs:
  build:
```

Define un job identificado como `build`.

### Condición

```yaml
if: github.repository == 'mouredev/roadmap-retos-programacion' && github.ref == 'refs/heads/main'
```

Solo permite ejecutar el job cuando:

1. el repositorio es exactamente `mouredev/roadmap-retos-programacion`;
2. la referencia es la rama `main`.

Esto ayuda a evitar que esa lógica se ejecute accidentalmente en otro contexto.

### Runner

```yaml
runs-on: ubuntu-latest
```

El job se ejecuta en un runner Linux basado en Ubuntu.

### Permisos

```yaml
permissions:
  contents: write
```

Necesita escritura porque al final del proceso se pretende crear y subir un commit al repositorio.

### Checkout

```yaml
uses: actions/checkout@v4
```

Obtiene el contenido del repositorio para que el runner pueda trabajar con sus archivos.

### Python

```yaml
uses: actions/setup-python@v5
with:
  python-version: '3.11'
```

Prepara Python 3.11.

### Script

```yaml
run: python ./Roadmap/stats.py
```

Ejecuta el script `Roadmap/stats.py`, que genera o actualiza los datos estadísticos utilizados por el proyecto.

### Commit automático

```yaml
uses: stefanzweifel/git-auto-commit-action@v5
```

Después de ejecutar el script, la Action comprueba los cambios y puede crear y subir automáticamente un commit.

Los parámetros:

```yaml
commit_message
commit_user_name
commit_user_email
commit_author
```

controlan el mensaje y la identidad Git del commit generado.

### Flujo completo

```text
Cron diario
   ↓
Runner Ubuntu
   ↓
Checkout del repositorio
   ↓
Configurar Python 3.11
   ↓
Ejecutar Roadmap/stats.py
   ↓
Cambios en archivos
   ↓
Commit automático
   ↓
Push al repositorio
```

Este ejemplo conecta los conceptos principales de GitHub Actions en un workflow real.

---

# 13. Anatomía visual

```text
Repositorio
│
└── .github/workflows/
    │
    └── workflow.yml
        │
        ├── on
        │   └── evento / trigger
        │
        └── jobs
            │
            └── job
                │
                ├── runs-on → runner
                ├── permissions
                │
                └── steps
                    ├── uses → Action
                    └── run  → comando
```

---

# 14. Chuleta rápida

| Elemento | Función |
|---|---|
| `name` | Nombre del workflow |
| `on` | Evento que lo inicia |
| `jobs` | Trabajos a ejecutar |
| `runs-on` | Runner donde se ejecuta |
| `steps` | Pasos de un job |
| `uses` | Ejecutar una Action |
| `run` | Ejecutar un comando |
| `with` | Parámetros de una Action |
| `env` | Variables de entorno |
| `if` | Condición de ejecución |
| `needs` | Dependencia entre jobs |
| `permissions` | Permisos del `GITHUB_TOKEN` |
| `secrets` | Información sensible |
| `vars` | Variables de configuración |
| `schedule` | Ejecución programada |
| `workflow_dispatch` | Ejecución manual |

### Lectura rápida de un workflow

Cuando abras un YAML desconocido, sigue este orden:

```text
1. name      → ¿Qué workflow es?
2. on        → ¿Cuándo se ejecuta?
3. jobs      → ¿Qué trabajos realiza?
4. runs-on   → ¿Dónde se ejecuta?
5. permissions → ¿Qué acceso necesita?
6. steps     → ¿Qué hace exactamente?
7. uses      → ¿Qué Actions externas emplea?
8. run       → ¿Qué comandos ejecuta?
9. with/env  → ¿Con qué configuración?
10. if/needs → ¿Qué condiciones y dependencias existen?
```

---

# 15. Enlaces de consulta

- [GitHub Actions — Documentación oficial](https://docs.github.com/es/actions)
- [GitHub Actions — Página del producto](https://github.com/features/actions)
- [Actions oficiales de GitHub](https://github.com/actions)
- [GitHub Actions Marketplace](https://github.com/marketplace?type=actions)
- [actions/checkout](https://github.com/actions/checkout)
- [actions/setup-python](https://github.com/actions/setup-python)
- [git-auto-commit-action](https://github.com/stefanzweifel/git-auto-commit-action)
- [Workflow stats.yml de MoureDev](https://github.com/mouredev/roadmap-retos-programacion/blob/main/.github/workflows/stats.yml)
'''

path = Path("/mnt/data/GitHub_Actions_Guia_Rapida.md")
path.write_text(content, encoding="utf-8")
print(path)
