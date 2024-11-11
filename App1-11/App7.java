import java.util.Scanner;

public class App7 /** BUCLES */
{
    public static void main(String[] args) throws Exception {
        System.out.println(" dime a que ejercicio quieres ir: ");
        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();
        switch (menu) {
            case "1":
                int numero, cuadrado;
                System.out.println("Dame un numero: ");
                numero = sc.nextInt();

                while (numero >= 0) {
                    cuadrado = numero * numero;
                    System.out.println(numero + " es el cuadrado de " + cuadrado);
                    System.out.println("Dame otro numero: ");
                    numero = sc.nextInt();

                }
                /**
                 * do {
                 * System.out.print("Introduce un número (introduce un número negativo para
                 * salir): ");
                 * numero = sc.nextInt();
                 * 
                 * if (numero >= 0) {
                 * System.out.println("El cuadrado de " + numero + " es: " + (numero * numero));
                 * }
                 * } while (numero >= 0);
                 * 
                 * System.out.println("Has introducido un número negativo. Programa
                 * terminado.");
                 */
                /**
                 * case "2":
                 * Scanner scanner = new Scanner(System.in);
                 * int numero1;
                 * int suma = 0;
                 * int contador = 0;
                 * 
                 * // Ciclo que se repite hasta que se introduce un número negativo
                 * do {
                 * System.out.print("Introduce un número (introduce un número negativo para
                 * salir): ");
                 * numero1 = scanner.nextInt();
                 * 
                 * if (numero1 >= 0) {
                 * suma += numero1;
                 * contador++;
                 * }
                 * } while (numero1 >= 0);
                 * 
                 * if (contador > 0) {
                 * double media = (double) suma / contador;
                 * System.out.println("La media de los números introducidos es: " + media);
                 * } else {
                 * System.out.println("No se introdujeron números válidos.");
                 * }
                 */
            case "2":
                System.out.println("Dame un numero");
                int numeroneg = sc.nextInt();
                int total = 0;
                int contador = 0;

                while (numeroneg >= 0) {
                    total = total + numeroneg;
                    contador = contador + 1;
                    System.out.println("Dame otro numero");
                    numeroneg = sc.nextInt();
                }

                System.out.println("La media es :" + (total / contador));

            case "3":
                int x = 100;

                while (x > 0) {
                    System.out.println("El numero resultante es :" + x);
                    x = x - 7;
                }

            case "4":

                int contadoruno = 0;
                int numerosintroducidos = 0;
                int sumanumintro = 1;

                while (numerosintroducidos < 10) {

                    if (contadoruno % 2 != 0) {
                        System.out.println("Este numero es impar: " + contadoruno);
                        numerosintroducidos++;
                        sumanumintro = sumanumintro * contadoruno;
                    }
                    contadoruno++;
                }
                System.out.println("El resultado de la multiplicacion es : " + sumanumintro);

            case "5":

                int sumaPositivos = 0, sumaNegativos = 0, cantidadCeros = 0, cantidadPositivos = 0,
                        cantidadNegativos = 0;

                for (int contadordos = 0; contadordos < 10; contadordos++) {
                    System.out.println("Dame un numero : ");
                    int p = sc.nextInt();

                    if (p > 0) {
                        sumaPositivos = sumaPositivos + p;
                        cantidadPositivos++;
                    } else if (p < 0) {
                        sumaNegativos = sumaNegativos + p;
                        cantidadNegativos++;
                    } else {
                        cantidadCeros++;
                    }
                }
                if (cantidadPositivos > 0)
                    System.out.println("La media de numeros positivos es " + (sumaPositivos / cantidadPositivos));
                if (cantidadNegativos > 0)
                    System.out.println("La media de los numeros negativos es " + (sumaNegativos / cantidadNegativos));
                System.out.println("La cantidad de ceros es: " + cantidadCeros);

            case "6":

                System.out.println("Dame un numero entre 0 y 10");
                int numerotabla = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numerotabla + " x " + i + " = " + (numerotabla * i));
                }

            case "7":

                System.out.print("¿Cuántos sueldos desea ingresar?: ");
                int sueldos = sc.nextInt();
                double sueldoMaximo = Double.MIN_VALUE;

                for (int y = 0; y < sueldos; y++) {
                    System.out.print("Ingrese el sueldo " + (y + 1) + ": ");
                    double sueldo = sc.nextDouble();

                    if (sueldo > sueldoMaximo) {
                        sueldoMaximo = sueldo;
                    }
                }
                System.out.println("El sueldo máximo es: " + sueldoMaximo);

            case "8":
                int numeroa = 0;
                int numerob = 100;

                while (numeroa != numerob) {
                    System.out.println("Introduce numero: ");
                    numeroa = sc.nextInt();

                    if (numeroa < numerob) {
                        System.out.println("El numero es menor");
                    } else if (numeroa > numerob) {
                        System.out.println("El numero es mayor");
                    }
                }
                System.out.println("El numero es correcto");

            case "9":

                System.out.println("Dame un numero");
                int numerop = sc.nextInt();

                if (numerop <= 1) {
                    System.out.println("Este numero no es primo");
                } else {
                    boolean esPrimo = true;
                    for (int i = 2; i < numerop; i++) {
                        if (numerop % i == 0) {
                            esPrimo = false;
                        }
                    }
                    if (esPrimo) {
                        System.out.println("Este numero es primo");
                    } else {
                        System.out.println("Este numero no es primo");
                    }
                }
            case "10":
                int COMBINACION_CORRECTA = 1313;
                int MAX_INTENTOS = 4;
                boolean cajaAbierta = false;

                while (MAX_INTENTOS > 0 && !cajaAbierta) {
                    System.out.print("Introduce la combinación de 4 cifras: ");
                    int combinacionIngresada = sc.nextInt();

                    if (combinacionIngresada == COMBINACION_CORRECTA) {
                        System.out.println("¡Has abierto la caja fuerte!");
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

    }
}
