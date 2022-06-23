package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    public Item() {
        this.value = 0;
        this.creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    //getters
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    //setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = null;
        boolean cont = false;
        do {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter the value: ");
                value = sc.nextInt();
                if (value < 0) {
                    throw new Exception();
                }
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value");
            } catch (Exception e) {
                System.out.println("Value must larger than 1");
            }
        } while (!cont);
        cont = false;
        do {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter the creator: ");
                creator = sc.nextLine();
                if (!creator.matches("^[a-zA-Z]+([a-zA-Z ]+)")) {
                    throw new Exception();
                }
                cont = true;
            } catch (Exception e) {
                System.out.println("Invalid name");
            }
        } while (!cont);
    }
    public void ouput() {
        System.out.println("Creator: " + creator);
        System.out.println("Value: " + value);
    }
}
