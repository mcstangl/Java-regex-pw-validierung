import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidPassword = false;

        while (!isValidPassword) {

            System.out.print("Bitte geben Sie ein Passwort ein: ");
            String password = scanner.nextLine();


            if (Password.validate(password)) {
                System.out.println("Ihr Passwort ist gültig");
                isValidPassword = true;
            }
            else {
                System.out.println("Passwort ist nicht gültig!");
            }

        }


    }
}
