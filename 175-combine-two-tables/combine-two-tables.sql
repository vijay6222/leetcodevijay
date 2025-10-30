# Write your MySQL query statement below
select p.firstName,p.lastName,A.city,A.state from person p
left join address a on p.personid=a.personid;