<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login">
<span style="color: red;">${err}</span>
     <input type="text" name="uname" placeholder="enter username">
      <input type="text" name="pass" placeholder="enter password">
      <input type="submit">
</form>
</body>
</html>