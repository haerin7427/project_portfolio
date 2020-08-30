<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h1>Add New Employee</h1>  
       <form:form method="GET" action="join">    
        <table >    
         <tr>    
          <td>ID : </td>   
          <td><form:input path="id" /></td>  
         </tr>    
         <tr>    
          <td>psw  :</td>    
          <td><form:input path="pwd" /></td>  
         </tr>   
         <tr>    
          <td>name  :</td>    
          <td><form:input path="name" /></td>  
         </tr>   
         <tr>    
          <td>birth   :</td>    
          <td><form:input path="birth" /></td>  
         </tr>  
         <tr>    
          <td>phone number   :</td>    
          <td><form:input path="number" /></td>  
         </tr>  
         <tr>    
          <td>email  :</td>    
          <td><form:input path="email" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
	
</body>
</html>