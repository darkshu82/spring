<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="root" value="${pageContext.request.contextPath}/" /> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>officer</title>
</head>
<body>
  <h1>test/officer.jsp</h1>
  <h2> 경찰관 정보 목록</h2>
  <p>${officerList }</p>
  <hr>
    <ul class="navbar-nav">
	
    <c:forEach var="officer" items="${officerList }">
    <li class="nav-item">
		${officer.empno} - ${officer.ename} - ${officer.height} - ${officer.weight}
	</li>
    </c:forEach>
    
	</ul>
</body>
</html>