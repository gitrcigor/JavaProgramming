package src.br.com.geekuniversity.secao12.exercitando.exercicio02;
/*
* Exercício retirado do google
* 2. Formas de Pagamento:
Crie uma classe abstrata Pagamento com um método abstrato processar_pagamento().
Crie subclasses concretas como CartaoCredito, BoletoBancario e TransferenciaBancaria que herdam de Pagamento e implementam o método processar_pagamento() com suas lógicas específicas.
*
* */
public class ProgramaPrincipalParaClassePagamento {

    public static void main(String[] args) {

        System.out.print("\n--- Transferência ---");
        TransferenciaBancaria transferencia01 = new TransferenciaBancaria(100, "Messias J.");
        System.out.print("\nValor final com desconto de 5%: R$" + transferencia01.processarPagamento());
        System.out.print("\n");

        System.out.print("\n--- Cartão de Crédito ---");
        CartaoDeCredito cartao01 = new CartaoDeCredito(500, "Igor R.", 3);
        System.out.print("\nValor da compra de R$" + cartao01.valor + " dividido em " + cartao01.getQuantidadeParcelas() + " prestações: " + cartao01.processarPagamento());
        System.out.print("\n");

        System.out.print("\n--- Boleto Bancário ---");
        BoletoBancario boleto01 = new BoletoBancario(350, "Camila Lima");
        System.out.print("\nBoleto processado com juros de 10%" + boleto01.getJuros() + " tem valor final de: " + boleto01.processarPagamento());
        System.out.print("\n");

    }

}
