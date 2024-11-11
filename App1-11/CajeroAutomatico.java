import java.util.Scanner;

public class CajeroAutomatico {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println(" dime a que ejercicio quieres ir: ");
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;
        double totalIngresado = 0.0;
        double totalRetirado = 0.0;
        int numIngresos = 0;
        int numRetiros = 0;
        int opcion;
        do {
            System.out.println(" -----------------------------");
            System.out.println("|   ***CAJERO AUTOMATICO***   |");
            System.out.println("|_____________________________|");
            System.out.println("|    1. Consultar saldo.      |");
            System.out.println("|    2. Depositar dinero.     |");
            System.out.println("|    3. Retirar dinero.       |");
            System.out.println("|    4. Salir                 |");
            System.out.println(" -----------------------------");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Saldo actual: " + saldo + " $");
                    break;
                case 2:
                    System.out.println("2.Numero de Ingresos realizados: " + numIngresos);
                    System.out.println("Dinero a ingresar: ");
                    double ingresado = sc.nextDouble();
                    if (ingresado > 0) {
                        saldo += ingresado;
                        totalIngresado += ingresado;
                        numIngresos++;
                        System.out.println("Ingreso realizado. Saldo: " + saldo + " $");
                    } else {
                        System.out.println("Error la cantidad debe ser mayor de 0 $.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro < saldo) {
                        saldo -= retiro;
                        totalRetirado += retiro;
                        numRetiros++;
                        System.out.println("Dinero retirado corectamente. Saldo: " + saldo + "$");
                    } else if (retiro < 0) {
                        System.out.println("Error: la cantidad debe ser mayor de 0 $.");
                    } else {
                        System.out.println("Error: Saldo insuficiente. ");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico. ¡Hasta pronto!");
                    System.out.println("---------Resumen de las operaciones----------");
                    System.out.println("     Total Ingresado:    " + totalIngresado + "$");
                    System.out.println("     Número de Ingresos: " + numIngresos);
                    System.out.println("     Total retirado:     " + totalRetirado + "$");
                    System.out.println("     Número de retiros:  " + numRetiros);
                    System.out.println("     Saldo final:        " + saldo + "$");
                    System.out.println("---------------------------------------------");
                    break;
                default:
                    System.out.println(" Opción no válida. Por favor, intente de nuevo. ");
            }
            System.out.println();

        } while (opcion != 4);
        sc.close();
    }
}