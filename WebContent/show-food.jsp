<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
    <h1 align = "center">Menu</h1>
    <table border="1" cellpadding="30%" bordercolor = "red" align = "center">
       <tr>
        <th>code</th>
        <th>name</th>
        <th>price</th>
       </tr>
       <c:forEach var = "items" items= "${foodItems}">
       <tr>
         <td>${items.id}</td>
         <td>${items.name}</td>
         <td>${items.price}</td>
       </tr>
       </c:forEach>
    </table>
    
</body>
</html>