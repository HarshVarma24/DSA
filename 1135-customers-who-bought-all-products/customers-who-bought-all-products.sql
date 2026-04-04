# Write your MySQL query statement below
#select customer_id from Customer
#group by customer_id 
#select distinct product_key from Product;
#select distinct customer_id from Customer where product_key in (5,6);
select customer_id from Customer
group by customer_id 
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) from Product);

