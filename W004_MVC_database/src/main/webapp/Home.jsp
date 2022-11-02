<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
 <%
      String email = (String) session.getAttribute("email");
      if(email == null || email=="")
      {
    	  request.setAttribute("err", "please login frist");
    	  request.getRequestDispatcher("Login.jsp").forward(request, response);
      }
      
      %>
       <h1>Welcome <%=email %></h1>
       <h2><a href="Logout">Logout</a></h2>
       <a href="display">Show all User</a>
</body>
</html>