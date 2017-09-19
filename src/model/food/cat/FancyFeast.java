package model.food.cat;

import model.food.Food;

public class FancyFeast extends Food {

	@Override
	public String viewPrice() {
		return "7000 Pesos";
	}

	@Override
	public String viewBrand() {
		return "Fancy Feast";
	}

	@Override
	public String viewDescription() {
		return "Will make your cat meow";
	}

}
