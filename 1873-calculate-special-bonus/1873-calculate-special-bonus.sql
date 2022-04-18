/* Write your T-SQL query statement below */
select employee_id, 
        CASE  
        WHEN employee_id%2 = 1 and left(name, 1) != 'M' THEN salary
        ELSE 0
    END
    AS bonus
from Employees
order by employee_id