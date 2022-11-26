<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core</title>
</head>
<body>
         <%--  <c:if test="${20<150}">
             <c:out value="ok"></c:out>
             </c:if> --%>
             
       <%--       
        <c:forEach var="dt" begin="1" end="10">
        <c:out value="${dt}"></c:out>
        </c:forEach> --%>
        
        
        <c:set var="marks" value="30"></c:set>
        
        <c:choose>
        <c:when test="${marks>90}">
        <c:out value="Grade A"></c:out>
        </c:when>
        <c:when test="${marks>50 && marks<90}">
        <c:out value="Grade B"></c:out>
             </c:when>
             <c:when test="${marks>35 && marks<50}">
             <c:out value="Grade C"></c:out>
             </c:when>
             <c:otherwise>
             <c:out value="Invalid"></c:out>
             </c:otherwise>
        </c:choose>
        
        
</body>
</html>