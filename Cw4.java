import java.util.Scanner;

public class Cw4 {
    public static void main(String[] args) {
        System.out.println("Wpisz 5 liczb całkowitych");
        //czy do kazdej liczby/Stringa musi byc nowy System in?
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        int anser = scan.nextInt();
        int anser1 = scan2.nextInt();
        int anser2 = scan3.nextInt();
        int anser3 = scan4.nextInt();
        int anser4 = scan5.nextInt();

        int[] tab = {anser,anser1,anser2,anser3,anser4};
        int dlugosc = tab.length;
        int max = tab[0];
        for (int i = 0; i < dlugosc; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println("Największa liczba to "+max);
    }
}
       /* if(anser>=anser1) {
            System.out.println(anser);
        }
          else if(anser2>anser) {
            System.out.println(anser2);
        }
          else  if(anser3>anser2) {
            System.out.println(anser3);
        }
          else if (anser4>anser3){
                        System.out.println("Ta liczba jest najwieksza"+anser4);
                    }
                }
            }

*/