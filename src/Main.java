import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artik = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) artik = true;
                else artik = false;
            } else artik = true;
        } else artik = false;

        if (artik) System.out.println(yil + " bir artık yıldır !");
        else
            System.out.println(yil + " bir artık yıl değildir !");
    }
}