package utility;

import model.animal.Animal;
import model.characteristics.Characteristics;
import model.food.Food;

public interface AbstractFactory {
	
	Animal getAnimal(String input);
	Food getAccessories(String input);
	Characteristics getCharacteristics(String input);
	
}
