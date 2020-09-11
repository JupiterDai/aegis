CREATE TABLE AC_ROLE
(
    ID           VARCHAR(8) PRIMARY KEY,
    ROLE_NAME    VARCHAR(32)  NOT NULL,
    TYPE         CHAR(3)      NOT NULL,
    DESCRIPTION  VARCHAR(100),
    IS_SYSTEM    CHAR(1),
    LANDING_PAGE VARCHAR(512) NOT NULL,
    CREATED_AT   DATETIME     NOT NULL,
    CREATED_BY   VARCHAR(32)  NOT NULL,
    UPDATED_AT   DATETIME     NOT NULL,
    UPDATED_BY   VARCHAR(32)  NOT NULL
);

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('SYSADMIN', '系统管理员', 'SYS', 'Y', '/web/systemManagement/issueStatus', NOW(), 'SYSTEM', NOW(), 'SYSTEM');

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('DEV', '软件开发工程师', 'DEV', 'N', '/web/issue/view', NOW(), 'SYSTEM', NOW(), 'SYSTEM');

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('QA', '软件测试工程师', 'DEV', 'N', '/web/issue/view', NOW(), 'SYSTEM', NOW(), 'SYSTEM');

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('DEV_S', '开发主管', 'ADM', 'N', '/web/issue/view', NOW(), 'SYSTEM', NOW(), 'SYSTEM');

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('QA_S', '测试主管', 'ADM', 'N', '/web/issue/view', NOW(), 'SYSTEM', NOW(), 'SYSTEM');

INSERT INTO AC_ROLE (ID, ROLE_NAME, TYPE, IS_SYSTEM, LANDING_PAGE, CREATED_AT, CREATED_BY,
                     UPDATED_AT, UPDATED_BY)
VALUES ('EXT_PTY', '第三方', 'USR', 'N', '/web/index', NOW(), 'SYSTEM', NOW(), 'SYSTEM');


