/* 
 Please write a DELETE statement and DO NOT write a SELECT statement.
 Write your T-SQL query statement below
 */
 
with tmp as
(
    select min(id) as UN_ID, email
    from Person
    group by email
)

delete from Person where id not in
(
    select UN_ID from tmp
)
