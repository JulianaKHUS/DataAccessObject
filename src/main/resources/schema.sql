CREATE TABLE CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    age INT check (age >= 0),
    phone_number VARCHAR(15)
);

CREATE TABLE ORDERS (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customers_id INT,
    product_name VARCHAR(255) NOT NULL,
    amount INT CHECK ( amount > 0 ),
    FOREIGN KEY (customers_id) REFERENCES CUSTOMERS(id) ON DELETE CASCADE
);

