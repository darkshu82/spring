<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>안녕하세요 ~~~</h1>
  
  <button type="button" onclick="location.href='test1'">test1 GET 방식</button>
  <br> 
  <form action="test1" method="post">
    <input type="submit" value="test1 POST 방식" >
  </form>
  <button type="button" onclick="location.href='test2'">test2 GET 방식</button>
  <br> 
  <form action="test2" method="post">
    <input type="submit" value="test2 POST 방식" >
  </form>
  <button type="button" onclick="location.href='calculate?nums=1&nums=2&nums=3&nums=4&nums=5'">calculate</button>
  <br>  
  <form action="circleArea" method="post">
    원주율 : <input type="text" name="pi"><br>
    반지름 : <input type="text" name="radius"><br>
    <input type="submit" value="circleArea" >
  </form>
  <button type="button" onclick="location.href='circleArea?pi=3.14&radius=5'">circleArea2</button>
  <br> 
  <img src="images/tjoeun.png" />
</body>
</html>



