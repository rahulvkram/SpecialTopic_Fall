<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>

		<c:forEach items="${books}" var="a">

			<tr>
				<td>${a.bookId}</td>
				<td>${a.bookName}</td>
				<td>${a.bookPrice}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>