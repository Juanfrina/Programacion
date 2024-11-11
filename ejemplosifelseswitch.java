import java.util.Scanner;

public class ejemplosifelseswitch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        switch (numero) {
            case 1->System.out.println("sacar dinero");
            case 2->System.out.println("Ingreso");
            case 3->System.out.println("Transferencia");
            case 4->System.out.println("cerrar cuenta");
            default->System.out.println("eleccion incorrecta");
        } sc.close();

        if (numero > 3 && numero < -5){
        /** ((numero > 3 || numero <-5) && numero % 2==0)*/
        System.out.println("Esto es si cumple la condicion");
        }
        else if (numero <3){
            System.out.println("Numero pequeño");
        }
        else {System.out.println("Esto es si cumple la condicion");
    }
        /**int numero = Integer.parseInt(sc.nextLine()); */
    }
}
