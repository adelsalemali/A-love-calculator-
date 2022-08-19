<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1 align="center">Love Calculator</h1>
        <hr>
         ${userInfo.name} & ${userInfo.crushName}<br>
          <br>
          ${userInfo.result}
          <br>
          <a href="<c:url value='sendEmailnow'/>">
           Send result to your email
          </a>
</body> 
</html>