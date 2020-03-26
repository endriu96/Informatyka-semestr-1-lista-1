import java.util.Scanner;
public class Cw3 {
    public static void main(String[]args){
        System.out.println("Podaj trzy liczby całkowite ");
        Scanner scan=new Scanner(System.in);
        int liczba1=scan.nextInt();
        int liczba2=scan.nextInt();
        int liczba3=scan.nextInt();

        System.out.println(Math.max(liczba1,Math.max(liczba2,liczba3)));
        System.out.println(Math.min(liczba1,Math.min(liczba2,liczba3)));
        System.out.println("Najwieksza liczba to "+Math.max(liczba1,Math.max(liczba2,liczba3)));
        System.out.println("Najmniejsza liczba to "+Math.min(liczba1,Math.min(liczba2,liczba3)));
    }


}
