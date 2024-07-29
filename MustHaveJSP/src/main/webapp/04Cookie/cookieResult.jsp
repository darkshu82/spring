<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>cookieResult</title>
</head>
<body>
	<h1>cookieResult.jsp</h1>
	<h2>cookie 값 확인하기</h2>
	<%
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			String cookieName = cookies[i].getName();
			String cookieValue = cookies[i].getValue();
			out.println(String.format("쿠키명 : %s - 쿠키값 : %s<br/>", cookieName, cookieValue));
		}
	}
	%>
</body>
</html>