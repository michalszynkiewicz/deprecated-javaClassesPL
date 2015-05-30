
--polecenie zakładające wymagane tabele
CREATE TABLE employees(name VARCHAR(255), salary BIGINT)
--wprowadzenie wiersza do tabeli
insert into employees values("przykład", 10)
--lista wszystkich pracowników
SELECT name, salary FROM employees