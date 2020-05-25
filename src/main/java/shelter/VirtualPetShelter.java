package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public Map<String, VirtualPet> getPets() {
        return pets;
    }

    public Collection<VirtualPet> retrieveAllPets() {
        return pets.values();
    }

    public VirtualPet retrievePet(String petName) {
        return pets.get(petName);
    }

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getPetName(), petToAdd);
    }

    public void removePet(String petName) {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            String name = pet.getKey();
            if (name.equalsIgnoreCase(petName)) {
                pets.remove(name);
            }
        }
    }

    public void feedPets() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            VirtualPet currentPet = pet.getValue();
            currentPet.feed();
        }
        System.out.println("Thank you for feeding the pets!");

    }

    public void waterPets() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            VirtualPet currentPet = pet.getValue();
            currentPet.water();
        }
        System.out.println("Thank you for giving the pets water!");
    }

    public void playWithPet(String petName) {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            VirtualPet currentPet = pet.getValue();
            String petKey = pet.getKey();
            if (petKey.equalsIgnoreCase(petName)) {
                currentPet.play();
                System.out.println("Thank you for playing with " + petKey);
            }
        }
    }

    public void tick() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            VirtualPet petObject = pet.getValue();
            petObject.tick();
        }
    }

    public void getAllPetDescriptions() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            System.out.println(pet.getValue().getPetDescription());
        }
    }

    public void printAllPetsAndDescriptions() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            String petName = pet.getKey();
            String petDescription = pet.getValue().getPetDescription();
            System.out.println(petName + " - " + petDescription);
        }
    }

    public boolean isPetHealthy() {
        boolean isGoodHealth = true;
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            isGoodHealth = pet.getValue().isGoodHealth();
        }
        return isGoodHealth;

    }

    public void printPetHealthStatus() {
        for (Map.Entry<String, VirtualPet> pet : pets.entrySet()) {
            String petName = pet.getKey();
            int petHunger = pet.getValue().getHunger();
            int petThirst = pet.getValue().getThirst();
            int petBoredom = pet.getValue().getBoredom();
            System.out.println(petName + " - Hunger: " + petHunger + " Thirst: " + petThirst + " Boredom: " + petBoredom);

        }
    }
}
