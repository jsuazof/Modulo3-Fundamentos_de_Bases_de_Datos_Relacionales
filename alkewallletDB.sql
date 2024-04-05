USE alkewalletdb;


CREATE TABLE Moneda (
    moneda_id INT PRIMARY KEY,
    moneda_nombre VARCHAR(50),
    moneda_simbolo VARCHAR(10)
);

CREATE TABLE Usuario (
    usuario_id INT PRIMARY KEY,
    nombre VARCHAR(255),
    correo_electronico VARCHAR(255),
    contrasena VARCHAR(255),
    saldo DECIMAL(10,2)
);

CREATE TABLE Transaccion (
    transaccion_id INT PRIMARY KEY,
    envia_usuario_id INT,
    recibe_usuario_id INT,
    importe DECIMAL(10,2),
    transaccion_fecha DATE,
    id_moneda INT,
    FOREIGN KEY (envia_usuario_id) REFERENCES Usuario(usuario_id),
    FOREIGN KEY (recibe_usuario_id) REFERENCES Usuario(usuario_id),
    FOREIGN KEY (id_moneda) REFERENCES Moneda(moneda_id)
);

INSERT INTO Usuario (usuario_id, nombre, correo_electronico, contrasena, saldo)
VALUES 
(1, 'Juan Perez', 'juan@example.com', 'contraseña123', 1000.00),
(2, 'María García', 'maria@example.com', 'password456', 500.50),
(3, 'Pedro López', 'pedro@example.com', 'securepass789', 750.75),
(4, 'Ana Martínez', 'ana@example.com', 'safepassword321', 1200.00),
(5, 'Luis Rodríguez', 'luis@example.com', 'strongpass789', 900.25),
(6, 'Sofía Ruiz', 'sofia@example.com', 'password1234', 1500.00),
(7, 'Carlos Sánchez', 'carlos@example.com', 'secure123pass', 800.50),
(8, 'Elena Gómez', 'elena@example.com', 'pass123456', 2000.00),
(9, 'Miguel Pérez', 'miguel@example.com', 'mypass789', 600.75),
(10, 'Laura Martín', 'laura@example.com', 'securepass987', 1100.25);

INSERT INTO Moneda (moneda_id, moneda_nombre, moneda_simbolo)
VALUES
(1, 'Peso CLP', 'CLP'),
(2, 'Dólar USD', 'USD'),
(3, 'Euro EUR', 'EUR');

INSERT INTO Transaccion (transaccion_id, envia_usuario_id, recibe_usuario_id, importe, transaccion_fecha, id_moneda)
VALUES
(1, 1, 2, 50.00, '2024-03-01', 1),
(2, 3, 4, 100.50, '2024-03-05', 2),
(3, 2, 5, 75.25, '2024-03-10', 1),
(4, 5, 1, 30.00, '2024-03-15', 2),
(5, 4, 3, 200.00, '2024-03-20', 1),
(6, 6, 7, 150.75, '2024-03-25', 2),
(7, 8, 9, 80.50, '2024-03-30', 1),
(8, 9, 10, 120.25, '2024-04-05', 2),
(9, 10, 8, 90.75, '2024-04-10', 1),
(10, 7, 6, 300.00, '2024-04-15', 2);


-- Consultas solicitadas

/* 1.- Consulta para obtener el nombre 
de la moneda elegida por un usuario específico */

SELECT m.moneda_nombre
FROM Moneda m
JOIN Transaccion t ON m.moneda_id = t.id_moneda
WHERE t.envia_usuario_id = 1;

/* 2.- Consulta para obtener todas las transacciones registradas */

SELECT *
FROM Transaccion;

/* 3.- Consulta para obtener todas las transacciones realizadas por un
usuario específico */

SELECT *
FROM Transaccion
WHERE envia_usuario_id = 1 OR recibe_usuario_id = 1;

/* 4.- Sentencia DML para modificar el campo correo electrónico de un
usuario específico */

UPDATE Usuario
SET correo_electronico = 'nuevo_correo@example.com'
WHERE usuario_id = 1;

/* 5.- Sentencia para eliminar los datos de una transacción (eliminado de
la fila completa) */

DELETE FROM Transaccion
WHERE transaccion_id = 1;