package proj1fa18;

import java.util.Random;

public class Animal {
    private final int MAX_STR = 10;
    private int       strength;
    private String    gender;
    private String    species;

    public Animal() {
        Random Random = new Random();
        strength      = Random.nextInt(MAX_STR) + 1; // range = [1, 10]
        if (!Random.nextBoolean()) {    // true = Male, Female otherwise
            gender = "Female";
        }
        else gender = "Male";
        if (Random.nextInt(30) <= 15) {    // true = Bear, Fish otherwise
            species = "Fish";
        }
        else species = "Bear";
    }

    public int getStrength() {
        return strength;
    }
    public String getGender() {
        return gender;
    }
    public String getSpecies() {
        return species;
    }
    public String toString() {
        return new String("Species: " + species + " " + "Gender: " + gender + " " + "Strength: " + strength);
    }
}
