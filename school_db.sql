CREATE TABLE students(
  id INT,
  student_name VARCHAR(255),
  birthdate DATE,
  class VARCHAR(255)
);

INSERT INTO students 
(id, birthdate, student_name,  class)
VALUES 
(1, '2001-01-11', 'Петров П. П.', '11А');

INSERT INTO students 
(id, birthdate, student_name,  class)
VALUES 
(2, '2002-08-21', 'Иванов И. И.', '10Д');

INSERT INTO students 
(id, birthdate, student_name,  class)
VALUES 
(3, '2002-09-23', 'Сидоров С. И.', '10Д');

SELECT *
FROM students;

SELECT id, student_name, birthdate, class
FROM students;

SELECT student_name, class
FROM students;

SELECT *
FROM students
WHERE class = '10Д';

SELECT *
FROM students
WHERE class = '11А' OR id = 3;

SELECT *
FROM students
WHERE NOT id = 3;

DELETE FROM students WHERE id = 2;

--ASC можно пропустить
SELECT *
FROM students
ORDER BY id ASC;

SELECT *
FROM students
ORDER BY id DESC;

UPDATE students
SET class = '11А'
WHERE id = 3;

CREATE TABLE subgroup(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

INSERT INTO subgroup(name) VALUES ('Первая группа');
INSERT INTO subgroup(name) VALUES ('Вторая группа');

SELECT * FROM subgroup;

DROP TABLE subgroup;








