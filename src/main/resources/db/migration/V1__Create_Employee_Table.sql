CREATE TABLE employee
(
  id          SERIAL        NOT NULL CONSTRAINT employee_pkey PRIMARY KEY,
  name        VARCHAR(100)  NOT NULL,
  dept_id       INTEGER       NOT NULL
);