package br.com.stpaes.domain;

public class Onibus {

     private String cor;
     private int capacidade;
     private String rota;
     private float velocidade;

    public Onibus(String cor, int capacidade, String rota, float velocidade) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.rota = rota;
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void abastecer(int litros) {
        int tanqueCombustivel = litros;
        System.out.println("Tanque abastecido com " + litros + " litros.");
    }


    public void alterarRota(String novaRota) {
        rota = novaRota;
        System.out.println("Rota alterada para: " + novaRota);
    }

    

}
