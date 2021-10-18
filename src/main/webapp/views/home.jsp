<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- the var sets variable for the root location of the app -->
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Expenses</title>
    <link href="/css/style.css" rel="stylesheet">
</head>
<body>
<h1>Expense Tracker</h1>

<!-- foreach tag for jstl -->

<a href="${contextRoot}/expense/create">Add Expense</a>

<c:forEach var="expense" items="${expenses}">
    <div>
        <h3>${expense.expensename}</h3>
        <h3>Gh&cent ${expense.amount}</h3>
        <a href="${contextRoot}/expense/edit/${expense.id}">Edit Expense</a>
    </div>
</c:forEach>

<script src="/js/script.js"></script>
</body>
</html>