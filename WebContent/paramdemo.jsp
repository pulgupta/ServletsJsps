<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dogi" class="com.example.Dog"></jsp:useBean>

<form>
	<input type="text" name="breed" />
	<input type="submit" value="enter" />
</form>
	<jsp:setProperty property="*" name="dog"/>
	<p> The value of the breed is ${dog.breed}</p>
</body>
</html>