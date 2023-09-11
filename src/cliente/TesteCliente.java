package cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente newCliente1 = new Cliente("João", 22, "M", "Brasileiro", 175);
		Cliente newCliente2 = new Cliente("Luiza", 24, "F", "Espanhola", 165);
		
		newCliente1.visualiza();
		newCliente2.visualiza();
	}
}
