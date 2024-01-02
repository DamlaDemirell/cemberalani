import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz:");
        int yaricap = input.nextInt();
        int pi = 3;
        int cevre = 2*pi*yaricap;
        System.out.print("Cember cevresi :" + cevre);
    }
}