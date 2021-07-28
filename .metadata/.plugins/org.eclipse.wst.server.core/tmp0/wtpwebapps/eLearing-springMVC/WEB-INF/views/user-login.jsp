<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User page</title>
</head>
<body>
<h2>User Login</h2>
	<hr>
	<!--<h2>${adminLogin} </h2>-->
	 <form:form action="user-login" method="POST" modelAttribute="user">
		<pre>
        Id        : <form:input path="user_id" /><br>
        password  : <form:password path="password"/><br>
                    <input type="submit" value="Login" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form> 
</body>
</html>