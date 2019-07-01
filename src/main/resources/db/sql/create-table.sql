DROP TABLE IF EXISTS transactions;

CREATE TABLE transactions (
  Id                    INTEGER PRIMARY KEY,
  date                  Date          NOT NULL,
  description           VARCHAR(100),
  original_description  VARCHAR(100),
  amount                DECIMAL       NOT NULL,
  type                  VARCHAR(6)   NOT NULL,
  parent_category       VARCHAR(100),
  category              VARCHAR(100),
  account               VARCHAR(100)  NOT NULL,
  tags                  VARCHAR(25),
  memo                  VARCHAR(255),
  pending               BOOLEAN DEFAULT FALSE NOT NULL
);
