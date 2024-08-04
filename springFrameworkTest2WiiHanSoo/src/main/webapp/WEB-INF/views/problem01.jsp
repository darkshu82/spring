<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>problem01</title>
</head>
<body>
  <h1>problem01.jsp</h1>
  <form action="result" method="post">
    이  름 : <input type="text" name="name" value="${ user.name }"><br>
    아이디 : <input type="text" name="id" value="${ user.id }"><br>
    암  호 : <input type="password" name="pw" value="${ user.pw }"><br>
    우편번호 : <input type="text" name="post_number" value="${ user.post_number }"><br>
    주  소 1 : <input type="text" name="address1" value="${ user.address1 }"><br>
    주  소 2 : <input type="text" name="address2" value="${ user.address2 }"><br>
    <input type="submit" value="회원정보수정">
  </form>
  <br>
  <button type="button" onclick="history.back()">이전 페이지</button>
</body>
</html>