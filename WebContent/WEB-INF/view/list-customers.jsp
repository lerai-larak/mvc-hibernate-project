<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer List</title>
<link 	href="${pageContext.request.contextPath}/resources/css/style.css" 
		rel= "stylesheet" 
		type="text/css"/> 
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
		
		<div id="container">
			<div id="content">
				<table>
					<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					</tr>
					<c:forEach var="customer" items="${customers}">
						<tr>
							<td>${customer.firstName}</td>
							<td>${customer.lastName}</td>
							<td>${customer.email}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

</body>
</html>