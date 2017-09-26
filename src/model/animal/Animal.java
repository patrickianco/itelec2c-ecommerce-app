package model.animal;

import model.characteristics.Characteristics;
import model.food.Food;

public abstract class Animal {
	
	public abstract String viewAnimal();
	public abstract void setCharacteristics(Characteristics characteristics);
	public abstract Characteristics getCharacteristics();
}
