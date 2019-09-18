package virtualpet;

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
			displayAllDragonAttributes();
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

		if (choiceOfDragon.equals("organic")) {
			if (attributeOfDragon.equals("fire")) {
				OrganicFireDragon pet = new OrganicFireDragon(petName);
				petShelter.addPetToShelter(pet);

			} else {
				OrganicIceDragon pet = new OrganicIceDragon(petName);
				petShelter.addPetToShelter(pet);
			}
		} else {
			if (attributeOfDragon.equals("fire")) {
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
		Dragon selectedVirtualPet = petShelter.retrieveVirtualPet(selectedPetName);

		stayInMenu = true;
		if (selectedVirtualPet instanceof OrganicDragon) {
			OrganicDragon dragon = (OrganicDragon) selectedVirtualPet;
			while (stayInMenu) {
				dragon.displayOrganicAttributes();
				System.out.println("");
				System.out.println("What would you like to do?  Feed, Rest, Play, Magic, or Back?");
				String response = userInput.nextLine().trim().toLowerCase();
				determineUserResponseForOrganicDragon(response, dragon);
			}

		} else if (selectedVirtualPet instanceof RoboticDragon) {
			RoboticDragon dragon = (RoboticDragon) selectedVirtualPet;
			while (stayInMenu) {
				dragon.displayRoboticAttributes();
				System.out.println("");
				System.out.println("What would you like to do?  Oil, Charge, Play, Magic, or Back?");
				String response = userInput.nextLine().trim().toLowerCase();
				determineUserResponseForRoboticDragon(response, dragon);
			}
		} else {
			System.out.println("Something is wrong... fix it, BUM!");
		}
	}

	private static void interactWithAllPets() {
		int amount = 0;
		stayInMenu = true;

		while (stayInMenu) {
			displayAllDragonAttributes();
			//petShelter.retrieveOrganicPetAttributes();
			System.out.println("");
			System.out.println("What would you like to do?  Feed/Oil, Rest/Charge, Play, Magic, or Back?");
			String response = userInput.nextLine().trim().toLowerCase();
			switch (response) {
			case "feed":
			case "oil":
				System.out.println("How much do you want to feed/oil pets?");
				amount = userInput.nextInt();
				userInput.nextLine();
				petShelter.feedAllPets(amount);
				break;

			case "rest":
			case "charge":
				System.out.println("How much do you want to rest/charge pets?");
				amount = userInput.nextInt();
				userInput.nextLine();
				petShelter.restAllPets(amount);
				break;

			case "play":
				System.out.println("How much play time do you want to have with pets?");
				amount = userInput.nextInt();
				userInput.nextLine();
				petShelter.playWithAllPets(amount);
				break;

			case "magic":
				System.out.println("How much magic should each Dragon use?");
				amount = userInput.nextInt();
				userInput.nextLine();
				petShelter.doMagicWithAllPets(amount);
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

	private static void determineUserResponseForOrganicDragon(String response, OrganicDragon dragon) {

		int amount = 0; 
		switch (response) {
		case "feed":
			System.out.println("How much do you want to feed " + dragon.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.feedDragon(amount);
			break;

		case "rest":
			System.out.println("How much do you want " + dragon.getName() + " to rest?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.restDragon(amount);
			break;

		case "play":
			System.out.println("How much play time do you want " + dragon.getName() + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.playWithDragon(amount);
			break;

		case "magic":
			if (dragon.getElement().equals("Fire")) {
				System.out.println("How much fire should " + dragon.getName() + " breath?");
			} else if (dragon.getElement().equals("Ice")) {
				System.out.println("How much bitter wind should " + dragon.getName() + " blow?");
			} else {
				System.out.println("Something is wrong, FOOL!");
			}
			amount = userInput.nextInt();
			userInput.nextLine();
			petShelter.doMagic(dragon, amount);
			break;

		case "back":
			stayInMenu = false;
			break;

		default:
			System.out.println("You so silly!");
		}

	}

	private static void determineUserResponseForRoboticDragon(String response, RoboticDragon dragon) {

		int amount = 0; 
		switch (response) {
		case "oil":
			System.out.println("How much oil do you want to give " + dragon.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.feedDragon(amount);
			break;

		case "charge":
			System.out.println("How much do you want to charge " + dragon.getName() + "?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.restDragon(amount);
			break;

		case "play":
			System.out.println("How much play time do you want " + dragon.getName() + " to have?");
			amount = userInput.nextInt();
			userInput.nextLine();
			dragon.playWithDragon(amount);
			break;

		case "magic":
			if (dragon.getElement().equals("Fire")) {
				System.out.println("How much fire should " + dragon.getName() + " breath?");
			} else if (dragon.getElement().equals("Ice")) {
				System.out.println("How much bitter wind should " + dragon.getName() + " blow?");
			} else {
				System.out.println("Something is wrong, FOOL!");
			}
			amount = userInput.nextInt();
			userInput.nextLine();
			petShelter.doMagic(dragon, amount);
			break;

		case "back":
			stayInMenu = false;
			break;

		default:
			System.out.println("You so silly!");
		}

	}
	private static void displayAllDragonAttributes() {
		System.out.println("Organic Dragons:");
		System.out.print(String.format("|%-10s", "Name"));
		System.out.print(String.format("|%-10s", "Element"));
		System.out.print(String.format("|%-10s", "Hunger"));
		System.out.print(String.format("|%-10s", "Fatigue"));
		System.out.print(String.format("|%-10s", "Boredom"));
		System.out.print(String.format("|%-10s|", "Magic"));
		System.out.println();
		petShelter.retrieveOrganicPetAttributes();
		System.out.println();

		System.out.println("Robotic Dragons:");
		System.out.print(String.format("|%-10s", "Name"));
		System.out.print(String.format("|%-10s", "Element"));
		System.out.print(String.format("|%-10s", "Oil"));
		System.out.print(String.format("|%-10s", "Battery"));
		System.out.print(String.format("|%-10s", "Boredom"));
		System.out.print(String.format("|%-10s|", "Magic"));
		System.out.println();
		petShelter.retrieveAllRoboticPetAttributes();
		System.out.println();
	}
}
