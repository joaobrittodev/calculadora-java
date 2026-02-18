package ved.ottirboaoj.calculator;

import java.util.Scanner;

public class Metodos {
    Scanner scanner = new Scanner(System.in);
    public static void menu() {

        System.out.println("-----CALCULADORA-----");
        System.out.println("1- Somar");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Elevar um número a uma potência");
        System.out.println("6- Sair da calculadora");
        System.out.println("_________________________");
    }

    public static void soma(Scanner scanner){
        System.out.println("Digite o primeiro numero que deseja somar: ");
        Double numero = scanner.nextDouble();

        System.out.println("Digite outro numero para somar: ");
        Double numero2 = scanner.nextDouble();

        Double soma = numero + numero2;
        System.out.println(soma);
    }
    public static void subtracao(Scanner scanner){
        System.out.println("Digite o primeiro numero que deseja subtrair: ");
        Double numero = scanner.nextDouble();

        System.out.println("Digite outro numero para subtrair: ");
        Double numero2 = scanner.nextDouble();

        Double subtracao = numero - numero2;
        System.out.println(subtracao);
    }

    public static void multiplicacao(Scanner scanner){
        System.out.println("Digite o primeiro numero que deseja multiplicar: ");
        Double numero = scanner.nextDouble();

        System.out.println("Digite outro numero para multiplicar: ");
        Double numero2 = scanner.nextDouble();

        Double multiplicacao = numero * numero2;
        System.out.println(multiplicacao);
    }

    public static void divisao(Scanner scanner){
        System.out.println("Digite o primeiro numero que deseja dividir: ");
        Double numero = scanner.nextDouble();

        System.out.println("Digite outro numero para dividir: ");
        Double numero2 = scanner.nextDouble();

        Double divisao = numero / numero2;
        Double resto = numero % numero2;
        System.out.println("O valor da divisão é: " + divisao);
        System.out.println("O resto da divisão é: " + resto);
    }

    public static void potencia(Scanner scanner){

    }
}
