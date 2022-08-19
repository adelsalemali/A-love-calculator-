<%@ page language ="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding  ="ISO-8859-1"%>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <h1>HI ${name}</h1>
           <h2>Send result to your email</h2>
            <form:form action="processEmali" method="get" modelAttribute="emailDTO">
                
	            <label>Enter your Email</label>
	            <form:input path="userEmail"/>
	            <input type="submit" value="Send">
               
            </form:form>
</body>
</html>