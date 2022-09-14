# Write your MySQL query statement below
select t.employee_id from (select Employees.employee_id from Employees left join Salaries on Employees.employee_id=Salaries.employee_id where salary is null
union
select Salaries.employee_id from Employees right join Salaries on Employees.employee_id=Salaries.employee_id where name is null) as t order by employee_id  ;