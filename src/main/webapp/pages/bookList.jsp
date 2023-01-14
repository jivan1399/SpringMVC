<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Book Data</h3>

	<table>
		<thead>
			<tr>
				<td>Book Id</td>
				<td>Book Name</td>
				<td>Book Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listOfBook }" var="books">
				<tr>
					<td>${books.bookId }</td>
					<td>${books.bookName }</td>
					<td>${books.bookPrice }</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>