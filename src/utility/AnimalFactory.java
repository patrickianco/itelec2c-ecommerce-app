package utility;

import model.animal.Animal;
import model.animal.*;
import model.characteristics.*;
import model.food.*;

public class AnimalFactory implements AbstractFactory {
	
	@Override
	public Animal getAnimal(String input) {
		Animal animal = null;
		
		switch(input){
		case "Dog":
			animal = new Dog();
			break;
		case "Cat":
			animal = new Cat();
			break;
		}
		
		return animal;
	}

	@Override
	public Characteristics getCharacteristics(String input,Animal animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food getFood(String input,Animal animal) {
		// TODO Auto-generated method stub
		return null;
	}

}
