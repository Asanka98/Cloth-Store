<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form action="#" th:action="@{/user/adduser}" th:object="${newuser}" method="POST">
  
  <h2>Your Personal Details</h2>
  
	<label for="fname"><b>FirstName*</b></label>
    <input type="text" placeholder="Enter Firstname" th:field="*{firstName}" name="fname" id="fname"required>
    
    <label for="lname"><b>LastName*</b></label>
    <input type="text" placeholder="Enter Lastname" th:field="*{lastName}" name="lname" id="lname"required>

	<br><br>
	
	<label for="email"><b>Email*</b></label>
    <input type="email" placeholder="Enter Email" th:field="*{email}" name="email" id="email" required>
    
    <br><br>
    
    <label for="telephone"><b>Telephone*</b></label>
    <input type="text" placeholder="Enter Telephone" th:field="*{contactno}" name="tel" id="tel"required>
    
    <br><br>
    
  	
 	<label for="psw"><b>Password*</b></label>
    <input type="password" placeholder="Enter Password" th:field="*{password}"  name="psw" id="psw" required>
    
    <br><br>
    
   	<label for="address"><b>Address*</b></label>
    <input type="text" placeholder="Enter Address" th:field="*{address}"  name="address" id="address" required>
    
    
    <br><br>

	<label for="type"><b>Type*</b></label>
    <input type="text" placeholder="Enter Type" th:field="*{type}"  name="type" id="type" required>
    
    <br><br>
    
    
    <label for="gender"><b>Gender*</b></label>
    <input type="text" placeholder="Enter Gender" th:field="*{gender}"  name="gender" id="gender" required>
    
    <br><br>
    
    
    <button type="submit">Register</button>
  
  
  
</form>

</body>
</html>