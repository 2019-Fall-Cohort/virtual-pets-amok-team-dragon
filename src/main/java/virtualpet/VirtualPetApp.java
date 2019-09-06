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
		
		
	

	}

}
