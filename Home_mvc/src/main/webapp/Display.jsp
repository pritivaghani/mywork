<%@page import="model.labour"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-6 m-auto">


<h1 align="center">Labour Data</h1>
<table class="table table-dark table-striped">

   <tr>
   <th>id</th>
   <th>lname</th>
   <th>email</th>
   <th>pass</th>
   <th colspan="2">Action</th>
   </tr>

<%
ArrayList<labour> al = (ArrayList)request.getAttribute("data");
for(labour l : al)
{

%>
   <tr>
   <td><%=l.getId()%></td>
   <td><%=l.getLname()%></td>
   <td><%=l.getEmail()%></td>
   <td><%=l.getPass()%></td>
   <td><a class="btn btn-primary" href="update?lid=<%=l.getId()%>">Update</a></td>
   <td><a class="btn btn-danger" href="delete?did=<%=l.getId()%>">Delete</a></td>
   </tr>
     <% }
%>



</table>

</div>
</div>
</div>

</body>
</html>