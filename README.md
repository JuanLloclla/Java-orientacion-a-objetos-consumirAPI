# 🎬 ScreenMatch – Consumo de API, JSON y Manejo de Errores

Este repositorio corresponde a una nueva evolución del proyecto **ScreenMatch**, desarrollada durante el curso **"Java: consumir API, escribir archivos y manejar errores"**, como parte de la formación **Java Orientado a Objetos G9 – Oracle Next Education (ONE)**.

En esta etapa del proyecto se integra el consumo de una **API externa**, la conversión de datos **JSON ↔ objetos Java**, la escritura de archivos y el manejo de excepciones personalizadas.

---

## 🎯 Objetivo del curso y del proyecto

El objetivo principal de este curso fue aprender a **integrar aplicaciones Java con servicios externos**, manipular datos en formato JSON y manejar errores de forma controlada, aplicando estos conceptos directamente sobre el proyecto ScreenMatch.

Con este proyecto se busca:

* Consumir una **API HTTP** desde Java
* Convertir respuestas JSON en **objetos Java**
* Utilizar la biblioteca **Gson** para serialización y deserialización
* Crear archivos `.json` a partir de objetos del dominio
* Manejar errores mediante **excepciones personalizadas**

---

## 🌐 Consumo de API

El proyecto consume datos desde la API pública **OMDb (Open Movie Database)** para obtener información de películas y series.

Ejemplo de URL utilizada:

```java
String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=c0b6bc0d";
```

Los datos recibidos en formato JSON son transformados a objetos Java para su posterior procesamiento.

---

## 🧠 Conceptos aplicados

Durante el desarrollo de esta etapa se aplicaron los siguientes conceptos:

* **Consumo de API HTTP** usando clases de Java
* **Manipulación de JSON**
* **Serialización y deserialización** con Gson (`gson-2.10.1.jar`)
* Conversión de datos externos a modelos del dominio
* **Escritura de archivos** usando clases del paquete `java.io`
* **Manejo de excepciones** y creación de excepciones personalizadas

---

## 🗂️ Estructura del proyecto

```text
src/
└── com.aluracursos.screenmatch
    ├── calculos
    │   ├── CalculadoraDeTiempo.java
    │   ├── Clasificacion.java
    │   └── FiltroRecomendacion.java
    ├── exception
    │   └── ErrorEnConversionDeDuracionException.java
    ├── modelos
    │   ├── Titulo.java
    │   ├── TituloOmdb.java
    │   ├── Pelicula.java
    │   ├── Serie.java
    │   └── Episodio.java
    └── principal
        ├── Principal.java
        ├── PrincipalConListas.java
        └── PrincipalConBusqueda.java
```

Además, el proyecto genera y utiliza los siguientes archivos:

* `titulos.json` → Archivo JSON generado con películas y series
* `peliculas.txt` → Archivo de texto con información procesada

---

## ▶️ Clase `PrincipalConBusqueda`

Esta clase se incorpora en este curso para:

* Realizar búsquedas dinámicas de títulos usando la API OMDb
* Convertir la respuesta JSON en objetos Java
* Guardar los títulos obtenidos en un archivo `.json`
* Manejar errores de conversión y datos inválidos

---

## 🛠️ Tecnologías y herramientas utilizadas

* **Lenguaje:** Java
* **IDE:** IntelliJ IDEA
* **API externa:** OMDb API
* **Biblioteca JSON:** Gson 2.10.1
* **Entrada/Salida:** `java.io.File`, `FileWriter`
* **Paradigma:** Programación Orientada a Objetos

---

## 📚 Formación

* **Curso:** Java: consumir API, escribir archivos y manejar errores
* **Proyecto:** ScreenMatch (integración con API y JSON)
* **Programa:** Oracle Next Education (ONE)
* **Ruta:** Java Orientado a Objetos
* **Grupo:** G9

---

✍️ *Proyecto académico que consolida el consumo de servicios externos, el manejo de JSON y el tratamiento de errores en aplicaciones Java orientadas a objetos.*
