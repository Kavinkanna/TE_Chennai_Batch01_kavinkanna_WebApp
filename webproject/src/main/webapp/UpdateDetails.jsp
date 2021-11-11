<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management</title>
    <link rel="stylesheet" href="./style/style.css">
    <link rel="stylesheet" href="./style/bootstrap.min.css">
    <link rel="shortcut icon" href="./style/logo.ico" type="image/x-icon">
</head>

<body class="bg">
    <div class="container-fluid">
        <div class="row mt-5 mb-4">
            <div class="col-md-5 col-sm-2 col-xs-12"></div>
            <div class="col-md-4 col-sm-8 col-xs-12 ">
                <form action="./update" class="forms" method="post">
                    <h3 class="text-warning text-center">Employee Update</h3> <br>
                    <div class="form-group mt-2">
                        <input type="text" class="form-control" name="name" id="name" placeholder="Name" >
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="user" id="user" placeholder="Username" >
                    </div>              
                    <div class="form-check form-check-inline">
                        <input type="radio" class="form-check-input" name="gender" id="gender" value="Male" >Male
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" class="form-check-input" name="gender" id="gender" value="Female" >Female
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="role" id="role" placeholder="Designation" >
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="mail" id="mail" placeholder="Email" >
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="mobile" id="mobile" placeholder="Mobile number" >
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="sal" id="sal" placeholder="Salary" >
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-block" value="Update">
                    </div>
                    <div>
                        <a href="./Menu" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Back to Menu</button></a><br>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script src="./style/jquery.slim.min.js"></script>
    <script src="./style/bootstrap.min.js"></script>
</body>

</html>