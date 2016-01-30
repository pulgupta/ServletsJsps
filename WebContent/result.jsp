<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer recommendations jsp</title>
</head>
<body>
	<h1>beer recommendations</h1>
	<%
		List<String> styles = (List)request.getAttribute("styles");
		Iterator<String> it = styles.iterator();
		while(it.hasNext()){
			out.println("<br> Try " + it.next());
		}
	%>
</body>
</html>