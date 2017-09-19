package utility;

import model.animal.Animal;
import model.animal.*;
import model.characteristics.Characteristics;
import model.food.Food;
import model.food.cat.*;
import model.food.dog.*;

public class FoodFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food getFood(String input,Animal animal) {
		Food food = null;
		
		if(animal instanceof Cat)
		{
			switch(input) 
			{
				case "Authority": food = new Authority(); break;
				case "FancyFeast": food = new FancyFeast(); break;
				case "Friskies": food = new Friskies(); break;
			}
		}
		if(animal instanceof Dog)
		{
			switch(input) 
			{
				case "BlueBuffalo": food = new BlueBuffalo(); break;
				case "Canidae": food = new Canidae(); break;
				case "Pedigree": food = new Pedigree(); break;
			}
		}
		
		return food;
		
	}

	@Override
	public Characteristics getCharacteristics(String input,Animal animal) {
		// TODO Auto-generated method stub
		return null;
	}

}
