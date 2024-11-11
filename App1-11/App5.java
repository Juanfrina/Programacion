import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(" dime a que ejercicio quieres ir: ");
        String menu = sc.nextLine();
        switch (menu) {
        case "1":
        System.out.println(" dame un numero: ");
        int numero = sc.nextInt();
        if (numero % 3 == 0) {
            System.out.println(numero + " es multiplo de 3 ");

        } else {
            System.out.println(numero + " no es multiplo de 3 ");
        }
        case "2":
        System.out.println(" dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println(" dame el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println(" dame el tercer numero: ");
        int num3 = sc.nextInt();
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println(" El mayor de los tres numeros es: " + mayor);
        case "3":
        System.out.println(" dame la Hora (H): ");
        int H = sc.nextInt();
        System.out.println(" dame los Minutos (M): ");
        int M = sc.nextInt();
        System.out.println(" dame los Segundos (S): ");
        int S = sc.nextInt();
        if ((H >= 0 && H < 24) && (M >= 0 && M < 60) && (S >= 0 && S < 60)) {
            System.out.println(" la Hora " + H + ":" + M + ":" + S + " es corecta.");
        } else {
            System.out.println(" la Hora " + H + ":" + M + ":" + S + " no es correcta.");
        }
        case "4":
        System.out.println(" Dame un numero del mes (1-12): ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println(" El numero no es valido, Debe estar entre 1 y 12.");
        } else {
            String nombreMes = "";
            int dias = 0;

            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    dias = 31;
                    break;
                case 2:
                    nombreMes = "Febrero";
                    dias = 28;
                    break;
                case 3:
                    nombreMes = "Marzo";
                    dias = 31;
                    break;
                case 4:
                    nombreMes = "Abril";
                    dias = 30;
                    break;
                case 5:
                    nombreMes = "Mayo";
                    dias = 31;
                    break;
                case 6:
                    nombreMes = "Junio";
                    dias = 30;
                    break;
                case 7:
                    nombreMes = "Julio";
                    dias = 31;
                    break;
                case 8:
                    nombreMes = "Agosto";
                    dias = 31;
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    dias = 30;
                    break;
                case 10:
                    nombreMes = "Octubre";
                    dias = 31;
                    break;
                case 11:
                    nombreMes = "Nomviembre";
                    dias = 30;
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    dias = 31;
                    break;
            }
            System.out.println(" El mes de " + nombreMes + " tiene " + dias + " dias.");
        }
        case "5":
        double nota1, nota2, nota3;
        System.out.println(" Dame la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.println(" Dame la segunda  nota: ");
        nota2 = sc.nextDouble();
        System.out.println(" Dame la tercera nota: ");
        nota3 = sc.nextDouble();
        double notamedia = ((nota1 + nota2 + nota3) / 3);
        System.out.println("nota final es:" + notamedia);
        if (notamedia >= 5 && notamedia <= 10) {
            System.out.println("esta aprobado con:" + notamedia);
        } else {
            System.out.println("esta suspendido con: " + notamedia);
        }
        if (nota1 >= 5 && nota1 <= 10) {
        System.out.println("nota1 aprobado con:" + nota1);
         } else {
        System.out.println("nota1 suspendido con: " + nota1);    
         }     
         if (nota2 >= 5 && nota2 <= 10) {
        System.out.println("nota2 aprobado con:" + nota2);
        } else {
         System.out.println("nota2 suspendido con: " + nota2); 
        } 
        if (nota3 >= 5 && nota3 <= 10) {
         System.out.println("nota3 aprobado con:" + nota3);
        } else {
         System.out.println("nota3 suspendido con: " + nota3);
        }
        case "6":
        System.out.println(" Dame las horas trabajadas este mes: ");  
        int horasTrabajadas = sc.nextInt();
        if (horasTrabajadas <= 150) 
        System.out.println("tu sueldo es: " + (horasTrabajadas * 10) + "E");
          else {
        System.out.println(" tu sueldo es: " + (((horasTrabajadas - 150) * 20) + 1500) + "E");
        }
        case "7":
        System.out.println("dame un numero: ");
        int entero = sc.nextInt();
        if (entero % 2 == 0){
        System.out.println ("El numero " + entero + " es par.");}
        else {
        System.out.println("El numer es impar ");
        }
        case "8":
        System.out.println(" Dame un numero entre el (0-10): ");
        int letra = sc.nextInt();
        switch (letra) {
            case 0: System.out.println("el cero tiene cuatro letras.");
            break;
            case 1: System.out.println("el uno tiene tres letras");
            break;
            case 2: System.out.println("el dos tiene tres letras");
            break;
            case 3: System.out.println("el tres tiene cuatro letras");
            break;
            case 4: System.out.println("el cuatro tiene seis letras");
            break;
            case 5: System.out.println("el cinco tiene cinco letras.");
            break;
            case 6: System.out.println("el seis tiene cuatro letras");
            break;
            case 7: System.out.println("el siete tiene cinco letras");
            break;
            case 8: System.out.println("el ocho tiene cuatro letras");
            break;
            case 9: System.out.println("el nueve tiene cinco letras");
            break;
            case 10:System.out.println("el diez tiene cuatro letras");
        }
        case "9":
        System.out.println(" Dame un numero entre el (0-10): ");
        String letranumero = sc.nextLine();
        switch (letranumero) {
            case "cero": System.out.println("0");
            break;
            case "uno": System.out.println("1");
            break;
            case "dos": System.out.println("2");
            break;
            case "tres": System.out.println("3");
            break;
            case "cuatro": System.out.println("4");
            break;
            case "cinco": System.out.println("5");
            break;
            case "seis": System.out.println("6");
            break;
            case "siete": System.out.println("7");
            break;
            case "ocho": System.out.println("8");
            break;
            case "nueve": System.out.println("9");
            break;
            case "diez":System.out.println("10");
        }
        case "10":
        System.out.println(" Dame un año y te dire si es bisiesto: ");
        int numeroBisiesto = sc.nextInt();
        if (numeroBisiesto %4==0 && numeroBisiesto %100 !=0)
        System.out.println(" Este año es bisiesto ");
        else{
        System.out.println(" Este año no es bisiesto ");
        if (numeroBisiesto >=0);
        System.out.println("ERROR");
        }

        sc.close();
    }
    }

}