<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }/" />
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
  <script type="text/javascript">
  	alert("게시글이 삭제되었습니다 !!!");
  	location.href="${root }board/main";
  </script>
</body>
</html>