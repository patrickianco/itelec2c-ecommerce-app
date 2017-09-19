package model.characteristics.cat;

import model.characteristics.Characteristics;

public class Sphynx extends Characteristics {

	@Override
	public String viewPrice() {
		return "40,000 Pesos";
	}

	@Override
	public String viewBreed() {
		return "Sphynx";
	}

	@Override
	public String viewBirthday() {
		return "12/29/2010";
	}

	@Override
	public String viewColor() {
		return "Brown";
	}

	@Override
	public String viewGender() {
		return "Male";
	}

	@Override
	public String viewWieght() {
		return "25kg";
	}

}
