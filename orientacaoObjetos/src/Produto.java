package src;
/*
>>> Classes
- Nome das classes inicia com letra maiúscula;
- Nome não deve conter acentuação, caracteres especiais, espaço
- Nas classes java não existe a implementação da função main()
- O nome da classe Java deve ser o mesmo nome do arquivo Java
- Tudo que estiver dentro das chaves pertence a classe
- Toda classe Java possui a seguinte forma:

public class NomeDaClasse{
}

>>> Atributos
- São as características da classe/modelo/modelo de dados;
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;
- Atributos são nomeados em letras minúsculos, sem espaço, sem caracter especial, sem acentuação;

>>> Métodos
- Podemos entender os métodos como a ação que é realizada por um objeto;
- Podemos entender também que os métodos são comportamentos dos objetos da classe;
- Mesmos requisitos para funções;

> a) Tipo de retorno
> b) Nome - corresponde a ação que a função realiza
> c) Parâmetros/Argumentos de entrada (opcional)
> d) Retorno (opcional - depende do tipo de retorno)

 */
public class Produto {

    //Atributos
    String nome;
    float preco;
    float desconto;

    //Metodo para aumentar preço em R$10
    void aumentar_preco(float valor){
        this.preco = this.preco + 10;
    }

}
