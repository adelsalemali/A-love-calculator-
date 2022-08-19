<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<style type="text/css">
.erro{
    color: red;
    position: fixed;
    text-align: left;
    margin-left: 30px;
}

</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h1 align="center">Register Form</h1>
       
        <form:form action="resultRegister" method="get" modelAttribute="registerPage">
        
        <div align="center">
           <p>
            <label>User</label>
            <form:input id="yn" path="user"/>
            <form:errors path="user" cssClass="erro"/>
           </p>
           
           <p>
            <label>User Name</label>
            <form:input path="userName"/>
             <form:errors path="userName" cssClass="erro"/>
           </p>
           
           <p>
            <label>Password</label>
            <form:input path="password"/>
           </p>
           
           <p>
            <label>Age</label>
            <form:input id="age" path="age"/>
            <form:errors path="age" cssClass="erro"/>
           </p>
           
           <p>
           <label>Country</label>
           <form:select path="country">
           
              <form:option value="Yeman"/>
              <form:option value="Saudi Arabi"/>
              <form:option value="Sudan"/>
              <form:option value="Turkiey"/>
        
           </form:select>
           </p>
           <p>
           <label>Hobby :</label>
           Cricket<form:checkbox path="hobby" value="cricket "/>
           Reading<form:checkbox path="hobby" value="reading "/>
           Travel<form:checkbox path="hobby" value="travel "/>
           Programming<form:checkbox path="hobby" value="programming "/>
           </p>
           
           <p>
                <label>Gender :</label>
                Male<form:radiobutton path="gender"  value="Male"/>
                Female<form:radiobutton path="gender" value="Female"/>
           </p>
           
           
         </div>    
         <div align="center">
             <h3>Communication</h3>
             
             <p>
                  <label>Email</label>
	              <form:input path="communicationDTO.email"/>
	              <form:errors path="communicationDTO.email" cssClass="erro" />
              </p>
            
             <p>
                 <label>Phone</label>
                 <form:input path="communicationDTO.phone"/>
                 <form:errors path="communicationDTO.phone" cssClass="erro"/> 
             </p>
             
             <input type="submit" value="Register">
         </div>
          
        </form:form>
</body>
</html>