<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>exception</title>
</head>
<body>
	<%
	int status = response.getStatus();
	
	if(status == 404){
		out.print("404 에러가 발생하였습니다.");
		out.print("<br/>파일 경로를 확인해주세요.");
	} else if (status == 405){
		out.print("405 에러가 발생하였습니다.");
		out.print("<br/>요청 방식을 확인해주세요.");
	} else if (status == 500){
		out.print("500 에러가 발생하였습니다.");
		out.print("<br/>소스코드를 확인해주세요.");
	}
	%>
</body>
</html>