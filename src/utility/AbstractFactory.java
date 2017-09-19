package utility;

import model.animal.Animal;
import model.characteristics.Characteristics;
import model.food.Food;

public interface AbstractFactory {
	
	Animal getAnimal(String input);
	Food getFood(String input, Animal animal);
	Characteristics getCharacteristics(String input, Animal animal);
	
}
