<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@taglib uri""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>

<form:form action="addemployee" method="post" modelAttribute="employee">
<form:label path="name">Name</form:label>
<form:input path="name"/>
<form:label path="division">Division</form:label>
<form:input path="division"/>
<input type="submit">
</form:form>
</body>
</html>