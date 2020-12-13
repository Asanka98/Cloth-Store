<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta charset="ISO-8859-1">

</head>
<body>

<form action="" method="post">

	<h2>ClothStore</h2>
  
	<label for="email"><b>Email Address</b></label>
    <input type="text" placeholder="Enter Email Address" name="email" required>

	<br><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

	<br><br>


    <button type="submit">Login</button>
   
   
   	<br><br>
   
  	<span>OR</span>
  	
  	<br><br>
  	
    <a href="#">Forgotten Password</a>
    
    <br><br>
    
 	<p>"Don't have an account?"<a href="#"><span>SignUp</span></a></p>
 	
</form>

</body>
</html>