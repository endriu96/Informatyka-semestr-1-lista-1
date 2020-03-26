import java.util.Scanner;

public class Cw5 {
    public static void main(String[] args) {
        System.out.println("Podaj promien kuli");
        Scanner scan = new Scanner(System.in);
        double powField = 2;
        double powVolume = 3;
        double radius = scan.nextDouble();
        while (radius <= 0) {
            System.out.println("Promien nie może być mniejszy badz rowny zero. Podaj jeszcze raz");
            radius = scan.nextDouble();

        }
        double sphereField = 4 * Math.PI * Math.pow(radius, powField);
        double volumeOfTheBall = (4 / 3) * Math.PI * Math.pow(radius, powVolume);
        System.out.println(String.format("Pole kuli wynosi %.2f", sphereField));
        System.out.println("Objetosc kuli wynosi " + volumeOfTheBall);

    }

}
