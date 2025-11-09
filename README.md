## Proyecto: Gestión de Usuarios - Spring Boot

-Se trata de una aplicación CRUD de gestión de usuarios desarrollada con Java 17 y Spring Boot 3.5.7, utilizando Spring Data JPA para la persistencia de datos.

-Esta aplicacion permite crear, listar, actualizar y eliminar usuarios mediante endpoints REST.

-Consta de varios archivos, con el modelo de arquitectura vista controlador.
  Es un patrón de arquitectura de software que divide una aplicación en tres componentes interconectados: el Modelo, la Vista y el Controlador

## Estructura del archivo

src/main/java/com/grupoinvestigaciondam/investigacion/
├── controlador
│   └── UsuarioController.java      # Define endpoints REST
├── entidades
│   └── Usuario.java                # Clase entidad Usuario
├── repositorio
│   └── UsuarioRepository.java      # Interfaz JPA para CRUD
├── servicio
│   └── UsuarioServicio.java        # Lógica de negocio de usuarios
└── AppApplication.java             # Clase principal Spring Boot

## Tecnologías utilizadas
-Java 17
-Spring Boot 3.5.7
-Spring Data JPA
-H2 Database (en memoria para pruebas)
-Lombok (opcional)
-Maven (gestión de dependencias)


## Dependencias

Este proyecto utiliza **Spring Boot 3.5.7** y las siguientes dependencias principales:

1. **spring-boot-starter-web**
   
   - Proporciona todo lo necesario para crear aplicaciones web y RESTful.  
   - Incluye:  
     - Servidor Tomcat embebido (por defecto)  
     - Soporte para REST APIs  
     - Configuración automática de Spring MVC  

2. **spring-boot-starter-data-jpa**
   
   - Permite la integración con bases de datos mediante JPA (Java Persistence API).  
   - Incluye:  
     - Spring Data JPA  
     - Soporte para repositorios y operaciones CRUD automáticas  
     - Configuración automática de EntityManager y transacciones  

3. **h2**
   
   - Base de datos en memoria utilizada para pruebas.  
   - Características:  
     - Fácil de configurar  
     - Ideal para entornos de desarrollo y testing  
     - No requiere instalación externa  

4. **lombok**
     
   - Biblioteca que reduce el boilerplate code en Java.  
   - Permite:  
     - Generar getters/setters, constructores y `toString` automáticamente  
     - Uso de anotaciones como `@Data`, `@Getter`, `@Setter`, `@NoArgsConstructor`, etc.  

5. **spring-boot-starter-test**
    
   - Incluye todas las herramientas necesarias para testing en Spring Boot:  
     - JUnit 5 para pruebas unitarias  
     - Mockito para mocks  
     - Soporte para Spring Boot Test y pruebas de integración  





