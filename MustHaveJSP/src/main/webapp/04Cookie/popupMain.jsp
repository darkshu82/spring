<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String popupMode = "on";

	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			String cookieName = cookies[i].getName();
			String cookieValue = cookies[i].getValue();
			out.println(String.format("쿠키명 : %s - 쿠키값 : %s<br/>", cookieName, cookieValue));
			if(cookieName.equals("PopupClose")){
				popupMode = cookieValue;
			}
		}
	}
%>

<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>popup</title>
  <style>
    div#popup{
      position: absolute; top: 100px; left: 50px;
      width : 270px; height : 100px; color: yellow;
      background-color:gray;
    }
    div#popup > div {
      position: relative; background-color: #ffffff; top: 0px;
      border: 1px solid gray; padding: 10px; color: black; 
    }
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
  <script>
    $(function() {
    	$('#closeBtn').click(function(){
    		$('#popup').hide();
    		var chkVal = $('input:checkbox[id=inactiveToday]:checked').val();
    		if(chkVal == 1){
    			$.ajax({
    				url: './popupCookie.jsp',
    				type: 'get',
    				data: {inactiveToday : chkVal},
    				dataType: 'text',
    				success: function(resData){
    					if(resData != '') location.reload();
    				}
    			});
    		}
    	});
    });
  </script>
</head>
<body>
	<%
	  for(int i = 1; i <= 10; i++){
		out.print("현재 팝업창은 " + popupMode + " 상태입니다<br>");
	  }
	  if(popupMode.equals("on")){
	%>	
	  <div id="popup">
	    <h2 align="center">공지사항 팝업입니다.</h2>
	    <div align="right"><form name="popFrm">
	      <input type="checkbox" id="inactiveToday" value="1">
	      하루 동안 열지 않음
	      <input type="button" id="closeBtn" value="닫기">
	    </form></div>
	  </div>
	<%
	  }
	%>
</body>
</html>