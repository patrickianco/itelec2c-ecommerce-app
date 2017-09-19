package model.food.dog;

import model.food.Food;

public class BlueBuffalo extends Food {

	@Override
	public String viewPrice() {
		return "4000 Pesos";
	}

	@Override
	public String viewBrand() {
		return "Blue Buffalo";
	}

	@Override
	public String viewDescription() {
		return "Will make your doge bark";
	}

}
