<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>index</title>
  </head>
  <body>
	<h1>안녕하세요</h1>
    <button type="button" onclick="location.href='paramtest1?number1=100&number2=200&nums=10&nums=20&nums=30'">paramtest1 GET 방식</button>
    <br>
    <!-- post 방식 : input type text, checkbox(배열) -->
    <form action="paramtest2" method="post">
      number1 : <input type="text" name="number1"><br>
      number2 : <input type="text" name="number2"><br>
      checkbox 사용해서 request scope 에 배열로 올리기 <br> 
      
    </form>
    
    
    <br>
    <img src="images/tjoeun.png" />
  </body>
</html>