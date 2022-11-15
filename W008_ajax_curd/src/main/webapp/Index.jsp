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
    
    	//alert("ok")
    	getdata();
    	$("#sbtn1").hide();
    	
    })
    
    function addstudent()
    {
    	var sname = $("#sname").val()
    	var email = $("#email").val()
    	var pass = $("#pass").val()
    	var dob = $("#dob").val()
    	var country = $("#country").val()

    	$.post("reg",{sname,email,pass,dob,country},function(f){
           $("#msg").html(f);

    		getdata()
    		
    	})
    }
    
    function getdata()
    {
    	$.get("view",{},function(f){
    		//alert(f)
    		 const data = JSON.parse(f);
    		var row="";
    		row=row+"<tr><th>ID</th><th>Sname</th><th>Email</th><th>Pass</th><th>DOB</th><th>Country</th></tr>"
    	 for(var i=0;i<data.length;i++)
    		 {
    			var student = data[i];
    			row=row+"<tr><td>"+student.id+"</td><td>"+student.sname+"</td><td>"+student.email+"</td><td>"+student.pass+"</td><td>"+student.dob+"</td><td>"+student.country+"</td><td><buttons class='btn btn-danger bg-danger' onclick='deletestudent("+student.id+")'>Delete</button></td><td><buttons class='btn btn-primary bg-primary' onclick='getstudentbyid("+student.id+")'>Update</button></td></tr>"
    		}  
    		 
			$("#table").html(row);  

    	})
    }
    
    function deletestudent(sid)
    {
    	$.post("update",{sid},function(f){
    		alert(f)
    		getdata()
    		
    	})
    	 }
    
    function getstudentbyid(sid)
    {
    	$.get("update",{sid},function(f){
    		
    		var data = JSON.parse(f);
    		
    		$("#sid").val(data.id);
    		$("#sname").val(data.sname);
    		$("#email").val(data.email);
    		$("#pass").val(data.pass);
    		$("#dob").val(data.dob);
    		$("#country").val(data.country);
    		
    		$("#sbtn1").show();
    		$("#sbtn").hide();
    	})
    }
    
    function updatestudent()
    {
    	
        var sid = $("#sid").val()
    	var sname = $("#sname").val()
    	var email = $("#email").val()
    	var pass = $("#pass").val()
    	var dob = $("#dob").val()
    	var country = $("#country").val()

    	$.get("reg",{sid,sname,email,pass,dob,country},function(f){
           $("#msg").html(f);
          getdata()
    		
    	$("#sbtn").show();
        $("#sbtn1").hide();
    		
    	
    	})
    }
    
    function search(value)
    
    {
    	
    	$.get("search",{value},function(f){
    		 const data = JSON.parse(f);
     		var row="";
     		row=row+"<tr><th>ID</th><th>Sname</th><th>Email</th><th>Pass</th><th>DOB</th><th>Country</th></tr>"
     	 for(var i=0;i<data.length;i++)
     		 {
     			var student = data[i];
     			row=row+"<tr><td>"+student.id+"</td><td>"+student.sname+"</td><td>"+student.email+"</td><td>"+student.pass+"</td><td>"+student.dob+"</td><td>"+student.country+"</td><td><buttons class='btn btn-danger bg-danger' onclick='deletestudent("+student.id+")'>Delete</button></td><td><buttons class='btn btn-primary bg-primary' onclick='getstudentbyid("+student.id+")'>Update</button></td></tr>"
     		}  
     		 
 			$("#table").html(row);  

    		
    		
    	})
    	
    }
    </script>
    
    
</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-4">
      <h1 class="text-success">Add Student</h1>
       <span class="text-success" id="msg"></span>
       
       <input type="hidden" name="sid" id="sid">
      <div class="form-group">
      <lable>Studentname</lable>
      <input type="text" name="sname" id="sname" class="form-control">
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
      <lable>DOB</lable>
      <input type="text" name="dob" id="dob" class="form-control">
      </div>
      
      <div class="form-group">
      <lable>Gender</lable>
      <input type="radio" name="gender" id="gender" value="male">Male
        <input type="radio" name="gender" id="gender" value="female">FeMale
       </div>
       
        <div class="form-group">
      <lable>Languages</lable>
      <input type="checkbox" name="lang" id="lang" value="gujarati">Gujarati
        <input type="checkbox" name="lang" id="lang" value="hindi">Hindi
         <input type="checkbox" name="lang" id="lang" value="english">English
       </div>
       
          <div class="form-group">
      <lable>Country</lable>
      <select name="country" id="country" class="form-control">
      <option value="india">India</option>
            <option value="usa">USA</option>
            <option value="uk">UK</option>
            <option value="canada">Canada</option>
      </select>
       </div>
       
      <br>

<button class="btn btn-success" id="sbtn" onclick="addstudent()">Submit</button>
<button class="btn btn-success" id="sbtn1" onclick="updatestudent()">Update</button>

</div>

  <div class="col-md-8">
   <h1 class="text-success">View Student</h1>
         <table class="table" id="table">
      
       <input type="text" name="search" id="search" class="form-control" onkeyup="search(value)">
       
        </table>  
         </div> 
</div>
</div>
     
</body>
</html>