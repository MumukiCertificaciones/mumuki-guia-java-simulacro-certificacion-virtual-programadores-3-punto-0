CREATE TABLE biblioteca (id_biblioteca INTEGER PRIMARY KEY, localidad TEXT);

CREATE TABLE libro (id_libro INTEGER PRIMARY KEY, 
  titulo TEXT, 
  autor TEXT,
  cantidad_reservas INTEGER,
  id_biblioteca INTEGER,
  FOREIGN KEY (id_biblioteca) REFERENCES biblioteca(id_biblioteca));

INSERT INTO biblioteca VALUES
(1, "San Luis"), 
(2, "CABA"),
(3, "Gral Las Heras");


INSERT INTO libro VALUES 
(1, "fundacion", "Isaac Asimov", 5, 1),
(2, "farenheit 451", "Ray Bradbury", 3, 1),
(3, "un mundo feliz", "Aldous Huxley", 2, 1),
(4, "1984", "George Orwell", 1, 2),
(5, "odessa", "Frederick Forsyth", 5, 3),

