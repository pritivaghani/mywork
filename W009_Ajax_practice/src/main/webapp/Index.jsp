<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">

       $(document).ready(function(){
    	  // alert("ok");
    	   
    	   
    	   
       })
       
       function addemployee()
       {
    	   var ename = $("#ename").val()
    	   var email = $("#email").val()
    	   var pass = $("#pass").val()
    	   var gender = $("#gender").val()
    	   var qua = $("#qua").val()
    	   var country = $("#country").val()
    	   
    	   $.post("reg",{ename,email,pass,gender,qua,country},function(f){
    		//alert("ok");
    		   $("#msg").html(f);
    	   })
       }



</script>
</head>
<body>

       <div class="container">
        <div class="row"> 
        <div class="col-md-4">
        
        <h1 class="text-success">Add Employee</h1>
        <span class="text-success" id="msg"></span>
        <div class="form-group">
        <lable>Ename</lable>
        <input type="text" name="ename" id="ename" class="form-control">
        </div>
        
          <div class="form-group">
        <lable>Email</lable>
        <input type="text" name="email" id="email" class="form-control">
        </div>
        
          <div class="form-group">
        <lable>Password</lable>
        <input type="text" name="pass" id="pass" class="form-control">
        </div>
        
          <div class="form-group">
        <lable>Gender</lable>
        <input type="radio" name="gender" id="gender" value="male">Male
        <input type="radio" name="gender" id="gender" value="female">Female
        </div>
        
          <div class="form-group">
        <lable>Qualification</lable>
        <input type="checkbox" name="qua" id="qua" value="bcom">B.com
        <input type="checkbox" name="qua" id="qua" value="bba">B.B.A
        <input type="checkbox" name="qua" id="qua" value="bca">BCA
        <input type="checkbox" name="qua" id="qua" value="it">IT
        </div>
        
                  <div class="form-group">
        <lable>Country</lable>
        <select name="country" id="country" class="form-control">
        <option value="india">India</option>
         <option value="usa">USA</option>    
        <option value="canada">Canada</option>
        <option value="uk">UK</option>
        </select>
                </div>
        
        <br>
        
        <button class="btn btn-success" id="btn" onclick="addemployee()">Submit</button>
               </div>
        
        <div class="col-md-8">
        <h1 class="text-success">View Employee</h1>
        <table class="table" id="table">
        
        
        
        </table>
        
        
        
        </div>
       </div>
       </div>

</body>
</html>