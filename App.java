//Importación de bibliotecas

                    import java.util.Scanner;
//Esto es una instrucción para importar la biblioteca Scanner que nos permite leer datos de entrada desde el teclado.

//Definición de la clase principal

                    public class EJERCICIO5 {
                        public static void main(String[] args) {
                            // código aquí
                    }
//Esto es la definición de la clase principal llamada EJERCICIO5. La palabra clave public indica que esta clase puede ser accedida desde cualquier otra parte del programa. La palabra clave static indica que el método main se ejecuta sin crear una instancia de la clase.

//Definición del método main
                    public static void main(String[] args) {
                        // código aquí
                    }
//El método main es el punto de entrada del programa. Es decir, es donde comienza a ejecutarse el programa. La palabra clave static indica que este método se puede acceder sin crear una instancia de la clase.

//Definición de un Scanner
                    Scanner scanner = new Scanner(System.in);
//Un Scanner es una herramienta que nos permite leer datos de entrada desde el teclado. En este caso, creamos un objeto llamado scanner y le pasamos como parámetro System.in, que representa la entrada estándar del sistema (es decir, el teclado).

//Bucle de selección de ejercicio
                    do {
                        // código aquí
                    } while (opcion != 0);
//Este es un bucle que se ejecuta mientras la variable opcion no sea igual a 0. Dentro del bucle se presentan las opciones para seleccionar el ejercicio y se lee la opción elegida.

//Presentación de opciones
                    System.out.println("________________________________________________________________________________________");
                    System.out.println("\n----------------------------------Menú de Ejercicios----------------------------------");
                    System.out.println("________________________________________________________________________________________\n");
//Esto es solo una forma de presentar las opciones en un formato atractivo. Puedes omitirlo si no te gusta.

//Lectura de opción
                    opcion = scanner.nextInt();
//Aquí se lee la opción elegida por el usuario y se almacena en la variable opcion.

//Ejecución del ejercicio seleccionado
                    switch (opcion) {
                        case 1: ejercicio1(scanner); break;
                        // ...
                    }
//Este es un switch que se ejecuta dependiendo de la opción elegida. Si la opción es 1, entonces se llama al método ejercicio1 y se le pasa el objeto scanner como parámetro.

//Método ejercicio1
                    public static void ejercicio1(Scanner scanner) {
                        // código aquí
                    }
//Este es uno de los métodos que implementa la lógica del ejercicio 1. Recibe un objeto Scanner como parámetro y ejecuta la lógica correspondiente.

//Ejercicio 1: Comprobar si un número es múltiplo de otro**


                    public static void ejercicio1(Scanner scanner) {
                        System.out.println("            ---------------------------------------------------------------------------------------");
                        System.out.println("                                          Ejercicio 1: Multiplos                                 ");
                        System.out.println("            ---------------------------------------------------------------------------------------\n");

                        System.out.print("Introduce el primer número: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Introduce el segundo número: ");
                        int num2 = scanner.nextInt();

                        if (esMultiplo(num1, num2)) {
                            System.out.println(num1 + " es múltiplo de " + num2);
                        } else if (esMultiplo(num2, num1)) {
                            System.out.println(num2 + " es múltiplo de " + num1);
                        } else {
                            System.out.println("Ninguno es múltiplo del otro");
                        }
                    }

                    public static boolean esMultiplo(int num1, int num2) {
                        return num2 != 0 && num1 % num2 == 0;
                    }
/* 

*   La línea `System.out.print("Introduce el primer número: ");` imprime un mensaje en la consola solicitando al usuario que ingrese el primer número.
*   La línea `int num1 = scanner.nextInt();` lee el primer número ingresado por el usuario y lo asigna a la variable `num1`.
*   De manera similar, se solicita y se lee el segundo número con `System.out.print("Introduce el segundo número: ");` y `int num2 = scanner.nextInt();`.
*   La línea `if (esMultiplo(num1, num2)) { ... }` comprueba si el primer número es múltiplo del segundo utilizando la función auxiliar `esMultiplo`. Si lo es, imprime un mensaje informando que el primer número es múltiplo del segundo.
*   La línea `} else if (esMultiplo(num2, num1)) { ... }` comprueba si el segundo número es múltiplo del primero. Si lo es, imprime un mensaje informando que el segundo número es múltiplo del primero.
*   La línea `} else { System.out.println("Ninguno es múltiplo del otro"); }` imprime un mensaje en caso de que ninguno de los números sea múltiplo del otro.

La función auxiliar `esMultiplo(int num1, int num2)` se define como:

*   La línea `return num2 != 0 && num1 % num2 == 0;` devuelve verdadero si el segundo número no es cero y el resto de dividir el primer número entre el segundo es cero (lo que indica que el primer número es múltiplo del segundo).
*/
**Ejercicio 2: Calcular temperatura media de varios días**


                    public static void ejercicio2(Scanner scanner) {
                        System.out.println("            ---------------------------------------------------------------------------------------");
                        System.out.println("                                      Ejercicio 2: Temperatura media                                 ");
                        System.out.println("            ---------------------------------------------------------------------------------------\n");

                        System.out.print("Introduce el número de días: ");
                        int numDias = scanner.nextInt();

                        for (int i = 1; i <= numDias; i++) {
                            System.out.print("      Día " + i + " - Temperatura máxima: ");
                            double max = scanner.nextDouble();
                            System.out.print("      Día " + i + " - Temperatura mínima: ");
                            double min = scanner.nextDouble();

                            System.out.println("Temperatura media: " + calcularTemperaturaMedia(max, min));
                        }
                    }

                    public static double calcularTemperaturaMedia(double max, double min) {
                        return (max + min) / 2;
                    }
/*

*   La línea `System.out.print("Introduce el número de días: ");` imprime un mensaje en la consola solicitando al usuario que ingrese el número de días.
*   La línea `int numDias = scanner.nextInt();` lee el número de días ingresado por el usuario y lo asigna a la variable `numDias`.
*   El bucle `for (int i = 1; i <= numDias; i++) { ... }` itera sobre cada día, desde el día 1 hasta el día especificado por el usuario.
*   Dentro del bucle, se solicitan y se leen la temperatura máxima y mínima para cada día con `System.out.print("      Día " + i + " - Temperatura máxima: ");`, `double max = scanner.nextDouble();`, etc.
*   La línea `System.out.println("Temperatura media: " + calcularTemperaturaMedia(max, min));` imprime la temperatura media para cada día utilizando la función auxiliar `calcularTemperaturaMedia`.
*   La función auxiliar `calcularTemperaturaMedia(double max, double min)` se define como:
	+   La línea `return (max + min) / 2;` devuelve el promedio de las temperaturas máxima y mínima.
 */

**Ejercicio 3: Convertir texto añadiendo espacios entre caracteres**


                    public static void ejercicio3(Scanner scanner) {
                                System.out.println("            ---------------------------------------------------------------------------------------");
                                System.out.println("                                        Ejercicio 3: Convertir espaciado                                  ");
                                System.out.println("            ---------------------------------------------------------------------------------------\n");

                                scanner.nextLine(); // Limpiar buffer

                                System.out.print("Introduce un texto: ");
                                String texto = scanner.nextLine();

                                System.out.println("Texto espaciado: " + convertirEspaciado(texto));
                            }

                            public static String convertirEspaciado(String texto) {
                                StringBuilder resultado = new StringBuilder();
                                for (char c : texto.toCharArray()) {
                                    resultado.append(c).append(" ");
                                }
                                return resultado.toString().trim();
                            }

/* 
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------");` imprime una línea de separación en la consola.
*   La línea `System.out.println("                                        Ejercicio 3: Convertir espaciado                                  ");` imprime el título del ejercicio en la consola.
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------\n");` imprime otra línea de separación en la consola.
*   La línea `scanner.nextLine(); // Limpiar buffer` limpia el buffer de entrada para evitar errores al leer strings con espacios.
*   La línea `System.out.print("Introduce un texto: ");` imprime un mensaje en la consola solicitando que el usuario introduzca un texto.
*   La línea `String texto = scanner.nextLine();` lee el texto ingresado por el usuario y lo asigna a la variable `texto`.
*   La función auxiliar `convertirEspaciado(String texto)` se define como:
	+   El bucle `for (char c : texto.toCharArray()) { ... }` itera sobre cada carácter del texto.
	+   Dentro del bucle, se utiliza el método `append` para agregar el carácter y un espacio a la cadena de resultados.
	+   Finalmente, se devuelve la cadena de resultados sin el último espacio en blanco mediante el método `trim`.
*/
**Ejercicio 4: Calcular área y perímetro de una circunferencia**


                            public static void ejercicio4(Scanner scanner) {
                                System.out.println("            ---------------------------------------------------------------------------------------");
                                System.out.println("                                          Ejercicio 4: Área y perímetro de circunferencia                                 ");
                                System.out.println("            ---------------------------------------------------------------------------------------\n");

                                System.out.print("Introduce el radio de la circunferencia: ");
                                double radio = scanner.nextDouble();

                                double[] resultado = calcularCircunferencia(radio);

                                System.out.println("Área: " + resultado[0]);
                                System.out.println("Perímetro: " + resultado[1]);
                            }

                            public static double[] calcularCircunferencia(double radio) {
                                double area = Math.PI * radio * radio;
                                double perimetro = 2 * Math.PI * radio;

                                return new double[]{area, perimetro};
                            }
/* 

*   La línea `System.out.println("            ---------------------------------------------------------------------------------------");` imprime una línea de separación en la consola.
*   La línea `System.out.println("                                          Ejercicio 4: Área y perímetro de circunferencia                                 ");` imprime el título del ejercicio en la consola.
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------\n");` imprime otra línea de separación en la consola.
*   La línea `System.out.print("Introduce el radio de la circunferencia: ");` imprime un mensaje en la consola solicitando que el usuario introduzca el radio de la circunferencia.
*   La línea `double radio = scanner.nextDouble();` lee el valor del radio ingresado por el usuario y lo asigna a la variable `radio`.
*   La función auxiliar `calcularCircunferencia(double radio)` se define como:
	+   Las líneas `double area = Math.PI * radio * radio;` y `double perimetro = 2 * Math.PI * radio;` calculan el área y perímetro de la circunferencia utilizando las fórmulas correspondientes.
	+   Finalmente, se devuelve un arreglo con los valores del área y perímetro.
*/

**Ejercicio 5: Sistema de login con 3 intentos**


                    public static void ejercicio5(Scanner scanner) {
                        System.out.println("            ---------------------------------------------------------------------------------------");
                        System.out.println("                                        Ejercicio 5: Sistema de login                                  ");
                        System.out.println("            ---------------------------------------------------------------------------------------\n");

                        int intentos = 0;
                        boolean loginExitoso = false;

                        while (intentos < 3 && !loginExitoso) {
                            scanner.nextLine(); // Limpiar buffer

                            System.out.print("Usuario: ");
                            String usuario = scanner.nextLine();

                            System.out.print("Contraseña: ");
                            String password = scanner.nextLine();

                            loginExitoso = login(usuario, password, intentos);
                            intentos++;
                        }

                        if (loginExitoso) {
                            System.out.println("Login exitoso");
                        } else {
                            System.out.println("Número máximo de intentos alcanzado");
                        }
                    }

                    public static boolean login(String usuario, String password, int intentos) {
                        return usuario.equals("usuario1") && password.equals("1306");
                    }
/* 

*   La línea `System.out.println("            ---------------------------------------------------------------------------------------");` imprime una línea de separación en la consola.
*   La línea `System.out.println("                                        Ejercicio 5: Sistema de login                                  ");` imprime el título del ejercicio en la consola.
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------\n");` imprime otra línea de separación en la consola.
*   El bucle `while (intentos < 3 && !loginExitoso) { ... }` se utiliza para realizar los intentos de login.
*   Dentro del bucle, se limpia el buffer con `scanner.nextLine();`.
*   Luego, se leen las credenciales al usuario con `String usuario = scanner.nextLine()` y `String password = scanner.nextLine()`.
*   La función auxiliar `login(String usuario, String password, int intentos)` se utiliza para verificar si las credenciales son correctas.
	+   Si las credenciales son correctas, se devuelve `true` y el login es exitoso.
	+   De lo contrario, se devuelve `false` y se incrementa el número de intentos.
*/

**Ejercicio 6: Calcular el MCD usando el algoritmo de Euclides**


                            public static void ejercicio6(Scanner scanner) {
                                System.out.println("            ---------------------------------------------------------------------------------------");
                                System.out.println("                                Ejercicio 6: MCD usando el algoritmo de Euler ");
                                System.out.println("            ---------------------------------------------------------------------------------------\n");

                                System.out.print("Introduce el primer número: ");
                                int num1 = scanner.nextInt();
                                System.out.print("Introduce el segundo número: ");
                                int num2 = scanner.nextInt();

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
/* 

*   La línea `System.out.println("            ---------------------------------------------------------------------------------------");` imprime una línea de separación en la consola.
*   La línea `System.out.println("                                Ejercicio 6: MCD usando el algoritmo de Euler ");` imprime el título del ejercicio en la consola.
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------\n");` imprime otra línea de separación en la consola.
*   El bucle `while (b != 0) { ... }` se utiliza para calcular el MCD usando el algoritmo de Euclides.
*   Dentro del bucle, se calcula el resto de la división entre `a` y `b` con `b = a % b`.
*   Luego, se intercambian los valores de `a` y `b` con `temp` y `a`.
*   Finalmente, cuando `b` sea 0, se devuelve el valor de `a`, que es el MCD.
*/
**Ejercicio 7: Conversión de tiempo entre segundos y horas, minutos, segundos**


                                public static void ejercicio7(Scanner scanner) {
                                    System.out.println("            ---------------------------------------------------------------------------------------");
                                    System.out.println("                                 Ejercicio 7: Conversión de tiempo ");
                                    System.out.println("            ---------------------------------------------------------------------------------------\n");

                                    int opcion;
                                    do {
                                        System.out.println("\n1. Convertir a segundos");
                                        System.out.println("2. Convertir a horas, minutos y segundos");
                                        System.out.println("0. Volver al menú principal");
                                        System.out.print("Elige una opción: ");
                                        opcion = scanner.nextInt();

                                        switch (opcion) {
                                            case 1:
                                                // Convertir de horas, minutos, segundos a segundos totales
                                                System.out.print("Horas: ");
                                                int horas = scanner.nextInt();
                                                System.out.print("Minutos: ");
                                                int minutos = scanner.nextInt();
                                                System.out.print("Segundos: ");
                                                int segundos = scanner.nextInt();
                                                System.out.println("Total en segundos: " + aSegundos(horas, minutos, segundos));
                                                break;
                                            case 2:
                                                // Convertir de segundos totales a horas, minutos, segundos
                                                System.out.print("Segundos totales: ");
                                                int totalSegundos = scanner.nextInt();
                                                int[] tiempo = aTiempo(totalSegundos);
                                                System.out.printf("%d horas, %d minutos, %d segundos\n", tiempo[0], tiempo[1], tiempo[2]);
                                                break;
                                            case 0:
                                                System.out.println("Volviendo al menú principal");
                                                break;
                                            default:
                                                System.out.println("Opción no válida");
                                        }
                                    } while (opcion != 0);
                                }

                                public static int aSegundos(int horas, int minutos, int segundos) {
                                    return horas * 3600 + minutos * 60 + segundos;
                                }

                                public static int[] aTiempo(int segundosTotales) {
                                    int horas = segundosTotales / 3600;
                                    int minutos = (segundosTotales % 3600) / 60;
                                    int segundos = segundosTotales % 60;
                                    return new int[]{horas, minutos, segundos};
                            }
```
/* 
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------");` imprime una línea de separación en la consola.
*   La línea `System.out.println("                                 Ejercicio 7: Conversión de tiempo ");` imprime el título del ejercicio en la consola.
*   La línea `System.out.println("            ---------------------------------------------------------------------------------------\n");` imprime otra línea de separación en la consola.
*   Se utiliza un bucle `do-while` para realizar las opciones de conversión de tiempo.
*   Dentro del bucle, se leen las opciones de conversión con `opcion = scanner.nextInt();`.
*   Luego, se utiliza un switch para determinar qué opción se ha seleccionado y realizar la conversión correspondiente.

**Funciones auxiliares**

Las funciones auxiliares son métodos que se utilizan dentro del código principal para realizar tareas específicas. A continuación, se explican las funciones auxiliares utilizadas en el código:

*   `esMultiplo(int num1, int num2)`: Esta función comprueba si un número es múltiplo de otro.
	+   Recibe dos parámetros: `num1` y `num2`.
	+   Retorna `true` si `num1` es múltiplo de `num2`, de lo contrario retorna `false`.
*   `calcularTemperaturaMedia(double max, double min)`: Esta función calcula la temperatura media de dos valores.
	+   Recibe dos parámetros: `max` y `min`.
	+   Retorna la temperatura media calculada como `(max + min) / 2`.
*   `convertirEspaciado(String texto)`: Esta función convierte un texto en un texto espaciado.
	+   Recibe un parámetro: `texto`.
	+   Retorna el texto convertido con espacios entre cada carácter.
*   `calcularCircunferencia(double radio)`: Esta función calcula el área y perímetro de una circunferencia.
	+   Recibe un parámetro: `radio`.
	+   Retorna un arreglo con el área y perímetro calculados.
*   `login(String usuario, String password, int intentos)`: Esta función verifica si las credenciales son correctas.
	+   Recibe tres parámetros: `usuario`, `password` e `intentos`.
	+   Retorna `true` si las credenciales son correctas, de lo contrario retorna `false`.
*   `calcularMCD(int a, int b)`: Esta función calcula el MCD usando el algoritmo de Euclides.
	+   Recibe dos parámetros: `a` y `b`.
	+   Retorna el MCD calculado.
*   `aSegundos(int horas, int minutos, int segundos)`: Esta función convierte de horas, minutos y segundos a segundos totales.
	+   Recibe tres parámetros: `horas`, `minutos` y `segundos`.
	+   Retorna el total en segundos calculado.
*   `aTiempo(int segundosTotales)`: Esta función convierte de segundos totales a horas, minutos y segundos.
	+   Recibe un parámetro: `segundosTotales`.
	+   Retorna un arreglo con los valores de horas, minutos y segundos calculados.
*/
**Ejecución del código**

Para ejecutar el código, sigue estos pasos:

1.  Abre el entorno de desarrollo Java que estés utilizando (por ejemplo, Eclipse o NetBeans).
2.  Crea un nuevo proyecto Java vacío.
3.  Copia y pega el código en la ventana de edición de código del editor de Java.
4.  Asegúrate de que hayas importado las bibliotecas necesarias (`java.util.Scanner`).
5.  Haz clic en el botón de compilar para compilar el código.
6.  Una vez compilado, haz clic en el botón de ejecutar para ejecutar el programa.
7.  El programa se iniciará y mostrará la opción principal del menú.
8.  Puedes seleccionar una de las opciones y seguir los pasos solicitados por el programa.

Recuerda que este es un código básico para introducir a los conceptos de programación en Java. Por lo tanto, no te preocupes si encuentras errores o cosas que no entiendas. ¡La práctica y la experimentación son la mejor forma de aprender!