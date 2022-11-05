<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<h1>Registration From</h1>

   <form action="reg">
   <label>Username</label>
   <input type="text" name="uname" value="<%if(request.getParameter("uname")!=null){request.getParameter("uname");}%>">
   <span style="color: red">${err}</span>
   
    <label>Email</label>
   <input type="text" name="email" value="<%if(request.getParameter("email")!=null){request.getParameter("email");}%>">
   <span style="color: red">${msg}</span>
   
    <label>Password</label>
   <input type="text" name="pass" value="<%if(request.getParameter("pass")!=null){request.getParameter("pass");}%>">
   <span style="color: red">${wrong}</span>
   
   <input type="submit">
   </form>
</body>
</html>