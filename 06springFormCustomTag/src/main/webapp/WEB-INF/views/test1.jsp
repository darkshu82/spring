<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>
  <h1>test1.jsp</h1>
  <form action="result" method="post">
    이  름 : <input type="text" name="user_name" value="${member.user_name }"><br>
    아이디 : <input type="text" name="user_id" value="${member.user_id }"><br>
    패스워드 : <input type="password" name="user_pw" value="${member.user_pw }"><br>
    우편번호 : <input type="text" name="user_postcode" value="${member.user_postcode }"><br>
    주  소 1 : <input type="text" name="user_address1" value="${member.user_address1 }"><br>
    주  소 2 : <input type="text" name="user_address2" value="${member.user_address2 }"><br>
    <input type="submit" value="회원정보수정"><br>
  </form>
</body>
</html>