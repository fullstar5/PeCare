create table pet
(
    id           bigint auto_increment comment 'pet id' primary key,
    petName      varchar(256)                       null comment 'pet name',
    userID       bigint                              null comment 'corresponding user',
    petAge       int                                null comment 'pet age',
    petGender    tinyint                            null comment 'pet gender',
    petDescription    varchar(1024)                 null comment 'pet description'
)
    comment 'pet_table';