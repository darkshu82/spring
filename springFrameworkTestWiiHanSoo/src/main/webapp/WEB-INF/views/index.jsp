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
    <button type="button" onclick="location.href='problem01'">problem01</button><br>
    <button type="button" onclick="location.href='problem02?nums=1&nums=2&nums=3&nums=4&nums=5'">problem02</button><br>
    <form action="problem03" method="post">
      <input type="text" value="1"><br>
      <input type="text" value="2"><br>
      <input type="text" value="3"><br>
      <input type="text" value="4"><br>
      <input type="text" value="5"><br>
      <input type="submit" value="problem03"><br>
    </form>
    <form action="problem05" method="post">
      몸무게 : <input type="text" name="c"><br>
        키   : <input type="text" name="weight"><br>
      <input type="submit" value="problem04"><br>
    </form>
    <button type="button" onclick="location.href='problem05'">problem05</button><br>
    <button type="button" onclick="location.href='problem06'">problem06</button><br>
    <button type="button" onclick="location.href='problem07'">problem07</button><br>
    <button type="button" onclick="location.href='problem08'">problem08</button><br>
    <button type="button" onclick="location.href='problem09?name=더조은&address=종로&age=23&favoriteSubjects=자바&favoriteSubjects=스프링&favoriteSubjects=오라클'">problem09</button><br>
    <button type="button" onclick="location.href='problem10'">problem10</button><br>
    
    
    <form action="abc" method="post">
    	이름 : <input type="text" name="name" value="이순신">
    	주소 : <input type="text" name="address" value="서울">
    	<input type="submit" value="전송">
    </form>
    
    <img src="images/tjoeun.png" />
  </body>
</html>