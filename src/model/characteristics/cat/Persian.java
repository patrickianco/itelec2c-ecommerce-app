package model.characteristics.cat;

import model.characteristics.Characteristics;

public class Persian extends Characteristics {

	@Override
	public String viewPrice() {
		return "20,000 Pesos";
	}

	@Override
	public String viewBreed() {
		return "Persian";
	}

	@Override
	public String viewBirthday() {
		return "10/29/2005";
	}

	@Override
	public String viewColor() {
		return "Gray";
	}

	@Override
	public String viewGender() {
		return "Male";
	}

	@Override
	public String viewWieght() {
		return "20kg";
	}

}
