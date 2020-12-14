<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">

</head>
<body>


<!-- Form Name -->

<!-- Text input-->

    <form action="#" th:action="@{/inventory/addproduct}" th:object="${product}" method="POST">
    
    	
		  <input th:field="*{pname}" placeholder="PRODUCT NAME" ><br>
		  
		  <input type="hidden" th:field="*{idproduct}" placeholder="PRODUCT NAME" ><br>
			
		  <input type="text" th:field="*{gender}" placeholder="GENDER" ><br>	   
	
		  <input type="text" th:field="*{size}" placeholder="SIZE" ><br>	   
	
		  <input type="text" th:field="*{color}" placeholder="PRODUCT NAME" ><br>
		
		  <input type="text" th:field="*{brand}" placeholder="BRAND"  ><br>	   
		
		  <input type="text" th:field="*{type}" placeholder="TYPE" ><br>	   
		
		  <button type="submit"  >INSERT</button><br>
	 
	</form>

<script type="text/javascript">

</script>
</body>
</html>
