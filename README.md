# Conversor de Monedas

Bienvenido al Conversor de Monedas de Nahomi C., un programa de consola que implementa la lógica para convertir monedas
utilizando datos obtenidos de la API Java Exchange Rate API | Java Currency Converter.
 
 
## Estructura general
- Un método principal (main) que controla el flujo del programa.
- Métodos auxiliares como mostrarMenu y realizarConversion para organizar el código.
- Dependencia de una clase externa llamada ConversorDeMonedas que realiza las conversiones (asumiendo que ya está implementada).

## Flujo de datos
- El método recibe un código de moneda base como parámetro (por ejemplo, "USD").
- Construye una URL para consultar las tasas de cambio de esa moneda.
- Realiza la solicitud HTTP y obtiene una respuesta en formato JSON, que contiene las tasas de cambio.
- Si todo va bien, devuelve el cuerpo de la respuesta como una cadena (string).
- Si ocurre un error, devuelve un mensaje que comienza con "Error:".
- 
## Monedas soportadas

- **Dólar estadounidense (USD)**
- **Peso argentino (ARS)**
- **Real brasileño (BRL)**
- **Peso chileno (CLP)**
- **Peso colombiano (COP)**
- **Peso boliviano (BOB)**

### Ejemplo de Uso

![image](https://github.com/user-attachments/assets/574b16c9-e140-4eb3-bc0c-edec3fc31ad2)

##Autor
Nahomi Cuevas


