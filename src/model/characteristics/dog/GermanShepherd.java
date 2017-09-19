package model.characteristics.dog;

import model.characteristics.Characteristics;

public class GermanShepherd extends Characteristics {

	@Override
	public String viewPrice() {
		return "40,000 Pesos";
	}

	@Override
	public String viewBreed() {
		return "German Shepherd";
	}

	@Override
	public String viewBirthday() {
		return "08/15/2012";
	}

	@Override
	public String viewColor() {
		return "Black";
	}

	@Override
	public String viewGender() {
		return "Male";
	}

	@Override
	public String viewWieght() {
		return "50kg";
	}

}
