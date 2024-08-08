import java.util.Scanner;

public class TallerAbc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        while (true) {
            // Introducir valores diferentes
            System.out.print("Introduce el valor de a: ");
            a = scanner.nextInt();

            System.out.print("Introduce el valor de b: ");
            b = scanner.nextInt();

            System.out.print("Introduce el valor de c: ");
            c = scanner.nextInt();


            if (a != b && a != c && b != c) {
                break;
            } else {
                System.out.println("Los Valores son iguales introduzca valores diferentes.");
            }
        }

        int mayor, menor;

        if (a > b && a > c) {
            mayor = a;
        } else if (b > a && b > c) {
            mayor = b;
        } else {
            mayor = c;
        }

        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);

    }
}

