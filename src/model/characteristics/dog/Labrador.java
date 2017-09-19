package model.characteristics.dog;

import model.characteristics.Characteristics;

public class Labrador extends Characteristics {

	@Override
	public String viewPrice() {
		return "60,000 Pesos";
	}

	@Override
	public String viewBreed() {
		return "Labrador";
	}

	@Override
	public String viewBirthday() {
		return "10/01/2011";
	}

	@Override
	public String viewColor() {
		return "Brown";
	}

	@Override
	public String viewGender() {
		return "Female";
	}

	@Override
	public String viewWieght() {
		return "60kg";
	}

}
