import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        /**
         * int resultado = funcionEjemplo(20, 45);
         * System.out.println("El resultado de la llamada a la funcion" + resultado);
         * Math.sqrt(75);
         */

        System.out.println("Juanfran");
        System.out.println("la nota media del trimeste es:");
        double nota = 5.25;
        double nota1 = 7.85;
        double nota2 = 3.4;
        double suma = nota + nota1 + nota2;
        double media = suma /= 3;
        int puntoportrabajo = 1;
        double suma1 = media + puntoportrabajo;
        /** double media = notamedia (5.25,7.85,3.4) */
        System.out.println("nota final es:" + suma1);
        multiplicaciondesplazamiento(2);
        division(10, 5);
        numeroMasGrande();
    }

    /**
     * calcula una media con tres notas y suma 1
     * 
     * @param nota  -double- la nota, para operar la media
     * @param nota1 -double- la nota, para operar la media
     * @param nota2 -double- la nota, para operar la media
     * @param suma1 -double- resultado de la media mas 1 punto por trabo realizado
     * @return la media de las 3 notas mas 1 punto por trabajo, nota final.
     */
    public static double notamedia(double nota, double nota1, double nota2, double suma1) {
        double notamedia = ((nota + nota1 + nota2) / 3) + 1;
        return notamedia;
        /** return ((nota + nota1 + nota2)/3) + 1; */
    }

    /**
     * es una multiplicacion por desplazamiento de bits
     * 
     * @param numero es el numero que se le asigan
     * @return es el resultado de la operacion
     */
    public static int multiplicaciondesplazamiento(int numero) throws Exception {
        System.out.println("Dame un numero:");
        Scanner sc = new Scanner(System.in);
        int resultado = numero << 1;  sc.close();
        System.out.println("el doble del numeros es :" + resultado);
        return resultado;
     
    } 

    /**
     * es una division
     * 
     * @param n1 el numero que se asigna para la operacion
     * @param n2 el numero que se asigna para la operacion
     * @return el resultado de la operacion
     */
    public static String division(int n1, int n2) {
        return "" + n1 / n2 + "-" + n1 % n2;
    }

    /**
     * el numero mas grande que exista
     * 
     * @return busca el numero mas grade y lo muestra
     */
    public static int numeroMasGrande() {
        return Integer.MAX_VALUE;
    }

    /**
     * la funcion suma los dos parametros despues suma 10 y devuelve el numero
     * 
     * @param parametroEj -int-el primer operador de la suma
     * @param parametro2  -int-el segundo operador de la suma
     * @return la suma de los 2 parametros +10
     */
    public static int funcionEjemplo(int parametroEj, int parametro2) {
        @SuppressWarnings("unused")
        int numero = (parametroEj + parametro2 + 10);
        System.out.println("esto es una funcion. El parametro vale:");

        return 1;
    }

    public static String funcionEjemplo(String parametroEj) {
        return parametroEj;
    }

}
