import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExercicioExtra {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA EXTRA ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 01 - Palindromo                                       |");
        System.out.println("| 02 - Juros                                            |");
        System.out.println("| 03 - Fibonacci                                        |");
        System.out.println("| 04 - Inteiro para Binário                             |");
        System.out.println("| 05 - Tabuada e Sequencia                              |");
        System.out.println("| 06 - Data de Nascimento (Anos, Meses, Dias)           |");
        System.out.println("| 07 - Número Sorteado                                  |");
        System.out.println("| 08 - Pirâmide                                         |");
        System.out.println("| 09 - Sexo e Idade                                     |");
        System.out.println("| 10 - Adivinhar Número                                 |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Escreva um programa que determine se uma cadeia de caracteres é um palíndromo ou não. Um palíndromo é uma cadeia que é igual à sua inversa.
            case 1:
                // palindromo(String palavra) 
                break;
            /* 2) Um banco realiza empréstimos nas seguintes condições:
             *  * são tomados “P” reais emprestados;
             *  * “A” reais serão pagos cada mês até que o empréstimo seja quitado; 
             *  * parte do pagamento mensal serão juros, calculados como "i" por cento do saldo corrente; 
             *  * o restante será aplicado no pagamento da dívida.
             *  Escreva um programa que leia estes três valores: P, A, i e determine:
             *  * Para cada mês:
             *  a) valor em dinheiro dos juros pagos;
             *  b) valor em dinheiro aplicada no pagamento da dívida;
             *  c) valor acumulado de juros já pagos;
             *  d) valor ainda por pagar do empréstimo no fim de cada mês;
             *  * No final do programa:
             *  e) número de meses necessários para pagar o empréstimo;
             *  f) quantidade da última prestação.
             */                
            case 2:
                // juros(double p, double a, double i);
                break;
            // 3) Escreva um programa que carregue um carregue um número inteiro pelo teclado e indique se ele faz parte da sequência de Fibonacci.
            case 3:
                // isFibonacci(int number);
                break;
            // 4) Escreva um programa que leia um número inteiro e mostre a sua conversão em binário.
            case 4:
                // toBinary(int number);
                break;
            /*
             * 5) Escreva um programa que mostre um menu com as seguintes opções: 1 – Tabuada, 2 – Sequencia, 3 Sair. Ao escolher a opção 1, o usuário deve digitar um número entre 1 e 10 (nem maior, nem menor) e o programa exibirá a tabuada desse número (use um laço).
             *  Ex: 2 x 1 = 2 2 x 2 = 4...
             *  Ao escolher a opção 2, o programa pede para o usuário digitar dois valores e mostra todos os números entre eles.
             *  Ex: Digitou 5 e 15, o programa mostra: 5, 6, 7, 8, 9, 10, 11 ,12 ,13, 14, 15
             *  Ao escolher a opção 3, o programa encerra. Se escolher qualquer outra opção que não essas, mostre uma mensagem de erro “opção inválida”.
             */
            case 5:
                // tabuadaESequencia(int number);
                // tabuadaESequencia(int first, int last)
                break;
            // 6) Escreva um programa que leia a data de nascimento de uma pessoa e mostre-a expressa em dias, meses e anos.
            case 6:
                // printDataDeNascimento(Date dataNascimento);
                break;
            // 7) Escreva um programa que receba dois valores e sorteie um número entre eles.
            case 7:
                // sortNumber(int min, int max
                break;
            /*
             * 8) Escreva uma pirâmide de números conforme um número informado. Exemplo: Número 11
             *  01 <br>
             *  02 02 <br>
             *  03 03 03 <br>
             *  04 04 04 04 <br>
             *  05 05 05 05 05 <br>
             *  06 06 06 06 06 06 <br>
             *  07 07 07 07 07 07 07 <br>
             *  08 08 08 08 08 08 08 08 <br>
             *  09 09 09 09 09 09 09 09 09 <br>
             *  10 10 10 10 10 10 10 10 10 10 <br>
             *  11 11 11 11 11 11 11 11 11 11 11<br>
             */
            case 8:
                // piramid(int number);
                break;
            // 9) Escreva um programa que pergunte o sexo e a idade de uma lista indeterminada de pessoas. O usuário deverá informar a quantidade de pessoas e ao final deverá imprimir a quantidade de homens e mulheres maiores e menores de idade
            case 9:
                // countPessoas()
                break;
            // 10) Escreva um programa que sorteie um número de 0 a 100 e que permita tentar acertar este número, o programa só irá parar ao acertar. A cada tentativa, deverá exibir se o número é maior ou menor do que o informado.
            case 10:
                // sortNumber();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }
    
    public static boolean palindromo(String palavra) {
        return false;
    }

    public static ArrayList<Double[]> juros(double p, double a, double i) throws Exception {
        return new ArrayList<Double[]>();
    }

    public static boolean isFibonacci(int number) {
        return false;
    }

    public static String toBinary(int number) {
        return "";
    }

    public static void tabuadaESequencia(int number) {
        
    }

    public static void tabuadaESequencia(int first, int last) {
        
    }

    public static int[] printDataDeNascimento(Date dataNascimento) {
        return new int[3];

    }

    public static int sortNumber(int min, int max) {
        return -1;
    }

    public static void piramid(int number) {
        
    }

    public static void countPessoas() {
        
    }

    public static void sortNumber() {
        
    }
}
