# Write your MySQL query statement below
# firstName, lastName --> person 
# city, state --> address
# if the address of the person is not found report null

select
    firstName, lastName, city, state
from
    Person 
left join 
    Address
on 
    Person.personId = Address.personId