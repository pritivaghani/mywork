<%@page import="model.Notebook"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-4">
      <h1 class="text-success">Add Notebook</h1>
       <form action="reg">
       <span class="text-success">${msg}</span>
      <div class="form-group">
      <lable>Bname</lable>
      <input type="text" name="bname" class="form-control">
      </div>
  
        <div class="form-group">
      <lable>Price</lable>
      <input type="text" name="price" class="form-control">
      </div>
      
      <br>
      <input type="submit" class="btn btn-success">
      <input type="reset" class="btn btn-primary">


</form>
</div>

<div class="col-md-8">
         <h1 class="text-success">Notebook Details</h1>
         <table class="table">
         <tr>
         <th>Id</th>
         <th>Bname</th>
         <th>Price</th>
         <th colspan="2">Action</th>
         </tr>
         
         <%
        ArrayList<Notebook> al = (ArrayList<Notebook>)request.getAttribute("data");
         for( Notebook n : al)
         {
        	 %>
        <tr>
        <td><%=n.getId()%></td>
        <td><%=n.getBname() %></td>
                <td><%=n.getPrice() %></td>
                <td><a>Delete</a></td>
                
        </tr>	 
         <% }
         
         %>
                
         </table>
         </div>
</div>
</div>
     
</body>
</html>