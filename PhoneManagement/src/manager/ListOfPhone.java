package manager;

import data.Phone;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListOfPhone {
    ArrayList<Phone> listPhone;
    String fileName = "PhoneInformation.txt";
    
    public ListOfPhone() {
        listPhone = new ArrayList<>();
    }
    
    public boolean addNewPhoneToList(Phone phoneInformation) {
        if (findPhoneByModel(phoneInformation.getModel()) != null) {
            System.out.println("The phone's model has been in the list!");
            System.out.println("Please add another phone information.");
            return false;
        } else {
            listPhone.add(phoneInformation);
            return true;
        }
    }
    
    public void printListPhoneInDescendingOrder() {
        Collections.sort(listPhone);
        for (Phone phoneInformation : listPhone) {
            phoneInformation.printOutPhoneInformation();
        }
    }
    
    public Phone findPhoneByModel(String model) {
        for (Phone phoneInformation : listPhone) {
            if (phoneInformation.getModel().equals(model))
                return phoneInformation;
        }
        return null;
    }
    
    public boolean removePhoneByModel(String model) {
        Phone phoneInformation = findPhoneByModel(model);
        
        String statusYesNo = "";
        boolean stillAdd = true;
        Scanner sc = new Scanner(System.in);
        
        if (phoneInformation != null) {
            System.out.println("Found phone's model in list.");
            System.out.print("Are you sure to remove the phone with this model? (yes or no) ");
            do {                
                try {
                    sc = new Scanner(System.in);
                    statusYesNo = sc.nextLine();
                    if (!statusYesNo.equalsIgnoreCase("yes") && !statusYesNo.equalsIgnoreCase("no"))
                        throw new Exception();
                    stillAdd = false;
                } catch (Exception e) {
                    System.out.print("Just yes or no: ");
                    stillAdd = true;
                }
            } while (stillAdd);
            
            if (statusYesNo.equalsIgnoreCase("yes")) {
                listPhone.remove(phoneInformation);
            return true;
            } else return false;
        } else return false;
    }
    
    public void readFile (String fileName) {
        try {
            File f = new File(fileName); 
            if (!f.exists()) return; //checking the file
            FileReader fr = new FileReader(f); //read()
            BufferedReader bf = new BufferedReader(fr); //readLine()
            String data; 
            while ((data = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(data, ";"); //Splitting details into elements
                String model = stk.nextToken();
                String CPU = stk.nextToken();
                int RAM = Integer.parseInt(stk.nextToken());
                int primaryCamera = Integer.parseInt(stk.nextToken());
                double screenSize = Double.parseDouble(stk.nextToken());
                int price = Integer.parseInt(stk.nextToken());
                String color = stk.nextToken();
                String brand = stk.nextToken();
                Phone phoneInformation = new Phone(model, CPU, RAM, primaryCamera, screenSize, price, color, brand);
                this.addNewPhoneToList(phoneInformation);
            }
            fr.close();
            bf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean saveDataToFile (String fileName) {
        int i = 0;
        try {
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Phone phoneInformation : listPhone) {
                    pw.println((++i) + ". " + "Model: " + phoneInformation.getModel() + "; " 
                        + "CPU: " + phoneInformation.getCPU() + "; "
                        + "RAM: " + phoneInformation.getRAM() + "GB" + "; "
                        + "primary camera: " + phoneInformation.getPrimaryCamera() + "MP" + "; "
                        + "screen-size: " + phoneInformation.getScreenSize() + "\"" + "; "
                        + "price: " + phoneInformation.getPrice() + "đ" + "; "
                        + "color: " + phoneInformation.getColor() + "; "
                        + "brand: " + phoneInformation.getBrand());
             
            }
            pw.close(); fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    
    public boolean checkListEmpty() {
        if (listPhone.isEmpty()) {
            System.out.println("No element!");
            return true;
        } else return false;
    }
}
