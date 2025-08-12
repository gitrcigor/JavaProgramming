package src.br.com.geekuniversity.secao13.interfaces;
//Aula 72 Interfaces
//Uma interface pode conter:
//Constantes e métodos abstratos
//Diferença entre interface e classe abastratas:
//Classe Abstrata: só pode ter constante, só pode ter métodos abstratos
//Interface: trabalha com constantes, só pode ter métodos abstratos, a classe que implementa a interface precisa usar os métodos declarados

//Interface para servir de contrato para produtos eletrônicos. Todo produto
//eletrônico que implementar esta interface obrigatoriamente deverão implementar os métodos abstratos.

public interface IEletronico {

    public String MARCA = "Geek";

    public void ligar();

    public void desligar();
}
