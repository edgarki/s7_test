-- create a table
CREATE TABLE students (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  grade INTEGER NOT NULL
);
CREATE TABLE grade (
  grade INTEGER PRIMARY KEY,
  min_value INTEGER NOT NULL,
  max_value INTEGER NOT NULL
);
-- insert some values
INSERT INTO students VALUES (1, 'Julia', '81');
INSERT INTO students VALUES (2, 'Carol', '68');
INSERT INTO students VALUES (3, 'Maria', '99');
INSERT INTO students VALUES (4, 'Andreia', '78');
INSERT INTO students VALUES (5, 'Jaqueline', '63');
INSERT INTO students VALUES (6, 'Marcela', '88');

INSERT INTO grade VALUES (1, 0, 9);
INSERT INTO grade VALUES (2, 10, 19);
INSERT INTO grade VALUES (3, 20, 29);
INSERT INTO grade VALUES (4, 30, 39);
INSERT INTO grade VALUES (5, 40, 49);
INSERT INTO grade VALUES (6, 50, 59);
INSERT INTO grade VALUES (7, 60, 69);
INSERT INTO grade VALUES (8, 70, 79);
INSERT INTO grade VALUES (9, 80, 89);
INSERT INTO grade VALUES (10, 90, 100);
-- fetch some values

select (case when g < 8 then replace(name, name, 'NULL') else name end), g, grade
from (SELECT students.name, grade.grade as g, students.grade
FROM students 
INNER JOIN grade on students.grade >= grade.min_value and students.grade <= grade.max_value
ORDER BY students.grade DESC);
