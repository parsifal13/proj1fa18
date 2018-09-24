package proj1fa18;

import java.util.Random;

public class River {
    private int       arraySize;
    private Animal[]  riverArray;
    private int       numAnimal;

    public River() {    // default constructor creates array size of 20
        riverArray = new Animal[20];
        numAnimal = 0;
    }
    public River(int size) {    // parameterized constructor receives value from the user
        this.setArraySize(size);
        riverArray = new Animal[arraySize];
        numAnimal = 0;
    }

    public void setArraySize(int size) {
        arraySize = size;
    }

    public void addAnimal() {
        Random Random = new Random();
        while (numAnimal < arraySize / 2) {
            boolean randomObjects = Random.nextBoolean();   // true = Bear, Fish otherwise
            int     randomInt     = Random.nextInt(arraySize);
            if (riverArray[randomInt] == null & !randomObjects) {
                riverArray[randomInt] = new Fish();
                numAnimal++;
            }
            else if (riverArray[randomInt] == null & randomObjects) {
                riverArray[randomInt] = new Bear();
                numAnimal++;
            }
        }
    }

    public String toString() {
        String returnMe = "";
        for (int i = 0; i < arraySize; i++) {
            if (riverArray[i] == null) {
                returnMe += "Area " + "[" + i + "]" + "\n";
            }
            else returnMe += "Area " + "[" + i + "] " + riverArray[i].toString() + "\n";
        }
        return returnMe + "\n" + "Total number of Animals: " + numAnimal;
    }
}
