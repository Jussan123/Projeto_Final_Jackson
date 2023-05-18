import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("=== LISTA DE EXERCÍCIOS: ===");

        System.out.println("+-----------------+");
        System.out.println("| 1 - Lista 1     |");
        System.out.println("| 2 - Lista 2     |");
        System.out.println("| 3 - Lista 3     |");
        System.out.println("| 4 - Lista 4     |");
        System.out.println("| 5 - Lista 5     |");
        System.out.println("| 6 - Lista Extra |");
        System.out.println("+-----------------+");

        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // Lista 1
            case 1:
                ExercicioUm.call(scanner);
                break;
            // Lista 2
            case 2:
                ExercicioDois.call(scanner);
                break;
            // Lista 3
            case 3:
                ExercicioTres.call(scanner);
                break;
            // Lista 4
            case 4:
                ExercicioQuatro.call(scanner);
                break;
            // Lista 5
            case 5:
                ExercicioCinco.call(scanner);
                break;
            // Lista Extra
            case 6:
                ExercicioExtra.call(scanner);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        scanner.close();
    }


}