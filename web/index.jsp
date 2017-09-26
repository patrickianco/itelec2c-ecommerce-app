<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function initialLoad(){
	document.getElementById("petForm").reset(); 
	setBreed(document.getElementById("selectedPet"));
}

function setBreed(objPet) {
    var objBreed = document.getElementById("breed");
    var objFood = document.getElementById("food");
    var objSubmit = document.getElementById("submit");
    
    objBreed.options.length = 0;
    objFood.options.length = 0;
    
        objBreed.disabled = false;
        objFood.disabled = false;
        objSubmit.disabled = false;
        
    switch (objPet.value) {
    case "Dog":
        objBreed.options.add(new Option("Corgi"));
        objBreed.options.add(new Option("GermanShephered"));
        objBreed.options.add(new Option("Labrador"));
        
        objFood.options.add(new Option("BlueBuffalo"));
        objFood.options.add(new Option("Canidae"));
        objFood.options.add(new Option("Pedigree"));
        break;
    case "Cat":
        objBreed.options.add(new Option("Persian"));
        objBreed.options.add(new Option("Siamese"));
        objBreed.options.add(new Option("Sphynx"));
        
        objFood.options.add(new Option("Authority"));
        objFood.options.add(new Option("Authority"));
        objFood.options.add(new Option("Friskies"));
        break;
    default:
        objBreed.disabled = true;
        objFood.disabled = true;
        objSubmit.disabled = true;
        break;
    }
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CatDog Shop</title>
</head>
<body onload='initialLoad()'>
	<h1>WOOF MEOW</h1>
	
	<h2>Select dog or cat</h2>
	<form action="processPetSelection.html" method ="post" id="petForm">
		<p>Select type of pet</p>
			<select name="selectedPet" id="selectedPet" onchange="setBreed(this)">
				<option></option>
				<option value="Dog">Dog</option>
				<option value="Cat">Cat</option>
			</select>
			
		<p>Select type of breed</p>
			<select name="selectedBreed" id="breed" disabled="disabled">
			</select>
		
		<p>Select food</p>
			<select name="selectedFood" id="food" disabled="disabled">
			</select>
		
		<input type='submit' id='submit' value='Show Pet' disabled="disabled">
		&nbsp;&nbsp;&nbsp;
		
		<input type='button' value="Reset" onClick='initialLoad()' />
	</form>
</body>
</html>