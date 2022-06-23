package gui;

import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;

public class AntiqueShop {

    public static void main(String[] args) {
        String[] options = {" Create a Vase.", " Create a Statue.", " Create a Painting.", " Display the Item."};
        Item item = null;
        int choice = 0;
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("you need to create an object");
                    }
                
            }
        } while (choice <= 4);
    }
}
