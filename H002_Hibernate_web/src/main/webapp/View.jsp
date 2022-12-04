<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View</title>
</head>
<body>

<table border="1">

<tr>
<th>Id</th>
<th>Bname</th>
<th>Email</th>
<th>Pass</th>
</tr>

<c:forEach var="dt" items="${data}">
<tr>
<td>${dt.getId()}</td>
<td>${dt.getBname()}</td>
<td>${dt.getEmail()}</td>
<td>${dt.getPass()}</td>
<td><a href="update?bid=${dt.getId()}&&action=delete">Delete</a></td>
<td><a href="update?bid=${dt.getId()}&&action=update">Update</a></td>

</tr>
</c:forEach>

</table>

</body>
</html>