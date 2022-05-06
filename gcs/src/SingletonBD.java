
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        listaUsuario.add(new Usuario("Admin", "123", "Fulano", 1985));
        System.out.println("\nUsuário cadastrado.\n");
    }

    public static void deletarUsuario(){ 

	// deletar usuário}

    public static void atualizarUsuario(){

// mudei o arquivo teste
		}

    public static void listarUsuarios(){ }

}
