<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        User : ${registerPage.user}<br><br>
        User name :${registerPage.userName}<br><br>
        Password :${registerPage.password}<br><br>
        Gender :${registerPage.gender}<br><br>
        Country :${registerPage.country}<br><br>
        Age :${registerPage.age}<br><br>
        Hobby :
      
        <c:forEach var="select" items="${registerPage.hobby}" > 
        
        <c:out value="${select}"/>
        
        </c:forEach>
       <br><br>
       Email : ${registerPage.communicationDTO.email}
        
       <br><br>
       Phone : ${registerPage.communicationDTO.phone} 
        
        
        
</body>
</html>