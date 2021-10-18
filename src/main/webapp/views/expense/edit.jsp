<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- Import form -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- the var sets variable for the root location of the app -->

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit Expense</title>
</head>
<body>
<h1>Edit Expense</h1>
<form:form action="${contextRoot}/expense/update" method="post" modelAttribute="expense">
    <!-- path attribute is for the form name attribute
    usually, the table column name is required
    -->
    <form:input path="expensename" placeholder="Enter expense name" value=""/>
    <form:input path="amount" placeholder="Enter expense amount" />
    <form:textarea path="note" placeholder="Enter Note" />
    <form:textarea path="description" placeholder="Enter Description" />
    <button type="submit">Add Expense</button>
</form:form>

<script src="/js/script.js"></script>
</body>
</html>
