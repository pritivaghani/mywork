<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
     <div class="row">
     <div class="col-md-4 m-auto">
     
     <h1>Update Form</h1>
     <form action="updateuser">
     <span class="text-success">${msg}</span>
     
     <input type="hidden" value="${user.getId()}" name="uid">
     
     <div class="form-group">
     <label>Username</label>
     <input type="text" name="uname" class="form-control" value="${user.getUname()}">
     </div>
     
     <div class="form-group">
     <label>Email</label>
     <input type="text" name="email" class="form-control" value="${user.getEmail()}">
     </div>
     
     <div class="form-group">
     <label>Password</label>
     <input type="text" name="pass" class="form-control" value="${user.getPass()}">
     </div>


         <br>     
     <input type="submit" class="btn btn-success" value="update">
     <input type="reset" class="btn btn-primary">
     
     </form>
     </div>
     </div>
     </div>
     
</body>
</html>