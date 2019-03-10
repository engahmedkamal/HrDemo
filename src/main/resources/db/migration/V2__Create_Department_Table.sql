CREATE TABLE department
(
  id          SERIAL        NOT NULL CONSTRAINT department_pkey PRIMARY KEY,
  name        VARCHAR(100)  NOT NULL
);

ALTER TABLE employee
  ADD FOREIGN KEY (dept_id) REFERENCES department(id);