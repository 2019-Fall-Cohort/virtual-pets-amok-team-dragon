package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What is the name of your pet?");
		String petName = userInput.nextLine();
		VirtualPet pet = new VirtualPet(petName);
		
		pet.displayMenu();
		
		while (true) {
		
			System.out.println("What would you like to do? (Feed, Rest, Play, Fire, or Quit)");
			String response = userInput.nextLine().trim().toLowerCase();			
			determineUserResponse(response, pet);				
			
			
			pet.tick();
			pet.displayMenu();
			
		} 
			
	}
	
	private static void determineUserResponse(String response, VirtualPet pet) {

		int amount = 0; // amount+1 is below to counter the tick.
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + pet.name + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.feedDragon(amount);
			break;
			
		case "rest":
			System.out.println("How much do you want " + pet.name + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.restDragon(amount);
			break;
			
		case "play":
			System.out.println("How much play time do you want " + pet.name + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.playWithDragon(amount);
			break;
			
		case "fire":
			System.out.println("How long should " + pet.name + " breath fire?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.breathsFire(amount);
			break;
			
		case "quit":
			System.out.println("Okay, BYEEEEE!!!!");
			System.exit(0);
		
		default:
			System.out.println("You so silly!");
		}
		
	}



}
