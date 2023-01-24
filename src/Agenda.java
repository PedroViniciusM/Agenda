
public class Agenda {
	public static void main(String[] args) {
		ConexoBD bancoDeDados = new ConexoBD();
		bancoDeDados.conectar();
		if(bancoDeDados.estaConectado()) {
			bancoDeDados.apagarContato("4");
			bancoDeDados.listarContatos();
			
			bancoDeDados.desconectar();
		}

	}
}
