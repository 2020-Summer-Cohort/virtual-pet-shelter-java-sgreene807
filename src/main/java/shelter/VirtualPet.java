package shelter;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int boredom;
    private String petName;
    private String petDescription;

    public VirtualPet(String petName, String description) {
        this.petName = petName;
        this.petDescription = description;
    }

    public VirtualPet(int hunger, int thirst, int boredom, String name, String description) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.petName = name;
        this.petDescription = description;
    }

    public void feed() {
        this.hunger -= 2;
    }

    public void water() {
        this.thirst -= 2;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        this.boredom -= 2;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void tick() {
        this.hunger++;
        this.thirst++;
        this.boredom++;
    }

    public boolean isGoodHealth() {
        if (this.hunger == 100 || this.thirst == 100 || this.boredom == 100) {
            return false;
        }
        return true;
    }
}







