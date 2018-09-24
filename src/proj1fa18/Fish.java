package proj1fa18;

public class Fish extends Animal {
    private int       strength;
    private String    gender;
    private String    species;
    private int       predator;

    public Fish() {
        strength = super.getStrength();
        gender = super.getGender();
        species = super.getSpecies();
        predator = 0;
    }
}
