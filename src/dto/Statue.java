package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Statue extends Item {

    int weight;
    String colour;

    public Statue() {
        super();
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    //setters
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //getter
    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void inputStatue() {
        Scanner sc = null;
        boolean cont = false;
        super.input();
        do {
            try {
                System.out.print("Input weight: ");
                sc = new Scanner(System.in);
                weight = sc.nextInt();
                if (weight <= 0) {
                    throw new Exception();
                }
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            } catch (Exception e) {
                System.out.println("Value must larger than 1");
            }
        } while (!cont);

        cont = false;

        do {
            try {
                System.out.print("Input colour: ");
                sc = new Scanner(System.in);
                colour = sc.nextLine();
                if (!colour.matches("^[a-zA-Z]+([a-zA-Z ]+)")) {
                    throw new Exception();
                }
                cont = true;
            } catch (Exception e) {
                System.out.println("Invalid colour");
            }
        } while (!cont);

    }

    public void outputStatue() {
        super.ouput();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
