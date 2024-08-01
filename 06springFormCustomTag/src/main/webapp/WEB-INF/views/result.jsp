<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
  <h1>result.jsp</h1>
    이  름 : ${member.user_name }<br>
    아이디 : ${member.user_id }<br>
    패스워드 : ${member.user_pw }<br>
    우편번호 : ${member.user_postcode }<br>
    주  소 1 : ${member.user_address1 }<br>
    주  소 2 : ${member.user_address2 }<br>
</body>
</html>