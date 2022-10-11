<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Sign-in">
      <span style="color: red">${err}</span>
       <input type="type" name="uname" placeholder="enter username">
       <input type="text" name="pass" placeholder="enter password">
        <input type="submit">
        <a href="http://localhost:8080/W002_Weblearning_jsp/Login2_hw.jsp">Click me</a>
</form>
</body>
</html>