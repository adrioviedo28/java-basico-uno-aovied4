import java.util.Scanner;

public class NotaSwitch {

    public static void main(String[] args) {

        Scanner IngreseNota = new Scanner(System.in);
        System.out.println("Digite Nota");
        int nota = IngreseNota.nextInt();

        switch (nota){

            case 1, 2:{
                System.out.println("Su calificación es: F");
                break;
            }
            case 3, 4:{
                System.out.println("Su calificación es: D");
                break;
            }
            case 6, 5:{
                System.out.println("Su calificación es: C");
                break;
            }
            case 8, 7:{
                System.out.println("Su calificación es: B");
                break;
            }
            case 10, 9:{
                System.out.println("Su calificación es: A");
                break;
            }
            default:{
                System.out.println("Número no válido, por favor verifique");
            }
        }
    }
}
