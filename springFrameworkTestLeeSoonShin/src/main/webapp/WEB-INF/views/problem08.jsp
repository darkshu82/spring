<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>problem08.jsp</h1>
  
  <c:forEach begin="1" end="9" var="count">
	  <c:out value="${dan } X ${count} = ${dan*count}" /><br/>
  </c:forEach>
	
  <br>
  <button type="button" onclick="history.back()">이전페이지</button><br>
</body>
</html>