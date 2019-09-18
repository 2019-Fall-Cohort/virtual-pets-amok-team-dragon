package virtualpet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class VirtualPetApp {

	static DragonCave petShelter = new DragonCave();
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
			addANewPet();
			break;

		case 2:
			displayAllPetAttributes();
			petShelter.retrieveAllPetAttributes();
			break;

		case 3:
			interactWithOnePet();
			break;

		case 4:
			interactWithAllPets();
			break;

		case 5:
			stayInMenu = false;
			System.out.println("Okay, BYEEEEE!!!!");
			System.exit(0);

		}

	}

	private static void addANewPet() {
		System.out.println("What would you like to name your pet?");
		String petName = userInput.nextLine();
		System.out.println("Do you want " + petName + " to be an organic or robotic dragon?");
		String choiceOfDragon = userInput.nextLine().trim().toLowerCase();
		System.out.println("Do you want " + petName + " to be a fire or ice dragon?");
		String attributeOfDragon = userInput.nextLine().trim().toLowerCase();

		if (choiceOfDragon == "organic") {
			if (attributeOfDragon == "fire") {
				OrganicFireDragon pet = new OrganicFireDragon(petName);
				petShelter.addPetToShelter(pet);
			} else {
				OrganicIceDragon pet = new OrganicIceDragon(petName);
				petShelter.addPetToShelter(pet);
			}
		} else {
			if (attributeOfDragon == "fire") {
				RoboticFireDragon pet = new RoboticFireDragon(petName);
				petShelter.addPetToShelter(pet);
			} else {
				RoboticIceDragon pet = new RoboticIceDragon(petName);
				petShelter.addPetToShelter(pet);
		}
	}

	}

	

	private static void interactWithOnePet() {
		System.out.println("Which pet would you like to interact with?");
		System.out.println(petShelter.retrievePetList());
		String selectedPetName = userInput.nextLine();
		Dragon selectedVirtualPet = petShelter.retrieveVirtualpet(selectedPetName);

		stayInMenu = true;
		while (stayInMenu) {
			selectedVirtualPet.displayPetAttributes();
			System.out.println("");
			System.out.println("What would you like to do?  Feed, Rest, Play, Fire, or Back?");
			String response = userInput.nextLine().trim().toLowerCase();
			determineUserResponse(response, selectedVirtualPet);
		}
	}

	private static void interactWithAllPets() {
		int amount = 0;
		stayInMenu = true;

		while (stayInMenu) {
			petShelter.retrieveAllPetAttributes();
			System.out.println("");
			System.out.println("What would you like to do?  Feed, Rest, Play, Fire, or Back?");
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

	}

	private static void displayMainMenu() {

		System.out.println("Please chose an option");
		System.out.println("1: Add a new pet to the shelter.");
		System.out.println("2: View current pets in the shelter.");
		System.out.println("3: Interact with a pet.");
		System.out.println("4: Interact with all pets.");
		System.out.println("5: Burn the shelter down (quit application).");

	}

	private static void determineUserResponse(String response, Dragon selectedVirtualPet) {

		int amount = 0; // amount+1 is below to counter the tick.
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + selectedVirtualPet.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.feedDragon(amount);
			petShelter.tickAllPets();
			break;

		case "rest":
			System.out.println("How much do you want " + selectedVirtualPet.getName() + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.restDragon(amount);
			petShelter.tickAllPets();
			break;

		case "play":
			System.out.println("How much play time do you want " + selectedVirtualPet.getName() + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.playWithDragon(amount);
			petShelter.tickAllPets();
			break;

		case "fire":
			System.out.println("How long should " + selectedVirtualPet.getName() + " breath fire?");
			amount = userInput.nextInt();
			userInput.nextLine();
			selectedVirtualPet.breathsFire(amount);
			petShelter.tickAllPets();
			break;

		case "back":
			stayInMenu = false;
			break;

		default:
			System.out.println("You so silly!");
		}

	}

	private static void displayAllPetAttributes() {
		System.out.print(String.format("|%-10s", "Name"));
		System.out.print(String.format("|%-10s", "Hunger"));
		System.out.print(String.format("|%-10s", "Fatigue"));
		System.out.print(String.format("|%-10s", "Boredom"));
		System.out.print(String.format("|%-10s|", "Magic"));
		System.out.println();
		String[] retrievedAttributes = petShelter.retrieveAllPetAttributes();

	}
}
