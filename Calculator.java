import java.util.Scanner;

public class Calculator{



    public static void main(String[] args)
    {
        int first;
        int second;
        char sign;
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        first = scan.nextInt();
        System.out.println("Podaj drugą liczbę:");
        second = scan.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");
        System.out.println("Operacaja modulo - wciśnij %");

        sign = scan.next().charAt(0);
        switch(sign)
        {
            case '+':
            {
                System.out.println(first + second);
                break;
            }
            case '-':
            {
                System.out.println(first - second);
                break;
            }
            case '*':
            {
                System.out.println(first * second);
                break;
            }
            case '/':
            {
                if(second !=0)
                {
                    System.out.println(first / second + "oraz reszty: " +
                            first % second);
                }
                else
                {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }
            case '%':
            {
                if(second !=0)
                {
                    System.out.println(first % second);
                }
                else
                {
                    System.out.println("Nie dzielimy przez zero!!");
                }
            }

        }

    }
}