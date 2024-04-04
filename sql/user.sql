create table user
(
    id           bigint auto_increment comment 'user id' primary key,
    username     varchar(256)                       null comment 'user name',
    userAccount  varchar(256)                       null comment 'user account',
    userPassword varchar(512)                       not null comment 'user password',
    userDescription    varchar(1024)                null comment 'user description',
    userIdUrl    varchar(1024)                      null comment 'user ID/Passport photo',
    gender       tinyint                            null comment 'user gender',
    phone        varchar(128)                       null comment 'user phone number',
    emailAddress varchar(512)                       null comment 'user email',
    address      varchar(512)                       null comment 'user address',
    userRole     int      default 0                 not null comment '0 - regular, 1 - volunteer',
    havePets     int      default 0                 not null comment 'whether user has pets',
    userCredits  int      default 0                 not null comment 'user credit after complete task',
    createTime   datetime default CURRENT_TIMESTAMP null comment 'first create time',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment 'last update time',
    isDelete     tinyint  default 0                 not null comment '0 - not delete 1 - deleted'
)
    comment 'user_table';