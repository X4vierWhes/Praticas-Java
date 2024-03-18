package Main;

import java.util.Scanner;

public class Client {
    private String login;
    private String modelo;

    private String renavam;

    private int fabricacao;

    private double preco;

    private String categoria;

    private boolean admin = false;

    public Client(){}

    public Client(String login, String modelo, String renavam, int fabricacao, double preco){
        setLogin(login);
        setModelo(modelo);
        setRenavam(renavam);
        setFabricacao(fabricacao);
        setPreco(preco);
        setAdmin(login);
    }

    public void create(){
        Scanner cin = new Scanner(System.in);

        System.out.println();

        cin.close();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(String login) {
        if("admin".equalsIgnoreCase(login)){
            this.admin = true;
        }else{
            this.admin = false;
        }
    }
}
