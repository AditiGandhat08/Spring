<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<caption>Food</caption>
<tr>
<th>FoodId</th>
<th>FoodName</th>
<th>FoodType</th>
<th>FoodCategory</th>
<th>FoodPrice</th>
<th colspan="2">Action</th>
</tr>

<c:forEach items="${flist}" var="food">
<tr>
<td>${food.foodid}</td>
<td>${food.foodname}</td>
<td>${food.foodtype}</td>
<td>${food.foodcategory}</td>
<td>${food.price}</td>
<td> <a href="edit/${food.foodid}">edit</a> </td>
<td> <a href="delete/${food.foodid}">delete</a> </td>

</tr>
</c:forEach>


</table>
</body>
</html>