import java.util.Scanner;
import java.util.Random;

public class App8 {
    public static final Random random = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println(" dime a que ejercicio quieres ir: ");
        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();
        switch (menu) {
            case "1":
                int horas;
                int minutos;
                int segundos;
                for (horas = 0; horas < 24; horas++) {
                    for (minutos = 0; minutos < 60; minutos++) {
                        for (segundos = 0; segundos < 60; segundos++) {
                            System.out.println(horas + ":" + minutos + ":" + segundos);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
                break;
            case "2":
                System.out.println("Introduce la base (numero real): ");
                double base = sc.nextDouble();
                System.out.println("Introduce el exponente (entero positivo): ");
                int exponente = sc.nextInt();
                if (exponente < 0) {
                    System.out.println("El exponente debe ser un numero entero positivo.");
                } else {
                    double resultado = 1.0;
                    for (int i = 0; i < exponente; i++) {
                        resultado *= base;
                    }
                    System.out.println("Resultado: " + resultado);
                }break;
            case "3":
                // Pedir al usuario que ingrese una frase
                System.out.println("Introduce una frase: ");
                String frase = sc.nextLine();

                // Recorrer cada carácter de la frase y mostrarlo en una línea distinta
                for (int i = 0; i < frase.length(); i++) {
                    System.out.println(frase.charAt(i));
                }break;
            case "4":
                // Variables para almacenar los límites del intervalo
                int limiteInferior, limiteSuperior;

                // Pedir límites del intervalo, asegurándonos que el inferior es menor que el
                // superior
                do {
                    System.out.print("Introduce el límite inferior: ");
                    limiteInferior = sc.nextInt();

                    System.out.print("Introduce el límite superior: ");
                    limiteSuperior = sc.nextInt();

                    if (limiteInferior >= limiteSuperior) {
                        System.out.println(
                                "El límite inferior debe ser menor que el límite superior. Vuelve a intentarlo.");
                    }
                } while (limiteInferior >= limiteSuperior);

                // Variables para las estadísticas
                int sumaDentroIntervalo = 0;
                int numerosFueraIntervalo = 0;
                boolean limiteInferiorIntroducido = false;
                boolean limiteSuperiorIntroducido = false;
                int numero;
                // Bucle para introducir números hasta que se introduzca un 0
                do {
                    System.out.print("Introduce un número (0 para salir): ");
                    numero = sc.nextInt();

                    if (numero == 0) {
                        break; // Salir del bucle si se introduce 0
                    }

                    // Comprobar si el número está en los límites
                    if (numero > limiteInferior && numero < limiteSuperior) {
                        sumaDentroIntervalo += numero;
                    } else {
                        numerosFueraIntervalo++;
                    }

                    // Comprobar si el número es igual a los límites del intervalo
                    if (numero == limiteInferior) {
                        limiteInferiorIntroducido = true;
                    }
                    if (numero == limiteSuperior) {
                        limiteSuperiorIntroducido = true;
                    }

                } while (numero != 0);

                // Resultados
                System.out.println("Suma de los números dentro del intervalo: " + sumaDentroIntervalo);
                System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);

                if (limiteInferiorIntroducido) {
                    System.out.println("Se ha introducido el límite inferior.");
                }
                if (limiteSuperiorIntroducido) {
                    System.out.println("Se ha introducido el límite superior.");
                }break;
            case "5":
                Random random = new Random();
                // Generar un número aleatorio entre 1 y 100
                int numeroAdivinar = random.nextInt(100) + 1;
                int intentosRestantes = 10;
                boolean acertado = false;

                System.out.println("¡Bienvenido al juego de adivinar el número!");
                System.out.println("He generado un número entre 1 y 100. ¡Tienes 10 intentos para adivinarlo!");

                // Bucle de juego
                while (intentosRestantes > 0 && !acertado) {
                    System.out.println("Introduce tu número: ");
                    int numeroUsuario = sc.nextInt();
                    intentosRestantes--;

                    if (numeroUsuario == numeroAdivinar) {
                        acertado = true;
                        System.out.println(
                                "¡Felicidades! Has acertado el número " + (10 - intentosRestantes) + " de intentos.");
                    } else if (numeroUsuario < numeroAdivinar) {
                        System.out.println("El número es mayor. Te quedan " + intentosRestantes + " intentos.");
                    } else {
                        System.out.println("El número es menor. Te quedan " + intentosRestantes + " intentos.");
                    }
                }
                // Si no se ha acertado el número
                if (!acertado) {
                    System.out.println("Lo siento, no has acertado. El número era: " + numeroAdivinar);
                }
                sc.close();
        }
    }
}
