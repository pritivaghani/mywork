<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
   
    <div class="container">
    <div class="row">
    <div class="col-md-6 m-auto">
    
    <h1 align="center">User data</h1>
    <table class="table table-dark table-striped">

<tr>
       <th>id</th>
       <th>uname</th>
       <th>email</th>
       <th>pass</th>
       <th colspan="2">Action</th>
</tr>
<%


ArrayList<User> al = (ArrayList)request.getAttribute("data");
   for(User u : al){
%>
     <tr>
          <td><%=u.getId()%></td>
          <td><%=u.getUname()%></td> 
          <td><%=u.getEmail()%></td> 
          <td><%=u.getPass()%></td> 
          <td><a class="btn btn-primary" href="update?uid=<%=u.getId()%>">Update</a></td>
          <td><a class="btn btn-danger" href="delete?did=<%=u.getId()%>">Delete</a></td>
         </tr> 
         <% }
   %>
</table>
    </div>
    </div>
    </div>

</body>
</html>