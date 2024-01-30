# API REST para Sistema de Recomendación KNN - Proyecto Estudiantil

## Descripción

Este proyecto es una API REST desarrollada con Spring Boot, diseñada para un sistema de recomendación basado en el algoritmo K-Nearest Neighbors (KNN). El enfoque principal es la clasificación y recomendación de intereses comunes entre estudiantes y docentes en la carrera de software, proporcionando una herramienta útil para mejorar la interacción y el aprendizaje colaborativo.

## Características Principales

- **Implementación del Algoritmo KNN**: Utiliza el algoritmo KNN para ofrecer recomendaciones precisas y personalizadas.
- **Normalización de Datos**: Incluye procesos de normalización para asegurar una comparación efectiva y justa de los datos.
- **Escalabilidad y Adaptabilidad**: Diseñada para facilitar la incorporación de nuevos usuarios y la actualización continua de intereses.

## Tecnologías Empleadas

- **Spring Boot**: Framework robusto para el desarrollo de aplicaciones backend.
- **Java**: Lenguaje de programación principal, conocido por su solidez y versatilidad.
- **MySQL**: Sistema de gestión de base de datos para almacenar y manejar los datos de usuarios e intereses.
- **Maven**: Herramienta para la gestión y automatización de proyectos Java.

## Instalación y Ejecución

Para poner en marcha la API en tu entorno local, sigue estos pasos:

1. **Clonar el Repositorio**:
   ```sh
   git clone https://github.com/OAlbuja/ApiRest-KNN-Recomendaciones.git

2. Navega hasta el directorio del proyecto y ejecuta:
   ```sh
   mvn clean install

3. Inicia la aplicación:
   ```sh
   mvn spring-boot:run

## Diseño de Ingeniería

### Diagrama del Framework Spring Boot

<img src="https://springframework.guru/wp-content/uploads/2015/04/spring-overview.png" width="600">

### Diagrama de Secuencia: Backend con Spring Boot y MySQL

<img src="https://showme.redstarplugin.com/d/d:20KsZDqt" width="600">

#### Explicación del Diagrama

El diagrama representa la estructura del sistema backend desarrollado con Spring Boot y SpEL, relacionando los componentes clave:

- **Controladores**: En Spring Boot, los controladores gestionan las solicitudes HTTP y definen las rutas de la API. Se utilizan controladores para manejar las operaciones CRUD en clientes y productos.

- **Servicios**: Los servicios son componentes que realizan la lógica de negocio y procesan las solicitudes del controlador. En la aplicación, los servicios utilizan SpEL para asignar valores dinámicamente.

- **Persistencia de Datos**: Spring Boot facilita la interacción con una base de datos MySQL, lo que permite almacenar y recuperar datos de manera eficiente. Se utiliza JPA (Java Persistence API) para interactuar con la base de datos.

Este diseño de ingeniería garantiza una separación clara de responsabilidades y una arquitectura escalable para la aplicación Spring Boot.


## Uso

La API estará disponible en `http://localhost:8080/api`. Las rutas disponibles pueden incluir:

- `/usuarios`: Para manejar la información de los usuarios.
- `/recomendaciones`: Para obtener recomendaciones basadas en KNN.

## Ejemplo de Uso del Endpoint de Recomendaciones

1. Para probar el endpoint de recomendaciones, puedes usar la siguiente URL en tu navegador o herramienta de API como Postman:
   ```sh
   http://localhost:8080/api/cliente-intereses/{clienteId}/recomendaciones?k={numeroDeVecinos}

Donde {clienteId} es el ID del cliente para el que deseas obtener recomendaciones y {numeroDeVecinos} es el número de vecinos cercanos a considerar en el algoritmo KNN.

2. Ejemplo: Si deseas obtener 5 recomendaciones para el cliente con ID 12, utilizarías:
   ```sh
   http://localhost:8080/api/cliente-intereses/12/recomendaciones?k=5

Este request te devolverá una lista de recomendaciones basadas en los intereses comunes más cercanos del cliente especificado.

## Contribuciones

Las contribuciones son esenciales para el enriquecimiento continuo de este proyecto estudiantil. Cualquier sugerencia, idea de mejora o reporte de errores es bienvenido. Puedes abrir un issue o enviar un pull request para colaborar.

## Licencia

Este proyecto se desarrolla con fines académicos y no está sujeto a licencia comercial.

## Autores

- Oscar Albuja - Desarrollo Inicial

## Obtener Más Ayuda

Si se necesita más ayuda o información sobre el uso de Spring Boot, SpEL o MySQL, se puede consultar la [documentación oficial de Spring Boot](https://spring.io/projects/spring-boot), [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/docs/3.2.x/reference/html/expressions.html) y [MySQL](https://www.mysql.com/).
