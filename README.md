# Prueba - Desarrollo de aplicaciones web dinámicas Java

####Tablas usadas  

```sql
-- Borrar tablas si existen
DROP TABLE IF EXISTS roles_usuarios;
DROP TABLE IF EXISTS direcciones;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS usuarios;

-- CREAR TABLAS
-- Crear tabla usuarios
CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    correo VARCHAR(255) NOT NULL,
    nick VARCHAR(50) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    peso NUMERIC(10,2) NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- Crear tabla roles
CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	nombre VARCHAR(20) NOT NULL
);

-- Crear tabla roles_usuarios
CREATE TABLE roles_usuarios (
	usuario_id INTEGER NOT NULL,
	rol_id INTEGER NOT NULL,
	PRIMARY KEY (usuario_id, rol_id),
	FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
	FOREIGN KEY (rol_id) REFERENCES roles(id)
);

-- Crear la tabla direcciones
CREATE TABLE direcciones (
	id SERIAL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	numeracion VARCHAR(25) NOT NULL,
	usuario_id INTEGER NOT NULL,
	FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);


-- INSERTAR DATOS
-- Insertar datos de prueba
INSERT INTO usuarios (correo, nick, nombre, password, peso, created_at, updated_at) VALUES
('user1@mail.com', 'Peter', 'Pedro Perez', 'pass123', 70.50, '2024-07-10 17:47:23', '2024-07-10 17:47:23'),
('user2@mail.com', 'Jhon', 'Juan Gonzales', 'pass456', 65.00, '2024-07-10 17:47:23', '2024-07-10 17:47:23'),
('user3@mail.com', 'Armando', 'Diego Muñoz', 'pass789', 80.00, '2024-07-10 17:47:23', '2024-07-10 17:47:23');

-- Insertar datos en tabla roles
INSERT INTO roles (nombre) VALUES
('trabajador'),			-- id = 1
('supervisor'),			-- id = 2
('administrativo');		-- id = 3

-- Isertar datos en la tabla roles_usuarios
INSERT INTO roles_usuarios (usuario_id, rol_id) VALUES
(1, 1), -- user_id 1 tiene rol trabajador
(1, 2), -- user_id 1 tiene rol supervisor
(1, 3), -- user_id 1 tiene rol administrativo
(2, 2), -- user_id 2 tiene rol supervisor
(2, 3), -- user_id 2 tiene rol administrativo
(3, 1); -- user_id 3 tiene rol trabajador

-- Insertar datos en la tabla direcciones
INSERT INTO direcciones (nombre, numeracion, usuario_id) VALUES
('Lautaro', '114', 1),			-- Dirección para user_id 1
('Caupolicán', '115', 2),		-- Dirección para user_id 2
('Las Rosas', '119', 3),		-- Dirección para user_id 3
('Los Aromos', '127', 3),		-- Otra dirección para user_id 3
('Gabriela Mistral', '128', 3);	-- Otra dirección para user_id 3
```
  
  
**Configuracion BD**  
[https://github.com/asmitmans/Prueba_M5/blob/main/src/main/java/cl/fullstackjava/model/conexion/Conexion.java](https://github.com/asmitmans/Prueba_M5/blob/main/src/main/java/cl/fullstackjava/model/conexion/Conexion.java)  


**Imagen deploy**  
[https://github.com/asmitmans/Prueba_M5/blob/main/src/main/webapp/img/Tomcat.png](https://github.com/asmitmans/Prueba_M5/blob/main/src/main/webapp/img/Tomcat.png)


**Datos pruebas:**  
 * Usuario con rol administrativo: email: user1@mail.com pass: pass123
 * Usuario sin rol administrativo: email: user3@mail.com pass: pass789

