package model.food.dog;

import model.food.Food;

public class Pedigree extends Food {

	@Override
	public String viewPrice() {
		return "1000 Pesos";
	}

	@Override
	public String viewBrand() {
		return "Pedigree";
	}

	@Override
	public String viewDescription() {
		return "Will make your dog say such wow";
	}

}
