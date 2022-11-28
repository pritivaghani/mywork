<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/16june" user="root" password="" var="ds"/>
<sql:query var="rs" dataSource="${ds}">

select * from user

</sql:query>

<table>

<tr>
<td>ID</td>
<td>Uname</td>
<td>Email</td>
<td>Password</td>
</tr>

<c:forEach var="dt" items="${rs.rows}">
<tr>
<td>${dt.id}</td>
<td>${dt.uname}</td>
<td>${dt.email}</td>
<td>${dt.pass}</td>
</tr>
</c:forEach>

</table>


</body>
</html>