CREATE TABLE CM_MASTER_CODE
(
    ID            INT PRIMARY KEY AUTO_INCREMENT,
    TYPE          VARCHAR(64) NOT NULL,
    CODE          VARCHAR(16) NOT NULL,
    VALUE         VARCHAR(64) NOT NULL,
    DESCRIPTION   VARCHAR(500),
    IS_CACHED     CHAR(1)     NOT NULL,
    IS_SYSTEM     CHAR(1),
    DISPLAY_ORDER INT,
    IS_EDITABLE   CHAR(1)     NOT NULL,
    CREATED_AT    DATETIME    NOT NULL,
    CREATED_BY    VARCHAR(32) NOT NULL,
    UPDATED_AT    DATETIME    NOT NULL,
    UPDATED_BY    VARCHAR(32) NOT NULL,
    UNIQUE MASTER_TYPE_CODE_UK (TYPE, CODE)
);

