package model.characteristics.cat;

import model.characteristics.Characteristics;

public class Siamese extends Characteristics {

	@Override
	public String viewPrice() {
		return "30,000 Pesos";
	}

	@Override
	public String viewBreed() {
		return "Siamese";
	}

	@Override
	public String viewBirthday() {
		return "11/11/2009";
	}

	@Override
	public String viewColor() {
		return "Blue";
	}

	@Override
	public String viewGender() {
		return "Female";
	}

	@Override
	public String viewWieght() {
		return "22kg";
	}
}
