
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atencion atencion = new Atencion();
        int opcion;
        do {
            System.out.println("******* ATENCIÓN AL CLIENTE *******");
            System.out.println("* 1. Agregar cliente               *");
            System.out.println("* 2. Atender cliente              *");
            System.out.println("* 3. Listar usuarios pendientes   *");
            System.out.println("* 4. Salir                        *");
            System.out.println("***********************************");
            System.out.print("Seleccione una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("REGISTRAR CLIENTE");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    atencion.registrarUsuario(nombre);
                    System.out.println("Cliente registrado exitosamente.");
                    break;
                case 2:
                    System.out.println("ATENDER USUARIOS");
                    atencion.atenderUsuario();
                    break;
                case 3:
                    System.out.println("LISTA DE USUARIOS PENDIENTES");
                    atencion.listarUsuariosPendientes();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro software!!!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

