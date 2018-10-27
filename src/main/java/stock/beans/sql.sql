
CREATE TABLE account (
  aid int auto_increment PRIMARY KEY,
  aname VARCHAR(20),
  balance DOUBLE
);

CREATE TABLE stock (
  sid int auto_increment PRIMARY KEY,
  sname VARCHAR(20),
  count INT
);