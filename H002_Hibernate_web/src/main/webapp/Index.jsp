<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

          <form action="reg" method="post">
          <input type="hidden" name="id" value="${data.getId()}">
          <input type="text" name="bname" placeholder="enter bname" value="${data.getBname()}">
          <input type="text" name="email" placeholder="enter email" value="${data.getEmail()}">
          <input type="text" name="pass" placeholder="enter pass" value="${data.getPass()}">
          <input type="submit">
          <a href="view">View All</a>
         </form>

</body>
</html>