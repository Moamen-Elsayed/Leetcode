# Write your MySQL query statement below
select emp.name as Employee
from Employee As emp, Employee as manager
where emp.managerId = manager.id AND emp.salary > manager.salary