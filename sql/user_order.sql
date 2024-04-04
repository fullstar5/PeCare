create table user_order
(
    id           bigint auto_increment comment 'order id' primary key,
    orderName    varchar(256)                        null comment 'order name',
    orderDescription    varchar(1024)                null comment 'order description',
    requesterID  bigint                              null comment 'user who post request',
    requesterPetID  bigint                           null comment 'pet that requires attention',
    volunteerID  bigint                              null comment 'user who receive request',
    creditsReward  int    default 20                 not null comment 'how many credits rewards',
    orderTime    datetime default CURRENT_TIMESTAMP  null comment 'when order should be proceed',
    accept       tinyint                             null comment 'whether user has pets',
    createTime   datetime default CURRENT_TIMESTAMP  null comment 'first create time',
    updateTime   datetime default CURRENT_TIMESTAMP  null on update CURRENT_TIMESTAMP comment 'last update time',
    isDelete     tinyint  default 0                  not null comment '0 - not delete 1 - deleted'


)
    comment 'order_table';