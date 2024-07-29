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
  <h1>read_data.jsp</h1>
  
  <!--
    model.addAttribute("memberList", memberList); 에서 
    request scope 에 올린 이름과
    items="${memberList } 에서
    request scope 에서 가져오는 이름이 일치해야 됨
  -->
  <c:forEach var="member" items="${memberList }">
    이 름 : ${member.name }<br>
    아이디 : ${member.id }<br>
    주 소 : ${member.addr }<br>
    <hr>
  </c:forEach>
  
  <br>
  <button type="button" onclick="history.back()">이전 페이지</button><br>
  
</body>
</html>



