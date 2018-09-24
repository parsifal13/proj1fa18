package proj1fa18;

import javax.swing.*;

public class Proj1App {
    public static void main (String args[]) throws NumberFormatException {
        //  instance variables
        int userInput = 0;

        try {
            userInput = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Please input the size of the ecosystem"));

            River River = new River(userInput);
            River.addAnimal();
            System.out.println(River.toString());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input appropriate values");
        }
    }
}
