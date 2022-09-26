import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double alan, cevre, u, alaninKaresi;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarın Değerini Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarın Değerini Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarın Değerini Giriniz : ");
        c = input.nextInt();

        cevre = (a+b+c);
        u = (cevre / 2);
        alaninKaresi= u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alaninKaresi);
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);
    }
}
//Egecan Ör