# Versiones de Java

## 1. ¿Qué es Java SE y Java EE?

| Edición | Qué incluye | Uso principal |
|--------|-------------|---------------|
| **Java SE** (Standard Edition) | Núcleo del lenguaje, bibliotecas básicas, JVM y herramientas de línea de comandos. | Aplicaciones de escritorio, lógica de negocio, proyectos de aprendizaje. |
| **Java EE** (Enterprise Edition) | Extiende Java SE con Servlets, JSP, EJB, Web Services, seguridad avanzada y manejo de transacciones. | Aplicaciones empresariales de gran escala (servidores, micro‑servicios, etc.). |

---

## 2. JDK vs. JRE

- **JDK (Java Development Kit)**  
  - Contiene el compilador `javac`, la JVM, y herramientas de depuración y documentación.  
  - Es lo que necesitas para **desarrollar** aplicaciones Java.

- **JRE (Java Runtime Environment)**  
  - Sólo incluye la JVM y las bibliotecas necesarias para **ejecutar** aplicaciones.  
  - Desde Java 11 ya no se distribuye por separado; el JDK incluye todo lo necesario para ejecutar.

---

## 3. Oracle JDK vs. OpenJDK

| Distribución | Características | Licencia |
|--------------|----------------|----------|
| **OpenJDK** | Código abierto, mantenido por la comunidad (Red Hat, Amazon, Oracle, etc.). 100 % compatible con el estándar Java SE. | GPL (código abierto). |
| **Oracle JDK** | Versión comercial con soporte y optimizaciones específicas de Oracle. Desde Java 11 requiere suscripción para uso en producción. | Licencia comercial (suscripción). |

> **Recomendación:** para aprender y proyectos personales, **OpenJDK** es suficiente y libre de costos.

---

## 4. Evolución de las versiones

- **Java 8 (2014)** – Introducción de lambdas, Streams, API de fecha/hora (`java.time`).  
- **Java 9 (2017)** – Sistema de módulos (Project Jigsaw).  
- **Java 10 (2018)** – `var` para inferencia de tipo local.  
- **Java 11 (2018)** – LTS (Long‑Term Support). Mejoras de rendimiento y nuevas APIs.  
- **Java 12‑16 (2019‑2021)** – Lanzamientos semestrales con mejoras incrementales.  
- **Java 17 (2021)** – LTS. Introducción de *sealed classes*, mejoras en patrones de coincidencia.  
- **Java 21 (2023)** – LTS. Nuevas características de lenguaje y rendimiento.  
- **Java 22‑24 (2024‑2025)** – Versiones semestrales con características experimentales y refinamientos.

### LTS (Long‑Term Support)

Las versiones **LTS** reciben actualizaciones de seguridad y correcciones de bugs durante varios años. Son las más recomendadas para entornos de producción. Actualmente, las versiones LTS son: **Java 8, Java 11, Java 17 y Java 21**.

---

## 5. Distribuciones alternativas

- **Amazon Corretto** – Distribución de OpenJDK optimizada para AWS.  
- **Azul Zulu** – OpenJDK mantenido por Azul Systems, disponible para múltiples plataformas.  
- **AdoptOpenJDK / Eclipse Temurin** – Variante comunitaria de OpenJDK con builds certificados.

---

## 6. ¿Cuál elegir para comenzar?

| Necesidad | Versión recomendada | Distribución |
|-----------|--------------------|--------------|
| Aprendizaje y proyectos personales | Java 17 (LTS) | OpenJDK o AdoptOpenJDK |
| Aplicaciones empresariales en producción | Java 21 (LTS) | Oracle JDK (con suscripción) o OpenJDK con soporte comercial |
| Compatibilidad con código legado | Java 8 (LTS) | OpenJDK 8 o Oracle JDK 8 |

---

## 7. Enlaces útiles

- **OpenJDK:** https://openjdk.org/  
- **Oracle JDK:** https://www.oracle.com/java/technologies/javase-downloads.html  
- **Guía de migración a Java 17:** https://www.oracle.com/java/technologies/javase/migrate-to-java-17.html  

--- 

*Este resumen está listo para copiar y pegar en cualquier editor Markdown.*
