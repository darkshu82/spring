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
  
  <button type="button" onclick="location.href='problem01'">problem01 spring framework</button><br>
  <button type="button" onclick="location.href='problem02?nums=1&nums=2&nums=3&nums=4&nums=5'">problem02</button><br>
  <form action="problem03" method="post">
    <input type="checkbox" name="nums" value="1"> 1 
    <input type="checkbox" name="nums" value="2"> 2 
    <input type="checkbox" name="nums" value="3"> 3 
    <input type="checkbox" name="nums" value="4"> 4 
    <input type="checkbox" name="nums" value="5"> 5 <br>
    <input type="submit" value="problem03" > 
  </form>  
  <form action="problem04" method="post">
    몸무게 : <input type="text" name="weight"><br>
    신 장  : <input type="text" name="height"><br>
    <input type="submit" value="problem04 BMI" > 
  </form>
  <form action="problem05" method="post">
    몸무게 : <input type="text" name="weight"><br>
    신 장  : <input type="text" name="height"><br>
    <input type="submit" value="problem05 BMI" > 
  </form>
  <form action="problem06" method="post">
    몸무게 : <input type="text" name="weight"><br>
    신 장  : <input type="text" name="height"><br>
    <input type="submit" value="problem06 BMI" > 
  </form>
  <form action="problem07" method="post">
    몸무게 : <input type="text" name="weight"><br>
    신 장  : <input type="text" name="height"><br>
    <input type="submit" value="problem07 BMI" > 
  </form>
  <form action="problem08" method="post">
    출력할 단수 : <input type="text" name="dan"><br>
    <input type="submit" value="problem08 구구단" > 
  </form>
  <button type="button" onclick="location.href='problem09?name=더조은&address=종로&age=23&favoriteSubjects=자바&favoriteSubjects=스프링&favoriteSubjects=오라클'">problem09</button><br>
  <form action="problem10" method="post">
    이 름 : <input type="text" name="name"><br>
    주 소 : <input type="text" name="address"><br>
    나 이 : <input type="text" name="age"><br>
    과 목 : <input type="checkbox" name="favoriteSubjects" value="자바"> 자바 
		    <input type="checkbox" name="favoriteSubjects" value="스프링"> 스프링
		    <input type="checkbox" name="favoriteSubjects" value="오라클"> 오라클 <br>
		    <input type="submit" value="problem10" > 
  </form>

  <br> 
  <img src="images/tjoeun.png" />
</body>
</html>



