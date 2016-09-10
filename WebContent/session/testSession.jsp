<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lets test sessions</title>
</head>
<body>
<!-- In the below way we can say that even in case cookies are disabled we can ensure sessions will work -->
<form method="POST" action=<%= response.encodeURL("session.do") %>>
	Enter Your Name : <input type="text" name="ans1"/>
	<input type="submit" value="Enter"/>
</form>
</body>
</html>