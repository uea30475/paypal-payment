<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/pay">
	<input type="text" value="5" name="price" />
	<button type="submit"> Payment with Paypal </button>
	<a href="${pageContext.request.contextPath}/pay/cancel" type="button">Cancel</a>
</form>

</body>
</html>