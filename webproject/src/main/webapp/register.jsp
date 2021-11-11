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
                <form action="./reg" class="forms" method="post">
                    <h3 class="text-warning text-center">Employee Registration</h3><br>
                    <div class="form-group mt-2">
                        <input type="text" class="form-control" name="name" id="name" placeholder="Name" required>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="user" id="user" placeholder="Username" required>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Create an Password" required>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="pwd1" id="pwd1" placeholder="Re-Enter Your Password" required>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" class="form-check-input" name="gender" id="gender" value="Male" required>Male
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" class="form-check-input" name="gender" id="gender" value="Female" required>Female
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="role" id="role" placeholder="Designation" required>
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="mail" id="mail" placeholder="Email" required>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="mobile" id="mobile" placeholder="Mobile number" required>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="sal" id="sal" placeholder="Salary" required>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-block" value="Register">
                    </div>
                    <div>
                        <a href="./Welcome" class="text-decoration-none">
                        <button type="button" class="btn btn-primary btn-block">Back To Login</button></a><br>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script src="./style/jquery.slim.min.js"></script>
    <script src="./style/bootstrap.min.js"></script>
</body>

</html>