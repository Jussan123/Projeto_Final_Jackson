import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ExercicioQuatro {
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 3 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Tabuada com Arquivo                               |");
        System.out.println("| 2 - Ler e imprimir arquivo de texto                   |");
        System.out.println("| 3 - Operações básicas com a Main                      |");
        System.out.println("| 4 - Exponenciação com Precisão Arbitrária             |");
        System.out.println("| 5 - Nome aleatório de 5 pessoas                       |");
        System.out.println("| 6 - Calcular Raio e Área                              |");
        System.out.println("| 7 - Avaliar se TXT tem JAVA                           |");
        System.out.println("| 8 - 10 primeiros dígitos                              |");
        System.out.println("| 9 - Área com a Main                                   |");
        System.out.println("| 10 - Receba nome de arquivo na Main com valores       |");
        System.out.println("| 11 - Ler e imprimir arquivo de texto                  |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
            case 1:
                // calculaMedia(double[] notas)
                break;
            // 2) Crie um programa que imprima um arrays com Foreach.
            case 2:
                // printArray(new String[]{ "Teste", "imprimir", "foreach" });
                break;
            // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
            case 3:
                // dezValores(double[] valores);
                break;
            // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
            case 4:
                // dezValoresInt(int[] valores);
                break;
            // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
            case 5:
                // baralho();
                break;
            // 6) Crie um programa que una duas listas de inteiros.
            case 6:
                // mergeIntList(int[] listaUm, int[] listaDois);
                break;
            // 7) Crie um programa que simule a fila de atendimento de um banco.
            case 7:
                // filaBanco();
                break;
            // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
            case 8:
                // double temperaturaMedia(double[] temperaturas);
                break;
            // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
            case 9:
                // alterarArray(int[] listaUm, int[] listaDois);
                break;
            // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
            case 10:
                // mediaVinte(int[] valores);
                break;
            // DESAFIO
            case 11:
                // detetive();
                break;
        
            default:
                System.out.println("Operação inválida");
                break;
        }
    }   

    // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
    public static double calculaMedia(double[] notas) {
        return 0;
    }
    // 2) Crie um programa que imprima um arrays com Foreach.
    public static void printArray(String[] array) {
        
    }
    // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
    public static void dezValores(double[] valores) {
        
    }
    // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
    public static void dezValoresInt(int[] valores) {
        
    }
    // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imprima elas.
    public static SortedSet<String> baralho() {
        return new TreeSet<String>();
    }
    // 6) Crie um programa que una duas listas de inteiros.
    public static Integer[] mergeIntList(int[] listaUm, int[] listaDois) {
        return new Integer[0];
    }
    // 7) Crie um programa que simule a fila de atendimento de um banco.
    public static void filaBanco() {

    }
    // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
    public static double temperaturaMedia(double[] temperaturas) {
        return 0;
    }
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
    public static int[] alternarArray(int[] listaUm, int[] listaDois) {
        return new int[20];
    }
    // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
    public static void mediaVinte(int[] valores) {
        
    }

    public static void detetive() {
        
    }
}
