<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- the var sets variable for the root location of the app -->
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Expenses</title>
    <link href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<h1>Expense Tracker</h1>
<p>${message}</p>
<h3>${anothermessage}</h3>


<!-- foreach tag for jstl -->

<a href="${contextRoot}/expense/create">Add Expense</a>

<c:forEach var="expense" items="${expenses}">
    <div>
        <h3>${expense.expensename}</h3>
        <h3>Gh&cent ${expense.amount}</h3>
        <a href="${contextRoot}/expense/edit/{id}">Edit Expense</a>
    </div>
</c:forEach>
</body>
</html>