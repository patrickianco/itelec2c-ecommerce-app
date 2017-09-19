package utility;

import model.accessories.Accessories;
import model.animal.Animal;
import model.characteristics.Characteristics;

public interface AbstractFactory {
	
	Animal getAnimal(String input);
	Accessories getAccessories(String input);
	Characteristics getBreed(String input);
	
}
