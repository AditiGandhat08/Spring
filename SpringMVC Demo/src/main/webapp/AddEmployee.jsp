<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" method="POST">
<table>
<caption>Add Employee</caption>
<tr>
<td> Id:</td>
<td><form:input path="empid"/></td>
</tr>

<tr>
<td> Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td> Salary</td>
<td><form:input path="salary"/></td>
</tr>

</table>
<input type="submit" value="save">
</form:form>
</body>
</html>