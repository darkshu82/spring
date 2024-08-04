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
  <h2>이  름 : ${ user.name } </h2>
  <h2>아이디 : ${ user.id} </h2>
  <h2>암  호 : ${ user.pw} </h2>
  <h2>우편번호 : ${ user.post_number} </h2>
  <h2>주  소 1 : ${ user.address1} </h2>
  <h2>주  소 2 : ${ user.address2} </h2>
  <hr>
  <h2>이  름 : ${ name } </h2>
  <h2>직  업 : ${ job } </h2>
  <hr>
  <h2>회원번호 : ${ collegeStudent.memberNum} </h2>
  <h2>이  름 : ${ collegeStudent.name } </h2>
  <h2>아이디 : ${ collegeStudent.id} </h2>
  <h2>암  호 : ${ collegeStudent.pw} </h2>
  <h2>전화번호 : ${ collegeStudent.phone} </h2>
  <h2>주  소 : ${ collegeStudent.address} </h2>
  <hr>
  <h2>회원번호 : ${ officer.memberNum} </h2>
  <h2>이  름 : ${ officer.name } </h2>
  <h2>아이디 : ${ officer.id} </h2>
  <h2>암  호 : ${ officer.pw} </h2>
  <h2>전화번호 : ${ officer.phone} </h2>
  <h2>주  소 : ${ officer.address} </h2>
  <hr>
  <h2>회원번호 : ${ colleague.memberNum} </h2>
  <h2>이  름 : ${ colleague.name } </h2>
  <h2>아이디 : ${ colleague.id} </h2>
  <h2>암  호 : ${ colleague.pw} </h2>
  <h2>전화번호 : ${ colleague.phone} </h2>
  <h2>주  소 : ${ colleague.address} </h2>
  <hr>
  <h2>회원번호 : ${ learner.memberNum} </h2>
  <h2>이  름 : ${ learner.name } </h2>
  <h2>아이디 : ${ learner.id} </h2>
  <h2>암  호 : ${ learner.pw} </h2>
  <h2>전화번호 : ${ learner.phone} </h2>
  <h2>주  소 : ${ learner.address} </h2>
  <hr>
  <button type="button" onclick="history.back()">이전 페이지</button>
</body>
</html>