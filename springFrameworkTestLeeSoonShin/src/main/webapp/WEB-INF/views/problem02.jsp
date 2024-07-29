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
  <h1>problem02.jsp</h1>
  <h2>nums : [
    <c:forEach var="num" items="${nums}" varStatus="status">
      ${num}&nbsp;
    </c:forEach>]
  </h2>
  <br>
  <button type="button" onclick="history.back()">이전페이지</button><br>
</body>
</html>