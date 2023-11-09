import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Chat objChat = new Chat();

        int opc;
        do {
            System.out.println("************* CHAT *************");
            System.out.println("* 1. Agregar usuario           *");
            System.out.println("* 2. Conectar usuario          *");
            System.out.println("* 3. Desconectar Usuario       *");
            System.out.println("* 4. Lista usuarios conectados *");
            System.out.println("* 5. Salir                     *");
            System.out.println("********************************");
            System.out.print("Seleccione una opción:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Agregar usuario");
                    System.out.println("Ingrese el nombre de usuario");
                    String nomUsu = leer.next();
                    objChat.agregarUsuario(nomUsu);
                    break;
                case 2:
                    System.out.println("Conectar usuario");
                    System.out.println("Ingrese nombre: ");
                    String nombre = leer.next();
                    objChat.usuarioConectado(nombre);
                    System.out.println("Usuario conectado exitosamente.");
                    break;
                case 3:
                    System.out.println("Desconectar usuario");
                    System.out.println("Ingrese nombre: ");
                    String nom = leer.next();
                    objChat.usuarioDesconectado(nom);
                    break;
                case 4:
                    System.out.println("Lista usuarios conectados");
                    objChat.listUsuariosConectados();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro software!!!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
        } while (opc != 5);

    }
}