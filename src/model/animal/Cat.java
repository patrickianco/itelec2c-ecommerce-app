package model.animal;

import model.characteristics.Characteristics;
import model.food.Food;

public class Cat extends Animal {
	
	Characteristics characteristics;
	Food food;

	@Override
	public String viewAnimal() {
		return  "Cat";
	}

	@Override
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}

	@Override
	public Characteristics getCharacteristics() {
		return this.characteristics;
	}

	@Override
	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public Food getFood() {
		return this.food;
	}

}
