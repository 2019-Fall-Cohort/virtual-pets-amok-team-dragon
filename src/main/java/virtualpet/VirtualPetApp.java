package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What is the name of your pet?");
		String petName = userInput.nextLine();
		VirtualPet pet = new VirtualPet(petName);
		System.out.println("Please say hello to your pet dragon " + pet.getName());
		System.out.println(pet.getName() + " is hungry. How much do you want to feed him?");
		int amountFed = userInput.nextInt();
		System.out.println(pet.getName() + " is tired. How much do you want to rest him?");
		int amountRested = userInput.nextInt();
		System.out.println(pet.getName() + " is bored.  How much do you want to play with him?");
		int amountPlayed = userInput.nextInt();
		System.out.println(pet.getName() + " do you want your dragon to breath fire?");
		int amountMagixed = userInput.nextInt();
		
		
	

	}

}
