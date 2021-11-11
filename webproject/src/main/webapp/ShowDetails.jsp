<%@page import="com.te.webproject.servletcon.ShowDetails"%>
<%@page import="com.te.webproject.beans.EmpInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
<link rel="shortcut icon" href="./style/logo.ico" type="image/x-icon">
<link rel="stylesheet" href="./style/style.css">
<link rel="stylesheet" href="./style/bootstrap.min.css">
</head>
<body class="bg">

	<div class="container-fluid">
		<div class="row mt-5">
			<div class="col-md-5 col-sm-2 col-xs-12"></div>
			<div class="col-md-4 col-sm-8 col-xs-12 mt-5">
				<form class="forms" action="./Menu" method="get">
					<h3 class="text-warning text-center">Employee Details</h3>
					<br>
					<%
						EmpInfo data = ShowDetails.getEmp();
					%>
					<table>
						<tr>
							<th class="text-warning">Employee Id :</th>
							<td>&ensp; <%=data.getEmpid()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Name :</th>
							<td>&ensp; <%=data.getName()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Username :</th>
							<td>&ensp; <%=data.getUsername()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Gender :</th>
							<td>&ensp; <%=data.getGender()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Designation :</th>
							<td>&ensp; <%=data.getRole()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee MobileNo. :</th>
							<td>&ensp; <%=data.getMobileno()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Email :</th>
							<td>&ensp; <%=data.getEmail()%></td>
						</tr>
						<tr>
							<th class="text-warning">Employee Salary :</th>
							<td>&ensp; <%=data.getSalary()%></td>
						</tr>
					</table>
					<br>
					<div>
						<input type="submit" class="btn btn-primary btn-block"
							value="Back To Menu" />
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="./style/jquery.slim.min.js"></script>
	<script src="./style/bootstrap.min.js"></script>
</body>
</html>