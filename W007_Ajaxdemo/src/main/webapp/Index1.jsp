<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index1</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>


<script type="text/javascript">

   $(document).ready(function(){
	   
	   $.get("student",{},function(f){
		 
		   
	   })
   })
   



</script>
</head>
<body>
     <div class="container">
      <div class="row">
       <div class="col-md-4 m-auto">
       
       <h1 align="center">Registration Form</h1>

    <form action="student">
    
      <div class="form-group">
     <lable>ID</lable>
     <input type="text" name="id" class="form-control">
     </div>
     
     
      <div class="form-group">
     <lable>Sname</lable>
     <input type="text" name="sname" class="form-control">
     </div>
     
      <div class="form-group">
     <lable>Email</lable>
     <input type="text" name="email" class="form-control">
          </div>
     
      <div class="form-group">
     <lable>Password</lable>
     <input type="text" name="pass" class="form-control">
          </div>
     
      <div class="form-group">
     <lable>DOB</lable>
     <input type="text" name="dob" class="form-control">
          </div>
     
      <div class="form-group">
     <lable>Gender</lable>
     <input type="radio" value="male" class="form-control">
     <input type="radio" value="female" class="form-control">
          </div>
     
      <div class="form-group">
     <lable>Language</lable>
     <input type="checkbox" value="Gujarati" class="form-control">
     <input type="checkbox" value="Hindi" class="form-control">
     <input type="checkbox" value="English" class="form-control">
    </div>
    
       <div class="form-group">
     <lable>Country</lable>
     <input type="checkbox" value="India" class="form-control">
     <input type="checkbox" value="USA" class="form-control">
     <input type="checkbox" value="Canada" class="form-control">
    </div>
    
    <br>
    
    <input type="submit" class="btn btn-success">
    
    </form>
    
     </div>
     </div>
     </div>
</body>
</html>