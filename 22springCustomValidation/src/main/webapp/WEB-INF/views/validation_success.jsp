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
  부서이름 : ${ developer.dname }<br>
  매니저명 : ${ developer.mgrName }<br>
  
  <br>
  <button type="button" onclick="history.back()">이전 페이지로</button>
</body>
</html>