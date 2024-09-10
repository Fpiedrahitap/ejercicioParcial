import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Funcionalidad que registre la cantidad de pasos dados por una persona durante 5 dias, indique el promedio.
        - almancenar los datos en un arreglo
        - calcular el promedio
        inicializar el programa usando un ciclo while
        imprimir usando un ciclo for
         */
        /* Registre los datos del usario nombre, correo contraseña
        Inicie sesion
        haga un menu usando switch
        use funciones
         */

        int[] pasos = new int[5];
        int totalPasos = 0;
        int i = 0;
        while (i < 5) {
            int pasosDia = (int) (Math.random() * 10000);
            pasos[i] = pasosDia;
            totalPasos += pasosDia;
            i++;
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Los pasos dados el dia " + (j + 1) + " son: " + pasos[j]);
        }
        System.out.println("El promedio de pasos dados es: " + totalPasos / 5);

        menu();
    }

    public static void menu() {
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                iniciarSesion();
                break;
            case 2:
                registrarse();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
    }

    public static void registrarse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
    }
}

