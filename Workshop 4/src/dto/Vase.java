package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vase extends Item {

    int height;
    String material;

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //getter
    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void inputVase() {
        Scanner sc = null;
        boolean cont = false;
        super.input();
        do {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input height: ");
                height = sc.nextInt();
                if (height < 0) {
                    throw new Exception();
                }
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            } catch (Exception e) {
                System.out.println("Must larger than 1");
            }
        } while (!cont);

        cont = false;

        do {
            try {
                System.out.print("Input material: ");
                sc = new Scanner(System.in);
                material = sc.nextLine();
                if (!material.matches("^[a-zA-Z]+([a-zA-Z ]+)")) {
                    throw new Exception();
                }
                cont = true;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (!cont);

    }

    public void outputVase() {
        super.ouput();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
