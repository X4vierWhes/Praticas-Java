public class Pessoa {
    private String name;
    private String cpf;
    private String genero;
    private int idade;
    private double peso;
    private double altura;
    private double IMC;

    public Pessoa() {
    }

    public Pessoa(String name, String cpf, String genero, int idade, double peso, double altura) {
        setName(name);
        setCpf(cpf);
        setGenero(genero);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
        if (altura > 0) {
            setIMC(peso / altura * altura);
        } else {
            setIMC(0.0);
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return double peso, altura, return the IMC
     */
    public double getIMC() {
        return IMC;
    }

    /**
     * @param IMC the IMC to set
     */
    public void setIMC(double imc) {
        this.IMC = imc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        if (this.altura == 0) {
            this.IMC = 0;
        }
        double calc = (this.peso / this.altura * this.altura);
        return calc;
    }

}
