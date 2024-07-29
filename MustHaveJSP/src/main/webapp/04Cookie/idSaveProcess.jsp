<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String user_id = request.getParameter("user_id");
String user_pw = request.getParameter("user_pw");
String save_check = request.getParameter("save_check");

if("must".equals(user_id) && "1234".equals(user_pw)){
	if(save_check != null && save_check.equals("Y")){
		CookieManager.makeCookie(response, "loginId", user_id, 86400);
	} else {
		CookieManager.deleteCookie(response, "loginId");
	}
	JSFuction.alertLocation("로그인에 성공했습니다.", "idSaveMain.jsp", out);
} else {
	JSFuction.alertBack("로그인에 실패했습니다.", out);
}
%>    
    
    
<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
	
</body>
</html>