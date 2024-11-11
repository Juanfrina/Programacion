import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);

        String passwordCorrecta = "130989";
        System.out.println("Introduce tu contraseña: ");
        String passwordIngresada = scanner.nextLine();
        if(passwordIngresada.equals(passwordCorrecta))
        {System.out.println("Acceso concedido.");}
        else {System.out.println("Contraseña incorrecta. Intentar de nuevo");};
        /**System.out.println(passwordIngresada.equals(passwordCorrecta));*/


        System.out.print("Introduce una frase:");
        String frase = scanner.nextLine();
        int longitud = frase.length();
        char primeraLetra = frase.charAt(0);
        char ultimaLetra = frase.charAt(longitud - 1);
        System.out.println("Longitud de la frase: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);

        String frase1 = "Hola amigo ¿cómo estás?";
        System.out.println("Frase:" + frase1);
        String substring = frase1.substring(5,10);
        /**int posicion = frase1.indexOf("amigo");
        String substring2 = frase1.substring(posicion, posicion+5);*/
        System.out.println("Substring: " + substring);


        scanner.close();
    }
}