package model.animal;

import model.accessories.Accessories;
import model.characteristics.Characteristics;

public class Cat extends Animal {
	
	Characteristics breed;
	Accessories accesories;
	
	@Override
	public String viewPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBreed(Characteristics breed) {
		this.breed = breed;
		
	}

	@Override
	public Characteristics getBreed() {
		return this.breed;
	}

	@Override
	public void setAccessories(Accessories accessories) {
		this.accesories = accessories;
	}

	@Override
	public Accessories getAccessories() {
		return this.accesories;
	}

}
