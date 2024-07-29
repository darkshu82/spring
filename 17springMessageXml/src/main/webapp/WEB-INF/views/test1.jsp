<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>test1.jsp</h1>
  <h2>person.name : <spring:message code="person.name" /></h2>
  <h2>student.name : <spring:message code="student.name" /></h2>
  <h2>person.info : <spring:message code="person.info" arguments="${args }" /></h2>
  <h2>language.locale : <spring:message code="language.locale" /></h2>
</body>
</html>