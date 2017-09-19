import model.animal.Animal;
import utility.AnimalFactory;
import utility.CharacteristicsFactory;
import utility.FoodFactory;
import utility.Input;

public class FactoryMethodDemo {
	
	public static void main(String args[])
	{
		//Object Creation
		String input = Input.getString("input mo to");
		Animal animal = new AnimalFactory().getAnimal(input);
		animal.setCharacteristics(new CharacteristicsFactory().getCharacteristics("Persian", animal));
		animal.setFood(new FoodFactory().getFood("Authority", animal));
		
		System.out.println(animal.viewAnimal());
		System.out.println(animal.getCharacteristics().viewBirthday());
		System.out.println(animal.getCharacteristics().viewBreed());
		System.out.println(animal.getCharacteristics().viewBirthday());
		System.out.println(animal.getCharacteristics().viewColor());
		System.out.println(animal.getCharacteristics().viewGender());
		System.out.println(animal.getCharacteristics().viewWieght());
		
		System.out.println(animal.getFood().viewPrice());
		System.out.println(animal.getFood().viewBrand());
		System.out.println(animal.getFood().viewDescription());

		
		
	}
}
