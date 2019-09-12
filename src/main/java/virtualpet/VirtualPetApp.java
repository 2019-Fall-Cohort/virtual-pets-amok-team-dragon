package virtualpet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class VirtualPetApp {

	static VirtualPetShelter petShelter = new VirtualPetShelter();
	private static Scanner userInput = new Scanner(System.in);
	
	static boolean stayInMenu = true;

	public static void main(String[] args) {

		System.out.println("Welcome to Pet Shelter!");
		System.out.println("");
		
		stayInMenu = true;
		
		while (true) {		

			displayMainMenu();
			determineMainMenuAction();		
			
		}

	}

	private static void determineMainMenuAction() {
		int userSelection = userInput.nextInt();
		userInput.nextLine();

		switch (userSelection) {
		
		case 1:
			System.out.println("What would you like to name your pet?");
			String petName = userInput.nextLine();
			VirtualPet pet = new VirtualPet(petName);
			petShelter.addPetToShelter(pet);
			break;
			
		case 2:
			System.out.println(petShelter.retrievePetList());
			System.out.println("");
			break;
			
		case 3:
			System.out.println("Which pet would you like to interact with?");
			System.out.println(petShelter.retrievePetList());
			String selectedPetName = userInput.nextLine();				
			VirtualPet selectedVirtualPet = petShelter.retrieveVirtualpet(selectedPetName);

			stayInMenu = true;
			while (stayInMenu) {
				selectedVirtualPet.displayPetAttributes();
				System.out.println("");
				System.out.println("What would you like to do?  Feed, Rest, Play, Fire, or Back?");
				String response = userInput.nextLine().trim().toLowerCase();
				determineUserResponse(response, selectedVirtualPet);
			}
			
			break;
			
		case 4:
			// Interact with all pets.
			int amount = 0;
			stayInMenu = true;
			
			while (stayInMenu) {
				System.out.println("Do you want to feed, rest, play, or breath fire? (or quit?)");
				String response = userInput.nextLine().trim().toLowerCase();
				switch (response) {
				case "feed":
					System.out.println("How much do you want to feed pets?");
					amount = userInput.nextInt();
					userInput.nextLine();
					petShelter.feedAllPets(amount);
					petShelter.tickAllPets();
					break;

				case "rest":
					System.out.println("How much do you want to rest pets?");
					amount = userInput.nextInt();
					userInput.nextLine();
					petShelter.restAllPets(amount);
					petShelter.tickAllPets();
					break;

				case "play":
					System.out.println("How much play time do you want to have with pets?");
					amount = userInput.nextInt();
					userInput.nextLine();
					petShelter.playWithAllPets(amount);
					petShelter.tickAllPets();
					break;

				case "fire":
					System.out.println("How long should pets breath fire?");
					amount = userInput.nextInt();
					userInput.nextLine();
					petShelter.doMagicWithAllPets(amount);
					petShelter.tickAllPets();
					break;

				case "back":
					stayInMenu = false;
					break;

				default:
					System.out.println("You so silly!");
				}

				
			}
			
			break;
		
		case 5:
			stayInMenu = false;
			System.out.println("Okay, BYEEEEE!!!!");
			System.exit(0);

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

	private static void determineUserResponse(String response, VirtualPet selectedVirtualPet) {

		int amount = 0; // amount+1 is below to counter the tick.
		petShelter.tickAllPets();
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + selectedVirtualPet.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.feedDragon(amount);
			break;

		case "rest":
			System.out.println("How much do you want " + selectedVirtualPet.getName() + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.restDragon(amount);
			break;

		case "play":
			System.out.println("How much play time do you want " + selectedVirtualPet.getName() + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.playWithDragon(amount);
			break;

		case "fire":
			System.out.println("How long should " + selectedVirtualPet.getName() + " breath fire?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.breathsFire(amount);
			break;

		case "back":
			stayInMenu = false;
			break;

		default:
			System.out.println("You so silly!");
		}

	}

	
}


