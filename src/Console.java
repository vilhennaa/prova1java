import java.util.Scanner;

public class Console {

    private static final Scanner scan = new Scanner(System.in);

    public static int lerInt() {
        int valor = scan.nextInt();
        scan.nextLine(); //limpeza de buffer
        return valor;
    }

    public static float lerFloat() {
        float valor = scan.nextFloat();
        scan.nextLine();
        return valor;
    }

    public static String lerString() {
        return scan.nextLine();
    }

    public static double lerDouble() {
        double valor = scan.nextDouble();
        scan.nextLine();
        return valor;
    }

}
