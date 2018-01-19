CREATE TABLE contacts(
	id SERIAL PRIMARY KEY,
	contact_name VARCHAR(255),
	phone VARCHAR(255)
);

CREATE TABLE email_addresses(
	email VARCHAR(255),
	contact_id INTEGER 
	REFERENCES contacts(id)
);

INSERT INTO contacts (contact_name, phone)
VALUES ('Иванов Иван', '89636262222');

INSERT INTO contacts (contact_name, phone)
VALUES ('Петров Петр', '89622226362');

SELECT * FROM contacts;









