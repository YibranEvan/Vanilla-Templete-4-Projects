CREATE TABLE user (
    user_id serial,
    username varchar(20) NOT NULL,
    password varchar(20) NOT NULL
    email varchar(50) NOT NULL,
    profile_pic VARBINARY(MAX),
    birthday date Not NULL,
    weight 
);
