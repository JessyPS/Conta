package dados;

public class Conta {
    // private: esconde (encapsula) os atributos da classe
    private String numero;
    private double saldo;
    private Cliente titular;

    // Construtor sem parâmetros
    // Inicializa os atributos com vazio ou zero
    public Conta(){
        this.setNumero("");
        this.setSaldo(0);
        this.setTitular(null);
    }

    // Construtor com parâmetros
    // Inicializa os atributos com valores passados
    // Na instanciação da classe

    public Conta(String numero, Cliente titular){
        this.setNumero(numero);
        this.setSaldo(0);
        this.setTitular(titular);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar (double valorDeposito) {
        if(valorDeposito>0) {
            System.out.println("Saldo atual: R$ " + getSaldo());
            System.out.println("Valor depositado: R$ " + valorDeposito);
            this.setSaldo(getSaldo() + valorDeposito);
            System.out.println("Novo saldo: R$ " + getSaldo());
        }else{
            System.out.println("Valor inválido! Digite um valor positivo! ");
        }
    }

    public void sacar (double valorSaque) {
        if(getSaldo()>=valorSaque) {
            System.out.println("Saldo atual: R$ " + getSaldo());
            System.out.println("Valor a sacar: R$ " + valorSaque);
            this.setSaldo(getSaldo() - valorSaque);
            System.out.println("Novo saldo: R$ " + getSaldo());
        }else{
            System.out.println("Saldo insuficiente! ");
        }
    }
}

//EX: depositar 100.00 -> //valor: 100.00
//getSaldo(): //saldo: 100.00
//valor: 100.00
//setSaldo(100.00+100.00)
//novo valor de saldo: 200

