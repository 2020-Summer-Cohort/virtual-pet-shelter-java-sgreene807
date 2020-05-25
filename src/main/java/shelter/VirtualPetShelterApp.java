package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet(30, 30, 20, "Juno", "Energetic Boxer who loves to play!");
        VirtualPet pet2 = new VirtualPet(40, 30, 25, "Andy", "Sweet and shy Yorkie mix!");
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        System.out.println("Welcome to Sarah's Virtual Pet Shelter! Here are all the pets in the shelter:");
        printPattern();
        shelter.printAllPetsAndDescriptions();
        printPattern();
        shelter.printPetHealthStatus();
        printPattern();
        Scanner scanner = new Scanner(System.in);

        promptUser();

        while (shelter.isPetHealthy()) {
            int numberSelected = scanner.nextInt();
            if (numberSelected == 1) {
                shelter.feedPets();
            } else if (numberSelected == 2) {
                shelter.waterPets();
            } else if (numberSelected == 3) {
                System.out.println("Please select which pet you would like to play with.");
                System.out.println(shelter.getPets().keySet());
                scanner.nextLine();
                String petSelected = scanner.nextLine();
                shelter.playWithPet(petSelected);
            } else if (numberSelected == 4) {
                shelter.printAllPetsAndDescriptions();
                System.out.println("Please select which pet you would like to adopt.");
                scanner.nextLine();
                String petAdopted = scanner.nextLine();
                shelter.removePet(petAdopted);
                System.out.println(petAdopted + " has been adopted.");
            } else if (numberSelected == 5) {
                System.out.println("Please enter the pet's name.");
                scanner.nextLine();
                String petToAdd = scanner.nextLine();
                System.out.println("We are excited to welcome " + petToAdd + " to the shelter. Please tell us more about " + petToAdd);
                String petToAddDescription = scanner.nextLine();
                shelter.addPet(new VirtualPet(petToAdd, petToAddDescription));
                System.out.println(petToAdd + " has now been admitted.");
            } else if (numberSelected == 6) {
                System.out.println("Thank you for visiting the shelter. We hope to see you again soon!");
                System.exit(0);
            } else {
                System.out.println("Invalid. Please enter a number 1 through 6.");
            }
            shelter.tick();
            printPattern();
            shelter.printPetHealthStatus();
            printPattern();
            promptUser();
        }
        System.out.println("You lose!");
    }

    public static void promptUser() {
        System.out.println("What do you want to do?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Give the pets water");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Exit");
    }

    public static void printPattern() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}





