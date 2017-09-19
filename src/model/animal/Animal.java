package model.animal;

import model.accessories.Accessories;
import model.characteristics.Characteristics;

public abstract class Animal {
	
	public abstract String viewPrice();
	public abstract String viewAnimal();
	public abstract void setBreed(Characteristics breed);
	public abstract Characteristics getBreed();
	public abstract void setAccessories(Accessories accessories);
	public abstract Accessories getAccessories();
	
}
