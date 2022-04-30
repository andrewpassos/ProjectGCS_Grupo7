
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        listaUsuario.add(new Usuario("Admin", "123", "Fulano", 1985));
        System.out.println("\nUsuário cadastrado.\n");
    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
