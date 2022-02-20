select * from (select last_name, product_id, quantity from cart_items cr
inner join customers cs on cr.customer_id=cs.id where cs.id=1) xx
inner join products pr on xx.product_id=pr.id;