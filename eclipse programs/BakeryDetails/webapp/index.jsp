<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<nav class="navbar navbar-dark bg-primary">
         <a class="navbar-brand" href="#" >
           Bakery   
      </a>
</nav>

</head>
<body>
<h1>Save Details of Bakery</h1>
<form action="bakery" method="post">
        <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery Name</label>
			 <input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="Enter Bakery name">
		</div><br>
		 <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery Owner</label>
			 <input type="text" class="form-control" name="owner" id="exampleFormControlInput1" placeholder="Enter Bakery owner name">
		</div><br>
		 <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bakery Owner WifeName</label>
			 <input type="text" class="form-control" name="wife" id="exampleFormControlInput1" placeholder="Enter Bakery owner wife name">
		</div><br>
		<label for = "name">Owner Married</label>
      <div class = "radio">
         <label>
            <input type = "radio" name = "married" id = "optionsRadios1" value = "true" checked>Yes
         </label>
      </div>
      <div class = "radio">
         <label>
            <input type = "radio" name = "married" id = "optionsRadios2" value = "false">
               No
         </label>
         </div><br>
        <div class = "form-group">
            <label for = "name">Famousfor</label>
            <input type = "text" class = "form-control" name="famousFor" placeholder = "Enter bakery famous food">
         </div><br>
         
         <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Since</label>
			 <input type="text" class="form-control" name="since" id="exampleFormControlInput1" placeholder="Enter Bakery year">
		</div><br>
		
		<div>
		<input type="submit" value="send" class="btn btn-dark"/>
		</div>
	</form>
         
</body>
</html>