package Main;

public class Vehicle {

    private String model;
    private String renavam;
    private int year;
    private double price;
    private String category;

    public Vehicle(){
        this.model = "none";
        this.renavam = "none";
        this.year = 0;
        this.category = "none";
        this.price = 0.0;
    }

    public Vehicle(String model, String renavam, int year, double price){
        this.model = model;
        this.renavam = renavam;
        this.year = year;
        this.price = price;
        this.setCategory(price);
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(double price) {
        if(price <= 6000){
            this.category = "Economico";
        } else if (price <= 9999) {
            this.category = "Intermediario";
        }else{
            this.category = "Executivos";
        }
    }
}
