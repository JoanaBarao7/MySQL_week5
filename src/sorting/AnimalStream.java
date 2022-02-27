package sorting;

import java.util.stream.Collectors;

public class AnimalStream {
	public static void main(String[] args) {
		new AnimalStream().run();
	
}

	private void run() {
		 String animals = Animal.getAnimals().stream()
		.map(Animal::toString)
		.sorted()
		.collect(Collectors.joining(", "));
		 
		 System.out.println(animals);
	}
}
