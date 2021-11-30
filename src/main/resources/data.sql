DROP TABLE IF EXISTS products;
 
CREATE TABLE products (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  cost INT(250) NOT NULL
);

CREATE TABLE comment (
      id INT AUTO_INCREMENT  PRIMARY KEY,
      content VARCHAR(250) NOT NULL,
      id_product INT(250)
);

CREATE TABLE category(
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

CREATE TABLE category_product(
    category_id INT NOT NULL,
    product_id INT NOT NULL
);
 
INSERT INTO products (name, description, cost) VALUES
  ('iphone', 'smartphone apple', 1000),
  ('ipad', 'tablette apple', 500),
  ('imac', 'ordinateur apple', 2000);

INSERT INTO comment (content, id_product) VALUES
    ('nul', 1),
    ('cool', 2),
    ('bien', 1);

INSERT INTO category(name) VALUES
    ('smartphones'),
    ('tablette'),
    ('ordinateur'),
    ('apple');

INSERT INTO category_product(category_id,product_id) VALUES
    (1,1),
    (2,2),
    (3,3),
    (3,2),
    (3,1)