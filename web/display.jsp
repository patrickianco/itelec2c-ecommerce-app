<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="pet" type="model.animal.Animal" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cat Dog Shop</title>
</head>
<body>
	<h2>Welcome to Cat Dog Shop</h2>
	
		<p>Animal type: <b><%=pet.viewAnimal() %></b></p>
		<p>Birthday: <b><%=pet.getCharacteristics().viewBirthday() %></b></p>
		<p>Breed: <b><%=pet.getCharacteristics().viewBreed() %></b></p>
		<p>Color: <b><%=pet.getCharacteristics().viewColor() %></b></p>
		<p>Gender: <b><%=pet.getCharacteristics().viewGender() %></b></p>
		<p>Weight: <b><%=pet.getCharacteristics().viewWieght() %></b></p>
		<p>Price: <b><%=pet.getCharacteristics().viewPrice()%></b></p>
				
		<p>Food Brand: <b><%=pet.getFood().viewBrand() %></b></p>
		<p>Description: <b><%=pet.getFood().viewDescription() %></b></p>
		<p>Price: <b><%=pet.getFood().viewPrice() %></b></p>
	
	<hr/>
	<form action="index.jsp">
		<input type="submit" value="Back">
	</form>
</body>
</html>