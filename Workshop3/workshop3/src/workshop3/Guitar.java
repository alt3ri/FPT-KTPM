package workshop3;

public class Guitar {

    String serialNumber;
    int price;
    String builder;
    String model;
    String backWood;
    String topWood;

    public Guitar() {
        serialNumber = "";
        price = 0;
        builder = " ";
        backWood = " ";
        topWood = " ";
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    //setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    //getter
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Price: " + price);
        System.out.println("Builder: " + builder);
        System.out.println("Model: " + model);
        System.out.println("Back wood: " + backWood);
        System.out.println("Top wood: " + topWood);
    }

}
