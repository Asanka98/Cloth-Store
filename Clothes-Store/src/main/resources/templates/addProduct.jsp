<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
 	<meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>ADD PRODUCTS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</head>
<body>

<!-- Form Name -->

<!-- Text input-->
<div style="margin-top:10%">
    <form action="#" class="form-horizontal" th:action="@{/inventory/addproduct}" th:object="${product}" method="post">
	<div class="form-group">
	  <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
	  <div class="col-md-4">
	  
	  <input type="text"  th:field="*{pName}" placeholder="PRODUCT NAME" class="form-control input-md"  >
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="gender">GENDER</label>  
	  <div class="col-md-4">
	  <input id="product_name" th:field="*{gender}" placeholder="GENDER" class="form-control input-md"  type="text">
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="size">SIZE</label>  
	  <div class="col-md-4">
	  <input id="product_name"  th:field="*{size}" placeholder="SIZE" class="form-control input-md"  type="text">
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="color">COLOUR</label>  
	  <div class="col-md-4">
	  <input id="product_name"  th:field="*{color}" placeholder="PRODUCT NAME" class="form-control input-md"  type="text">
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="brand">BRNAD</label>  
	  <div class="col-md-4">
	  <input id="product_name"  th:field="*{brand}" placeholder="BRAND" class="form-control input-md"  type="text">
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="type">TYPE</label>  
	  <div class="col-md-4">
	  <input id="product_name"  th:field="*{ptype}" placeholder="TYPE" class="form-control input-md"  type="text">
	   
	  </div>
	</div>
	<div class="form-group">
	  <label class="col-md-4 control-label" for="singlebutton"></label>
	  <div class="col-md-4">
	    <button type="submit" id="singlebutton" name="singlebutton" class="btn btn-primary">INSERT</button>
	  </div>
	  </div>
	 
	</form>
</div>
<script type="text/javascript">

</script>
</body>
</html>
