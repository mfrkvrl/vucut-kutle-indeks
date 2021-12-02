import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=scanner.nextDouble();
        double index=(kilo/(boy*boy));
        System.out.println("Vücut kütle indeksiniz : " + index);
    }
}
