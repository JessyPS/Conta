package principal;

import dados.Conta;
import dados.Cliente;

public class Exercicio1 {

    public static void main(String[] args) {
        Cliente novoCliente1 = new Cliente( "Marcos", "Barreto");
        Conta novaConta1 = new Conta("208479",novoCliente1);
        novaConta1.depositar(200);
        novaConta1.sacar(50);


        Cliente novoCliente2 = new Cliente();
        novoCliente2.setNome("Paulo");
        novoCliente2.setSobrenome("José");
        Conta novaConta2 = new Conta("457812",novoCliente2);
        novaConta1.depositar(480);
        novaConta1.sacar(60);
    }
}




// *** Assinatura do método main() ***
// public: modificador de acesso: determina a visibilidade
// void: tipo de dado retornado pelo método
// main: nome do método
// String[] args: parâmetro do método
// *** Assinatura do método main() ***
