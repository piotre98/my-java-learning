import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.print("Pies");
        //System.out.print("Okrutnik");

        int x; //declaration

        x = 123; //assignment

        int y = 123; //initialization

        float z = 3.14f; //"f" at the end for float

        double c = 3.14; //double doesnt need f or d at the end

        Scanner scanner = new Scanner(System.in);

        System.out.println("Papieżu, jak masz na imię? ");
        String name = scanner.nextLine();
        System.out.println("A czy papież lubi zęby myć? ");
        boolean trueorfalse = scanner.nextBoolean();

        System.out.println("Witaj " +name);
        System.out.println("Czy papież lubi zęby myć? Odpowiedź: " +trueorfalse);

    }
}