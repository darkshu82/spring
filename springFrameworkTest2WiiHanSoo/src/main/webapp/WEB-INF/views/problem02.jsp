<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>problem02</title>
</head>
<body>
  <h1>problem02.jsp</h1>
  <form:form action="result" modelAttribute="user" method="post">
    이  름 : <form:input path="name" /><br>
    아이디 : <form:input path="id" /><br>
    암  호 : <form:password path="pw" showPassword="true" /><br>
    우편번호 : <form:input path="post_number" /><br>
    주  소 1 : <form:input path="address1" /><br>
    주  소 2 : <form:input path="address2" /><br>
    <button type="submit">회원정보수정</button>
  </form:form>
  <br>
  <button type="button" onclick="history.back()">이전 페이지</button>
</body>
</html>