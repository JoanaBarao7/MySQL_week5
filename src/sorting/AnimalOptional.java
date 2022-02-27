package sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class AnimalOptional {
	public static void main(String[] args) {
		new AnimalOptional().run();
	}

	private void run() {
		Animal animal = animalMethod(Optional.of(new Animal("Not available")));
		System.out.println(animal);
		
		try {
			animalMethod(Optional.empty());
		} catch (NoSuchElementException e) {
		System.out.println(e.getMessage());
		}
	}
	
	private Animal animalMethod(Optional<Animal> optionalAnimal) {
		return optionalAnimal.orElseThrow(() -> new NoSuchElementException("No animal!"));
	}
}
