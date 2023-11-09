import java.util.LinkedList;

public class Atencion {

    private LinkedList<Usuario> listCola;
    private int numeroTicket;

    public Atencion() {
        listCola = new LinkedList<>();
        numeroTicket = 0;
    }

    public void registrarUsuario(String nombre) {
        numeroTicket++;
        Usuario usuario = new Usuario(nombre, numeroTicket);
        listCola.add(usuario);
    }

    public void atenderUsuario() {
        if (!listCola.isEmpty()) {
            Usuario usuarioAtendido = listCola.pop();
            System.out.println("Se atendió al usuario: " + usuarioAtendido.getNombre() +
                    " con el número de ticket: " + usuarioAtendido.getNumeroTicket());
        } else {
            System.out.println("No hay usuarios por atender.");
        }
    }

    public void listarUsuariosPendientes() {
        if (!listCola.isEmpty()) {
            for (Usuario usuario : listCola) {
                System.out.println("Nombre: " + usuario.getNombre() +
                        " Número de ticket: " + usuario.getNumeroTicket());
            }
        } else {
            System.out.println("No hay usuarios pendientes.");
        }
    }}
