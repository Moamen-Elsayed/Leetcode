# Write your MySQL query statement below

select t.employee_id 
from 
(
    select e.employee_id, name, salary
    from Employees AS e
    left join Salaries AS s
    on e.employee_id = s.employee_id

    union

    select s.employee_id, name, salary
    from Employees AS e
    right join Salaries AS s
    on e.employee_id = s.employee_id
) AS t

where t.name is null or t.salary is null
order by t.employee_id;


