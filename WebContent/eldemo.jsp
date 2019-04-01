<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <jsp:useBean id="dog" type="com.example.Dog" class="com.example.Dog" scope="request">
		<jsp:setProperty property="breed" name="dog" value="not set"/>
	</jsp:useBean>
	The breed of Dog is <jsp:getProperty property="breed" name="dog"/> --%>
	<!-- So all the above commented lines can be replaced by just a single line as 
	written below -->
	${dog.breed}
</body>
</html>