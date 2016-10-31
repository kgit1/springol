<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<table>
<tr>
	<th>First Name</th>
	<th>Last Name</th>
</tr>
<c:forEach var="customer" items="${users}">
	<tr>
		<td>${customer.firstName}</td>
		<td>${customer.lastName}</td>
	</tr>
</c:forEach>
</table>

</body>
</html>