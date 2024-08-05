<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="root" value="${pageContext.request.contextPath}/" /> 
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>officer.jsp</title>
</head>
<body>
  <h1>test/sophomore.jsp</h1>
  <h2>경찰관 정보 목록</h2>
  <p>${sophomoreList }</p>
  <hr>
  <ul class="navbar-nav">
    <c:forEach var="officer" items="${sophomoreList }">
      <li class="nav-item">
        ${sophomore.stdno } - ${sophomore.name } - ${sophomore.grade } - ${sophomore.deptname }
      </li>
    </c:forEach>
  
  </ul>
</body>
</html>