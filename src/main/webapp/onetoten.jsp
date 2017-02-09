<%@page contentType="text/html; charset=utf-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1-10까지의 합</title>
</head>
<body>
<%
	int sum = 0;
	for (int i=1; i<=10; i++) {
		sum = sum + i;
	}
%>
1-10까지의 합은 <%=sum %> 입니다.
<br>
<%
	int sum2 = 0;
	for (int i=11; i<=20; i++) {
		sum2 = sum2 + i;
	}
%>
11-20까지의 합은 <%=sum2 %> 입니다.
</body>
</html>