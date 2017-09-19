package model.food.cat;

import model.food.Food;

public class Friskies extends Food {

	@Override
	public String viewPrice() {
		return "6000 Pesos";
	}

	@Override
	public String viewBrand() {
		return "Friskies";
	}

	@Override
	public String viewDescription() {
		return "Will make your cat happy";
	}

}
