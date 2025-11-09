## Proyecto: Gestión de Usuarios - Spring Boot
Se trata de una aplicación CRUD de gestión de usuarios desarrollada con Java 17 y Spring Boot 3.5.7, utilizando Spring Data JPA para la persistencia de datos.
Esta aplicacion permite crear, listar, actualizar y eliminar usuarios mediante endpoints REST

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


## Dependency Management

The `JAVA PROJECTS` view alows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
Hola este es de antonio luis


