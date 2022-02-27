package sorting;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String name;
	
	private static List<Animal> animals = List.of(
			new Animal("Dog"),
			new Animal("Cat"),
			new Animal("Turtle"),
			new Animal("Parrot"),
			new Animal("Hamster")
	);

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public static int compare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}
	
	public static List<Animal> getAnimals() {
		return new ArrayList<>(animals);
	}
	
}
