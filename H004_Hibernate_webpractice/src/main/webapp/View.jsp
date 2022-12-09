<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
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
<th>Name</th>
<th>Price</th>
<th>Qty</th>
</tr>

<c:forEach var="dt" items="${data}">
<tr>
<td>${dt.getId()}</td>
<td>${dt.getName()}</td>
<td>${dt.getPrice()}</td>
<td>${dt.getQty()}</td>
<td><a href="update?fid=${dt.getId()}&&action="delete">Delete</a></td>
<td><a href="update?fid=${dt.getId()}&&action="update">Update</a></td>

</tr>

</c:forEach>





</table>

</body>
</html>