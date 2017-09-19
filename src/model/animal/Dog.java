package model.animal;

import model.characteristics.Characteristics;
import model.food.Food;

public class Dog extends Animal {

	Characteristics breed;
	Food accesories;

	@Override
	public String viewAnimal() {
		return "Dog";
	}

	@Override
	public void setCharacteristics(Characteristics characteristics) {
		this.breed = characteristics;
		
	}

	@Override
	public Characteristics getCharacteristics() {
		return this.breed;
	}

	@Override
	public void setAccessories(Food accessories) {
		this.accesories = accessories;
	}

	@Override
	public Food getAccessories() {
		return this.accesories;
	}


}
