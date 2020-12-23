DROP TABLE IF EXISTS user;
CREATE TABLE user AS (SELECT * FROM CSVREAD('classpath:table/user_visa.csv'));