
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Output from welcome.jsp</h2>
	<h2>${welcomeobj.message}</h2>
	<h2>Server date time is : ${welcomeobj.dateTime}</h2>

</body>
</html>