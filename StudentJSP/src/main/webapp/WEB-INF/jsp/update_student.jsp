<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Add Student</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">

<body>
    <div class="container my-5">
        <h3>Update Student</h3>
        <div class="card">
            <div class="card-body">
                <div class="col-md-10">
                    <form:form action="/editStudentById/${id}"  method = "POST">
                        <div class="row">
                            <div class="form-group col-md-8">
                                <form:input type="text" class="form-control" id="name" path="name" placeholder="Enter Name" />
                            </div>
                            <div class="form-group col-md-8">
                                <form:input type="text" class="form-control" id="marks" path="marks" placeholder="Enter Marks" />
                            </div>
                            <div class="form-group col-md-8">
                                <form:input type="text" class="form-control" id="address" path="address" placeholder="Enter Address" />
                            </div>
                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary" value=" Submit ">
                            </div>

                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>