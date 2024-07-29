<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>test5.jsp</h1>
  <h2>회원정보 수정 페이지 스프링 커스텀 폼 태그 방식</h2>
  <h2>Model의 addAttribute()객체</h2>
  <form:form modelAttribute="student" action="result" >
    이  름 : <form:input path="user_name" /><br>
    아이디 : <form:input path="user_id" /><br>
    암  호 : <form:password path="password" /><br>
    우편번호 : <form:input path="user_postcode" /><br>
    주  소 1 : <form:input path="user_address1" /><br>
    주  소 2 : <form:input path="user_address2" /><br>
  <button type="submit">회원정보수정</button><br>
  </form:form>
</body>
</html>