import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
public class Chat {
    private Stack<String> usuariosConectados;
    private ArrayList<String> usuariosAgregados;

    public Chat() {
        usuariosConectados = new Stack<>();
        usuariosAgregados = new ArrayList<>();
    }
    public void agregarUsuario(String nombre) {
        usuariosAgregados.add(nombre);
    }

    public void usuarioConectado(String nombre){
        usuariosConectados.push(nombre);
        System.out.println(nombre + " se ha conectado");
    }

    public void usuarioDesconectado(String nombre){
        if (usuariosConectados.contains(nombre)) {
            usuariosConectados.remove(nombre);
        } else {
            System.out.println("Error: el usuario no está conectado.");
        }
    }
    public void listUsuariosConectados(){
        System.out.println("Usuarios conectados: ");
        for (String usuario : usuariosConectados){
            System.out.println(usuario);
        }
    }

}
