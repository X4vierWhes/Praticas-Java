package Main;

import java.util.Scanner;

public class Client {
    private User user;

    private Vehicle car;

    private double wallet;

    private boolean admin = false;

    public Client(){}

    public Client(User user, Vehicle car, double wallet){
        this.user = user;
        this.car = car;
        this.wallet = wallet;

        if(user.getLogin().equalsIgnoreCase("admin")){
            this.admin = true;
        }
    }

    public void createCar(){
        System.out.println("Modelo do carro: ");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
