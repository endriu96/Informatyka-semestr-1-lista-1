import java.util.Scanner;

public class  InstallmentsCounting{

    public static void main(String[] args) {
        String info = "Podaj cene towaru w zakresie od 1000 zł do 50000 zł";
        System.out.println(info);

        Scanner scan = new Scanner(System.in);
        int priceOfCommodity = scan.nextInt();
        if (priceOfCommodity <= 1000) {
            System.out.println(info);
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe rat w zakresie od 1 do 48");
        int numberOfInstallments= scan1.nextInt();
        double interest1 = 3.0 / 100.0;
        double interest2 = 6.0 / 100.0;
        double interest3 = 10.0 / 100.0;

        if (numberOfInstallments >= 1 && numberOfInstallments <= 12) {
            System.out.println("Twoja rata wynosi= " + priceOfCommodity / numberOfInstallments * (1 + interest1));
        } else if ( numberOfInstallments > 12 && numberOfInstallments  <= 24) {
            System.out.println("Twoja rata wynosi= " + priceOfCommodity / numberOfInstallments * (1 + interest2));

        } else if (numberOfInstallments  > 24 && numberOfInstallments  <= 48) {
            System.out.println("Twoja rata wynosi= " + priceOfCommodity / numberOfInstallments * (1 + interest3));
        }


    }
}

