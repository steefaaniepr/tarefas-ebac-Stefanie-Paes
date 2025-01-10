package br.com.stpaes.domain;

public class Motorista {

    private String nome;
    private int idade;
    private String carteiraMotorista;

    public Motorista(String nome, int idade, String carteiraMotorista) {
        this.nome = nome;
        this.idade = idade;
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    public void ligarMotor(){
        boolean motorLigado = true;
        System.out.println("Ligando motor");
    }

    public void desligarMotor(){
        boolean motorLigado = false;
        System.out.println("Desligar motor");
    }


}
