# Write your MySQL query statement below
select C.name as Customers
from Customers as C
left join Orders as O
on O.customerId = C.id
where O.CustomerId is null