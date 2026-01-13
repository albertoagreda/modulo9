# Modulo9 – JavaFX + Maven + EXE + Instalador

Proyecto educativo desarrollado como práctica completa de **JavaFX**, cubriendo todo el ciclo:
desarrollo → JAR ejecutable → EXE de Windows → instalador.

---

## 🎯 Objetivo del proyecto

El objetivo de este proyecto es aprender y demostrar cómo:

- Crear una aplicación de escritorio con **JavaFX**
- Gestionar el proyecto con **Maven**
- Generar un **JAR ejecutable**
- Convertir el JAR en un **EXE para Windows**
- Crear un **instalador profesional** que incluya el runtime de Java

El resultado final es una aplicación que **funciona incluso en equipos sin Java instalado**.

---

## 🧰 Tecnologías usadas

- Java 21 (compilación)
- JavaFX 21
- Maven
- Launch4j (JAR → EXE)
- Inno Setup (EXE → Instalador)
- Windows

---

## 📁 Estructura del proyecto

```
modulo9/
├─ src/
│  └─ main/
│     ├─ java/com/modulo9/
│     │  ├─ App.java
│     │  └─ controllers/
│     └─ resources/
│        ├─ views/main.fxml
│        ├─ styles/app.css
│        └─ icons/app.png
│
├─ dist/
│  ├─ runtime/          # Java embebido
│  ├─ modulo9.jar       # JAR ejecutable
│  ├─ Modulo9.exe       # EXE de Windows
│  ├─ app.ico
│  └─ launch4j.xml
│
├─ installer/
│  ├─ modulo9.iss       # Script Inno Setup
│  └─ Modulo9-Setup.exe # Instalador final
│
├─ pom.xml
└─ mvnw
```
## 📦 Instalación

1. Descargar `installer/Modulo9-Setup.exe`
2. Ejecutar el instalador
3. Seguir el asistente
4. Ejecutar la aplicación desde el acceso directo

---

## ▶️ Ejecutar en modo desarrollo

Requiere Java instalado.

```bash
./mvnw clean javafx:run
```

---

## 📦 Generar el JAR ejecutable

```bash
./mvnw clean package
```

El JAR se genera en la carpeta `target/` y se copia a `dist/` para distribución.

---

## 🪟 Ejecutar en Windows (EXE)

Ejecutar directamente:

```
dist/Modulo9.exe
```

✔️ No abre consola  
✔️ Usa Java incluido en `runtime/`  

---

## 🧩 Instalador

El instalador se genera con **Inno Setup** y se encuentra en:

```
installer/Modulo9-Setup.exe
```

El instalador:
- Copia la aplicación a Program Files
- Incluye Java (runtime)
- Crea accesos directos
- Permite desinstalación limpia

---

## 🧪 Estado del proyecto

✔️ Aplicación funcional  
✔️ JAR ejecutable  
✔️ EXE de Windows  
✔️ Instalador completo  

---

## 📚 Propósito educativo

Este proyecto forma parte de una práctica de aprendizaje y **no tiene fines comerciales**.
Su objetivo es entender el proceso real de distribución de aplicaciones Java en Windows.

---

## 📝 Autor

Alumno: Alberto agredano orellana
Proyecto: Modulo9  
Curso / Módulo: 2DAM
