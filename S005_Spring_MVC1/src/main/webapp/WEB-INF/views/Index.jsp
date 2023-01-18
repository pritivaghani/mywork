<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<h1>Registration file</h1>
<span>${msg}</span>
<form:hidden path="id"/>
<form:form action="adduser" modelAttribute="user">
<form:label path="name"></form:label>
<form:input path="name"/>
<form:errors path="name"></form:errors>
<form:label path="email"></form:label>
<form:input path="email"/>
<input type="submit">


</form:form>

<h1>User Details</h1>
<table border="1" width="100%">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th colspan="2">Action</th>
</tr>

<c:forEach var="dt" items="${userlist}">
<tr>
<td>${dt.getId()}</td>
<td>${dt.getName()}</td>
<td>${dt.getEmail()}</td>
<td><a href="delete?did=${dt.getId()}">Delete</a></td>
<td><a href="update?uid=${dt.getId()}">Update</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>