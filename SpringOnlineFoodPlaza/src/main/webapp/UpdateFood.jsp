<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FooodPlaza</title>
</head>
<body>

<form action="updatefood" method="post">
<table>
<caption>Update Food</caption>
<tr>
<td> Food Id:</td>
<td><input type="text" name="foodid" value="${food.foodid}"/></td>
</tr>

<tr>
<td>Food Name:</td>
<td><input type="text" name="foodname"value="${food.foodname}"/></td>
</tr>

<tr>
<td> Food Type:</td>
<td><input type="text" name="foodtype" value="${food.foodtype}"/></td>
</tr>

<tr>
<td> Food Category:</td>
<td><input type="text" name="foodcategory" value="${food.foodcategory}" /></td>
</tr>

<tr>
<td> Price:</td>
<td><input type="text" name="price" value="${food.price}"/></td>
</tr>
</table>
<input type="submit" value="save">
<input type="reset" value="clear">

</form>
</body>
</html>