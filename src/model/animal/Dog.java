package model.animal;

public class Dog extends Animal {

	@Override
	public String viewPrice() {
		return "Php 50,000.00";
	}

	@Override
	public String viewBreed() {
		return "Pembroke Welsh Corgi";
	}

	@Override
	public String viewColor() {
		return "Gold";
	}

	@Override
	public String viewGender() {
		return "Male";
	}

	@Override
	public String viewWeight() {
		return "12 kg";
	}

}
