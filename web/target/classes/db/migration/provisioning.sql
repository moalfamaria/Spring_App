CREATE TABLE IF NOT EXISTS V1_create_users (

    Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    User_name varchar(20),
    Passwrord varchar(50),
    PRIMARY KEY (Id),
    UNIQUE KEY UK_username (User_name)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;


CREATE TABLE IF NOT EXISTS  V2_create_messages(

    Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Message varchar(50),
    Post_date timestamp,
    User_id int,
    PRIMARY KEY (Id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
