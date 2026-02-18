package ved.ottirboaoj.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            Metodos.menu();
            System.out.println("\nDigite a opçao que deseja acessar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    Metodos.soma(scanner);
                    break;
                case 2:
                    Metodos.subtracao(scanner);
                    break;
                case 3:
                    Metodos.multiplicacao(scanner);
                    break;
                case 4:
                    Metodos.divisao(scanner);
                    break;
                case 5:
                    Metodos.potencia(scanner);
                    break;
            }
        } while(opcao != 6);


    }
}
