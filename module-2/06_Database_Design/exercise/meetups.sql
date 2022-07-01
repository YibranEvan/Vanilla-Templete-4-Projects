
CREATE TABLE member (
	member_id serial,
	first_name varchar(20) NOT NULL,
	last_name varchar(30) NOT NULL,
	email varchar(50) NOT NULL,
	phone varchar(12),
	birthdate date NOT NULL,
	wants_reminders boolean NOT NULL,
	CONSTRAINT PK_member PRIMARY KEY (member_id)
);

CREATE TABLE interest_group (
	group_id serial,
	name varchar(40) NOT NULL,
	CONSTRAINT PK_interest_group PRIMARY KEY (group_id),
	CONSTRAINT UQ_interest_group_name UNIQUE (name)
);

CREATE TABLE event (
	event_id serial,
	name varchar(40) NOT NULL,
	description text,
	start_date date NOT NULL,
	start_time time NOT NULL,
	duration int NOT NULL,
	group_id int NOT NULL,
	CONSTRAINT PK_event PRIMARY KEY (event_id),
	CONSTRAINT FK_event_interest_group FOREIGN KEY (group_id) REFERENCES interest_group(group_id),
	CONSTRAINT CHK_duration CHECK (duration >= 30)
);

CREATE TABLE interest_group_member (
	group_id int NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT PK_interest_group_member PRIMARY KEY (group_id, member_id),
	CONSTRAINT FK_interest_group_member_interest_group FOREIGN KEY (group_id) REFERENCES interest_group(group_id),
	CONSTRAINT FK_interest_group_member_member FOREIGN KEY (member_id) REFERENCES member(member_id)
);

CREATE TABLE event_member (
	event_id int NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT PK_event_member PRIMARY KEY (event_id, member_id),
	CONSTRAINT FK_event_member_event FOREIGN KEY (event_id) REFERENCES event(event_id),
	CONSTRAINT FK_event_member_member FOREIGN KEY (member_id) REFERENCES member(member_id)
);

INSERT INTO interest_group (name) VALUES ('Anime Club');
INSERT INTO interest_group (name) VALUES ('Gaming Club');
INSERT INTO interest_group (name) VALUES ('Cooking Club');

INSERT INTO event (name, start_date, start_time, duration, group_id)
VALUES ('Anime Club', '2022-06-30', '10:00', 120, 1);
INSERT INTO event (name, start_date, start_time, duration, group_id)
VALUES ('Anime Club', '2022-07-27', '10:30', 90, 1);
INSERT INTO event (name, start_date, start_time, duration, group_id)
VALUES ('Gaming Club', '2022-03-14', '15:30', 150, 2);
INSERT INTO event (name, start_date, start_time, duration, group_id)
VALUES ('Cooking Club', '2022-01-25', '9:00', 180, 3);

INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Yibran', 'Evangelista', 'yibran@gmail.com', '1998-07-27', true);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Victor', 'Evangelista', 'victor@gmail.com', '1995-02-24', false);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Eren', 'Yeager', 'eren@gmail.com', '1969-04-20', true);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Levi', 'Ackerman', 'levi@gmail.com', '1969-05-19', true);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Joe', 'Mamma', 'joe.mama@gmail.com', '1979-09-12', true);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Hector', 'Salamanca', 'hector@gmail.com', '1976-09-25', false);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Walter', 'White', 'walter@gmail.com', '2002-05-20', true);
INSERT INTO member (first_name, last_name, email, birthdate, wants_reminders)
VALUES ('Jesse', 'Pinkman', 'jessie@gmail.com', '2000-11-28', false);

INSERT INTO event_member (event_id, member_id) VALUES (1, 1);
INSERT INTO event_member (event_id, member_id) VALUES (1, 2);
INSERT INTO event_member (event_id, member_id) VALUES (1, 3);
INSERT INTO event_member (event_id, member_id) VALUES (2, 4);
INSERT INTO event_member (event_id, member_id) VALUES (2, 5);
INSERT INTO event_member (event_id, member_id) VALUES (3, 6);
INSERT INTO event_member (event_id, member_id) VALUES (3, 7);
INSERT INTO event_member (event_id, member_id) VALUES (3, 8);

INSERT INTO interest_group_member (group_id, member_id) VALUES (1, 1);
INSERT INTO interest_group_member (group_id, member_id) VALUES (1, 2);
INSERT INTO interest_group_member (group_id, member_id) VALUES (2, 4);
INSERT INTO interest_group_member (group_id, member_id) VALUES (2, 5);
INSERT INTO interest_group_member (group_id, member_id) VALUES (3, 6);
INSERT INTO interest_group_member (group_id, member_id) VALUES (3, 7);
INSERT INTO interest_group_member (group_id, member_id) VALUES (3, 1);


COMMIT;


