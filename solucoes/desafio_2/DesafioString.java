package solucoes.desafio_2;

public class DesafioString {

    public static void verificadorDeA(String palavra){
        int contador = 0;

        for(int i = 0; i <= palavra.length()-1; i++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                contador++;
            }
        }
        System.out.println("A letra A aparece na palavra " + palavra + " " + contador + " vezes");
    }
}
