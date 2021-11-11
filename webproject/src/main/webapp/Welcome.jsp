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
                <form class="forms" action="./log" method="post">

                    <h3 class="text-warning text-center">Employee Login</h3><br>
                    <div class="form-group">
                        <input type="text" class="form-control" name="user" id="user" placeholder="Username">
                    </div>
                    <div class="form-group">
                       <br>
                        <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Password"><br>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-block">Submit</button><br>
                    </div>
                    <div>
                        <a href="" class="text-light text-decoration-none">Forget Password ?</a><br>
                        <a href="./Register" class="text-light text-decoration-none">Sign Up</a>
                    </div>
                </form>
            </div>
            
        </div>
    </div>
    <script src="./style/jquery.slim.min.js"></script>
    <script src="./style/bootstrap.min.js"></script>
</body>

</html>