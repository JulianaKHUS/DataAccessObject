SELECT o.product_name
FROM ORDERS o
         JOIN CUSTOMERS c ON o.customers_id = c.id
WHERE LOWER(c.name) = LOWER('alexey');