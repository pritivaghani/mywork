<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

<form action="reg" method="post">
<input type="hidden" name="id" value="${data.getId()}">
<input type="text" name="name" placeholder="enter name" value="${data.getName()}">
<input type="text" name="price" placeholder="enter price" value="${data.getPrice()}">
<input type="text" name="qty" placeholder="enter qty" value="${data.getQty()}">
<input type="submit">
<a href="view">View Fruits</a>



</form>


</body>
</html>