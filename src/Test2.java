import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny wyraz:");
        String wyraz = scanner.nextLine();

        System.out.println("Długość podanego wyrazu wynosi: " + wyraz.length());

    }
}
