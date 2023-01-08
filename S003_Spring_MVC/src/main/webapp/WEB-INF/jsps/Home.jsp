<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>Student List</h1>

<table border="1" width="100%">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th colspan="2">Action</th>
</tr>

<c:forEach items="${data}" var="dt">
<tr>
<td>${dt.getId()}</td>
<td>${dt.getName()}</td>
<td>${dt.getEmail()}</td>
<td>${dt.getPass()}</td>
<td><a href="delete/${dt.getId()}">Delete</a></td>
<td><a href="update/${dt.getId()}">Update</a></td>
</tr>
</c:forEach>


</table>
</body>
</html>