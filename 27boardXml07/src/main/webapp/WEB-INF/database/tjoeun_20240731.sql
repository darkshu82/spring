SELECT * 
  FROM BOARD_INFO_TABLE
ORDER BY BOARD_INFO_IDX; 

DESC BOARD_INFO_TABLE;

SELECT BOARD_INFO_IDX, BOARD_INFO_NAME FROM BOARD_INFO_TABLE ORDER BY BOARD_INFO_IDX;

SELECT * FROM BOARD_INFO_TABLE ORDER BY BOARD_INFO_IDX;

DROP SEQUENCE DEVELOPER_SEQ;
CREATE SEQUENCE DEVELOPER_SEQ
START WITH 1
INCREMENT BY 1
MINVALUE 0;


CREATE TABLE DEVELOPER(
  EMPNO		VARCHAR2(4) PRIMARY KEY,
  ENAME     VARCHAR2(20) NOT NULL,
  HEIGHT    NUMBER(5,2),
  WEIGHT    NUMBER(5,2)
);
INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXTVAL, '이순신', 182, 93);
INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXTVAL, '강감찬', 176, 78);
INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXTVAL, '이율곡', 172, 75);
INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXTVAL, '유관순', 168, 54);
INSERT INTO DEVELOPER VALUES(DEVELOPER_SEQ.NEXTVAL, '안중근', 179, 83);

COMMIT;

SELECT * FROM DEVELOPER;

-- DELETE FROM DEVELOPER;

SELECT * 
  FROM DEVELOPER
ORDER BY EMPNO;


DROP SEQUENCE OFFICER_SEQ;
CREATE SEQUENCE OFFICER_SEQ
START WITH 1
INCREMENT BY 1
MINVALUE 0;

CREATE TABLE OFFICER(
  OFFICERNO		VARCHAR2(4) PRIMARY KEY,
  OFFICERNAME   VARCHAR2(20) NOT NULL,
  DEPTNAME      VARCHAR2(20),
  HIREDATE      VARCHAR2(50)  
);

INSERT INTO OFFICER VALUES(OFFICER_SEQ.NEXTVAL, '이순신', '수사국', '2024-07-01');
INSERT INTO OFFICER VALUES(OFFICER_SEQ.NEXTVAL, '강감찬', '형사국', '2024-07-02');
INSERT INTO OFFICER VALUES(OFFICER_SEQ.NEXTVAL, '이율곡', '정보국', '2024-07-03');
INSERT INTO OFFICER VALUES(OFFICER_SEQ.NEXTVAL, '유관순', '교통국', '2024-07-04');
INSERT INTO OFFICER VALUES(OFFICER_SEQ.NEXTVAL, '안중근', '안보국', '2024-07-05');

COMMIT;

SELECT * 
  FROM OFFICER 
ORDER BY OFFICERNO;  

-- SELECT * FROM OFFICER ORDER BY OFFICERNO

