package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	static VirtualPetShelter petShelter = new VirtualPetShelter();
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			System.out.println("Welcome to Pet Shelter!");

			displayMainMenu();

			int userSelection = userInput.nextInt();
			userInput.nextLine();

			switch (userSelection) {
			
			case 1:
				System.out.println("What would you like to name your pet");
				String petName = userInput.nextLine();
				VirtualPet pet = new VirtualPet(petName);
				petShelter.addPetToShelter(pet);
				break;
				
			case 2:
				petShelter.retrievePetList();
				
				for (int i = 0; i < petShelter.petList.size(); i++) {
					System.out.println(petShelter.petList.get(i).toString());
					
				}
				
				
				break;
				
			case 3:
				System.out.println("Which pet would you like to interact with?");
				petShelter.retrievePetList();
				// Capture which pet was selected.

				while (true) {
					System.out.println("Do you want to feed, rest, play, or breath fire? (or quit?)");
					String response = userInput.nextLine().trim().toLowerCase();
					// determineUserResponse(response, pet);
					// Add another option to get out of this menu and back to the main menu.
				}
				
			case 4:
				// Interact with all pets.
				
				System.out.println("Do you want to feed, rest, play, or breath fire? (or quit?)");
				String response = userInput.nextLine().trim().toLowerCase();
				
				break;
			
			case 5:
				System.exit(0);

			}
		}

	}

	private static void displayMainMenu() {

		System.out.println("Please chose an option");
		System.out.println("1: Add a new pet to the shelter.");
		System.out.println("2: View current pets in the shelter.");
		System.out.println("3: Interact with a pet.");
		System.out.println("4: Interact with all pets.");
		System.out.println("5: Burn the shelter down (quit application).");

	}

	private static void determineUserResponse(String response, VirtualPet pet) {

		int amount = 0; // amount+1 is below to counter the tick.
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + pet.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.feedDragon(amount);
			break;

		case "rest":
			System.out.println("How much do you want " + pet.getName() + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.restDragon(amount);
			break;

		case "play":
			System.out.println("How much play time do you want " + pet.getName() + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			pet.playWithDragon(amount);
			break;

		case "fire":
			System.out.println("How long should " + pet.getName() + " breath fire?");
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
