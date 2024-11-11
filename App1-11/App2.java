import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame otro numero para sumar");
        int numero1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int numero2 = sc.nextInt();
        int suma = numero1+numero2;
        System.out.println("La suma de los numeros es :"+suma);

        System.out.println("Dame otro numero para restar");
        int numer1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int numer2 = sc.nextInt();
        int resta = numer1-numer2;
        System.out.println("La resta de los numeros es :"+resta);

        System.out.println("Dame un numero para multiplicar");
        int nume1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int nume2 = sc.nextInt();
        int multi = nume1*nume2;
        System.out.println("La multiplicacion de los numeros es :"+multi);

        System.out.println("Dame un numero para dividir");
        int num1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();
        int division = num1/num2;
        System.out.println("La division de los numeros es :"+division);

        System.out.println("Dame un numero para  calcular la raiz");
        int nu1 = sc.nextInt();
        double raiz=Math.sqrt(nu1);
        System.out.println("La raiz del numero de" + nu1 +"es" + raiz);

        System.out.println("Dame la base");
        int n1 = sc.nextInt();
        System.out.println("Dame el exponente");
        double exponente =sc.nextDouble();
        double resultado=Math.pow(n1,exponente);
        System.out.println("El calculo de la potencia es :"+resultado);

        System.out.println("Introduce el radio del círculo: ");
        double radio = sc.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del círculo con radio" + radio + "es: "+area);

        System.out.println("Introduce el radio de la circunferencia: ");
        double radio2 = sc.nextInt();
        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia con radio" + radio2 + "es: "+longitud);

        sc.close();


         }
    }
