<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	HttpSession hs = request.getSession(); //옛날 자바였을 때는 () 여기다가 true,false썼다.
	
	String mid = (String)hs.getAttribute("mid");
	out.print(mid);
	hs.invalidate(); // session 전체삭제

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>