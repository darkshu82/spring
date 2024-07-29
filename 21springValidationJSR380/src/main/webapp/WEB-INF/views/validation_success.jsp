<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>validation_success.jsp</h1>
  이  름 : ${ developer.name }<br>
  아이디 : ${ developer.id }<br>
  나  이 : ${ developer.age }<br>
  사원번호 : ${ developer.empno }<br>
  주문번호 : ${ developer.orderno }<br>
  부서번호 : ${ developer.deptno }<br>
   이메일  : ${ developer.email }<br>
  
  <br>
  <button type="button" onclick="history.back()">이전 페이지로</button>
</body>
</html>