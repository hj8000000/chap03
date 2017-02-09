<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<%
	Date now = new Date();
%>
<html>
<head>
<meta charset="UTF-8">
<title>현재 시간</title>
</head>
<body>
현재시간:
<%= now %>
</body>
</html>