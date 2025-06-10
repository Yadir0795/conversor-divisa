# Conversor de Monedas 💱

Este proyecto es un conversor de monedas desarrollado como parte del programa Oracle Next Education. 
El objetivo es brindar una herramienta simple en consola para realizar conversiones entre diferentes 
divisas utilizando una API de tipo de cambio.

## 🚀 Funcionalidades

- Conversión de monedas en tiempo real.
- Interfaz de consola amigable.
- Manejo de errores ante peticiones fallidas.
- Arquitectura modular (aplicación, modelos, servicios y utilitarios).

## 🛠️ Tecnologías usadas

- Java
- Gson (para parseo de JSON)
- API externa de tipo de cambio (ExchangeRate API)

## 🧠 Estructura del Proyecto

```
src/
├── aplicacion/Principal.java         # Punto de entrada del programa
├── modelos/Moneda.java               # Modelo para representar una moneda
├── modelos/TipoDeCambio.java         # Modelo para el resultado del tipo de cambio
├── servicios/ApiTipoDeCambio.java    # Lógica de consulta a la API de tipo de cambio
├── util/ClienteHttp.java             # Cliente HTTP para consumir servicios externos
└── util/Consola.java                 # Utilidades de entrada/salida por consola
```

## 📦 Cómo ejecutar

1. Clona el repositorio o descomprime el archivo ZIP.
2. Asegúrate de tener Java instalado (versión 11 o superior).
3. Ejecuta la clase principal:

```bash
javac -cp ".;Gson/gson-2.13.1.jar" src/aplicacion/Principal.java
java -cp ".;Gson/gson-2.13.1.jar;src" aplicacion.Principal
```

## 👤 Autor

**Yadir García Córdoba**  
Programa Oracle Next Education (ONE) - Grupo 8 (G8)

---

Este proyecto forma parte del desafío técnico de conversión de monedas propuesto dentro del programa ONE.
