import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        String palavra, palavraInvertida;
        char[] pilha = new char[50]; 
        //O tipo char em Java é usado para representar um único caractere. Cada caractere em Java é armazenado como um valor numérico (um código Unicode) de 16 bits. Os caracteres podem ser letras, dígitos, símbolos, espaços, etc.
        //Esta linha declara um array chamado pilha que pode armazenar até 50 caracteres. Esse array é usado como a pilha onde as letras da palavra digitada pelo usuário serão armazenadas.

        int topo = 0;

        // Entrada da palavra
        System.out.print("Digite uma palavra:");
        palavra = scanner.nextLine().trim();

        
        for(int i = 0; i < palavra.length(); i++){
            topo++;
            pilha[topo] = palavra.charAt(i);
            // O método .charAt() em Java é utilizado para obter o caractere em uma posição específica de uma String. Ele recebe um índice como parâmetro e retorna o caractere localizado nessa posição.
        }

        palavraInvertida = "";
        while(topo > 0){
            palavraInvertida += pilha[topo];
            topo--;
        }

        if(palavra.equals(palavraInvertida)){
            System.out.println("É um palindromo");
        } else {
            System.out.println("Não é");
        }



        
    }
}
