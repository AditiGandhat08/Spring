<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FoodPlaza</title>
</head>
<body>

<form:form action="food" method="post">
<table>
<caption>Add Food</caption>
<tr>
<td> Food Id:</td>
<td><form:input path="foodid"/></td>
</tr>

<tr>
<td>Food Name:</td>
<td><form:input path="foodname"/></td>
</tr>

<tr>
<td> Food Type:</td>
<td><form:input path="foodtype"/></td>
</tr>

<tr>
<td> Food Category</td>
<td><form:input path="foodcategory"/></td>
</tr>

<tr>
<td> Price</td>
<td><form:input path="price"/></td>
</tr>
</table>
<input type="submit" value="save">
<input type="reset" value="clear">


</form:form>
</body>
</html>