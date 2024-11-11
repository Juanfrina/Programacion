import java.util.Scanner;
import java.util.Random;

public class App9 {
    public static Scanner sc = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println(" dime a que ejercicio quieres ir: ");
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            switch (sc.nextInt()) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                default -> seguir = false;
            }

        }
        sc.close();
    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("dame otro numero: ");
        int numero2 = sc.nextInt();
        esMultiplo(numero1, numero2);
        sc.close();
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        if (numero1 % numero2 == 0) {
            System.out.println("el numero " + numero1 + " es multiplo de " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " no es multiplo de " + numero2);
        }
        return numero1 % numero2 == 0;
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero de dias quieres ver la temperatura: ");
        int numeroDias = sc.nextInt();
        for (int i = 1; i <= numeroDias; i++) {
            System.out.println("---dia " + i + "---");
            System.out.println("Dame la temperatura minima: ");
            double temperaturaMinima = sc.nextDouble();
            System.out.println("Dame la temperatura maxima: ");
            double temperaturaMaxima = sc.nextDouble();

            System.out.println("La temperatura media es: " + temperaturaMedia(temperaturaMaxima, temperaturaMinima));
        }
        sc.close();
    }

    public static double temperaturaMedia(double temperaturaMaxima, double temperaturaMinima) {
        double temperaturaMedia = ((temperaturaMinima + temperaturaMaxima) / 2);
        return temperaturaMedia;
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = sc.nextLine();
        String textoConEspacios = convertirEspaciado(texto);
        System.out.println("Texto convertido: " + textoConEspacios);
        sc.close();
    }

    public static String convertirEspaciado(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                resultado = resultado + texto.charAt(i) + " ";
            }
        }
        if (texto.length() > 0) {
            resultado += texto.charAt(texto.length() - 1);
        }
        return resultado;
    }

    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        double r = sc.nextInt();
        double area = calculoArea(r);
        System.out.println("El area del círculo con radio " + r + " es: " + area);

        System.out.println("Introduce el radio de la circunferencia: ");
        double radio2 = sc.nextInt();
        double longitud = perimetro(r);
        System.out.println("La longitud de la circunferencia con radio " + radio2 + " es: " + longitud);
        sc.close();
    }

    public static double calculoArea(double radio) {
        double resultado = Math.PI * Math.pow(radio, 2);
        return resultado;
    }

    public static double perimetro(double radio) {
        double perime = 2 * Math.PI * radio;
        return perime;
    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int MAX_INTENTOS = 3;
        boolean cajaAbierta = false;

        while (MAX_INTENTOS > 0 && !cajaAbierta) {
            System.out.println("Introduce el usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            String contrasena = sc.nextLine();

            if (usuarioycontrasena(usuario, contrasena)) {
                System.out.println("¡Has abierto la sesion!");
                cajaAbierta = true;

            } else {
                MAX_INTENTOS--;
                if (4 < MAX_INTENTOS) {
                    System.out.println("Clave incorrecta. Te quedan " + (MAX_INTENTOS) + " intento(s).");
                } else {
                    System.out.println("Lo siento, te quedan " + MAX_INTENTOS + " oportunidades.");
                }
            }
        }
        sc.close();
    }

    public static boolean usuarioycontrasena(String usuario, String contrasena) {
        String usuarioCorrecto = "usuario1";
        String COMBINACION_CORRECTA = "asdasd";
        boolean usuarioycontrasena = usuario.equals(usuarioCorrecto) && contrasena.equals(COMBINACION_CORRECTA);
        return usuarioycontrasena;

    }

    public static void ejercicio6() {

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("MCD: " + calcularMCD(num1, num2));
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void ejercicio7() {

        int opcion;
        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir a horas, minutos y segundos");
        System.out.println("2. Convertir a segundos");
        System.out.println("3. Salir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ejercicio8();
                break;
            case 2:
                ejercicio9();
                break;
            case 3:
                System.out.println("Salir del programa...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }

    public static void ejercicio8() {

        System.out.println("Dame una hora (0-23): ");
        int hora = sc.nextInt();
        System.out.println("Dame unos minutos (0-59): ");
        int minutos = sc.nextInt();
        System.out.println("Dame unos segundos (0-59): ");
        int segundos = sc.nextInt();
        int segundosc = calcularSegundos(hora, minutos, segundos);
        System.out.println("Las " + hora + " horas, " + minutos + " minutos y " + segundos + " segundos son "
                + segundosc + " segundos.");
    }

    public static void ejercicio9() {

        System.out.println("Dame una cantidad de segundos: ");
        int totalSegundos = sc.nextInt();
        String tiempo = convertirSegundos(totalSegundos);
        System.out.println(tiempo);
    }

    public static int calcularSegundos(int hora, int minutos, int segundos) {
        int segundosc = (hora * 3600) + (minutos * 60) + segundos;
        return segundosc;
    }

    public static String convertirSegundos(int totalSegundos) {
        int shoras = totalSegundos / 3600;
        int sminutos = (totalSegundos % 3600) / 60;
        int ssegundos = totalSegundos % 60;
        String cadena = "La cantidad de segundos " + totalSegundos + " es " + shoras + " horas, " + sminutos
                + " minutos y " + ssegundos + " segundos.";
        return cadena;
    }
}
