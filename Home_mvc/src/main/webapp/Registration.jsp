<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>

      <div class="container">
       <div class="row">
       <div class="col-md-4 m-auto">

      <h1>Registration From</h1>
      <form action="reg">
      <span class="text-success">${msg}</span>
            <span class="text-danger">${err}</span>
      
      <div class="form-group">
      <lable>Labourname</lable>
      <input type="text" name="lname" class="form-control">
      </div>
      
       <div class="form-group">
      <lable>Email</lable>
      <input type="text" name="email" class="form-control">
      </div>
      
       <div class="form-group">
      <lable>Password</lable>
      <input type="text" name="pass" class="form-control">
      </div>
      
      <br>
      <input type="submit" class="btn btn-success">
      <input type="reset" class="btn btn-primary">
      
        </form>
        <a href="Login.jsp">Login</a>


</div>
</div>
</div>
</body>
</html>