-- create a table
CREATE TABLE dogs (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL
);

CREATE TABLE cats (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL
);

-- insert some values
INSERT INTO dogs VALUES (1, 'Julia');
INSERT INTO dogs VALUES (2, 'Carol');
INSERT INTO dogs VALUES (3, 'Maria');

INSERT INTO cats VALUES (1, 'Andreia');
INSERT INTO cats VALUES (2, 'Jaqueline');
INSERT INTO cats VALUES (3, 'Marcela');
-- fetch some values
--- SELECT * FROM dogs cross join cats on dogs.name != cats.name;
SELECT distinct name FROM dogs union select distinct name from cats;
