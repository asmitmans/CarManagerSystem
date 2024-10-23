# CarManagerSystem - Sistema de Gestión de Vehículos

## Descripción del Proyecto
CarManagerSystem es una aplicación web desarrollada en Java que permite la 
gestión de usuarios y vehículos. Los administradores pueden realizar 
operaciones CRUD en los datos, asignar roles a los usuarios y gestionar sus 
permisos. El sistema utiliza Servlets, JSP, y JDBC para la interacción con 
una base de datos MySQL.


## Características
- **Gestión de Usuarios**: Crear, leer, actualizar y eliminar información de 
  usuarios.
- **Gestión de Vehículos**: CRUD completo para la administración de vehículos.
- **Gestión de Roles**: Asignación de roles a los usuarios para controlar 
  accesos.
- **Autenticación**: Sistema de login y logout para gestionar el acceso 
  según los roles definidos.
- **Vistas JSP**: Despliegue de la interfaz mediante JSPs con acceso dinámico 
  a los datos.

  
## Tecnologías Utilizadas
- **Java**: Lenguaje de programación principal.
- **JSP y Servlets**: Para el manejo de la interfaz y lógica del lado del 
  servidor.
- **Tomcat**: Servidor web para el despliegue.
- **MySQL**: Base de datos para el almacenamiento de usuarios y vehículos.
- **JDBC**: Para la conexión con la base de datos.
- **Git y GitHub**: Control de versiones y colaboración.


## Configuración de la Base de Datos
Para que la aplicación funcione correctamente, es necesario configurar la base 
de datos en el archivo `Conexion.java`, dentro del paquete 
`cl.fullstackjava.model.conexion`. Cambia los siguientes valores:

- **Nombre de la base de datos**: `"nombre_bd"`
- **Usuario de la base de datos**: `"usuario_bd"`
- **Contraseña**: `"password_usuario_bd"`

Ejecuta el archivo `src/sql/tables.sql` para crear las tablas y poblar la base 
de datos con datos de prueba.


## Instalación y Uso
1. Clona este repositorio:
   ```bash
   git clone https://github.com/asmitmans/CarManagerSystem.git
   ```
2. Configura la base de datos como se menciona en la sección anterior.
3. Importa el proyecto en Eclipse o IntelliJ como un proyecto web dinámico.
4. Ejecuta en Tomcat y accede a:
   ```bash
   http://localhost:8080/CarManagerSystem/
   ```

   
## Autor
Este proyecto fue desarrollado por [Agustin Smitmans](https://github.com/asmitmans) 
como parte de un desafío técnico en Java. Si tienes alguna pregunta o deseas 
contactarme, puedes hacerlo a través de mi perfil en GitHub.
