<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- Import form -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- the var sets variable for the root location of the app -->

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Create Expense</title>
</head>
<body>
<h1>Add Expense</h1>
<form:form action="${contextRoot}/save" method="post" modelAttribute="expense">
    <!-- path attribute is for the form name attribute
    usually, the table column name is required
    -->
    <form:input path="expensename" placeholder="Enter expense name" />
    <form:textarea path="note" placeholder="Enter Note" />
    <button type="submit">Add Expense</button>
</form:form>

</body>
</html>
