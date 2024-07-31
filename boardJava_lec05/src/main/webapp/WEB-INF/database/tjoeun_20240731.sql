DROP SEQUENCE USER_SEQ;
CREATE SEQUENCE USER_SEQ
START WITH 0
INCREMENT BY 1
MINVALUE 0;

DROP SEQUENCE CONTENT_SEQ;
CREATE SEQUENCE CONTENT_SEQ
START WITH 0
INCREMENT BY 1
MINVALUE 0;

DROP TABLE BOARD_INFO_TABLE PURGE;
CREATE TABLE BOARD_INFO_TABLE(
	BOARD_INFO_IDX NUMBER CONSTRAINT PK_BOARD_INFO PRIMARY KEY,
	BOARD_INFO_NAME VARCHAR2(500) NOT NULL
);

INSERT INTO BOARD_INFO_TABLE(BOARD_INFO_IDX, BOARD_INFO_NAME) VALUES (1, '�����Խ���');
INSERT INTO BOARD_INFO_TABLE(BOARD_INFO_IDX, BOARD_INFO_NAME) VALUES (2, '���ӰԽ���');
INSERT INTO BOARD_INFO_TABLE(BOARD_INFO_IDX, BOARD_INFO_NAME) VALUES (3, '��ġ�Խ���');
INSERT INTO BOARD_INFO_TABLE(BOARD_INFO_IDX, BOARD_INFO_NAME) VALUES (4, '�������Խ���');

SELECT * FROM BOARD_INFO_TABLE;
COMMIT;

DROP TABLE USER_TABLE PURGE;
CREATE TABLE USER_TABLE(
	USER_IDX NUMBER CONSTRAINT PK_USER PRIMARY KEY,
	USER_NAME VARCHAR2(50) NOT NULL,
	USER_ID VARCHAR2(100) NOT NULL,
	USER_PW VARCHAR2(100) NOT NULL
);

DROP TABLE CONTENT_TABLE PURGE;
CREATE TABLE CONTENT_TABLE(
	CONTENT_IDX NUMBER CONSTRAINT PK_CONTENT PRIMARY KEY,
	CONTENT_SUBJECT VARCHAR2(500) NOT NULL,
	CONTENT_TEXT LONG NOT NULL,
	CONTENT_FILE VARCHAR2(500),
	CONTENT_WRITER_IDX NUMBER NOT NULL
	                   CONSTRAINT FK1_CONTENT REFERENCES USER_TABLE(USER_IDX),
	CONTENT_BOARD_IDX NUMBER NOT NULL
	                  CONSTRAINT FK2_CONTENT REFERENCES BOARD_INFO_TABLE(BOARD_INFO_IDX),
	CONTENT_DATE DATE NOT NULL
);

SELECT * FROM USER_TABLE;
SELECT * FROM CONTENT_TABLE;

DROP SEQUENCE DEVELOPER_SEQ;
CREATE SEQUENCE DEVELOPER_SEQ
START WITH 0
INCREMENT BY 1
MINVALUE 0;

CREATE TABLE DEVELOPER(
  EMPNO		VARCHAR2(4) PRIMARY KEY,
  ENAME     VARCHAR2(20) NOT NULL,
  HEIGHT    NUMBER(5,2),
  WEIGHT    NUMBER(5,2)
);

INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXT_VAL, )




