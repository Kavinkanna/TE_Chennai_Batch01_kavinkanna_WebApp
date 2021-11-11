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
                <form class="forms" action="" method="get">
					<h3 class="text-warning text-center">Employee Menu</h3><br>
					<div>
                        <a href="./ShowDetails" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Show Details</button></a><br>
                    </div>
                    <div>
                        <a href="./UpdateDetails" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Update Details</button></a><br>
                    </div>
                    <div>
                        <a href="./DeleteDetails" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Delete Details</button></a><br>
                    </div>
                    <div>
                        <a href="./Welcome" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Log Out</button></a><br>
                    </div>
				</form>
			</div>
		</div>
	</div>

	<script src="./style/jquery.slim.min.js"></script>
    <script src="./style/bootstrap.min.js"></script>
</body>
</html>