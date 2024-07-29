<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
  </head>
  <body>
    <h1>안녕하세요 ~~~</h1> 
    <button type="button" onclick="location.href='test1'">urlMappingTest1</button><br>
    <button type="button" onclick="location.href='abc'">urlMappingAbc</button><br>
    <button type="button" onclick="location.href='abc'">urlMappingPost</button><br>
    <button type="button" onclick="location.href='tjoeun'">urlMappingTjoeun</button><br>
    <button type="button" onclick="location.href='tjoeun/test2'">urlMappingTjoeun/test2</button><br>
    <button type="button" onclick="location.href='test2'">urlMappingTest2</button><br>
    <br>
    
    <form action="abc" method="post">
    	이름 : <input type="text" name="name" value="이순신">
    	주소 : <input type="text" name="address" value="서울">
    	<input type="submit" value="전송">
    </form>
    
    <img src="images/tjoeun.png" />
  </body>
</html>