import java.util.Scanner;
public class switch_case {




    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);

        System.out.println("Ingrese el caso a escanear: ");
        int dia = lector.nextInt();

        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero de dia invalidio");




        }
    }

}

