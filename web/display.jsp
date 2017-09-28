<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="pet" type="model.animal.Animal" scope="request"/>
<jsp:useBean id="food" type="model.food.Food" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cat Dog Shop</title>
</head>
    <body>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <div class="container-fluid" style="padding-bottom: 50px;">
            <div class="row">
                <div class="col-xs-1 col-xs-offset-5">
                    <img src="logo.png" class="logo">
                </div>
            </div>
            <div class="row" style="margin-top: 50px;">
                <div class="col-xs-5 col-xs-offset-1">
                    <img src="<%= pet.getCharacteristics().viewBreed()%>.jpg" class="img-responsive"> 
                </div>
                <div class="col-xs-6">
                    <table>
                        <tr>
                            <td><h3>Animal Type</h3></td>
                            <td><h3><%= pet.viewAnimal()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Breed</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewBreed()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Birthday</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewBirthday()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Color</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewColor()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Gender</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewGender()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Weight</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewWieght()%></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Price</h3></td>
                            <td><h3><%= pet.getCharacteristics().viewPrice()%></h3></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="row" style="margin-top: 50px;">
                <div class="col-xs-5 col-xs-offset-1">
                    <img src="<%= food.viewBrand() %>.jpg" class="img-responsive"> 
                </div>
                <div class="col-xs-6">
                    <table>
                        <tr>
                            <td><h3>Food Brand</h3></td>
                            <td><h3><%= food.viewBrand() %></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Description</h3></td>
                            <td><h3><%= food.viewDescription() %></h3></td>
                        </tr>
                        <tr>
                            <td><h3>Price</h3></td>
                            <td><h3><%= food.viewPrice() %></h3></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>