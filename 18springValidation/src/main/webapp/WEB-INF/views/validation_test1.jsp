<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .errors { color: red; }
</style>
</head>
<body>
  <h1>validation_test1.jsp</h1>
  <form action="validation_procedure" method="post">
    이름 : <input type="text" name="name">
    <spring:hasBindErrors name="developer">
      <c:if test="${ errors.hasFieldErrors('name') }">
      	<span class="errors">${ errors.getFieldError('name').defaultMessage }</span>
      </c:if>
     </spring:hasBindErrors> <br>
    나이 : <input type="text" name="age">
    <spring:hasBindErrors name="developer">
      <c:if test="${ errors.hasFieldErrors('age') }">
      	<span class="errors">${ errors.getFieldError('age').defaultMessage }</span>
      </c:if>
     </spring:hasBindErrors> <br> 
    <input type="submit" value="유효성검사">
  </form>  
</body>
</html>








