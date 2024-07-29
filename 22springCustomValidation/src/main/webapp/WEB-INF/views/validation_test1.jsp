<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>validation_test1</title>
  <style>
    .errors {color: red; font-size: 12px; font-weight: bold;}
  </style>
</head>
<body>
  <h1>validation_test1</h1>
  <form:form action="validation_procedure" modelAttribute="developer" method="post">
    
    이름 : <form:input path="name" /><br>
           <span class="errors"><form:errors path="name" /></span><br>
    부서이름 : <form:input path="dname" /><br>
               <span class="errors"><form:errors path="dname" /></span><br> 
    매니저명 : <form:input path="mgrName" /><br>
               <span class="errors"><form:errors path="mgrName" /></span><br>
    주소 : <form:input path="address" /><br>
           <span class="errors"><form:errors path="address" /></span><br>            
    이메일 : <form:input path="email" /><br>
           <span class="errors"><form:errors path="email" /></span><br> 
     
               
               
    <br><br>
    <form:button type="submit">유효성검사하기</form:button>
  </form:form>
  <br>
  <button type="button" onclick="history.back()">이전 페이지로</button>
</body>
</html>


