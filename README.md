# CarManagerSystem - Sistema de Gestión de Vehículos


## Descripción del Proyecto
CarManagerSystem es una aplicación web desarrollada en Java que permite el
registro y login de usuarios. Los roles de usuario se gestionan directamente
en la base de datos, y solo los usuarios con rol **administrativo** tienen
acceso al listado de direcciones. El sistema utiliza Servlets, JSP y JDBC
para la interacción con una base de datos PostgreSQL.


## Características
- **Login y Registro de Usuarios**: Los usuarios pueden registrarse y hacer 
  login en el sistema.
- **Gestión de Acceso mediante Roles**: Los roles de los usuarios (definidos 
  en la base de datos) controlan el acceso a la funcionalidad de visualización 
  del listado de direcciones. Solo los usuarios con rol administrativo pueden 
  acceder a esta funcionalidad.
- **Listado de Direcciones**: Solo accesible para usuarios con rol 
  administrativo.

  
## Tecnologías Utilizadas
- **Java**: Lenguaje de programación principal.
- **JSP y Servlets**: Para el manejo de la interfaz y lógica del lado del 
  servidor.
- **Tomcat**: Servidor web para el despliegue.
- **PostgreSQL**: Base de datos para el almacenamiento de usuarios y direcciones.
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
