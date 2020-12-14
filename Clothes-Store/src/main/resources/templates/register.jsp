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

<form th:action="@{/user/register}" th:object="${user}" method="post">
  
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
    <input type="text" placeholder="Enter Telephone" th:field="*{contacNo}" name="tel" id="tel"required>
    
    <br><br>
    
  <h2>Your Password</h2>
 
 	<label for="psw"><b>Password*</b></label>
    <input type="password" placeholder="Enter Password"  name="psw" id="psw" required>
    
    <br><br>
    
    <label for="psw"><b>Confirm Password*</b></label>
    <input type="password" placeholder="Enter ConfirmPassword" name="cpsw" id="Cpsw" required>
    
    <br><br>

    <button type="submit">Register</button>
  
  
  
</form>

</body>
</html>