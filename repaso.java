import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        int sumaPrimos = 0;

        // Validación de entrada
        if (numero < 2) {
            System.out.println("No hay números primos menores que 2.");
        } else {
            // Sumar todos los números primos hasta el número ingresado
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    sumaPrimos += i;
                }
            }
            System.out.println("La suma de todos los números primos hasta " + numero + " es: " + sumaPrimos);
        }

        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
