package gui;

import java.util.Scanner;
import data.Phone;
import java.io.IOException;
import manager.ListOfPhone;

public class Tester {
    public static void main(String[] args) {
        int choice = 0;
        boolean stillAdd;
        Scanner sc = new Scanner(System.in);
        
        ListOfPhone listOfPhone = new ListOfPhone();
        String fileName = "PhoneInformation.txt";
        
        do {            
            System.out.println("----------------------------------------------------------------");
            System.out.println("Welcome to HKT Store - @ 2021 by <HE176816 - Then Ngoc Hai Dang>");
            System.out.println("Select the options below: ");
            System.out.println("1. > Load data from file");
            System.out.println("2. > Add a phone");
            System.out.println("3. > Search a phone by model");
            System.out.println("4. > Remove the phone by model");
            System.out.println("5. > Print the phone list in the descending order of Model");
            System.out.println("6. > Save data to file");
            System.out.println("7. > Quit");
            System.out.println("----------------------------------------------------------------");
            System.out.print("What's your choice?: ");
            
            //try catch for input of choice
            do {                
                try {
                    sc = new Scanner(System.in);
                    choice = sc.nextInt();
                    if (choice <= 0 || choice > 7) {
                        throw new Exception();
                    }
                    stillAdd = false;
                } catch (Exception e) {
                    System.out.print("Please add another choice: ");
                    stillAdd = true;
                }
            } while (stillAdd);
                
            switch (choice) {
                case 1: //Load data from file
                    listOfPhone.readFile(fileName);
                    System.out.println("Successfully added!");
                    System.out.print("Press ENTER to go back main menu!");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                    }
                    break;

                case 2: //Add another new phone to the list
                    String statusYesNo = "";   
                    
                    //Input phone number
                    Phone phoneInformation = new Phone();
                    phoneInformation.addPhoneInformation();
                    
                    if (listOfPhone.addNewPhoneToList(phoneInformation)) System.out.println("Successfully added!");
                    else System.out.println("Failed to add new phone");
                    
                    //Add more or not
                    System.out.print("Do you want to add another phone? (yes or no) ");
                    do {                            
                        try {
                            sc = new Scanner(System.in);
                            statusYesNo = sc.nextLine();
                            if (!statusYesNo.equalsIgnoreCase("yes") && !statusYesNo.equalsIgnoreCase("no"))
                                throw new Exception();
                            stillAdd = false;
                        } catch (Exception e) {
                            System.out.print("Just <yes> or <no>: ");
                            stillAdd = true;
                        }
                    } while (stillAdd);

                    //Check if user want to add another new phone to the list or not
                    while (statusYesNo.equalsIgnoreCase("yes")) {                            
                        Phone phoneInformation1 = new Phone();
                        phoneInformation1.addPhoneInformation();
                        
                        if (listOfPhone.addNewPhoneToList(phoneInformation)) System.out.println("Successfully added");
                        else System.out.println("Failed to add new phone");
                        
                        
                        System.out.print("Do you want to add another phone? (yes or no)");
                        do {                                    
                            try {
                                sc = new Scanner(System.in);
                                statusYesNo = sc.nextLine();
                                if (!statusYesNo.equalsIgnoreCase("yes") && !statusYesNo.equalsIgnoreCase("no"))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("Just <yes> or <no>: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);
                    } 
                    break;
              
                case 3: //Search based on model
                    if (listOfPhone.checkListEmpty()) {
                    } else {
                        String modelWantSearch = "";

                        //Input section
                        System.out.print("Search for the model of phone that you want to search: ");
                        do {
                            try {
                                sc = new Scanner(System.in);
                                modelWantSearch = sc.nextLine();
                                modelWantSearch = modelWantSearch.toUpperCase();
                                if (modelWantSearch.equals(""))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("Add another model: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);

                        //Check if the model is in the list. If yes, then export the corresponding phone information
                        if (listOfPhone.findPhoneByModel(modelWantSearch) != null) {
                            System.out.println("I have found it!");
                            System.out.println("The information of phone has this model are: ");
                            listOfPhone.findPhoneByModel(modelWantSearch).printOutPhoneInformation();
                        } else System.out.println("This phone's model does not exist!");  

                        //Let the user choose whether to search for the model continue or return to the menu
                        String statusYesNo1 = "";
                        System.out.print("Continue searching for another phone's model? (yes or no) ");
                        do {                        
                            try {
                                sc = new Scanner(System.in);
                                statusYesNo1 = sc.nextLine();
                                if (!statusYesNo1.equalsIgnoreCase("yes") && !statusYesNo1.equalsIgnoreCase("no"))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("Just <yes> or <no>: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);

                        //If user type yes then run the search loop -> enter <yes> or <no>.
                        //If user enters no then go back to main menu
                        while (statusYesNo1.equalsIgnoreCase("yes")) {
                            System.out.print("Add a model of phone that you want to search: ");
                            do {        
                                try {
                                    sc = new Scanner(System.in);
                                    modelWantSearch = sc.nextLine();
                                    modelWantSearch = modelWantSearch.toUpperCase();
                                    if (modelWantSearch.equals(""))
                                        throw new Exception();
                                    stillAdd = false;
                                } catch (Exception e) {
                                    System.out.print("Add another model: ");
                                    stillAdd = true;
                                }
                            } while (stillAdd);

                            if (listOfPhone.findPhoneByModel(modelWantSearch) != null) {
                                System.out.println("I have found it!");
                                System.out.println("The information of phone has this model are: ");
                                listOfPhone.findPhoneByModel(modelWantSearch).printOutPhoneInformation();
                            } else System.out.println("This phone's model does not exist!");

                            System.out.print("Continue searching for another phone's model? (yes or no) ");
                            do {                            
                                try {
                                    sc = new Scanner(System.in);
                                    statusYesNo1 = sc.nextLine();
                                    if (!statusYesNo1.equalsIgnoreCase("yes") && !statusYesNo1.equalsIgnoreCase("no"))
                                        throw new Exception();
                                    stillAdd = false;
                                } catch (Exception e) {
                                    System.out.print("Just <yes> or <no>: ");
                                    stillAdd = true;
                                }
                            } while (stillAdd);
                        }
                    }
                    break;

                case 4: //Delete based on the model
                    if (listOfPhone.checkListEmpty()) {
                    } else {
                        String modelWantRemove = "";
                    
                        //Input the model
                        System.out.print("Add the model of phone that you want to remove: ");
                        do {
                            try {
                                sc = new Scanner(System.in);
                                modelWantRemove = sc.nextLine();
                                modelWantRemove = modelWantRemove.toUpperCase();
                                if (modelWantRemove.equals(""))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("Add another model: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);

                        //remove object
                        if (listOfPhone.removePhoneByModel(modelWantRemove))
                            System.out.println("Successfully removed");
                        else System.out.println("Failed to remove");

                        //continue to remove or return to main menu
                        String statusYesNo2 = "";
                        System.out.print("Continue removing another phone's model (yes or no): ");
                        do {
                            try {
                                sc = new Scanner(System.in);
                                statusYesNo2 = sc.nextLine();
                                if (!statusYesNo2.equalsIgnoreCase("yes") && !statusYesNo2.equalsIgnoreCase("no"))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("<yes> or <no>: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);

                        //if they choose remove
                        if (listOfPhone.checkListEmpty());
                        else {
                            while (statusYesNo2.equalsIgnoreCase("yes")) {
                                System.out.print("Add the model of phone that you want to remove: ");
                                do {                            
                                    try {
                                        sc = new Scanner(System.in);
                                        modelWantRemove = sc.nextLine();
                                        modelWantRemove = modelWantRemove.toUpperCase();
                                        if (modelWantRemove.equals(""))
                                            throw new Exception();
                                        stillAdd = false;
                                    } catch (Exception e) {
                                        System.out.print("Add another model: ");
                                        stillAdd = true;
                                    }
                                } while (stillAdd);

                                if (listOfPhone.removePhoneByModel(modelWantRemove))
                                    System.out.println("Successfully removed");
                                else System.out.println("Failed to remove");

                                System.out.print("Continue removing another phone's model (yes or no): ");
                                do {
                                    try {
                                        sc = new Scanner(System.in);
                                        statusYesNo2 = sc.nextLine();
                                        if (!statusYesNo2.equalsIgnoreCase("yes") && !statusYesNo2.equalsIgnoreCase("no"))
                                            throw new Exception();
                                        stillAdd = false;
                                    } catch (Exception e) {
                                        System.out.print("<yes> or <no>: ");
                                        stillAdd = true;
                                    }
                                } while (stillAdd);
                            }
                        }
                    }
                    break;
               
                case 5: //sort
                    if (listOfPhone.checkListEmpty()) {
                    } else {
                        listOfPhone.printListPhoneInDescendingOrder();
                        System.out.print("Press ENTER to go back main menu!");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                        }
                    }
                    break;
        
                case 6: //Write data to file
                    if (listOfPhone.checkListEmpty()) {
                    } else {
                        String fileNameWant = "";
                        System.out.print("Add the name of file that you want to save data to (format name.txt): ");
                        do {
                            try {
                                sc = new Scanner(System.in);
                                fileNameWant = sc.nextLine();
                                if (fileNameWant.equals(""))
                                    throw new Exception();
                                stillAdd = false;
                            } catch (Exception e) {
                                System.out.print("Add another name: ");
                                stillAdd = true;
                            }
                        } while (stillAdd);

                        if (listOfPhone.saveDataToFile(fileNameWant))
                            System.out.println("Successfully saved");
                        else System.out.println("Failed to save");
                        System.out.print("Press ENTER to go back main menu!");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                        }
                    }
                    break;
              
                case 7: //Exit
                    System.out.println("Good bye!");
                    break;
            }
        } while (choice > 0 && choice < 7);
    }
}
