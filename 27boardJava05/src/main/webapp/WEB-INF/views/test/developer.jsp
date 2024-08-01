<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<title>developer</title>
  </head>
  <body>
  	<h1>developer.jsp</h1>
    <h2>개발자 정보 목록</h2>
    ${developerList}
    <ul class="navbar_nav">
      <c:forEach var="developer" items="${developerList}">
        <li class="nav_item">
          ${developer.empno} - ${developer.ename} - ${developer.height} - ${developer.weight}
        </li>
      </c:forEach>
    </ul>

  	<br>
  	<button type="button" onclick="history.back()">이전페이지</button>
  </body>
</html>