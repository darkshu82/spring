<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .errors {color: red; font-size: 12px; font-weight: bold;}
</style>
</head>
<body>
  <h1>validation_test1.jsp</h1>
  <form:form action="validation_procedure" modelAttribute="developer" method="post">
    
    결혼여부 : <form:radiobutton path="married" value="true"/> 기혼
           <form:radiobutton path="married" value="false"/> 미혼 <br>
           <span class="errors"><form:errors path="married" /></span><br>
           
    졸업여부 : <form:radiobutton path="gradudated" value="true"/> 예
           <form:radiobutton path="gradudated" value="false"/> 아니요 <br>
           <span class="errors"><form:errors path="gradudated" /></span><br>
    
    아이디 : <form:input path="id" /><br>
           <span class="errors"><form:errors path="id" /></span><br>
           
    이름 : <form:input path="name" /><br>
           <span class="errors"><form:errors path="name" /></span><br>
    
    나이 : <form:input path="age" /><br>
           <span class="errors"><form:errors path="age" /></span><br>
           
    신장 : <form:input path="height" /><br>
           <span class="errors"><form:errors path="height" /></span><br>           
    
    부서 : <form:radiobutton path="dname" value="Operation" />운영부
           <form:radiobutton path="dname" value="Developer" />개발부<br>
           <span class="errors"><form:errors path="dname" /></span><br>
    
    부서번호 : <form:checkbox path="deptno" value="0080" />0080<br>
               <span class="errors"><form:errors path="deptno" /></span><br>
           
    개발자번호 : <form:input path="devNumber" /><br>
                 <span class="errors"><form:errors path="devNumber" /></span><br>        
    
    
    <br><br>
    <form:button type="submit">유효성검사하기</form:button>
  </form:form>
</body>
</html>


