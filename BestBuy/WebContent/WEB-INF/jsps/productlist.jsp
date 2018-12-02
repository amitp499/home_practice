<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.jp.entities.Products"%>
    <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
<h3>Product List</h3>
Hello ${displayUserName} <a href="Logout.do">Logout</a><br>

${message}
<table border=1>

<tr>
<td>PRODUCTNAME</td><td>PRODUCTID</td><td>PRODUCTTYP</td><td>PRODUCTPRICE</td>
</tr>

<% for(Products prds : (ArrayList<Products>)request.getAttribute("aproductList")) {
%>
<tr>

					<td><%=prds.getProductId() %></td>
					<td><%=prds.getProductName()%></td>
					<td><%=prds.getProductType()%></td>
					<td><%=prds.getProductPrice()%></td>
					<td><a href="AddToCart.do?id=<%=prds.getProductId()%>">Add To Cart</a></td>
</tr>

<%}%>


</table>

</body>
</html>