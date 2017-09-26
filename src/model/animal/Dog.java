package model.animal;

import model.characteristics.Characteristics;
import model.food.Food;

public class Dog extends Animal {

	Characteristics characteristics;

	@Override
	public String viewAnimal() {
		return "Dog";
	}

	@Override
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
		
	}

	@Override
	public Characteristics getCharacteristics() {
		return this.characteristics;
	}
}
