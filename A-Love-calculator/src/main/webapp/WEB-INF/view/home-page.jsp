<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      	
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.erro{
    color: red;
    position: fixed;
    text-align: left;
    margin-left: 30px;
}

</style>

<script type="text/javascript">

     function validationUserName() {
	 	
      var userName = document.getElementById("yn").value;
      if(userName.length < 3  )
    	  {
    	    alert("Your name shoud have atlest 2 " + userName.length);
    	     return false ;
    	  }
      else
    	  {
    	    true;
    	  }
	}
</script>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h2 align="center">Love Calculator</h2>
         
         <form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validationUserName()">
	         <div align="center">
		           <p>
		            <label for="yn">Name:</label>
		            <form:input path="name" id="yn"/>
		            <form:errors path="name" cssClass="erro"/>
		          </p>
		          
		          <p>
		            <label for="cn">Crash name :</label>
		            <form:input  path="crushName"  id="cn"/>
		            <form:errors path="crushName" cssClass="erro"/>
		         </p>
		         
		         <p>
		            <form:checkbox path="termAndCondithion"/>
		            <label>I am agreeing this just for fun</label>
		            <form:errors path="termAndCondithion" cssClass="erro"/>
		         </p>
		         
	                <input type="submit" value="Calculator" />
	         </div>
         </form:form>
</body>
</html>