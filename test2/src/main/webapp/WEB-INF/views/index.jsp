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
    <button type="button" onclick="location.href='hello'">hello</button><br>
    <button type="button" onclick="location.href='greet'">greet GET</button><br>
    <form action="greet" method="post">
      <input type="submit" value="greet POST"><br>
    </form>
    <button type="button" onclick="location.href='hello2?name=이순신'">hello2</button><br>
    <button type="button" onclick="location.href='service'">service</button><br>
    
    
    <br><br>    
    <button type="button" onclick="history.back()">이전 페이지</button><br>
    <img src="images/tjoeun.png" />
  </body>
</html>