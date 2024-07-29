<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>problem04.jsp</h1>
  <h2>체질량지수(BMI) : <fmt:formatNumber value="${bmi * 100}" pattern="0.00"/> %</h2>

  <br>
  <button type="button" onclick="history.back()">이전페이지</button><br>
</body>
</html>