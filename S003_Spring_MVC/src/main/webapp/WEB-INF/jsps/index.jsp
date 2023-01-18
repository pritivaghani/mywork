<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<h1>Registration Page</h1>
<form:form action="addstudent" method="get" modelAttribute="student">
<form:input path="id"/>
<form:label path="name">StudentName</form:label>
<form:input path="name"/>
<form:label path="email">Email</form:label>
<form:input path="email"/>
<form:label path="pass">Password</form:label>
<form:input path="pass"/>
<input type="submit">
</form:form>

<br>

<a href="view">Display all Student</a>

</body>
</html>