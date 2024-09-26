package solucoes;

import solucoes.desafio_1.DesafioFibonacci;
import solucoes.desafio_2.DesafioString;
import solucoes.desafio_3.CalculandoASoma;

public class MainSolucoes {

    public static void main(String[] args) {

        //verificar se um numero é fibonacci
        System.out.println(DesafioFibonacci.isFibonacci(5));

        //verifar se uma string possui a letra a e quantas vezes ela aparece
        DesafioString.verificadorDeA("AbacAxi");

        System.out.println("a variavel soma é igual a: " + CalculandoASoma.somar());
    }
}
