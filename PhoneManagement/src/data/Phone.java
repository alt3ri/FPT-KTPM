package data;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Phone implements Comparable<Phone>{
    private String model;
    private String CPU;
    private int RAM;
    private int primaryCamera;
    private double screenSize;
    private int price;
    private String color;
    private String brand;
    
    public Phone() {
        model = "";
        CPU = "";
        RAM = 0;
        primaryCamera = 0;
        screenSize = 0;
        price = 0;
        color = "";
        brand = "";
    }

    public Phone(String model, String CPU, int RAM, int primaryCamera, double screenSize, int price, String color, String brand) {
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.primaryCamera = primaryCamera;
        this.screenSize = screenSize;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(int primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void addPhoneInformation() {
        Scanner sc = new Scanner(System.in);
        boolean stillAdd = true;
        
        System.out.print("Add model: ");
        do {       
            try {
                sc = new Scanner(System.in);
                model = sc.nextLine();
                model = model.toUpperCase();
                if (model.equals(""))
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another model: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add CPU: ");
        do {            
            try {
                sc = new Scanner(System.in);
                CPU = sc.nextLine();
                if (CPU.equals(""))
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another CPU: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add RAM: ");
        do {            
            try {
                sc = new Scanner(System.in);
                RAM = sc.nextInt();
                if (RAM <= 0)
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another RAM: ");
                stillAdd = true;
            }
        } while (stillAdd);
                
        System.out.print("Add primary camera: ");
        do {            
            try {
                sc = new Scanner(System.in);
                primaryCamera = sc.nextInt();
                if (primaryCamera < 0)
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another primary camera: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add screen-size: ");
        do {            
            try {
                sc = new Scanner(System.in);
                screenSize = sc.nextDouble();
                if (screenSize <= 0)
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another screen size: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add price: ");
        do {            
            try {
                sc = new Scanner(System.in);
                price = sc.nextInt();
                if (price <= 0)
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another price: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add color: ");
        do {
            try {
                sc = new Scanner(System.in);
                color = sc.nextLine();
                if (color.equals(""))
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another color: ");
                stillAdd = true;
            }
        } while (stillAdd);
        
        System.out.print("Add brand: ");
        do {
            try {
                sc = new Scanner(System.in);
                brand = sc.nextLine();
                if (brand.equals(""))
                    throw new Exception();
                stillAdd = false;
            } catch (Exception e) {
                System.out.print("Add another brand: ");
                stillAdd = true;
            }
        } while (stillAdd);
    }
    
    public void printOutPhoneInformation() {
        System.out.println("---");
        System.out.println("Model: " + model);
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Primary camera: " + primaryCamera + "MP");
        System.out.println("Screen size: " + screenSize + "\"");
        
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str = currencyVN.format(price);
        
        System.out.println("Price: " + str);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("---");
    }

    @Override
    public int compareTo(Phone t) {
        return t.getModel().compareTo(model);
    }
}
