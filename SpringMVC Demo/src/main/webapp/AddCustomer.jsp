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
<form:form action="saved" method="POST">
<table>
<caption>Add Customer</caption>

<tr>
<td> Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td> Email Id:</td>
<td><form:input path="emailid"/></td>
</tr>

<tr>
<td> Password:</td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td> Address:</td>
<td><form:input path="address"/></td>
</tr>

<tr>
<td> Contact:</td>
<td><form:input path="contact"/></td>
</tr>
</table>
<input type="submit" value="saved">
</form:form>

</body>
</html>