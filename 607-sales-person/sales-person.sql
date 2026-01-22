# Write your MySQL query statement below
select s.name from SalesPerson s  where s.sales_id not in (select sales_id from orders o inner join company c on o.com_id=c.com_id
  where c.name ='Red')