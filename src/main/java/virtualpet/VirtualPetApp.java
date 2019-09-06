package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What is the name of your pet?");
		String petName = userInput.nextLine();
		VirtualPet pet = new VirtualPet(petName);
		
		displayMenu(pet);
		
		do {
		
			System.out.println("What would you like to do? (Feed, Rest, Play, Fire, or Quit)");
			String response = userInput.nextLine().trim().toLowerCase();			
			determineUserResponse(response, pet);				
			displayMenu(pet);
			
			pet.tick();
			System.out.println("Ticking...");
			displayMenu(pet);
			
		} while (1!=2); // What is a better option for this loop?
			
	}
	
	private static void determineUserResponse(String response, VirtualPet pet) {

		int amount = 0; // amount+1 is below to counter the tick.
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + pet.name + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.feedDragon(amount+1);
			break;
			
		case "rest":
			System.out.println("How much do you want " + pet.name + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.restDragon(amount+1);
			break;
			
		case "play":
			System.out.println("How much play time do you want " + pet.name + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.playWithDragon(amount+1);
			break;
			
		case "fire":
			System.out.println("How long should " + pet.name + " breath fire?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.breathsFire(amount+1);
			break;
			
		case "quit":
			System.out.println("Okay, BYEEEEE!!!!");
			System.exit(0);
			
		}
		
	}

	public static void displayMenu(VirtualPet pet) {
		
		System.out.println("");
		System.out.println("Current attributes for: " + pet.name);
		System.out.println("Hunger: " + pet.Hunger);
		System.out.println("Fatigue: " + pet.Fatigue);
		System.out.println("Boredom: " + pet.Boredom);
		System.out.println("Magic: " + pet.Magic);
		System.out.println("");
				
	}

}
